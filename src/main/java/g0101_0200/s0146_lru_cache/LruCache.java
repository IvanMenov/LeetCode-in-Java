package g0101_0200.s0146_lru_cache;

import java.util.HashMap;
import java.util.Map;

public class LruCache {
    int capacity;
    Map<Integer, LruCacheNode> cacheMap = new HashMap<>();
    // insert here
    LruCacheNode head;
    // remove here
    LruCacheNode tail;

    public LruCache(int cap) {
        capacity = cap;
    }

    public int get(int key) {
        LruCacheNode val = cacheMap.get(key);
        if (val == null) {
            return -1;
        }
        moveToHead(val);
        return val.value;
    }

    /*
     * Scenarios :
     * 1. Value key is already present.
     *          update
     *          move node to head
     * 2. cache is not full
     *          cache is empty (create node and assign head and tail)
     *          cache is partially empty (add node to head and update head pointer)
     * 3. cache is full
     *          remove node at tail, update head, tail pointers
     *          Recursively call put
     *
     *
     * move node to head Scenarios
     * 1. node is at head
     * 2. node is at tail
     * 3. node is in middle
     *
     */
    public void put(int key, int value) {
        LruCacheNode valNode = cacheMap.get(key);
        if (valNode != null) {
            valNode.value = value;
            moveToHead(valNode);
        } else {
            if (cacheMap.size() < capacity) {
                if (cacheMap.size() == 0) {
                    LruCacheNode node = new LruCacheNode(key, value);
                    cacheMap.put(key, node);
                    head = node;
                    tail = node;
                } else {
                    LruCacheNode node = new LruCacheNode(key, value);
                    cacheMap.put(key, node);
                    node.next = head;
                    head.prev = node;
                    head = node;
                }
            } else {
                // remove from tail
                LruCacheNode last = tail;
                tail = last.prev;
                if (tail != null) {
                    tail.next = null;
                }
                cacheMap.remove(last.key);
                if (cacheMap.size() == 0) {
                    head = null;
                }
                // Call recursively
                put(key, value);
            }
        }
    }

    /*
     * check for 3 conditions
     * 1. node is already at head
     * 2. Node is tail node
     * 3. Node in middle node
     */
    private void moveToHead(LruCacheNode node) {
        if (node == head) {
            return;
        }
        if (node == tail) {
            tail = node.prev;
        }
        // node is not head, it should have some valid prev node
        LruCacheNode prev = node.prev;
        LruCacheNode next = node.next;
        prev.next = next;
        if (next != null) {
            next.prev = prev;
        }
        node.prev = null;
        node.next = head;
        head.prev = node;
        head = node;
    }
}

package g0101_0200.s0155_min_stack;

public class Node {
    int min;
    int data;
    Node nextNode;
    Node previousNode;

    public Node(int min, int data, Node previousNode, Node nextNode) {
        this.min = min;
        this.data = data;
        this.previousNode = previousNode;
        this.nextNode = nextNode;
    }
}

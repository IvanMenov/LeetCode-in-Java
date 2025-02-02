package g0001_0100.s0037_sudoku_solver;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<int[]> emptyCells = new ArrayList<>();
    int[] rows = new int[9];
    int[] cols = new int[9];
    int[] boxes = new int[9];

    public void solveSudoku(char[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    emptyCells.add(new int[] {r, c});
                } else {
                    int val = board[r][c] - '0';
                    int boxPos = r / 3 * 3 + c / 3;
                    rows[r] |= 1 << val;
                    cols[c] |= 1 << val;
                    boxes[boxPos] |= 1 << val;
                }
            }
        }
        backtracking(board, 0);
    }

    boolean backtracking(char[][] board, int i) {
        // Check if we filled all empty cells?
        if (i == emptyCells.size()) {
            return true;
        }

        int r = emptyCells.get(i)[0];
        int c = emptyCells.get(i)[1];
        int boxPos = (r / 3) * 3 + c / 3;
        for (int val = 1; val <= 9; ++val) {
            // skip if that value is existed!
            if (hasBit(rows[r], val) || hasBit(cols[c], val) || hasBit(boxes[boxPos], val)) {
                continue;
            }
            board[r][c] = (char) ('0' + val);
            // backup old values
            int oldRow = rows[r];
            int oldCol = cols[c];
            int oldBox = boxes[boxPos];
            rows[r] |= 1 << val;
            cols[c] |= 1 << val;
            boxes[boxPos] |= 1 << val;
            if (backtracking(board, i + 1)) {
                return true;
            }
            rows[r] = oldRow;
            cols[c] = oldCol;
            boxes[boxPos] = oldBox;
        }
        return false;
    }

    boolean hasBit(int x, int k) {
        return (x >> k & 1) == 1;
    }
}

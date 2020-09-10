package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        int[] diag = extractDiagonal(board);
        for (int i = 0; i < diag.length; i++) {
            if (diag[i] == 1) {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board[column].length; i++) {
            if (board[i][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int[] extractDiagonal(int[][] board) {
        int[] result = new int[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }
}

package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return isHorizontalWin(board) || isVerticalWin(board);
    }

    public static boolean isHorizontalWin(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 1) {
                    break;
                }
                if (j == board[i].length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isVerticalWin(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != 1) {
                    break;
                }
                if (j == board.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}

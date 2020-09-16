package com.cl.elena.algorithm.offer.dfs;

public class offer12 {

	public offer12() {
		// TODO Auto-generated constructor stub
	}

	public boolean exist(char[][] board, String word) {
		char[] words = word.toCharArray();
		int n = board.length;
		int m = board[0].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (dfs(board, words, i, j, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean dfs(char[][] board, char[] word, int i, int j, int k) {
		if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k])
			return false;
		if (k == word.length - 1)
			return true;
		char tmp = board[i][j];
		board[i][j] = '/';
		boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1)
				|| dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i, j - 1, k + 1);
		board[i][j] = tmp;
		return res;
	}

}

class Result {
  static boolean issafe(int arr[][], int r, int c, int v) {
    for (int i = 0; i < 9; i++) if (arr[r][i] == v || arr[i][c] == v || arr[(r / 3) * 3 + i / 3][(c / 3) * 3 + i % 3] == v) return false;
    return true;
  }

  static boolean sudoku(int arr[][], int r, int c) {
    if (r == 9) return true;
    if (c == 9) return sudoku(arr, r + 1, 0);
    if (arr[r][c] != 0) return sudoku(arr, r, c + 1);
    for (int i = 1; i <= 9; i++) if (issafe(arr, r, c, i)) { arr[r][c] = i; if (sudoku(arr, r, c + 1)) return true; arr[r][c] = 0; }
    return false;
  }

  static int solveSudoku(int mat[][]) { return sudoku(mat, 0, 0) ? 1 : -1; }
}

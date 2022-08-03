/*Prepared by PATEL KARM HITESHKUMAR(21CE095)*/
/*The problem is to check whether a given Sudoku solution is correct.
*/
public class Practical9 {
    public static void main(String[] args) {
        int[][] a = {
                { 2, 4, 8, 3, 9, 5, 7, 1, 6 },
                { 5, 7, 1, 6, 2, 8, 3, 4, 9 },
                { 9, 3, 6, 7, 4, 1, 5, 8, 2 },
                { 6, 8, 2, 5, 3, 9, 1, 7, 4 },
                { 3, 5, 9, 1, 7, 4, 6, 2, 8 },
                { 7, 1, 4, 8, 6, 2, 9, 5, 3 },
                { 8, 6, 3, 4, 1, 7, 2, 9, 5 },
                { 1, 9, 5, 2, 8, 6, 4, 3, 7 },
                { 4, 2, 7, 9, 5, 3, 8, 6, 1 } };
                System.out.println(sudoku(a));
        System.out.println("Prapared by PATEL KARM HITESHKUMAR(21CE095)");
    }

public static boolean sudoku(int arr[][]) {
    //int i, j;
    int c[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    int d[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    boolean b = true;
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            if (c[arr[j][i]] > i || d[arr[i][j]] > i) {
                return false;
            }
            d[arr[i][j]]++;
            c[arr[j][i]]++;
        }
    }
    return b;
}
}


public class DP {
    char[] array1;
    char[] array2;
    int[][] lcs;

    public DP(char[] array1, char[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public int[][] init() {//初始化lcs数组

        lcs = new int[array1.length][array2.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                lcs[i][j] = 0;
            }
        }
        return lcs ;
    }

    public int dp() {
        if (array1[0] == array2[0]) {
            lcs[0][0] = 1 ;
        }
        if (array1[0] != array2[0]) {
            lcs[0][0] = 0 ;
            if (array1[0] == array2[1]){
                lcs[0][1] = 1;
            }
            if (array1[1] == array2[0]){
                lcs[1][0] = 1;
            }
        }//手动定义初始值

        for (int i = 1; i <array1.length; i++) {
            for (int j = 1; j <array2.length; j++) {
                if (array1[i] == array2[j]) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                }
                else if (array1[i] != array2[j]){
                    lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
                }
            }
        }
        return lcs[array1.length-1][array2.length-1];
    }
}

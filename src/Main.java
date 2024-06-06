//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
//        int [] array = {6,3,4,9,10,2,15,7,11,8};//数组
////        algo maopao1 = new maopao(array);
////        maopao1.sort();
////        System.out.println("/////////////////////////");
////        maopao1.getArray();
//        quicksort quicksort1 = new quicksort(array);
//        quicksort1.sort1(array,0, array.length-1);
        char [] array1 = {'A','C','C','G','G','T','C','G','A','G','T','G','C','G','C','G','G','A','A','G','C','C','G','G','C','C','G','A','A'};
        char [] array2 = {'G','T','C','G','T','T','C','G','G','A','A','T','G','C','C','G','T','T','G','C','T','C','T','G','T','A','A','A'};
        DP dynamicp = new DP(array1 ,array2);
        dynamicp.init();
        int longest = dynamicp.dp();
        System.out.println("最长子序列长度是" + longest);
    }
}

abstract class algo{
    public algo(int[] array) {
        this.array = array;
    }

    int [] array ;

    public abstract int[] sort();



    public int[] getArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }

        return array;
    }
}




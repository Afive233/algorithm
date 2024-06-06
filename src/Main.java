//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] array = {6,3,4,9,10,2,15,7,11,8};//数组
//        algo maopao1 = new maopao(array);
//        maopao1.sort();
//        System.out.println("/////////////////////////");
//        maopao1.getArray();
        quicksort quicksort1 = new quicksort(array);
        quicksort1.sort1(array,0, array.length-1);


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




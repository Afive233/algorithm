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

class maopao extends algo{

    public maopao(int[] array) {
        super(array);
    }

    @Override
    public  int[] sort() {
        int temp = 0;
        for (int j = 1; j < array.length-1; j++) {
            boolean flag =false;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    flag = true;
                }

            }
            if (flag == false) {
                break;
            }

            System.out.printf("第%d次调整：",j );
            this.getArray();
            System.out.println("\n");
        }
        return  array;
    }


}

class quicksort extends algo{

    public quicksort(int[] array) {
        super(array);
    }

    public int[] sort( ) {

        return array ;
    }
    static  int num = 1;
    public int[] sort1(int[] array,int start ,int end){
        if (start == end ){
            return array;
        }
        int l = start ;
        int h = end ;
        int base = array[start];

        while (l < h){

            while (array[h] >= base && l < h ){
                h--;
            }
                array[l] = array[h];
            while (array[l] <= base && l < h){
                l++;
            }
            array[h] = array[l];
        }
        if (l == h){
            array[l] = base ;
            System.out.printf("\n第%d次排序：" , num++ );
            this.getArray();
        }
        if (start < l ){
            sort1(array,start , l-1);
        }
        if (end > l ) {
            sort1(array, l + 1, end);
        }

        return  array ;
    }

}
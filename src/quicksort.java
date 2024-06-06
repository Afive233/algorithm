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
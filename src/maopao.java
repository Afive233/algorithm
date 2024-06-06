

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

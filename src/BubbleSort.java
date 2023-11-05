

public class BubbleSort {

    public int[] array;

    public BubbleSort(){
        //construct random array
        makeArray();
        //print unsorted array
        printArray();
        //sort array
        //sortArray();
        selectionSortArray();
        //print sorted array to make sure it worked
        printArray();

    }

    public void makeArray(){
        //construct array
        array = new int[8];
        for(int y=1; y<8; y++){
            array[y]= (int)(Math.random()*9 + 1);
        }

    }

    public void printArray(){
        for(int y=0; y< array.length; y++) {
            System.out.print(array[y] + " ");
        }
        System.out.println();
    }

//    public void sortArray() {
//        for(int x=1;x<array.length; x++) {
//            for (int i = 1; i < array.length; i++) {
//                if (array[i - 1] > array[i]) {
//                    int temp = array[i];
//                    array[i] = array[i - 1];
//                    array[i - 1] = temp;
//                }
//            }
//            printArray();
//        }
//
//    }

    public void selectionSortArray(){
        for(int x=0;x<(array.length-1); x++) {
            int iMin = x;
            for(int y=x+1;y<(array.length); y++){
                if(array[y] < array[iMin]){
                    iMin = y;
                }
                }
            int min = array[iMin];
            array[iMin] = array[x];
            array[x] = min;
            }
        }


//            for(int y=1;y<array.length; y++){
//                if (array[y - 1] < array[y]) {
//                    int temp = array[y];
//                    array[y] = array[y - 1];
//                    array[y - 1] = temp;
//                }
//                printArray();
//        }
//        }
    


    //calling constructor (ignore)
    public static void main(String[] args) {
        BubbleSort bubbles = new BubbleSort();
    }


}

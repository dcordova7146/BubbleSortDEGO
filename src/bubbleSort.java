public class bubbleSort {
    public void bubblesort(int []arr){
        int endOfArray = arr.length;
        int swapcount = 0;
        boolean finished = false;
        int pos1 = 0;
        while(finished && swapcount == 0){
            swapcount = 0;
            if(arr[pos1] > arr[pos1+1]){
                swap(arr,pos1,pos1+1);
                swapcount ++;
            }
            pos1++;
            if(pos1 == endOfArray - 1){
                pos1 = 0;
                finished = true;
            }
        }
    }
    public void swap(int []arr, int pos1, int pos2){
        int temp = arr[pos2];
        arr[pos2] = arr[pos1];
        arr[pos1] = temp;
    }
}

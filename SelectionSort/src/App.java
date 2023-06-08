import java.util.Arrays;

public class App {

    public static void S_sort(int [] arr){

        int size = arr.length;
    for(int i = 0; i < size - 1; i++){
        int min_index = i;

        for(int j = i + 1; j < size; j++){
            if(arr[j] < arr[min_index]){
                min_index = j;
            }
        }
        int temp = arr[min_index];
        arr[min_index] = arr[i];
        arr[i] = temp;
    }

    }
    public static void main(String[] args) throws Exception {
       int[] arr = {20, 40, 10, 11, 9, 8, 7,3,2,5};

       System.out.println("Original" + Arrays.toString(arr));
       S_sort(arr);
       System.out.println(Arrays.toString(arr));
    }
}


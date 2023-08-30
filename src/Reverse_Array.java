import java.lang.reflect.Array;
import java.util.Arrays;

public class Reverse_Array {
    public static void arraySwap(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        System.out.println(start);
        System.out.println(end);

        System.out.println("before swap");
        System.out.println(arr[start]);
        System.out.println(arr[end]);
        System.out.println(Arrays.toString(arr));

        arr[start] = arr[end];

        System.out.println("After swap");
        System.out.println(arr[start]);
        System.out.println(arr[end]);
        System.out.println(Arrays.toString(arr));

        int temp = arr[end];
        System.out.println("temp before: "+temp);
        temp = arr[5];
        System.out.println("temp after: " + temp);

    }

    //have a time complexity of O(n/2)
    public static void reverseArrayOptimized(int[] arr){
        int start=0;
        int last= arr.length-1;

        while (start<last){
            int temp= arr[start];
            arr[start]=arr[last];
            arr[last] = temp;

            start++;
            last--;
        }
        System.out.println(Arrays.toString(arr));
    }


    //have a time complexity of O(n)
    public void reverseArray(){
        int[] arr_3 = {3,7,9,4,6,0,2};
        System.out.println(Arrays.toString(arr_3));
        for (int i = arr_3.length-1; i>=0; i--){
            System.out.print(arr_3[i] + " ");
        }
    }

    //have a time complexity of O(n/2)
    //iterates from the start to the middle of the array
    public static void reverseArrayForOptimized(int[] arr){
        int temp;
        int last= arr.length;
        for (int y=0; y<last/2; y++){
            temp= arr[y];
            arr[y] = arr[last-y-1];
            arr[last-y-1] = temp;
        }

    }


    public static void main(String[] args) {
        int[] arr_1 = {3,7,9,4,6,0,2};
        int[] arr_2 = {3,7,9,4,6,0,2};
        int[] arr_3 = {3,7,9,4,6,0,2};
        arraySwap(arr_1);
        System.out.println();
        System.out.println(Arrays.toString(arr_2));
        reverseArrayOptimized(arr_2);
        System.out.println();
        Reverse_Array reverse_array = new Reverse_Array();
        reverse_array.reverseArray();
        System.out.println();

        System.out.println("original");
        for(int original: arr_3){
            System.out.print(original+ " ");
        }

        reverseArrayForOptimized(arr_3);
        System.out.println();
        System.out.println("reversed");
        for (int reversed: arr_3){
            System.out.print(reversed + " ");
        }
    }

}

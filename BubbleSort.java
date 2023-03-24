
/**
 *
 * @author Hanbi Hanz Choi
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                if(a[inner] > a[inner + 1]){
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]){
        BubbleSort ob = new BubbleSort();
        int arr[] = { 5, 2, 8, 4, 9 };
        ob.bubbleSort(arr, arr.length-1);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }


}
/**
 *
 * @author Hanbi Hanz Choi
 */
public class LinearSearch {

    public static int search(int arr[], int x) {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code
        //         - prvoide asymptotic analysis of the developed solution
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                return i; // The index of the first match of x
            }
        }
        return -1; // x is not found
    }

    public static void main(String[] args){
        int[] arr = {3, 7, 1, 9, 5};
        int x = 5;
        int index = LinearSearch.search(arr, x);

        if (index == -1) {
            System.out.println(x + " not found in the array");
        } else {
            System.out.println(x + " found at index " + index);
        }
    }

}
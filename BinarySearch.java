/**
 *
 * @author Hanbi Hanz Choi
 */

public class BinarySearch {
    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm
    // provide time and space analysis
    public static void main(String args[]){
        int[] arr = {1, 5, 7, 8, 13};
        int key = 8;
        int low = 0;
        int high = arr.length - 1;

        int index = BinarySearch.runBinarySearchIteratively(arr, key, low, high);

        System.out.println(index);
    }

}
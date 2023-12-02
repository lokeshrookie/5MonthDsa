package StriverDSAAtoZ.Arrays.Easy;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,6,7,8,5,9,4,21,1,2,6};
        System.out.println(secondLargest(arr));
    }

    // Two-Pass Solution
    static int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            // if first element is largest one, the seondLargest will not be found.
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }
//        for(int i = 0; i< arr.length; i++){
//            if(arr[i] < largest) {
//                if (arr[i] > secondLargest) {
//                    secondLargest = arr[i];
//                }
//            }
//        }
        System.out.println("l: " + largest);
        System.out.println("second largest : " + secondLargest);
        return -1;
    }
}

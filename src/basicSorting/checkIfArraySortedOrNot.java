package basicSorting;

public class checkIfArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,7,8,9,12,13};
        int n = arr.length;
        boolean flag = true; // true means sorted
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                flag  = false; // false means unsorted
                break;
            }
        }
        if(flag==true) System.out.println("Sorted");
        else System.out.println("Unsorted");

        }
    }


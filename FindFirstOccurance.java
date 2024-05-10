public class FindFirstOccurance {
    public static void main(String[] args) {
       int []arr={1,2,4,3,2,7,7};
       System.out.println(findOccurance(arr, 7));
    }
     
    //Most Optimize Approach
    static int findOccurance(int []arr,int target){
        int start=0;
        while(start<arr.length){
            int diff=Math.abs(arr[start]-target);
            start+=diff;
            if(arr[start]==target){
                return start;
            }
        }
        return -1;
    }
}

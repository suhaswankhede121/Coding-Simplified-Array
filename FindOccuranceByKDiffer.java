public class FindOccuranceByKDiffer {
    public static void main(String[] args) {
        int []arr={10,20,30,50,89,90};
        System.out.println(KthDiffer(arr,10,30));
    }

    static int KthDiffer(int []arr,int k, int target){
        int start=0;
        while(start<arr.length){
            int diff=Math.abs(arr[start]-target)/k;
            diff=Math.max(1, diff);
            start+=diff;
            if(arr[start]==target){
                return start;
            }
        }
        return -1;
    }
}

class LargestContiuneSumSubarray{
    public static void main(String[]args){
        int arr[]={-3,-4,4,-1,-2,1,5,-3};
        int sum=arr[0];
        int now_sum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum=Math.max(sum+arr[i],arr[i]);
            now_sum=Math.max(now_sum,sum);
        }
        System.out.println("Longest sum of subarray is "+now_sum);
    }
}
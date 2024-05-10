public class SubArraySum {
    public static void main(String[] args) {
        int arr[]={1,2,4};
        sum(arr);
    }

    static void sum(int []arr){
        int i;
        int j;
        int sum=0;
        for(i=0;i<arr.length;i++){
           for(j=0;j<arr.length-2;j++){
              sum+=arr[j];
              //System.out.print(" "+sum);
              int extra=sum+arr[j+1];
              //System.out.println();
              System.out.print(" "+extra+" "+sum);
           }
        }
    }
}

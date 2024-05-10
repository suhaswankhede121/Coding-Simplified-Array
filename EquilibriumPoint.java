class EquilibriumPoint{
    public static void main(String[] args) {
        int []arr={1,4,0,5};
        System.out.println(equilibriumPoint(arr));
    }

    static int equilibriumPoint(int []arr){
        int totalsum=0;
        int right_sum=arr[0];
       for(int i=1;i<arr.length;i++){
         totalsum+=arr[i];
       }
        for(int i=1;i<arr.length;i++){
            totalsum-=arr[i];
            if(right_sum==totalsum){
                return i-1;
            }else{
                right_sum=arr[i];
            }
        }
        return -1;
    }
}
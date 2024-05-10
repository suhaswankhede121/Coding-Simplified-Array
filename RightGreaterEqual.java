class RightGreaterEqual{
    public static void main(String[]args){
        int []arr={14,15,8,9,5,2};
        int []ans=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    ans[k]=arr[j];
                    k++;
                }else{
                    ans[k]=arr[j];
                }
            }
        }
        for(int i:ans){
           if(i>0) System.out.print(" "+i);
        }
    }
}
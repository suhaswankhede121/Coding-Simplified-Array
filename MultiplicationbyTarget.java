public class MultiplicationbyTarget {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,6,};
        System.out.println(isFind(arr, 13));
    }

    //Most Optimize Solution 
    static boolean isFind(int []arr,int target){
        int i=0;
        int j;
        //int k=arr.length-1;
       for(j=i+1;i<arr.length-1;j++){
          if(arr[i]*arr[j]==target){
            return true;
          }
          i++;
          //k--;
       }
        return false;
    }
}

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int []arr={1,2,2,4,5,6,4,7,7};
        System.out.println(firstRepeat(arr));
    }

    static int firstRepeat(int []arr){
      Set set=new HashSet<>();
      int check=-1;
      for(int i=arr.length-1;i>0;i--){
        if(set.contains(arr[i])){
            check=arr[i];
        }else{
            set.add(arr[i]);
        }
      }
      return check;
    }
}

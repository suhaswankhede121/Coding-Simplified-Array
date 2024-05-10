import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class UnionOfArray {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5};
        int []arr2={1,2,7,8,3};
       //System.out.println(unionArray(arr1, arr2));
       //System.out.println(intersection(arr1, arr2));
       System.out.println(difference(arr1, arr2));
    }

    static Set unionArray(int []arr1,int []arr2){
        Set ans=new HashSet<>();
        for(int i:arr1){
            ans.add(i);
        }
        for(int i:arr2){
            ans.add(i);
        }
        return ans;
    }

    static Set intersection(int []arr1,int[]arr2){
        Set ans=new HashSet<>();
        Set ans2=new HashSet<>();
         for(int i:arr1){
            ans.add(i);
        }
        for(int i:arr2){
           Iterator it=(Iterator) ans.iterator();
           while(it.hasNext()){
              int check=(int)it.next();
             if(check==i){
                ans2.add(i);
             }
           }
        }
        return ans2;
    }

    static Set<Integer> difference(int []arr1,int []arr2){
        Set<Integer> result = new HashSet<>();
        for (int num : arr1) {
           boolean found = true;
            for (int compareNum : arr2) {
                if (num == compareNum) {
                    found = false;
                    break;
                }
            }
            if (found) {
                result.add(num);
            }
        }
         for (int num : arr2) {
            boolean found = false;
            for (int compareNum : arr1) {
                if (num == compareNum) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.add(num);
            }
        }
        return result;
    }
    
}

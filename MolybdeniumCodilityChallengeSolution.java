// you can also use imports, for example:
 import java.util.*;
import java.util.Arrays;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int K, int M, int[] A) {
        // write your code in Java SE 8
        
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for (int i=0;i<=A.length-K;i++){
            int[] A1=new int[A.length];
            for(int t=0;t<A.length;t++){
                A1[t]=A[t];
            }
            // System.out.println("-----");
            int count=0;int leader=-1;
            for (int j=i;j<i+K;j++){
                A1[j]++;
                // System.out.println("++"+A1[j]);
            }
             Arrays.sort(A1); 
             
             
             for(int k=0;k<A1.length;k++){
      // System.out.println("++"+A1[k]);
                 if (A1[k]==A1[A.length/2]){
                     count++;
                 }
                 if(count>A1.length/2){
                     leader=A1[A.length/2];
                   
                 }
             }
             
             if(leader!=-1){
                 if(list.size()==0){
                     list.add(leader);
                 }
                 else{
                     boolean poker=false;
                     for (int r=0;r<list.size();r++){
                         if (leader==list.get(r)){
                             poker=true;
                             break;
                         }
                        
                     }
                      if (poker==false){
                             list.add(leader);
                         }
                         Collections.sort(list);
                 }
             }
        }
        
        Integer[] array=list.toArray(new Integer[list.size()]);
        
        int[] intArray = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
        
        return intArray;
        
    }
}
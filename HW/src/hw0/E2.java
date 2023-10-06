package hw0;



public class E2 {
    public static int max(int[] m){
       int n=0;
       int max=0;
       while (n<m.length){
           if(m[n]>max){
               max=m[n];
           }
           n++;
       }
       return max;
    }
}

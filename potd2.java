 import java.util.*;
 public class potd2 {
    public static void freq (String s){
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        String sorteds=new String(arr);
       
        int i;
        
        for (i=0;i<s.length();i++){
            int count=1;
            while(i<s.length()-1 && sorteds.charAt(i)==sorteds.charAt(i+1)){
            count++;
            i++;
        }
        if (count>1){
            System.out.println(sorteds.charAt(i)+" "+count);
            

        }
       /*  if (count>2){
            System.out.println(sorteds.charAt(i)+" "+count);
            

        */

 

      
    }}
    public static void main (String args[]){
        String s=new String("fdfsdfdfsdfsfr");
        freq(s);
       // System.out.println(freq(s));


    }
    
}

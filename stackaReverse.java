import java.util.Stack;

public class stackaReverse {
    /**
     * @param st
     * @return
     */
    public static String reverse(String ){
    //    Stack<Character> s=new Stack<>();
    Stack<Character> s=new Stack<>();
        int id=0;
        while(id<st.length()){
            s.push(st.charAt(id));
            id++;
        } 
    StringBuilder result =new StringBuilder("");
        while(!s.isEmpty()){
           char curr=s.pop();
            result.append(curr);
    
        }
   }
   /**
 * @param args
 */
public static void main(String args[]){
    String st="sdad";
    String result=reverse(st);
    System.out.println(result);
    

   }
    

}

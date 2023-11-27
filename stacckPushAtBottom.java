import java.util.Stack;

public class stacckPushAtBottom {
    public static void pushbottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
    int top=s.pop();
    pushbottom(s,data); 
    s.push(top);

    }
       

    public static void main (String args[]){
        Stack<Integer> s=new Stack<>();
                s.push(4);
                s.push(5);
                s.push(6);

         pushbottom(s,3);       

                while(!s.isEmpty()){
                    System.out.println(s.pop());
                    
                }
            
        }
    
}

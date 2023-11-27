import java.util.ArrayList;

public class Stackb {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();

//creating four functions-- isEmpty9 ,push() ,pop(),peek()
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);//add func
        }
        public static int pop(){
            if(isEmpty()){
                return-1;
            }
            int top =list.get(list.size()-1);
            list.remove(list.size()-1);//remove func
            return top;
        }
        public static int peek(){
             if(isEmpty()){
                return-1;
            }
            return list.get(list.size()-1);//remove func


        }
        public static void main (String args[]){
            Stack s =new Stack();
                s.push(4);
                s.push(5);
                s.push(6);

                while(!s.isEmpty()){
                    System.out.println(s.peek());
                    s.pop();
                }
            
        }
    }

    
}


public class stackQueue {
     static int rear;
     static int arr[];
     static class Queue { static int arr[];
        
        static int size;
        

        Queue(int n){
         arr=new int[n];
         size=n;
         rear=-1;
        
        }
        //empty
        public boolean isEmpty(){
            return rear==-1;
        }
        //Enqueue
        public void Enqueue(int data){
            if(rear==size-1){
             System.out.println("full");
              return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        //Dequeue
        public int dequeue(){
           if (isEmpty()){
            System.out.println("empty");
            return -1;
           }
           int front=arr[0];
           for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];

           }
           front=front-1;
           return front;
        }



        public int peek(){
            if (isEmpty()){
            System.out.println("empty");
            return -1;
        }
        return arr[0];
       }
    }
    public static void main(String args[]){
       Queue q =new Queue(5);
       q.Enqueue(5);
       q.Enqueue(6);
     //  q.Enqueue(0);
        while(!q.isEmpty()){
        System.out.println(q.peek());
        q.dequeue();
        }
       
    }
 
    
}

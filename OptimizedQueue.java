public class OptimizedQueue {
    private int rear;
    private int[] arr;

    public OptimizedQueue(int size) {
        arr = new int[size];
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return rear == arr.length - 1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        arr[++rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int front = arr[0];
        // Shift elements to the left to remove the front element
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--; // Decrement the rear pointer
        return front;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }

    public static void main(String[] args) {
        OptimizedQueue q = new OptimizedQueue(5);
        q.enqueue(5);
        q.enqueue(6);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}

package Queues;

public class CircularQ {
    static class CQ{
        static int arr[] ;
        static int size;
        static int front;
        static int rear;

        CQ(int n){
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }
        public static boolean isEmpty(){
            return front == -1 && rear == -1;
        }
        public static boolean isFull(){
            return (rear+1) % size ==  front;
        }
        //Add
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;        
            }
            // Add 1st element
            if(front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
        //Remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty CQ");
                return -1;
            }
            int value = arr[front];
            
            //last el delete
            if(rear == front){
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return value;
        }
        //Peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }

    }




    public static void main(String[] args) {
        CQ q = new CQ(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        //print queue
        while(!q.isEmpty()){
            System.out.println(q.peek()+" ");
            q.remove();
        }
    }
}

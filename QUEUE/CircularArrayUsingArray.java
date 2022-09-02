public class CircularArrayUsingArray {
    static class CirArray{
        static int arr[];
        static int size;
        static int front,rear=-1;
        CirArray(int n){
            arr = new int[n];
            size=n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear+1)%size==front;
        }

        public static void add(int data){
            if(isFull()) {
                System.out.println("queue is full");
                return;
            }

            // if(front ==-1) 


        }
 
    }
    public static void main(String[] args) {
        
    }
}

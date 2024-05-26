package dsa_lab_exam;

public class CircularQueue {
    int[] numbers;
    int front;
    int rear;
    int noitems;
    int maxsize;

    public CircularQueue(int size){
        maxsize=size;
        numbers=new int[maxsize];
        front=0;
        rear=-1;
        noitems=0;


    }

    public boolean isEmpty(){
         noitems=0;
         return true;
    }
    public boolean isFull(){
        noitems=maxsize;
        return true;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
        }
        if(rear==maxsize-1){
            rear=-1;
        }
        numbers[++rear]=value;
        noitems++;

    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int frontvalue=numbers[front++];
        if(front==maxsize){
            front=0;
            noitems--;
        }
        return frontvalue;
    }
    public int front(){
        return numbers[front];

    }
    public int rear(){
        return numbers[rear];
    }

    public static void main(String[] args) {
        CircularQueue q=new CircularQueue(4);
        q.enqueue(4);
        q.enqueue(7);
        q.enqueue(2);
        q.enqueue(9);
        q.dequeue();
        q.dequeue();

        while (!q.isEmpty()){
            System.out.println(q.dequeue());
        }

    }
}

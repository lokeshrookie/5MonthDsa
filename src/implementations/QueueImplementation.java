package implementations;

/**
 *  enque
 *  deque
 *  isEmpty
 *  size
 *  DisplayB
 *
 *  Queue is an interface defined in the java package. it has to be implemented or extended by various other interfaces and classes.
 *  some of them are linked list and priority queue.
 *
 *  Important points:
 *      1. If the queue is empty, front and rear pointing to the same place. (0 th index means no elements.).
 *      2. after inserting one element. front will remain same and rear moves.
 *      3. if the queue is full, (if rear == size) we can not add new elements.
 *
 *
 */
public class QueueImplementation {
    public static void main(String[] args) {


    }
}

class QueueUsingArrays {
    int fornt;
    int rear;
    int capacityOfQueue;
    static int[] q1; // 1 D array

    QueueUsingArrays(int size){
        capacityOfQueue = size;
        q1 = new int[capacityOfQueue];
    }
    void enque(){

    }




}

























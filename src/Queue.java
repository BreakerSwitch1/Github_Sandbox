public class Queue {
    public void enqueue(Alert al){

    }
    public Alert dequeue(){

    }
    public Alert peek(){

    }
    public int count(){

    }

    // Inner or Nested Class
    private class QueueRecord(){
        public Alert alert;
        public QueueRecord next;
    }

    private QueueRecord head, tail;
}

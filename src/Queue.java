public class Queue {
    public Queue(){};
    public void enqueue(Alert obj){
        QueueRecord rec = new QueueRecord(obj);
        if(tail != null){
            tail.next = rec;
            tail = rec;
        }else{
            if(tail == null){
                head = rec;
                tail = rec;
            }
        }
    }
    public Alert dequeue(){

    }


    // Inner or Nested Class
    private class QueueRecord(Alert al){
        public Alert Alert;
        public QueueRecord next;
    }

    private QueueRecord head, tail;
}

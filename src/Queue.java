public class Queue {
    public void enqueue(Alert al){
        QueueRecord rec = new QueueRecord(al);
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
    public Alert peek(){

    }
    public int count(){

    }

    // Inner or Nested Class
    private class QueueRecord(Alert al){
        public Alert alert;
        public QueueRecord next;
    }

    private QueueRecord head, tail;
}

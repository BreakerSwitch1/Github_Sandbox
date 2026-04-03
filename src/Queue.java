public class Queue {
    private QueueRecord head;
    private QueueRecord tail;
    public Queue(){
    }

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
        if(head != null){
            return null;
        }
        if(head == null){
            tail = null;
        }
        return null;

    }


    // Inner or Nested Class
    private class QueueRecord{
        public Alert alert;
        public QueueRecord next;
        public QueueRecord(Alert al){
            alert = al;
        }
    }

    public int count(){
        int ct = 0;
        QueueRecord rec = head;
        while(rec !=null){
            ct++;
            rec = rec.next;
        }
        return ct;
    }

    public Alert peek(){
        if(head==null){
            return null;
        }
        return head.alert;
    }
}

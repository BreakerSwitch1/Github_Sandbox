public class Queue {
    public Queue(){
        int[] times = {1,2,3,4,5,6};
        for(int i = 0; i<times.length; i++){
            this.enqueue(new Alert(null,null,times[i]));
        }
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

    private QueueRecord head, tail;

    public int count(){
        int ct = 0;
        QueueRecord rec = head;
        while(rec !=null){
            ct++;
            rec = rec.next;
        }
        return ct;
    }
}

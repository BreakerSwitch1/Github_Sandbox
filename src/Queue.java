public class Queue {
    public Queue(){
        Queue queue = new Queue();
        int[] times = {5,10,15,20,25,30};
        for(int i = 0; i<times.length; i++){
            queue.enqueue(new Alert(null,null,times[i]));
        }
    }

    public void enqueue(Alert al){
        QueueRecord rec = new QueueRecord();
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
        public Alert Alert;
        public QueueRecord next;
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

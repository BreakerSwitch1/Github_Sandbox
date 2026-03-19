import java.util.Queue;
public class Alert {
    private Patient patient;
    private Observation observation;
    private int starting_time;
    private int importance;
    public Alert(Observation obs, int time, int priority){
        starting_time = time;
        observation = obs;
        importance = priority;

    }

    public void getAlertInfo(){

    }

    public String toString(){
        return String.format("Alert: %s %s Time: %d", patient.toString(), observation.toString(), starting_time);
    }

}

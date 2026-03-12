import java.util.Queue;
public class Alert {
    private Patient patient;
    private Observation observation;
    private int starting_time;
    public Alert(Patient pa, Observation obs, int time){
        int start_time = time;
    }

    public void getAlertInfo(){

    }

    public String toString(){
        return String.format("Alert: %s %s Time: %d", patient.toString(), observation.toString(), starting_time);
    }

}

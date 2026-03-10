import java.util.Queue;
public class Alert {
    private String patient_uuid;
    private Observation observation;
    private double starting_time;
    public Alert(String uuid, Observation observ, double time){
        patient_uuid = uuid;
        observation = observ;
        starting_time = time;
    }

    public void getAlertInfo(){

    }

}

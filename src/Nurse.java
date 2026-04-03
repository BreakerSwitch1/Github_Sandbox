import java.util.UUID;
import java.util.Random;

public class Nurse {
    private Nurse[] Nurse;
    private UUID nurseID;
    private Alert alert;
    private static Random rand = new Random();
    private double experienceLevel;

    public Nurse(UUID nurseID, Alert alert,double exp_level){
        Nurse = new Nurse[100];
        experienceLevel = exp_level;
        this.alert = alert;
        this.experienceLevel = exp_level;
    }
    public void resolve(Hospital hospital, int current_time){
        if(alert == null){
            alert = hospital.getNextAlert();
        }
        while(alert != null){
            double prob = calculateResolutionProbablility(alert);
        }
    }
    public void update_nurse(int current_time){
        System.out.println(current_time);
    }

    private double calculateResolutionProbablility(Alert alert){
        double baseProb = 0.5;
        Observation obs = alert.getObservation();

        if(obs instanceof Temperature){
            baseProb = alert.getIsUrgent() ? 0.4:0.7;
        }else if(obs instanceof BloodPressure){
            baseProb = 0.3;
        }
        return baseProb * experienceLevel;
    }
    public void makeNurse(){

    }
}

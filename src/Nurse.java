import java.util.UUID;

public class Nurse {
    private int experienceLevel;

    public Nurse(int exp_level){
        experienceLevel = exp_level;
    }
    public void update_nurse(int current_time){
        System.out.println(current_time);
    }
    static Nurse makeNurse(int exp_level){
        return new Nurse(exp_level);
    }
}

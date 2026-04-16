import java.util.Queue;
import java.util.Random;
import java.io.*;
public class Hospital {
    private Patient[] patients;
    private Nurse[] nurses;
    Random rng = new Random();
    private Queue highPriorityQueue;
    private Queue lowPriorityQueue;
    private Queue resolvedQueue;

    public Hospital() {
        Queue q1 = highPriorityQueue;
        Queue q2 = lowPriorityQueue;
        Queue resolved = resolvedQueue;
    }

    public void hospital_setup(int patient_count, int nurse_count){
        patients = new Patient[patient_count];
        for(int i = 0; i<patients.length; i++){
            patients[i] = Patient.makePatient();
            patients[i].addDevice(new TemperatureMonitor());
        }

        nurses = new Nurse[nurse_count];
        for(int n = 0; n<nurses.length; n++){
            nurses[n] = new Nurse(java.util.UUID.randomUUID(), this.getNextAlert(), rng.nextDouble(1,4));
        }
    }

    public Alert getNextAlert(){
        //if(highPriorityQueue)
        return new Alert(new Temperature(1,Main.sim.getTime()),1,1);
    }

    public void print_test() {
        for (int i = 0; i < patients.length; i++) {
            Patient p = patients[i];
            if (patients[i] != null) {
                System.out.println("Name: " +p.getPatient_firstname()+ " " +p.getPatient_lastname()+ " Sex: " +p.getPatient_sex()+ " UUID: " +p.getPatient_uuid()+ " Date of Birth: " +p.getPatient_date_of_birth());
            }
        }
    }

    public void update(int cur_time) {
        for (int i = 0; i < patients.length; i++) {
            patients[i].update(cur_time, this);
        }
        for(int n = 0; n < nurses.length; n++){
            nurses[n].update_nurse(cur_time);
        }
    }

    public void alert_enqueue(Alert al){
        if(al.getImportance() == 3){
        }
    }
}
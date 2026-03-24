import java.util.Queue;
import java.util.Scanner;
import java.io.*;
public class Hospital {
    private Patient[] patients;
    private Queue highPriorityQueue;
    private Queue lowPriorityQueue;
    private Queue resolvedQueue;

    public Hospital() {
        Queue q1 = highPriorityQueue;
        Queue q2 = lowPriorityQueue;
        Queue resolved = resolvedQueue;
    }

    public void hospital_setup(int patient_count){
        patients = new Patient[patient_count];
        for(int i = 0; i<patients.length; i++){
            patients[i] = Patient.makePatient();
            patients[i].addDevice(new TemperatureMonitor());
        }
    }

    public void print_test() {
        for (int i = 0; i < patients.length; i++) {
            Patient p = patients[i];
            if (patients[i] != null) {
                System.out.println("Name: " +p.getPatient_firstname()+ " " +p.getPatient_lastname()+ " Sex: " +p.getPatient_sex()+ " UUID: " +p.getPatient_uuid()+ " Date of Birth: " +p.getPatient_date_of_birth());
            }
        }
    }

    public void update(int cur_time){
        for(int i = 0; i<patients.length; i++){
            patients[i].update(cur_time);
        }
    }
}
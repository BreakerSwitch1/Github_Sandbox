import java.util.Scanner;
import java.io.*;
public class Hospital {
    private Patient[] patients;

    public Hospital() {
        Queue q = new Queue();
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

    public void update(double cur_time){
        for(int i = 0; i<patients.length; i++){
            patients[i].readDevices();
        }
    }

    public void add_patient(Patient patient) {
        for(int i = 0; i<patients.length; i++){
            if(patients[i] == null && patients[i] != patient){
                patients[i] = patient;
                return;
            }
        }
    }
}
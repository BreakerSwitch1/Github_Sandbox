import java.util.Scanner;
import java.io.*;
public class Hospital {
    private Patient[] patients;

    public Hospital() {
        patients = new Patient[5];
        print_test();
    }

    public void print_test() {
        for (int i = 0; i < patients.length; i++) {
            Patient p = patients[i];
            if (patients[i] != null) {
                System.out.println("Name: " +p.getPatient_firstname()+ " " +p.getPatient_lastname()+ " Sex: " +p.getPatient_sex()+ " ");
            }
        }
    }

    public void update(){
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
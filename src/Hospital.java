import java.util.Scanner;
import java.io.*;
public class Hospital {
    private Patient[] patients;

    public Hospital() {
        patients = new Patient[5];
        Patient j_patient = new Patient("Joseph","Smith", Patient.Sex.male,"06/26/2006", new TemperatureMonitor());
        Patient e_patient = new Patient("Elias","Doe",Patient.Sex.male,"05/24/2007", new TemperatureMonitor());
        add_patient(j_patient);
        add_patient(e_patient);
        Hospital_Setup(patients);
        print_test();
    }

    public void Hospital_Setup(Patient[] p){
        for(int i = 0; i< p.length; i++){
            if(p[i] != null){
                p[i].addDevice(new TemperatureMonitor());
            }
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
import java.util.Scanner;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Simulation {
    private Hospital hospital;
    double StartTime = 0.0;
    private int CurrentTime = 0;//Time in Minutes
    private final int EndTime = 1440;
    private final int TimeIncrement = 5;
    int PatientCount = 5;
    int NurseCount = 6;
    public Simulation(){
        setup();
        //run();
    }

    public void setup(){
        hospital = new Hospital();
        hospital.hospital_setup(PatientCount,NurseCount);
    }
    public void run(boolean manual_step){
        if(manual_step == true){
            int block_num = 1;
            System.out.println("You are using manual mode!");
            while(CurrentTime<=EndTime) {
                System.out.println("Block " +block_num+ " Start");
                hospital.update(CurrentTime);
                CurrentTime += TimeIncrement;
                boolean n = next_step();
                if(n == true){
                    block_num +=1;
                }
            }
        }
    }

    public static boolean next_step() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type 'y' to go to next block (y/n)? ");
        String input_string = sc.next();
        return(input_string.equals("y"));
    }
}

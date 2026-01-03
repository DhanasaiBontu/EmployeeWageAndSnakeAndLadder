import java.util.Random;

public class EmployeeWageComputation {

    public void checkAttendance() {
        int empCheck = new Random().nextInt(2);

        if (empCheck == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}

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

    public void calculateDailyWage() {
        int wagePerHour = 20;
        int fullDayHour = 8;
        int dailyWage = wagePerHour * fullDayHour;
        System.out.println("Daily Employee Wage: " + dailyWage);
    }

    public void calculatePartTimeWage() {
        int wagePerHour = 20;
        int partTimeHours = 8;

        int partTimeWage = wagePerHour * partTimeHours;
        System.out.println("Part Time Employee Wage: " + partTimeWage);
    }



}

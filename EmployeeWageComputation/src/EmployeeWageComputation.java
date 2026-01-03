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
        int partTimeHours = 4;

        int partTimeWage = wagePerHour * partTimeHours;
        System.out.println("Part Time Employee Wage: " + partTimeWage);
    }


    public void calculateWageUsingSwitchCase() {
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;

        int empType = new Random().nextInt(3);
        int empHours;

        switch (empType) {
            case 1:
                empHours = fullDayHour;
                break;
            case 2:
                empHours = partTimeHour;
                break;
            default:
                empHours = 0;
        }

        int wage = empHours * wagePerHour;
        System.out.println("Employee Wage using Switch Case: " + wage);
    }

    public void calculateMonthlyWage() {
        int wagePerHour = 20;
        int fullDayHour = 8;
        int workingDays = 20;

        int monthlyWage = wagePerHour * fullDayHour * workingDays;
        System.out.println("Monthly Employee Wage: " + monthlyWage);
    }

    public void calculateWageTillCondition() {
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int maxWorkingDays = 20;
        int maxWorkingHours = 100;

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < maxWorkingHours && totalDays < maxWorkingDays) {
            totalDays++;

            int empType = new Random().nextInt(3);
            int empHours;

            switch (empType) {
                case 1:
                    empHours = fullDayHour;
                    break;
                case 2:
                    empHours = partTimeHour;
                    break;
                default:
                    empHours = 0;
            }

            totalHours += empHours;
        }

        int totalWage = totalHours * wagePerHour;
        System.out.println("Total Wage till condition: " + totalWage);
    }



}

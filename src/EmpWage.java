
public class EmpWage {

    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOURS = 20;

        int empHrs = 0;
        int empWage = 0;


        int empCheck = (int) (Math.random()*10)%3;

        if(empCheck == IS_FULL_TIME)
            empHrs = 8;
        else if (empCheck == IS_PART_TIME)
            empHrs = 4;
        else
            empHrs = 0;

        empWage = empHrs * EMP_RATE_PER_HOURS;
        System.out.println("EMP Wages: "+ empWage);
    }
}

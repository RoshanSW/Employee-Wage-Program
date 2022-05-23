


public class EmpWage {

    public static void main(String[] args) {

        int empCheck = (int) (Math.random()*10)%2;

        if(empCheck == 1)
            System.out.println("Full time employee");
        else
            System.out.println("Part time employee");
    }
}

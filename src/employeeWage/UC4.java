package employeeWage;

public class UC4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int wagePerHour = 20;
		int wage = 0;
		int empHour = 0;
		int check = (int)(Math.floor(Math.random() * 10)% 3);
		
        switch (check) {
        case 1:
            empHour = 4;
            System.out.println("Employee is half time");
            break;
        case 2:
            empHour = 8;
            System.out.println("Employee is present");
            break;
        case 0:
            empHour = 0;
            System.out.println("Employee is absent");
            break;
        default:
            System.out.println("Invaild value");
    }
        
        wage = empHour * wagePerHour;
        System.out.println("Wage of the employee "+wage);
        
	}

}

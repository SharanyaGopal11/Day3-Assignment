package employeeWage;

public class UC3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int is_absent = 0;
		int is_halftime = 1;
		int is_fulltime = 2;
		int wagePerHour = 20;
		int wage = 0;
		int hours = 0;
		int check = (int)(Math.floor(Math.random() * 10)% 3);
		
		if(check == is_absent){
			System.out.println("Employee is absent");
			hours =0;
		}
		else if(check == is_halftime){
			System.out.println("Employee is half time");
			hours =4;
		}
		else if(check == is_fulltime){
			System.out.println("Employee is full time");
			hours =8;
		}
		
		wage = hours * wagePerHour;
		System.out.println("Wage of the employee "+wage);
	}

}

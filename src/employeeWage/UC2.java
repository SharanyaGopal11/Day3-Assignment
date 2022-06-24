package employeeWage;

public class UC2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int is_present = 1;
		int is_absent = 0;
		int check = (int) (Math.floor(Math.random() * 10)%2);
		int wagePerHour = 20;
		int hours = 0;
		
		if (check == is_present){
			System.out.println("Employee is present");
			hours = 8;
		}
		else if (check == is_absent){
			System.out.println("Employee is absent");
			hours =  0;
		}
		
		int wage = hours * wagePerHour;
		System.out.println("wage of the employee "+wage);
	}

}

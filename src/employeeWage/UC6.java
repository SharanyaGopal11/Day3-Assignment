package employeeWage;

public class UC6 {

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
		int totalwage =0;
		int check = (int)(Math.floor(Math.random() * 10)% 3);
		int totalHours = 100;
		int totaldays = 20;
		int hours_spent =0;
		int days_spent =0;
		
		while((hours_spent < totalHours) && (days_spent < totaldays)){
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
			totalwage = totalwage + wage;
			hours_spent = hours_spent + hours;
			days_spent = days_spent + 1;
			
		}
		System.out.println("days spent "+days_spent+" hours spent "+hours_spent);
		System.out.println("Total wage of employee "+totalwage);
	}

}

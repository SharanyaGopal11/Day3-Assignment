package employeeWage;

public class UC1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int is_present = 0;
		int is_absent = 1;
		
		int employee_check = (int) (Math.floor(Math.random() * 10) % 2);
		
		if(employee_check == is_present){
			System.out.print("Employee is present");
		}
		else if(employee_check == is_absent){
			System.out.print("Employee is absent");
		}
	}

}

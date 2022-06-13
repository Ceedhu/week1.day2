package week1.day2.assignments;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		EmployeeDetails Mahesh=new EmployeeDetails();
		Mahesh.printEmployeeName();
		String employeeAddress = Mahesh.getEmployeeAddress();
		System.out.println(employeeAddress);
		double printEmployeeSalary = Mahesh.printEmployeeSalary();
		System.out.println(printEmployeeSalary);
		long printEmployeeMobileNumber = Mahesh.printEmployeeMobileNumber();
		
		System.out.println(printEmployeeMobileNumber);
		
		
	}
		void printEmployeeName()
		{
			String empName="Mahesh";
			System.out.println(empName);
			int empid=476514;
			System.out.println(empid);
			}
		
		String getEmployeeAddress()
		{
			String empAddress="chennai";
			return(empAddress);
			
		}
		double printEmployeeSalary()
		{
			double empSalary=67500.87690;
			return(empSalary);
		}
			
		
		long printEmployeeMobileNumber()
		{
			long mobNum=7904323899L;
			return(mobNum);
			
		}
		// TODO Auto-generated method stub

	

}


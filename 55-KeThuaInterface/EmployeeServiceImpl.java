package milliwatt.phuc.service;

public class EmployeeServiceImpl implements EmployeeService, AnimalService{
	//Co the implement nhieu interface khac
	
	public void luong() {
		System.out.println("luong override");
	}

	public void them() {
		// TODO Auto-generated method stub
		
	}

	public void sua() {
		// TODO Auto-generated method stub
		
	}

	public void xoa() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		EmployeeService emp = new EmployeeServiceImpl();
		
		AnimalService p = new EmployeeServiceImpl();
		
		emp.luong();
	}
	
}

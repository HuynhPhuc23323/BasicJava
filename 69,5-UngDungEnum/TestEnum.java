package milliwatt.phuc.enumeration;

public class TestEnum {

	public static void main(String[] args) {
		System.out.println(RoleUser.ROLE_ADMIN.name());
		
		for(RoleUser role : RoleUser.values()) {
			System.out.println(role.name());
			System.out.println(role.getId());
		}
		
		Person p = new Person();
		p.setRole(RoleUser.ROLE_ADMIN);
		
		if(p.getRole() == RoleUser.ROLE_ADMIN) {
			System.out.println("OK");
		}
	}
	
}

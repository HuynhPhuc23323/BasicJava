package milliwatt.phuc.enumeration;

public enum RoleUser {

	ROLE_ADMIN(1),ROLE_USER(2);
	
	private int id;
	
	private RoleUser(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}

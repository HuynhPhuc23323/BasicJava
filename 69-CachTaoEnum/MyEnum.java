package milliwatt.phuc.enumeration;

public enum MyEnum {//la su ket hop cua hang so va class

	CAFE("cafe"), TEA("tra"), COCA("coca");//Hang so
	private String ten;

	private MyEnum(String ten) {//constructor cua Enum k the la public
		this.ten = ten;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}
	
	
	
}

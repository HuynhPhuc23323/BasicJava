package milliwatt.phuc.domain;

public class Animail {
	
	private String ten;
	public int tuoi;
	protected String noiSinhSong;
	String diaChi;
	
	//cac ham cung tuong tu the
	public void thongTin() {
		ten = "A";
		tuoi = 12;
		noiSinhSong = "VietNam";
		diaChi = "Hanoi";
	}
	private void anUong() {}
	protected void diLai() {}
	void daoChoi() {}
}

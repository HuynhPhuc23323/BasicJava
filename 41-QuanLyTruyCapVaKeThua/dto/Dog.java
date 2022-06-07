package milliwatt.phuc.dto;

import milliwatt.phuc.domain.Animail;

public class Dog extends Animail{

	public void thongTinDog() {
		//ten = "A"; bien private
		tuoi = 12;
		noiSinhSong = "HaNoi";
		//diaChi = "VN" bien default
		
		//anUong(); private
		thongTin();
		diLai();
		//daoChoi(); default
	}
	
}

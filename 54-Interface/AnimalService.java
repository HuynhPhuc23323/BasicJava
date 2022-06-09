package milliwatt.phuc.service;

public interface AnimalService {
	//Moi ham trong interface deu co abstract va public (default)
	//Bat buoc override lai
	
	public final int HANG_SO = 10;
	
	public abstract void them();
	
	void xoa(); //ngam dinh public abstract
	//k the khai bao private, default, protected
	
	
	
}

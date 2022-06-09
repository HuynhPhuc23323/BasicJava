package milliwatt.phuc.service;

public interface AnimalService {
	//Moi ham trong interface deu co abstract va public (default)
	//Bat buoc override lai
	//hieu nhu 1 cai dan y. Chua biet viet ham them,sua, xoa sao nhung phai co thi dung interface
	
	public final int HANG_SO = 10;
	
	public abstract void them();
	
	public void sua();
	
	void xoa(); //ngam dinh public abstract
	//k the khai bao private, default, protected
	
	
	
}

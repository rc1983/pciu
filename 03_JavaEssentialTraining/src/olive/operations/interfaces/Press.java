package olive.operations.interfaces;

import java.util.List;

public interface Press 
{
	public double getOil(List<?> oliveModels);
	
	public void setOil(double oil);
	
	public double getCurrentOil();
}

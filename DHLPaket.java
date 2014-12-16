package lab25;

public class DHLPaket extends Pakovanje {
	
	public double getDimensionalWeight()
	{
		return ((getWidth()*getHeight()*getLength())/5000);
	}
}

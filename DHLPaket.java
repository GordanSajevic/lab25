package lab25;

public class DHLPaket extends Pakovanje {
	
	// Kod prepisan sa table
	
	public double getDimensionalWeight()
	{
		return ((getWidth()*getHeight()*getLength())/5000);
	}
	
	@Override
	public double getWeight()
	{
		return Math.max(weight, getDimensionalWeight());
	}
}

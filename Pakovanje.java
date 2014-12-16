package lab25;

public class Pakovanje {
	
	private double height;
	private double width;
	private double length;
	private double weight;
	private double price;
	
	
	public double getHeight()
	{
		return height;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public double getPrice()
	{
		return weight * 3;
	}
	
	public void setHeight(double height)
	{
		if (height < 0)
		{
			throw new IllegalArgumentException("Height cannot be lesser than zero!");
		}
		else
		{
			this.height = height;
		}
	}
	
	public void setWidth(double width)
	{
		if (width < 0)
		{
			throw new IllegalArgumentException("Width cannot be lesser than zero!");
		}
		else
		{
			this.width = width;
		}
	}
	
	public void setLength(double length)
	{
		if (length < 0)
		{
			throw new IllegalArgumentException("Length cannot be lesser than zero!");
		}
		else
		{
			this.length = length;
		}
	}
	
	public void setWeight(double weight)
	{
		if (weight < 0)
		{
			throw new IllegalArgumentException("Weight cannot be lesser than zero!");
		}
		else
		{
			this.weight = weight;
		}
	}
	
	public String toString()
	{
		return "Paket (" + getWidth() + " x " + getHeight() + " x " + getLength() + "), težina: " + getWidth() + ", cijena: " + getPrice(); 
	}
	
	
}

package lab25;

public class Test {

	public static void main(String[] args) {
		public static void main(String[] args) {
		System.out.println("Enter weight: ");
		double weight = TextIO.getDouble();
		System.out.println("Enter width: ");
		double width = TextIO.getDouble();
		System.out.println("Enter length: ");
		double length = TextIO.getDouble();
		System.out.println("Enter height: ");
		double height = TextIO.getDouble();
		DHLPaket pack = new DHLPaket();
		pack.setWeight(weight);
		pack.setHeight(height);
		pack.setWidth(width);
		pack.setLength(length);
		System.out.println("Dimensional weight is: " + pack.getDimensionalWeight());
		System.out.println("Weight is: " + pack.getWeight());
		System.out.println("Price is: " + pack.getPrice());
	
	}

}

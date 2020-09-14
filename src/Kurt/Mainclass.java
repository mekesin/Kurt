package Kurt;

public class Mainclass {

	public static void main(String[] args) {
		
		abc ham1 = new abc();
		ham1.color= "red";
		ham1.gear="auto";
		ham1.price=100;
		
		ham1.run();
		ham1.stop();
		ham1.info();
		
		abc ham2 = new abc();
		ham2.color= "blue";
		ham2.gear="Áý";
		ham2.price=100;
		
		ham2.run();
		ham2.stop();
		ham2.info();
	}
		
}

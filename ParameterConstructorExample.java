class BoxP {
	double width, height, depth;
	
	BoxP(double w, double h, double d) {
		//Constructing Box
		width = w;
		height = h;
		depth = d;
	}
	
	double volume() {
		return width*height*depth;
	}
}

public class ParameterConstructorExample {
	public static void main(String[] args) {
		BoxP mybox1 = new BoxP(10, 20, 15);
		BoxP mybox2 = new BoxP(3, 6, 9);
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
	}			
}

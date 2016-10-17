package lekha1;

public class ExampleAndOr {

	public static void main(String[] args) {
		// 
		int x,y;
		x=10;
		y=-10;
		if(x>0 && y>0){
			System.out.println("both are +ve");
		}else if (x>0 || y>0){
		System.out.println("atleast one is +ve");
	}else{
		System.out.println("both are -ve");
	}

}
}

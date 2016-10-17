package lekha1;

public class ExampleArrays {
	public static void main(String[] args) {
		
		int[] a={10,20,30,40,50};
		System.out.println(a[0] +"  " + a[4]);
	// enchanced for
		for(int temp: a){
			System.out.println(temp);
		}
		System.out.println("-------------");
		
		int []x= new int [6];
		x[5]=18;
		x[4]=20;
		x[3]=12;
		x[2]=28;
		x[1]=38;
		x[0]=10;
		
		for(int temp: x){
			System.out.println(x[1]+" "+x[2]+" "+ x[3]);
		}
  }
}

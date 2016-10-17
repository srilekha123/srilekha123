package lekha1;

public class ExampleTwoDim {

	public static void main(String[] args) {
     int[][] RC = new int [4][3];
        int temp=10;
         for(int i=0; i<4;i++){
        	 for(int j=0;j<3;j++){
     		 
        		  RC[i][j]= temp;
        		 temp +=10;
        		 System.out.println("array:"+RC[i][j]);
        	 }
         }
	}

}

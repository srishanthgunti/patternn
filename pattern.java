public class pattern{
public static void main(String args[]){
	int n=5; //no of rows
		 //upper part of the diamond
		 for(int i=1;i<=n;i++){
		for(int j=1;j<=n-1;j++){
			System.out.print(" ");
		}
		for(int j=1;j<=(2*i-1);j++){
			System.out.print("*");
		}
		System.out.println();
		 }
		//lower part of the diamond
		for(int ii=n;ii>0;ii--){ //correct loop variable
		for(int j=1;j<=n-ii;j++){
			System.out.print(" ");
		}
		for(int j=1;j<=(2*ii-1);j++){
			System.out.print("*");
		}
		System.out.println();
		}
}
}

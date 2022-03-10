import java.util.Scanner;
public class Jinzita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in); 
    int s=input.nextInt();
    int i;
    for(i=1;i<=s;i++) {
    	for(int j=1;j<=s-i;j++) {
    		System.out.print(" ");
    		
    	}
    	for(int j=1;j<=i;j++) {
    		System.out.print(j);
    	}
    	for(int j=i-1;j>=1;j--) {
    		System.out.print(j);
    	}
    	System.out.println();
    }
	}

}

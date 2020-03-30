import java.util.Scanner;

public class NumberOfWaysDistance {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(output(n));
	}
	static int output(int n) {
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		return output(n-1)+output(n-2)+output(n-3);
	}

}

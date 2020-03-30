import java.util.*;

public class EditDistance {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			String s1 = sc.next();
			String s2 = sc.next();
			int m=s1.length();
			int n=s2.length();
			System.out.println(output(s1,s2,m,n));
			t--;
		}
	}
	static int output(String s1,String s2,int m,int n){
	    if(m==0){
	        return n;
	    }
	    if(n==0){
	        return m;
	    }
	    if(s1.charAt(m-1)==s2.charAt(n-1)){
	        return output(s1,s2,m-1,n-1);
	    }
	    int a=output(s1,s2,m,n-1);
	    int b=output(s1,s2,m-1,n-1);
	    int c=output(s1,s2,m-1,n);
	    return 1+Math.min(a,Math.min(b,c));
	}
}
package recursion;

public class code01 {
	public static void main(String[] args) {
		int result = func(4);
		System.out.println(result);
	}

	private static int func(int n) {
		if (n==0)
			return 0;
		else
			return n + func(n-1);
	}

}

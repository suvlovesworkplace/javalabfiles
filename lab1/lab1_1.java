class lab1_1 {
	public static void main(String[] args) {
		int n = 10;
		int first = 0;
		int second = 1;

		System.out.println("Fibonacci series up to " + n + "th term:");
		for (int i = 1; i <= n; i++) {
			System.out.print(first);
			if (i < n) {
				System.out.print(", ");
			}
			int next = first + second;
			first = second;
			second = next;
		}
		System.out.println();
	}
}

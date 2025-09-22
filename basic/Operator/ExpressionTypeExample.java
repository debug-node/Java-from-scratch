public class ExpressionTypeExample {

	public static void main(String[] args) {
		byte b = 1;
		short s = 1;
		int i = 1;
		long l = 1;
		float f = 1.0F;
		double d = 1.0;
		char c = 1;

		int intExpressionType = b + b; 			// int
		int intExpressionType2 = s + s; 		// int
		int intExpressionType3 = b + i + c; 	// int

		long longExpressionType = i + l; 		// long

		float floatExpressionType = l + f;		// float

		double doubleExpressionType = f + d;	// double

		System.out.println(10 / 3); // 3
		System.out.println(10.0 / 3); // 3.3333333333333335

		System.out.println("Hello " + 1); // Hello 1
		System.out.println("Hello " + null); // Hello null

	}

}

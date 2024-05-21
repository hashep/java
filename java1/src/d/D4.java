package d;

public class D4 {
	
	void powerOn() {
		System.out.println("뭐인마");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		System.out.printf("%d랑 %d를 더하면 %d란다 주겨벌랑", x, y, result);
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		System.out.printf("나눗셈값 %d 인마", result);
		return result;
	}
	
	void powerOff() {
		System.out.println("뭉탱이");
	}
	
}

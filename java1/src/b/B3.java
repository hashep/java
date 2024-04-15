package b;

public class B3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int value = System.in.read(); 
		
		System.out.print("type = %d" + value);
		
		int value2;
		
		while(true) {
			System.out.println("종료할며ㅕㄴ10을입려갛ㅅ-용");
			value2 = System.in.read();
			System.out.println("value: " + value2);
			if(value2 == 10) {
				break;
			}
		}
		
		System.out.println("종료");
	}

}

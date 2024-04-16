package shit;

public class Shit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<10;a++) {
			for(int b=1;b<10;b++) {
				System.out.print(a + "x" + b + "=" + a*b +" ");
				if(b==9) {
					System.out.print("\n");
				}
			}
		}
	}

}

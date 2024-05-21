package b;

public class B5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		System.out.println("이름: "+ name); // println 은 앞뒤 둘다 줄넘김 처리 알잘딱 해준다
		System.out.print("나이: " + age + "\n전화: " + tel1 + "-");
		System.out.printf("%s-%s", tel2, tel3);
	}

}

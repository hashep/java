package d;

public class D5 {
	
	int age;
	
	void setAge (int a) {
		age = a;
	}
	
	void setAge2 (int age) {
		this.age = age; // D5의 age = setAge2의 age
	}
	
}

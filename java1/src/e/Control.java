package e;

public interface Control { 
	//상수
	public int GAY = 10;
	public int YEE = 0;
	
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}

// 인터페이스 왜 쓰는가 => 클래스 만들기 전에 먼저 만들어서 메소드 등등 통합시킬려고
// https://gofnrk.tistory.com/22
package test;

public class EX6_1 {

	public static void main(String[] args) {
		TV t ;
		t = new TV();
		t.channel = 7 ;
		t.channelDown() ; 
		System.out.println("현재 채널은 " + t.channel + "입니다");
	}
}

class TV {
	String color ; 
	String power ;
	int channel ;
	
	void power() {power =!power ;} // tv를 키거나 끄는 메소드 
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}
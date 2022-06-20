package test;

class data3 {int x;}

class EX6_8 {
	public static void main(String[] args) {
		data3 d = new data3();
		d.x = 10;
		
		data3 d2 = copy(d) ;
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
	
	static data3 copy(data3 d) {
		data3 tmp = new data3 ()  ;
		tmp.x = d.x ;
		return tmp ;
	}

}

package part2.lection2;

class Bread {
	private Bread(){
		System.out.println("Нова буханка хліба");
	}
	private Bread slice(){
		System.out.println("Порізали хліб");
		return this;
	}
	static Bread prepareBread(){
		return new Bread().slice();
	}
}

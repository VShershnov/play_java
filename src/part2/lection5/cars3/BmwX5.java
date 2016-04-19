package part2.lection5.cars3;

public class BmwX5 extends Bmw {

	public BmwX5(String name) {
		super(name);
	}

	@Override
	public void fillBack(Petrol petrol, int i) {
		System.out.println("Заправляємо автомобіль BmwX5 бензином марки - "
				+ petrol);
		setTank(i);
	}

}

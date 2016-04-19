package part2.lection5.cars4;

public class BmwX5 extends Bmw {

	@Override
	public void fillBack(Petrol petrol, int i) {
		System.out.println("Заправляємо автомобіль BmwX5 бензином марки - "
				+ petrol);
		setTank(i);
	}

}

package part2.lection5.solution;

import part2.lection5.fail.*;

/**
 * Клас-обгортка для адаптування класу розумних хлопців, до клубного життя :)
 * 
 * @author Владислав
 * 
 */
public class ClubberAdapter implements Clubber {

	private SmartBoy b;

	public ClubberAdapter(SmartBoy b) {
		this.b = b;
	}

	@Override
	public String знайомитись(Дівчина d) {
		return b.знайомитись(d);
	}

	@Override
	public String getName() {
		return b.getName();
	}

	@Override
	public String rockTheClub() {
		return "качаю!";
	}

}

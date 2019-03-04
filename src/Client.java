
public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HanFeiZi hanFeiZi = new HanFeiZi();
		Observer liSi = new Lisi();
		hanFeiZi.addObserver(liSi);
		hanFeiZi.haveBreakfast();
	}
}

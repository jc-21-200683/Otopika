import jp.jc21.t.yoshizawa.otopika.Otopika;

/**
 * 
 */


/**
 * @author AB2B08
 *
 */
public class OtoSample01  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Otopika oto = new Otopika();
		oto.powerOn();
		while(true) {
			oto.lightAll();
			oto.sleep();
			oto.lightOff();
			oto.sleep();
			oto.lightGreen();
			oto.sleep();
			oto.lightGreenYellow();
			oto.sleep();
			oto.lightYellow();
			oto.sleep();
			oto.lightYellowRed();
			oto.sleep();
			oto.oto1.lightOff();();
			oto.sleep();
			oto.lightGreenRed();
			oto.sleep();
		}

	}

}

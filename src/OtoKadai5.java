import jp.jc21.t.yoshizawa.otopika.Otopika;

/**
 * 
 */


/**
 * @author AB2B08
 *
 */
public class OtoKadai5  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Otopika oto1 = new Otopika();
		Otopika oto2 = new Otopika();
		oto1.powerOn();
		oto2.powerOn();
		while(true) {
			oto1.lightGreen();
			oto1.sleep();
			
			oto1.lightYellow();
			oto1.sleep();
			oto1.lightOff();
			oto1.lightYellow();
			oto1.sleep();
			oto1.lightOff();
			oto1.lightRed();
			oto1.sleep();
			oto1.lightOff();
			oto2.lightGreen();
			oto1.sleep();
			oto1.lightOff();
			oto2.lightYellow();
			oto1.sleep();
			oto1.lightOff();
			oto2.lightRed();
			oto1.sleep();
			oto1.lightOff();
		}

	}

}

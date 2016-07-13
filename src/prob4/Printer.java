package prob4;

public class Printer {

	/*
	 * 뭔가 잘못 됨 .. 파악을못한듯. 이게아니야..
	 */
	public void println(int i) {
		System.out.println(i);
	}

	public void println(boolean b) {
		/*
		 * if (b == true) { System.out.println(true); } else {
		 * System.out.println(false); }
		 */
		System.out.println(b ? "true" : "false");
	}

	public void println(double d) {
		System.out.println(d);
	}

	public void println(String string) {
		System.out.println(string.toString());
	}
}
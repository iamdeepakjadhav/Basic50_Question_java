public class OneTwo500Palindrom {
	public static void main(String[] args) {
		int rem;

		for (int pnum = 1; pnum <= 500; pnum++) {
			int tamp = pnum, rev = 0;
			while (tamp != 0) {
				rem = tamp % 10;
				rev = (10 * rev) + rem;
				tamp = tamp / 10;
			}
			if (pnum == rev) {
				System.out.print(pnum + " ");
			}
		}
	}
}
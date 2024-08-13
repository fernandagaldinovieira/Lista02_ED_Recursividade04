package controller;

public class FatorialDuploController {

	public FatorialDuploController() {
		super();
	}

	public int FatorialDuplo(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * FatorialDuplo(n - 2);
		}
	}
}



	
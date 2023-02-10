public class Test {
	public static void main(String[] args) {
		// maytinh
		MayTinhCasio casio = new MayTinhCasio();
		System.out.println("cong : " + casio.cong(10, 1));
		System.out.println("tru: " + casio.tru(10, 9));

		MayTinhVina vina = new MayTinhVina();
		System.out.println("nhan :" + vina.nhan(10, 1));
		vina.chia(4, 1);
		double[] arr_1 = new double[] { 1, 4, 6, 7, 3, 4, 5, 9 };

		SapXepChon sapXepChon = new SapXepChon();

		System.out.println("sap xep giam");
		sapXepChon.SapXepGiam(arr_1);
		for (int i = 0; i < arr_1.length; i++) {
			System.out.print(" " + arr_1[i]);
		}

		System.out.println("");

		System.out.println("sap xep tang");
		sapXepChon.SapXepTang(arr_1);
		for (int i = 0; i < arr_1.length; i++) {
			System.out.print(" " + arr_1[i]);
		}

		PhanMemmayTinh pMMayTinh = new PhanMemmayTinh();
		pMMayTinh.chia(5, 1);

		System.out.println("");
		System.out.println("sap xep giam");
		pMMayTinh.SapXepGiam(arr_1);
		for (int i = 0; i < arr_1.length; i++) {
			System.out.print(" " + arr_1[i]);
		}
	}
}

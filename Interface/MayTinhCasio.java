
public class MayTinhCasio implements MayTinhBoTui{

	@Override
	public double cong(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double tru(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double nhan(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public void chia(double a, double b) {
		try {
			System.out.println("phep chia: " + a/b);
		} catch (Exception e) {
			System.out.println("khong the thuc hien phep chia");
		}
	}

}

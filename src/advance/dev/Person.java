package advance.dev;

public class Person {
	private String ten;
	private int tuoi;
	private String diaChi;
	private String sDT;
	private double diemTrungBinh;

	public Person(String ten, int tuoi, String diaChi, String sDT, double diemTrungBinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
		this.sDT = sDT;
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		if (tuoi < 0)
			tuoi = 0;
		this.tuoi = tuoi;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getsDT() {
		return sDT;
	}

	public void setsDT(String sDT) {
		this.sDT = sDT;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		if (diemTrungBinh <= 0)
			diemTrungBinh = 0;
		this.diemTrungBinh = diemTrungBinh;
	}

	@Override
	public String toString() {
		return "Person [ten=" + ten + ", tuoi=" + tuoi + ", diaChi=" + diaChi + ", sDT=" + sDT + ", diemTrungBinh="
				+ diemTrungBinh + "]";
	}

	

}

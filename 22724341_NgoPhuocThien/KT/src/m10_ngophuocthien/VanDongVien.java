package m10_ngophuocthien;

public class VanDongVien {
	private String hoten;
	private int tuoi;
	private int cannang;
	private int chieucao;
	/*
	 * constructor
	 * */
	public VanDongVien() {
		this.hoten="";
		this.tuoi=0;
		this.cannang=0;
		this.chieucao=0;
		
	}
	public VanDongVien(String hoten, int tuoi, int cannang, int chieucao) {
		
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.cannang = cannang;
		this.chieucao = chieucao;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public int getCannang() {
		return cannang;
	}
	public void setCannang(int cannang) {
		this.cannang = cannang;
	}
	public int getChieucao() {
		return chieucao;
	}
	public void setChieucao(int chieucao) {
		this.chieucao = chieucao;
	}
	@Override
	public String toString() {
		return "VanDongVien [hoten=" + hoten + ", tuoi=" + tuoi + ", cannang=" + cannang + ", chieucao=" + chieucao
				+ "]";
	}
	public boolean lonhon() {
		int a;
		if (chieucao>a) {
			return true;
		}
	

		}
	}
	
	
}

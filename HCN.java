package Bai1Tuan1;

public class HCN {
	private double ChieuDai;
	private double ChieuRong;

	/**
	 * @return the chieuDai
	 */
	public double getChieuDai() {
		return ChieuDai;
	}

	/**
	 * @param chieuDai the chieuDai to set
	 * @throws Exception 
	 */
	public void setChieuDai(double cD) throws Exception {
		if (cD>0) {
			this.ChieuDai=cD;
		} else {
		  throw new Exception("Loi");
		}
	}

	/**
	 * @return the chieuRong
	 */
	public double getChieuRong() {
		return ChieuRong;
	}

	/**
	 * @param chieuRong the chieuRong to set
	 */
	public void setChieuRong(double chieuRong) {
		this.ChieuRong = chieuRong;
	}

	public double getDT() {
		return this.ChieuDai*this.ChieuRong;
	}
	public double getCV() {
		return (this.ChieuDai+this.ChieuRong)*2;
	}
	
	/**
	 * @param chieuDai
	 * @param chieuRong
	 */
	public HCN(double chieuDai, double chieuRong) {
		this.ChieuDai = chieuDai;
		this.ChieuRong = chieuRong;
	}

	public static void main(String[] args) {
		HCN h1= new HCN(7, 5);
        System.out.println(h1.getChieuDai());
        System.out.println(h1.getChieuRong());
        
        System.out.println("Dien tich HCN: ");
        System.out.println(h1.getDT());
        System.out.println("Chu vi HCN: ");
        System.out.println(h1.getCV());
        
	}

}

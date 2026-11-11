package Bai2Tuan1;

public class HinhTron {
	    ToaDo tam;
	    double banKinh;

	    public HinhTron(ToaDo tam, double banKinh) {
	        this.tam = tam;
	        this.banKinh = banKinh;
	    }

	    public double tinhDienTich() {
	        return Math.PI * banKinh * banKinh;
	    }

	    public static void main(String[] args) {

	        HinhTron h1 = new HinhTron(
	                new ToaDo("O", 3, 4),
	                12
	        );

	        System.out.println("Thong tin hinh tron");
	        System.out.println("Ban kinh la: " + h1.banKinh);

	        System.out.println("Tam la: "
	                + h1.tam.getTen()
	                + "(" + h1.tam.x + ";"
	                + h1.tam.y + ")");

	        System.out.println("Dien tich = "
	                + h1.tinhDienTich());
	    }
	}


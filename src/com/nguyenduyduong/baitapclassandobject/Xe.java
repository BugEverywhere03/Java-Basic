package com.nguyenduyduong.baitapclassandobject;

public class Xe {
	 private int soBanh;
	 private String hang;
	 private String mau;
	 
	 public static void main(String[] args) {
		Xe oto = new Xe(4, "BMW", "Đỏ");
		System.out.println(oto.mau);
		Xe xeMay = new Xe(2, "Honda", "Vàng");
		System.out.println(xeMay.mau);
		System.out.println(xeMay.soBanh);
		System.out.println(xeMay.hang);
		Xe xeDap = new Xe();
//		xeMay.run(100);
//		oto.run(1000);
		xeDap.bocDau();
		xeMay.stop();
		
	}
	// Khi mà đã khởi tạo hàm constructor có tham số thì Java không cung cấp hàm khởi tạo không số 
	// Nếu muốn sử dụng hàm khởi tạo không tham số thì ta phải tự khai báo
	public Xe() {
		
	}
	// Hàm khởi tạo có tham số
	public Xe(int soBanh, String hang, String mau) {
		// soban = 
		this.soBanh = soBanh;
		this.hang = hang;
		this.mau = mau;
	}
	// Muốn truy cập vào giá trị thuộc tính thì mọi người sử dụng
	// cú pháp
	// <Tên Đối tượng>.<Thuộc tính muốn truy cập>;
	// Phương thức của đối tượng chính là một hàm
	public void run(double speed) {
		System.out.println("Xe chạy " + speed + "KM");
	}
	// cách gọi phương thức của đối tượng 
	// <Tên Đối tượng>.<Phương thức muốn chạy hoặc muốn sử dụng>();
	public void bocDau() {
		System.out.println("Xe đang bốc đầu");
	}
	public void stop() {
		System.out.println("Xe hết xăng");
		System.out.println("Đổ xăng để chạy tiếp");
	}
}

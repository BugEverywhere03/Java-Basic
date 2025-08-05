package com.nguyenduyduong.baitapclassandobject;

public class BaiTap {
	public static void main(String[] args) {
		// 1 .  Khai báo 1 hàm in ra hiệu của hai số nguyên với hai số nguyên là tham số của hàm.
		// Hàm không trả về giá trị thì khai với từ khóa void
		// Có 2 số nguyên là tham số
		// tham số thực chât là biến được tuyền vào hàm và sử dụng ở trong hàm
		// Cú để gọi hàm để hàm thực thi khối lệnh phía trong
		// <Tên hàm>(Giá trị của tham số);
//		subtractNumber(10, 5);
		// Tương giá trị tham số a = 10 , b = 5
		// Khai báo một hàm trả về giá trị diện tích hình chữ nhật với hai tham số là số nguyên a và b là độ dài hai cạnh của hình chữ nhật
		// Diện tích hình chữ nhật là a x b 
		// Hàm trả về trị là int 
		// Khai báo hàm rồi tính diện tích hình chữ nhật 
		// Hàm có trả về giá trị thì mặc định luôn phải có từ khóa return
		// Hàm có trả về giá trị cần nơi chứa giá trị trả về => nơi chứa đơn giản nhất là biến
//		int squareResult = squareRectangle(10, 20);
//		System.out.println(squareResult);
		//2. Khai báo một lớp Xe:
	    // Tạo 3 đối tượng lần lượt là xe ô tô, xe máy , xe đạp
	}
	
	public static void subtractNumber(int a, int b) {
		int subtract = a - b;
		System.out.println(subtract); // 5
	}
	
	public static int squareRectangle(int a, int b) {
		int square = a * b;
		return square;
	}
}

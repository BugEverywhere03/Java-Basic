package com.nguyenduyduong.buoi11;

public class ClassAndArray {
	public static void main(String[] args) {
		// Class và Object
		// Giả sử lớp Student thì có đặc điểm chung 
		// Mã sinh viên
		// Họ tên 
		// Ngày tháng năm sinh
		// Quê quán 
		// Đối tượng Student tên Phượng
		// Đối tượng 
		// MSV: 123456
		// Họ tên: Phượng
		// Quê quán: Thái Bình
		// Ngày tháng năm sinh là birth day: 07/10/2004
		// Class File 
		// Tên file
		// Dung lượng
		// Định dạng : docx, jpg, ppt
		// hocJava.docx
		// Tên file : docJava
		// dung lượng: 1kb
		// định dạng: docx
		
		// Hàm trong Java là các đoạn chương trình thực thi một nhiệm vụ nào đó/ hành động mà muốn máy tính thực hiện
		// Hàm sẽ tập hợp câu lệnh thường lặp trong chương tỉnh để gom lại thành hàm
		// Từ đó ta cần gọi hàm để  thực nhưng đoạn lệnh bị lặp trong chương trinh
		// Hàm chia làm hai loại là hàm có trả về giá trị và hàm không trả giá trị 
		// Hàm thường được tạo ra để xử lí những đoạn mã lặp lại nhiều lần ở nhiều nơi
		// Các khai báo hàm:
		// Hàm không trả bề gía trị 
		// void thể hiện cho hàm không trả về giá trị
		// public void <Tên hàm>() { 
	   //   < Khối lênh> 
		// }
		// Nhiêm vụ là in ra số  tổng 2 số được truyền vào hàm
		// Hàm trả về giá trị
		// Hàm có thể trả về một kiểu dữ liệu trong Java-> nguyên thủy hoặc đối tượng
		// Cú pháp khai báo một hàm có trả giá trị
		// Hàm có trả về giá trị thì bắt buộc phải có từ khóa return
		// Từ khóa return này dùng để trả về giá trị khi hàm được
		// Hàm có kiểu dữ liệu trả về là gì thì phải return về kiểu đó
		
		// <Kiểu dữ liệu trả về> <TenHam>() {
		// }
		
		
		// int c = 10 + 5;
		// System.out.println(c);
		tongHaiSo(10, 5);
		// Hàm có thể có tham số hoặc không có tham số 
		// Hàm không có tham số thì
		// Giữa 2 dấu ngoặc tròn không được khai báo giá trị truyền vào
		// Hàm có tham số thì giữa dấu ngoặc tròn được khai báo theo cấu truc
		// <Kiểu dữ liệu của tham số> <Tên tham số>
		// Các tham số ngăn cách nhau bởi giấu phẩy
		Math.random();
		// Lời gọi hàm
		tongHaiSo(2, 5);
		// Cú pháp gọi hàm
		// TenHam(Tham tri>);
		int chuVi = chuViTamGiac(10, 3, 8);
		System.out.println(chuVi);
		// Tham trị là gì : Tham trị là giá trị mà được truyền tham số tương ứng vào lúc mà lời gọi hàm được gọi
		
	}
	
	public static void tongHaiSo(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	public static int chuViTamGiac(int a, int b, int c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		int chuVi = a + b + c;
		return chuVi;
	}
	// Hàm không có tham số;
	public static void printMessage() {
		System.out.println("I Love VietNam");
	}
	// Hàm có tham số
	
}

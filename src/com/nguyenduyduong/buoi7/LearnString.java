package com.nguyenduyduong.buoi7;

public class LearnString {
	public static void main(String[] args) {
		// khởi tạo đối tượng LearnString được tham chiếu bởi biến object
		LearnString object = new LearnString(); 
		// new LearnString() -> Tạo ra đối tượng trong vùng nhớ heap
		// Khi khởi tạo xong thì có địa chỉ ô nhớ
		// Sau đó mới gán tham chiếu cho biến 
		// Tương tự như lúc làm với kiểu dữ liệu nguyên thủy
		int a = 2 + 4; // 2 + 4 rồi mới gán giá trị cho biến a
		// Khai báo ra một đối tượng String
		String stringObject = new String();
		// Student student = new Student();
		// Đối tượng chính thực thể ở thế thới thực
		// Thực thể vật lí hoặc phi vật lí
		// Âm thanh
		// File 
		// Khi muốn khởi tạo đối tượng thì dùng từ khóa new + constructer
		// constructer được gọi là hàm khởi 
		// mặc định mọi class đều có hàm khởi tạo
		// Khi mình tọa một class thì Java mặc định cung cấp cho ta một
		// hàm contructer
		// # Tính bất biến của string
		//String string1 = "abc"; // cố định giá trị là abc// giả sử "abc" -> 1
		//string1 += "def"; // "abcdef" -> 2
		// Thực chất ở đây là java tạo ra môt đối tượng string mới là abcdef
		// Sau đó gán địa chỉ cho string1 
		// Ví dụ về String Pool
		String str1 = "abc";
		// str1 = "abc"
		// Java kiểm tra -> String Pool có abc -> Tạo abc mới
		String str2 = "abc";
		// str = abc
		// Java kiểm tra trong String Pool có abc -> Lấy abc được khởi tạo ỏ trên
		// 
		// Khác với khi dùng kiểu dữ liệu nguyên thủy thì dấu == so sánh địa chỉ
		System.out.println(str1 == str2);
		String str3 = new String("abc");
		System.out.println(str1 == str3);
		// Cách khởi tạo String
		String s1 = "Java";
		String s2 = new String("Python");
		// 
		
		
	}
	

}

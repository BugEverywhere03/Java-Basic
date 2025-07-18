package com.nguyenduyduong.buoi4;

public class VariablesAndDataTypes {
	public static void main(String[] args) {// gõ main -> crtl + space(nút cách/ nút dài nhất trên bàn phím) -> enter 
		String name1 = "Nguyễn Duy Dương"; // Khi lưu trữ dữ liệu gì đó trong máy tình thì ta cần lưu trữ dữ liệu đó vào bộ nhớ
		// String -> Kiểu dữ liệu 
		// name -> Tên biến 
		int age = 22; // 
		int year; // Sẽ chứa giá trị là một số nguyên có ý nghĩa là năm hiện tại đang sống
		int b; // Khai báo nhưng không được gán gia trị
		b = 2; // Thông qua dấu bằng ta gán gía trị 2 cho biến b
		System.out.println(b); // 2
		// Biến được khai báo nhưng mà được gán giá trị
		boolean chamHoc = true;
		System.out.println(chamHoc); // true
		// Ví dụ:
		// Không sử dụng biến // Xin chào Phượng 
		System.out.println("Xin chào Phượng");
		System.out.println("Xin chào Phượng");
		// Sử dụng biến
		String mes = "Xin chào" + " Phượng";
		System.out.println(mes);  // Xin chào Phượng
		System.out.println(mes);
		// => Rút gọn được mã 
		// => Dễ dàng thay đổi giá trị sử tiện lợi hơn
		
		
		// Coding convention 
		// Biến phân biệt chữ hoa và chữ thường
		String name = "An";
		String Name = "Bình";
		System.out.println(name); 
		System.out.println(Name);
		// Biến được đặt tên theo quy tắc CamelCase
		String fullName = "Nguyễn Duy Dương";
		String birthDay;
		
		// Biến có thể chứa ký tự thường hoặc hoa, số, ký tự gạch dưới, ký tự đô la (Ký tự đặt biệt khách không dùng được
		String abH123_$ =  "abc"; 
		
		// Biến không được bắt đầu bằng số, không được chứa ký tự đặc biệt khác ngoài gạch dưới và đô la
		int _abc = 123;
		int $abc = 456;
		// Biến không được chứa khoảng trằng, không được bắt đầu bằng số
//		int 123a = 789
//		int a b = 1234;

		
		// Kiểu dữ liệu trong Java (Trong quy ước của máy tính thì 1 byte = 8 bit) mà (1 bit chỉ nhận giá trị là 0 hoặc 1)
		// 1 byte = 8bit = 0000 0000 
		// Nhưng mà trong kiểu số thì bit đầu tiên là biểu thị giá trị âm hay dương
		// => còn lại 7 bit để giá trị
		// 0-0-0-0-0-0-0 // Về mặt bản chất thì 1 bit chỉ có thể nhận giá trị là 0 hoặc 1 
		// 2 2 2 2 2 2 2 => 2*2*2*2*2*2*2 = 128 (0 -> 127) (-1 -> -128) -> 128 gía trị tai xuất phát -1
//											    1 - > 9 là 9 giá trị
//											    1 - > 127 là 127 giá trị
//											    0 -> 127 thì có 128 giá trị
//											    -1 -> -127 thì cũng có 128 giá trị   
	    // Gỉa sử lúc đầu nếu mà có 1 bit thì giá trị có thể là 0 hoặc 1 2^1
		// Tiếp theo thì nếu mà có 2 bit thi giá trị có thể nhận là: {00,01,10,11} = 2^2 = 2.2
		// Tiếp theo thì nếu mà có 2 bit thi giá trị có thể nhận là: 2^3 = 2.2.2 = 
		byte byteNumber = 127;
		short shortNumber = 32767;
		int intNumber = 1000000000;
		System.out.println(byteNumber);
		System.out.println(shortNumber);
		System.out.println(intNumber);
		long longNumber = 200000000000000L;
		System.out.println(longNumber);
		float floatNumber = 2.5f;
		System.out.println(floatNumber);
		double doubleNumber = 3.142567989898081D;
		System.out.println(doubleNumber);
		char character = 'a';
		char numberOneChar = '1';
		System.out.println(character);
		System.out.println(numberOneChar);
		boolean trueValue = true;
		boolean falseValue = false;
		System.out.println(trueValue);
		System.out.println(falseValue);
				
	}
}


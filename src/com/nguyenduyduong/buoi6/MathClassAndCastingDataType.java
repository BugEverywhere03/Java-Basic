package com.nguyenduyduong.buoi6;

public class MathClassAndCastingDataType {
	public static void main(String[] args) {
		// Note Toán tử số học: + - * / %
		// Khi mà thực hiện phép gán giá trị cho một biến 
		// thì vế phải của dấu bằng được thực hiện trước sau đó gán vế trái
		// Gỉa sử:
		int a = 2;
		//a = a + 2; // 4
	// VT     VP
	//      2 + 2 = 4
	// 	a = 4;
		//System.out.println(a);
		a += 2; // a = 4
		System.out.println(a);// 4
		a -= 5; // a = a - 5;  4 - 5 = -1
		System.out.println(a); // -1
		// a *= 1;
		// a /= 4;
		// a %= 2;
		
		// Các hàm phổ biến trong class Math
		// Hàm abs : Hàm lấy giá trị tuyệt đối
		// Cách sử dụng là: Math.abs()
		// System.out.println()
		// Sử dụng
		int absValue = Math.abs(20); // -> 20
		System.out.println(absValue);
		double absValue2 = Math.abs(-20.5); // 20.5
		System.out.println(absValue2); 
		// Hàm ceil
		// Hàm làm tròn các dấu phẩy động lên đến số nguyên gần nhất
		// Hàm trả giá tri double
		// Giả sử 5.3 -> 6.0 
		double ceilValue = Math.ceil(3.14); // 4.0
		System.out.println(ceilValue); // 4.0
		// floor
		// Hàm làm tròn dấu phẩy động xuống dến số nguyên gần nhất
		// Hàm trả giá trị double 
		// Giả sư 7.344 -> 7.0
		double floorValue = Math.floor(7.344D);
		System.out.println(floorValue); // 7.0
		// Hàm min và hàm max 
		// Trả về giá trị lớn nhất và nhỏ nhất giữa 2 số 
		int minValue = Math.min(10, 20); // 10
		int maxValue = Math.max(20, 10); // 20
		System.out.println(minValue); // 
		System.out.println(maxValue); //
		// Hàm round
		// Hàm làm tròn theo tắc toán học
		// giả sử 3.54 -> 4.0
		//        3.44 -> 3.0
		double roundValue = Math.round(9.5);
		System.out.println(roundValue); // 10.0
		// Hàm random : Sinh ra số thực ngẫu nhiên trong đoạn 0 -> 1
		// 0.0 0.01 -> 1.0 * 100 -> 100
		// 0.0*100=0 / 0.01 * 100 = 1 // 0.22 = 22 / 0.99 
		// 0.00 - 0.1 * 100D -> 0 -> 10
		// 0.11 - 020 * 100D -> 11 -> 20
		//  ||
		// 0.91 - 1.0 * 100 -> 91 -> 100
		double random = Math.random();
		//System.out.println(random);
		// Đặt ra câu hỏi : Giả sử như bây giờ mình muốn random từ 0 -> 100
		System.out.println(random*100D);
		// pow: Hàm trả về lũy thừa của 1 số
		// Cách sử dụng: Hàm pow truyền 2 số - số đầu tiên là cơ số, số thứ 2 là số mũ
		double powValue = Math.pow(2, 2); //  4.0
		double powValue1 = Math.pow(3, 2);// 9.0
		System.out.println(powValue);
		System.out.println(powValue1);
		// Hàm sqrt: Hàm lấy căn bâc 2 của một số
		double sqrt16 = Math.sqrt(16); // 4.0
		System.out.println(sqrt16); // 4.0
		// Ép kiểu dữ liệu trong Java
		// Ép kiểu mở rộng:
		// Tức kiểu dữ liệu có kích thước sang kiểu dữ liệu co kích thước lớn hơn
		// Ép kiểu mở rộng được java tự động chuyển đổi khi mà gán kiểu dữ liệu có kích nhỏ sang kiểu có kích thước lớn hơn
		// int -> double
		// float ->double
		int number1 = 5;
		double number2 = number1; // number1-int -> number2->double;
		System.out.println(number2);
		float number3 = 3.1323324F;
		number2 = number3; // number3-float -> number2->double
		System.out.println(number2);
		// Ép kiểu thu hẹp
		// Tức chuyển đổi từ kiểu dữ liệu có kích thước lớn sang kiểu dữ liệu có kích thước bé  hơn
		// Ép kiểu thu hẹp phải đươc thực hiện thủ công
		// double -> int
		double PI = 3.14;
		int PI2 = (int) PI;
		System.out.println(PI2);
		// Kiểu ép đặc biệt
		// Ép kiểu từ String -> số
		// Từ số -> sang String
		// Khi mà muốn ép  kiểu từ String sang số thì trong String phải chứa tất cả là só
		// "123242" -> số // "13ab" -> báo lỗi
		String numberString = "123";
		// Buổi sau sẽ học về các class Wrapper (Lớp có ngồn gốc từ các kiểu dữ liệu nguyên thủy)
		int numberByString = Integer.parseInt(numberString);
		System.out.println(numberByString);
		// Chuyển từ số sang String
		int abc = 567;
		// Muốn chuyển từ number sang STring thì dùng String.valueOf(truyền số muốn chuyên thành chuỗi)
		String stringByNumber = String.valueOf(abc);
		System.out.println(stringByNumber); //"567" 
		
	}

}

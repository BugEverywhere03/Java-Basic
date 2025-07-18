package com.nguyenduyduong.buoi5;

public class Operator {
	public static void main(String[] args) {
		// Ví dụ về toán tử công +
		// Cộng số nguyên
		int a = 2; // Khai báo biến a với giá trị là 2
		int b = 10;
		int c = a + b; 
		System.out.println(c); // 12
		// Trong java có bao nhiêu kiểu dữ liệu số thực -> Có phần thập thập phân là kiểu double, float
		// Cộng số thực
		double numberOne = 10.2D;
		double numberTwo = 9.8D;
		double numberResult = numberOne + numberTwo;
		System.out.println(numberResult); // Kết quả: 20.0
		//Toán tử cộng chuỗi: nối 2 chuỗi lại với nhau 
		String firstName = "Donal";
		String lastName = "Trump";
		String fullName = firstName + " " + lastName;
		System.out.println(fullName); // "Donal Trump"
		// Toán tử trừ trong Java: 
		// Trừ 2 số nguyên và trừ số thập phân (số thực)
		int a1 = 2;
		int a2 = 3;
		int a3 = a1 - a2;
		System.out.println(a3); // 2 - 3 = -1
		double num1 = 10.5;
		double num2 = 5.25;
		double num3 = num1 - num2;
		System.out.println(num3); // 5.25
		// Toán tử trừ 2 chuỗi: // Tạm thời chưa tìm hiểu -> Khả năng cao là không có
		String name = "Bich Phuong";
		String multiName = "Phuong";
		// Toán tử nhân
		// Ký hiệu của toán tử nhân là: *
		// Nhân 2 số nguyên:
		int b1 = 5;
		int b2 = 6;
		int result = b1 * b2;
		System.out.println(result); // 30
		double b3 = 2.5;
		double b4 = 2.0;
		double b6 = b3 * b4;
		System.out.println(b6); // 5.0
		// Toán tử chia
		// Chia lấy phần nguyên: 
		// Ký hiệu: /
		int number1 = 20;
		int number2 = 7;
		int number3 = number1 / number2;
		System.out.println(number3); // 20 / 7 = 2 dư 6 => 2
		// Chia lấy phần dư
		// Ký hiệu: %
		int number4 = number1 % number2; 
		System.out.println(number4); // => 6
		// Toán tử quan hệ kết quả trả ra là giá trị boolean -> true // false
		// So sánh bằng:
		// Ký hiệu là : ==
		boolean equalOperator = 2 == 2; // true
		System.out.println(equalOperator); // true
		// So sánh khác:
		// Ký hiệu là : !=
		equalOperator = 2 != 3; // true
		System.out.println(equalOperator);
		equalOperator = 2 != 2; // false
		System.out.println(equalOperator);
		// Phép so sánh lớn hơn và bé hơn
		// So sánh lớn hơn
		equalOperator = 2 > 3; // false
		System.out.println(equalOperator);
		// So sánh bé hơn
		equalOperator = 3 < 4; // true
		System.out.println(equalOperator);
		// Bé hơn hoặc bằng và lớn hơn hoặc bằng
		// Bé hơn hoặc bằng
		equalOperator = 3 <= 3 ; // true
		System.out.println(equalOperator);
		// Lớn hơn hoặc bằng
		equalOperator = 2 >= 3; // false
		System.out.println(equalOperator);
		// Toán tử Logical:
		// Toán tử AND:
		// Ký hiệu: &&
		// Toán tử AND toán tử dùng để hợp 2 kết quả từ 2 điều kiện trở lên 
		// Trả về kết quả là True nếu tất cả điều kiên là True hoặc False và
		// Ngược lại trả về False nếu một điều kiện là False và các điều kiện còn lại là true
		boolean expressionOne = 2 > 3; // false
		boolean expressionTwo = 3 < 4; // true
		boolean andOperator = expressionOne && expressionTwo; // false
		// # Tất cả các điều kiện được thực hiện theo chiều từ phải sang trái và ưu tiên thực hiện trong ngoặc đơn
		boolean noteResult = 2 < 3 && 3 < 4 && 4 > 5; // 
						//            true  && false => false
						// 	2 < 3 && false 
						// true && false => false
		System.out.print("Note: ");
		System.out.println(noteResult);
		// Toán tủ OR:
		// Ký hiệu: ||
		// Toán tử OR trả dùng để kết hợp các điều kiện
		// Trả về True nếu có ít nhất một điều kiện đúng
		// Trả về False nếu tất cả đều đều là false
		boolean orOperator = 2 < 3 || 3 < 4; // true
		System.out.println(orOperator);
		orOperator = 3 < 2 || 2 != 2; ; // false 
		System.out.println(orOperator);
		// Toán tử NOT
		// Ký hiệu: !
		// Phủ định Logic:
		// ! giá trị True -> False
		// ! giá trị false -> True
		
		boolean notOperator = !(2 < 3); //  
		 					//  true
							// !true => false
		notOperator = !(2 != 3 || 3 >= 4); // 
					//		true ||	false => true 
					//  !true => false
		System.out.println(notOperator);
	}

}

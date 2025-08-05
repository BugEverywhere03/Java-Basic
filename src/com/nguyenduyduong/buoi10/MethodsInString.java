package com.nguyenduyduong.buoi10;

public class MethodsInString {
	public static void main(String[] args) {
		// Nhắc lại String là một biểu diễn cho chuôi kí tự
		// String là kiểu dữ liệu tham chiếu (tức biến giữ địa chỉ không phải biến giữ giá trị)
		// Khai báo String 
		// Cách 1 sử dụng từ khóa new khởi tạo một tượng String
		// Đối tượng String khi được khởi tạo trong heap thì sẽ có địa chỉ
		// Địa chỉ của đối tượng chính là địa chỉ ô nhớ của nó trong bộ nhớ máy tính
		String stringTemp = new String("abc");
		// Biến mà giữ địa chỉ hay chứa địa chỉ thì được gọi là biến tham chiếu
		// Heap -> Vùng nhớ giành cho chương trình JAVA
		// Khi thực hiện lệnh có sử dụng từ khóa new thì sẽ khởi tạo một tượng ở trong heap 
		// Cách 2 sử dụng dấu "" khởi tạo String
//		String tempString = "abc";
//		// Phương thức length
//		String exam = "abcd"; // 4
//		int length = exam.length(); // 4
//		//// "abcd".length()
//		System.out.println(length); // 4
//		System.out.println("abc".length()); // 3
		// Phương thức charAt
//		String exam2 = "VietNam";
//					  //0123456
//		char characterAtIndex = exam2.charAt(0);
//		System.out.println(characterAtIndex); // V;
//		characterAtIndex = exam2.charAt(6);
//		System.out.println(characterAtIndex); // m
		// Phương thức trim
//		String trimString = "  abc  ";
//		System.out.println(trimString);
//		System.out.println(trimString.trim());
		// Phương thức contains
//		String parentString = "abcd";
//		String subString = "abc";
//		String subString2 = "abf";
//		System.out.println(parentString.contains(subString));
//		System.out.println(parentString.contains(subString2));
		// Đối đối tượng thì sử dụng == là so sánh địa chỉ (hay tham chiếu) của hai đối tượng có giống nhau không
		// Muốn so sánh giá trị của hai đối tượng thì dùng phương thức equals
//		String string1 = "abc";
//		String string2 = "abc";
//		System.out.println(string1.equals(string2));
		// Phương thức indexOf
//		String sub = "abc";
//		String parent = "efgabcdabc";
					   //0123456789
//		System.out.println(parent.indexOf(sub)); //3
		// substring
		// Cách 1
//		String parent1 = "abcdef";
		// Chuỗi con thỏa mãn hai điều kiện:
		// Nằm trong chuỗi cha
		// Liên tiếp
//		String sub1 = parent1.substring(1);
//		System.out.println(sub1);
		// Cách 2
		String parent = "Hello VietNam";
		 			  // 0123456789
		String sub = parent.substring(0, 5); // Hello
		System.out.println(sub); // Hello
	}

}

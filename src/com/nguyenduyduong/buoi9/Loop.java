package com.nguyenduyduong.buoi9;

public class Loop {
	public static void main(String[] args) {
		// Tiền tố 
		int a = 5;
		int b = ++a;
				// Tăng a lên đơn vị sau đó là trả lại giá trị vừa tăng cho biến á
				// 5 + 1 = 6 gán lại cho biến a = 6
			// Gán giá trị của a cho b
//		System.out.println(a);
//		System.out.println(b);
//		int number1 = 3;
//		int number2 = ++number1;
//		System.out.println(number1);
//		System.out.println(number2);
		// Hậu tố 
		int c = 10;
		int d = c++;
			// Thì Java sẽ tạo một biến bản sao chứa giá trị cuả biến c là 10
			// Sau đó tăng giá trị của biến c lên 1 đơn vị tức là từ 10 -> 11
			// Trả về giá trị của bản sao tức là trả về giá 10
//		System.out.println(c);
//		System.out.println(d); 
	 // Cấu trúc vòng lặp for 
	// Cách khai báo 1
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
//		}
	// Note: câu lệnh khai báo biến lặp chỉ thực thi 1 lần duy nhất trong suốt vòng lặp
	// Cách vòng lặp hoạt động:
	// Sau khi khai báo biến lặp 1 lần duy nhất -> thì thực hiện xét điều kiện nếu điều kiện còn đúng(hay true)
	// thì thực hiện khối lệnh -> Cập nhật lại biến lặp
	// Sau đó thì chỉ tiếp tục xét điều kiện -> Thực thi khối lệnh -> Cập nhật biến lặp cho đến khi điều kiện sai
	// thì không thực hiện nữa
	// Mặc dù
	// Minh họa vòng lặp  
	// i    /  Điều kiện    / Kết quả điều kiện // Giá trị in ra console 
	// 1   / 1 <= 5 	   /True  			   //   1
	// 2  / 2 <= 5        /True 		      //    2 
	//3  /  3 <= 5       /True               //     3
	//4 /  4 <= 5       / True              //      4
	//5/  5 <= 5       /  True             //       5 
	//6/  6 <= 5      /  False            //
    // Note cách 1: Mặc dù biến i được khai báo nhưng mà chỉ sử dụng được trong phạm vi của vòng lặp < Tức là có thể truy cập giá trị
	// trong vòng lặp>
	//System.out.println(i);
	// Cách 2:
//	int j = 1;
//	for (; j <= 5; j++) {
//		System.out.println(j);
//	}
//	System.out.println(j); // 6
	// Vòng lặp while 
//	int sum = 1;
//	while (sum < 100) {
//		System.out.println(sum);
//		sum += sum;
//	}
//	System.out.print("Giá trị biến sum sau khi kết thúc vòng lặp :");
//	System.out.println(sum);
	// do - while
	// Đếm số lần thực hiện random cho đến khi được giá trị 50
	// Điều kiện lăp là nếu giá trị random ra mà khác 50 thì sẽ random tiếp <=> Số random != 50 thì lặp tiếp
	int count = 0; // Biến đếm số lần random
	int temp;  // Biến chứa tạm gia trị random để so sánh với điều kiện
	do { 
		int randomNumber = (int) (Math.random() * 100D); // Random số từ 1 -> 100
		System.out.println(randomNumber); // In ra số được random
		temp = randomNumber; // Gán giá tri random được cho biến tạm dùng để so sánh điêù kiện
		count += 1; // Tăng số lần random
	} while (temp != 50);
	System.out.print("Số lần random: ");
	System.out.println(count);
	// Note: Những biến được khai báo trong khối lệnh do-while thì chỉ có phạm vi trong khối lệnh
	}
}

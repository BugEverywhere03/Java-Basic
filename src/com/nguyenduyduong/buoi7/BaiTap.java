	package com.nguyenduyduong.buoi7;
	
	public class BaiTap {
	
		public static void main(String[] args) {
			// Bài 1: Giới thiệu về bản thân của bạn
	//		String fullName = "Nguyễn Duy Dương";
	//		int age = 22;
	//		String homeTown = "Thừa Thiên Huế";
	//		String country = "Việt Nam";
	//		System.out.print(fullName);
	//		System.out.println(" " + age);
	//		System.out.println(homeTown);
	//		System.out.println(country);
			// Bài 2: Khai báo biến cho các giá trị
			byte a = 10;
			short b = -150;
			double c = 20.3D;
			float d = 1.1323423F;
			long e = 1323432424242442342L;
			char f = 'a';
			boolean g = true;
	//		System.out.println(a);
	//		System.out.println(b);
	//		System.out.println(c);
	//		System.out.println(d);
	//		System.out.println(e);
	//		System.out.println(f);
	//		System.out.println(g);
			// Bài 3:  Tính toán với số cho trước và chuỗi cho trước
	//		Số cho trước: 10 và 2
	//		String cho trước để thực hiện cộng String: “ I Love” , “VietNam”
	//		Các toán tử cần thao tác giữa hai số: +, -, *, /, %, +=, -=, *=,  /=, %=
			// Cộng 2 số 
	//		int tong = 10 + 2; // 12
	//		System.out.println(tong);
	//		// Hiệu của 2 sô
	//		int hieu = 10 - 2; // 8
	//		System.out.println(hieu);
	//		// Tích của 2 số 
	//		int tich = 10*2;
	//		System.out.println(tich); // 20
	//		// Chia lấy phần nguyên 
	//		int chiaLayNguyen = 10 / 2; // 5
	//		System.out.println(chiaLayNguyen);
	//		// Chia lấy dư
	//		int chiaLayDu = 10 % 2; // 0
	//		System.out.println(chiaLayDu);
	//		// CongChuoi
	//		String concatString = "I Love" + " " + "VietNam"; // I Love VietNam
	//		System.out.println(concatString);
			// Bài 4: Dự đoán kết quả của biểu thức
		//	    1. 2 == 3 -> false
		//	    2. 5 < 2 -> false
		//	    3. 2 >  1  -> true
		//	    4. 1 != 1 -> false
		//	    5. 2 <= 3 -> true 
		//	    6. 3 >= 5 -> false
		//	    7. 2 == 2 || 3 < 2 
				//           false
				// true  || false
				// -> true
		//	    8. 2 > 3  && 3 < 3 // Phép and chỉ đúng khi tất cả các giá trị đều đúng
			// 				false
			//		false && false
				// 	false
		//	    9. ! ( 2 > 3) 
			//			false
			//		!false -> true
			// 
			// Bài 5: Sử dụng các hàm thường dùng trong class Math
			// Hàm abs
			int absValue = Math.abs(10); // 10
			System.out.println(absValue);
			// Hàm làm tròn trên
			double ceilValue = Math.ceil(10.3);// 11.0
			System.out.println(ceilValue);
			// Hàm làm tròn dưới 
			double floorValue = Math.floor(3.14); // 3.0
			System.out.println(floorValue);
			// Hàm round: Làm tròn theo quy tắc toán học
			double roundValue = Math.round(2.54); // 3.0
			System.out.println(roundValue);
			// Hàm random : cho giá trị ngầu nhiên trong đoạn từ 0.0 -> 1.0
			double randomValue = Math.random();
			System.out.println(randomValue);
			// Hàm pow : Hàm lấy lũy thừa
			double powValue = Math.pow(10, 2); // 100
			System.out.println(powValue);
			// Hàm sqrt : Hàm lấy căn bậc hai // 
			double sqrtValue = Math.sqrt(64); // 8.0
			System.out.println(sqrtValue);
			
		}
	}

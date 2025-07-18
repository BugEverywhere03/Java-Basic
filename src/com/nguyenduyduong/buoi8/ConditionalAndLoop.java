package com.nguyenduyduong.buoi8;

public class ConditionalAndLoop {
	public static void main(String[] args) {
		// Hôm nay sẽ học về cấu trúc điều kiện và vòng lặp
		// Cấu trúc if 
		// Ví dụ: In ra thông báo "Người trưởng thành" nếu mà biến age >= 18
//		int age = 18;
//		if (age >= 18) {  // age = 18 >= 18 -> true
//			System.out.println("Người trưởng thành");
//		}
		// Note nếu như mà sau điều kiện là true mà khối lệnh chỉ thực thi 1 dòng lệnh thì ta có thể bỏ cặp dấu ngoặc nhọn
//		if (age >= 18) // age = 18 >= 18 -> true
//			System.out.println("Người trưởng thành");
		// 
//		int age = 16;
//		// Nếu biến age mà lớn hoặc bằng 18 thì in ra "Người trưởng thành và ngược lại thì in ra "Người chưa trưởng thành"
//		if (age >= 18) { // age = 16 >= 18 -> False
//			System.out.println("Người trưởng thành");
//		} 
//		else {
//			System.out.println("Người chưa trưởng thành");
//		}
		// Cú pháp comment 
		// Ở trước dòng lệnh nào thì Java sẽ bỏ qua ( Sẽ không thực thi dòng  lệnh đó)
		// Comment lại trên Eclispe thì dùng crtl + / -> nút (?/)
		// Note các điều kiẹn if else có thể được sử dụng liên tiếp trong trường hợp mà không chỉ có giá trị đúng hoặc sai
		// Ví dụ: dtb -> xếp loại
		// A : 8.5 <= dtb <= 10 // Điều kiện cho if
		// B : 7.0 <= dtb < 8.5 // 
		// C : 5.0 <= dtb < 7.0
		// D : 5.0 > dtb 
//		double diemTrungbinh = 7.5D;
//		if (diemTrungbinh >= 8.5) {
//			// Điều kiện ở đây là diemTrungBinh >= 8.5
//			// dtb >= 8.5
//			System.out.println("A");
//		} 
//		else {
//			// dtb < 8.5 
//			if (diemTrungbinh >= 7.0) {
//				// 7.0 <= dtb < 8.5
//				System.out.println("B");
//			} else {
//				// Bé 7.0
//				if (diemTrungbinh >= 5.0) {
//					// 5.0 <= dtb < 7.0
//					System.out.println("C");
//				} else {
//					// Bé hơn 5.0
//					System.out.println("D");
//				}
//			}
//		}
		// Cấu switch case
		int day = 8; // CN
		switch (day) {
			case 1:
				System.out.println("Thứ hai");
				break;
			case 2:
				System.out.println("Thứ ba");
				break;
			case 3:
				System.out.println("Thứ tư");
				break;
			case 4:
				System.out.println("Thứ năm");
				break;
			case 5:
				System.out.println("Thứ sáu");
				break;
			case 6:
				System.out.println("Thứ bảy");
				break;
			case 7:
				System.out.println("Chủ nhật");
				break;
			default:
				System.out.println("Ngày không hợp lệ");
				break;
		}
		// Số ngày ở trong năm
		// In ra số ngày tương ứng với giá trị truyền vào switch case
		// Tháng 2 có 28 ngày
 		// 12 case tương ứng với 12 tháng 
		int month = 8;
		switch (month) {
			case 1:
				System.out.println(31);
				break;
			case 2:
				System.out.println(28);
				break;
			case 3:
				System.out.println(31);
				break;
			case 4: 
				System.out.println(30);
				break;
			case 5:
				System.out.println(31);
				break;
			case 6:
				System.out.println(30);
				break;
			case 7:
				System.out.println(31);
				break;
			case 8:
				System.out.println(31);
				break;
			case 9:
				System.out.println(30);
				break;
			case 10:
				System.out.println(31);
				break;
			case 11:
				System.out.println(30);
				break;
			case 12:
				System.out.println(31);
				break;
			default:
				System.out.println("Tháng không hợp lệ");
				break;
		}
		// Những lệnh nằm sau lệnh break trong một khối lệnh thi sẽ không được thực hiện
		
		
		
	}

}

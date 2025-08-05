package com.nguyenduyduong.baitaploop;

public class BaiTapLoop {
	public static void main(String[] args) {
		// Bài 1: Sử dụng vòng lặp for để in ra thông báo "Tôi yêu Việt Nam" 10 lần 
//		for (int i = 1; i <= 10; ++i) {
//			System.out.println(i + " Tôi yêu Việt Nam");
//			
//		}
		// 2. Sử dụng thư viện Math.random để random ra một số n ngẫu nhiên trong phạm vi từ 0 → 100 rồi ép kiểu về số nguyên.
	    // Sau đó tính tổng từ 1 → n. Rồi in ra kết quả của tổng
		double randomNumber = Math.random() * 100D; // dạng double 100D 100.00000000000000
		int n =  (int) randomNumber; // Ép kiểu được số nguyên
		System.out.println(n);
		int count = 1; // khai biến đếm của vòng lặp while
		int sum = 0; // Khai báo giá trị ban đầu của tổng các số tử 1 -> n
		while (count <= n) {// Kiểm tra xem số hiện tại còn bé hơn hoặc bằng n
			sum += count; // cộng giá hiện tại vào tổng
			count++; // cập nhật giá trị biến đếm
		}
		System.out.println("Tổng từ 1 đến " + n +" là " + sum);
		// Bài 3:
		// Sử dụng vòng lặp do-while để in ra bảng cửu chương 5.
		// Nhắc lại là cấu trúc do-while là thực thi trước rồi mới kiểm tra điều kiện lặp
		// Nên là vòng lặp do-while luôn thực hiện ít nhất 1 lần 
		int i = 1 ; // Khai biến đêm để nhân với 5
		do {
			System.out.println("5 x " + i + " = " + 5*i); // in ra giá trị bảng cửu chương
			i++;
		} while(i <= 10);
		
		// Khi mà công chuôi và số trong hàm prinln thì java sẽ ép kiểu từ số thành chuỗi
	} 
	
}

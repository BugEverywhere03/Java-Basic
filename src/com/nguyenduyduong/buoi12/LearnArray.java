package com.nguyenduyduong.buoi12;

public class LearnArray {
	public static void main(String[] args) {
		//Khai báo mảng
		char[] alphabet;
		
		// Cách 1
		// Khởi tọa mảng
		String[] animals = { "Cat", "Dog", "Chicken", "Tiger", "Lion"};
						//     0  /  1   /   2     /   3    /  4
		// Khởi tạo môt mảng int
		int[] nums = { 1, 2, 3, 4};
		// 			   0 /1/ 2/ 3
		// Cách 2 là 
		alphabet = new char[26];
		// Cho phép truy cập vào giá trị trong mảng thông qua index 
		// Cú pháp truy cập 
		// <Tên mảng>[index]
		alphabet[0] = 'a';
		alphabet[1] = 'b';
		//////////
		alphabet[25] = 'z';
		alphabet[26] = 'y';
		System.out.println(alphabet[26]);
	}

}

package com.nguyenduyduong.buoi7;

public class LearnString2 {
	public static void main(String[] args) {
		// Kiểu dữ liệu tham chiếu
		// Kiểu  dữ liệu tham chiếu là kiểu dữ liệu được tọa ỏ trong heap. 
		// Các biến đối tượng sẽ giữ địa chỉ của đối tượng được khởi tạo trong heap
		// Đây là điểm khác biệt với kiểu dữ liệu nguyên thủy
		// Kiểu dữ liệu nguyên thủy sẽ giữ gía trị trức tiếp như là 1, 5,..
		// Ví dụ kiểu dữ liệu tham chiếu:
		String stringExample = new String("Learn String in Java");
		// Khi mà khởi đối tượng thì đối tượng phải nằm trên một ô nhớ trong máy tính -> mà nhưng ô nhớ được đánh địa chỉ
		// -> Đối tượng nằm tại ô nhớ đó thì có địa chỉ
		// Gán địa chỉ stringExample
		// Cú pháp khai báo:
		// <Tên kiểu đối tượng/ Tên class> <Tên biến> =  new <Tên kiểu đối tượng/ Tên lớp>();
		// Kiểu dữ liệu nguyên thủy
		// Cú pháp khai báo biến nguyên thủy: <Tên kiểu dữ liệu> <Tên biến> = <Giá trị trực tiếp> , Giá trị trực tiếp là số ,ký tự;
		// Hàm có kiểu Tên kiểu đối tượng ()
		// Hàm constructer -> hàm khởi tạo -> được java cung cấp mặc định cho mọi class được khởi tạo
		// Nhiệm vụ của constructer là khởi đôi tượng cho class của chính nó
		// new String("") -> khởi tọa đối tượng ở trong bộ nhớ heap -> sau đó là gán địa chỉ của đối tượng cho biến stringExample
		// Ví dụ: với class LearnString2
		// Sẽ khai báo một biến giữ địa chỉ của một đối tượng của class LearnString2
		LearnString2 bienTam = new LearnString2();
		char c = 'a';
		String chuoi = "abc"; // đối tượng  abc 1
		// Khi khởi tọa string thì không thể thay đổi được nữa
		// Mọi thao tác thay đổi string thực chất là đang khởi tạo đối tượng String mới
		String chuoi1 = "def"; 
		//chuoi += chuoi1 ;// -> //"abcdef";
		
		// Tạo chuỗi "abcdef" // đối tượng 2
		String chuoi3 = "abc"; // Đối tượng 3
		
		String chuoi4 = new String("abc");
		// Lưu trên heap -> không kiểm tra -> tọa đối tượng là abc 2
		

	}

}

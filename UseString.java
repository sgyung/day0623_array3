package day0623;

public class UseString {

	public UseString() {
		String csvData = "Java,Oracle,JDBC~HTML,CSS,JavaScript";
		// 배열로 생성
		String[] arr = csvData.split(",");
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		UseString us = new UseString();
		
	}

}

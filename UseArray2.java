package day0623;

import java.util.Iterator;

public class UseArray2 {

	public UseArray2() {
	}
		
	public void arrayUse2() {
		// 2차원 배열의 한 행은 1차원 배열로 이루어져 있다.
		int[][] arr2 = { {1,2,3,4,5} ,{6,7,8,9,10} };
		
		int[] arrTemp = arr2[0];// 특정 행을 1차원 배열에 할당 할 수 있다.
		
		for (int i = 0; i < arrTemp.length; i++) {
			System.out.println(arrTemp[i]);
		}
		System.out.println("\n=========================================");
		// 1차원 배열을 2차원 배열에 행에 넣을 수 있다.
		int[] arr = {100,200,300,400,500};
		arr2[1] = arr;
		
		for (int i = 0; i < arr2.length; i++) {//행
			for (int j = 0; j < arr2[i].length; j++) {//열
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new UseArray2().arrayUse2();
	}

}

package array;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[] nums= new int[10];
		int[] nums2= new int[10];
		int num=0,num0=0;
		System.out.println("po");
		
		for (int i=0;i<nums.length;i++) {
			
			nums[i]=sc.nextInt();
			num=nums[i]+num;
			
			System.out.println(nums[i]);
			
		}
		
		for (int i=0;i<nums2.length;i++) {
			
			nums2[i]=sc.nextInt();
			num0=nums2[i]+num0;
			
			System.out.println(nums2[i]);
			
		}
		
	}

}

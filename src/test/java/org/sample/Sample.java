package org.sample;

public class Sample {
	
	static int []a;

	public static void main(String[] args) {
		
		a = new int [] {10,20,30,40,50};
		method(a);
	}
	public static void method(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);	
		}
	}
}

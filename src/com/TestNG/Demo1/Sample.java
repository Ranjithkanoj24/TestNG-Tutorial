package com.TestNG.Demo1;



public class Sample {
	
	public static void main(String[] args) {
		System.out.println(" I am main method");
		Sample.main("");
		Sample.main("", "");
		Sample.main();
	}
	
	public static void main(String args1) {
		System.out.println("I am main method 2");
		
	}
	
	public static void main(String args1, String args2) {
		System.out.println(" I am main method 3");
	}
	public static void main() {
		System.out.println(" I am main method 4");
	}

}

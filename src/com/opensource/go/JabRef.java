package com.opensource.go;

public class JabRef {
	
	static {
		System.out.println("Eyeing at GSoC 2020");
	}
	
	public static void main(String[] args) {
		
		System.out.println(sayHelloWorld());
		System.out.println(myCode(4, 7));
	}
	
	public static String sayHelloWorld() {
		return "Hello JabRef Community";
	}
	
	public static int myCode(int f, int h) {
		return f * h;
	}
}

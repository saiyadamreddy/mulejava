package com.java.sample;

public class SampleJava {
	
    public static int i = 0;
    public int j=0;
    
	public static String staticmethod() {
		return "sai mule java static methode";
	}
	
	public String nonStatic() {
		return "sai mule jave non static methode";
	}
	
	public static void main() {
		int i = SampleJava.i;
		SampleJava.staticmethod();
		SampleJava smp = new SampleJava();
		smp.nonStatic();
		
	}
}

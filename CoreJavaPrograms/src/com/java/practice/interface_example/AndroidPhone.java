package com.java.practice.interface_example;

public class AndroidPhone implements Phone{
	public void call() {
		System.out.println("this phone can call");
	}
	public void message() {
		System.out.println("this phone can message");
	}
	public void runAndroidApps() {
		System.out.println("this phone can run adroid apps");
	}
}

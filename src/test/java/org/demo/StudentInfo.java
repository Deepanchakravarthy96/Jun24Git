package org.demo;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your student id");
		short nextLine = sc.nextShort();
		System.out.println("My id is " + nextLine);
		System.out.println("Enter your student Name");
		String next = sc.next();
		System.out.println("My name is " + next);
		System.out.println("Mark 1");
		byte nextByte = sc.nextByte();
		System.out.println("Mark 1 is " + nextByte);
		System.out.println("Mark 2");
		byte nextByte2 = sc.nextByte();
		System.out.println("Mark 1 is " + nextByte2);
		System.out.println("Mark 3");
		byte nextByte3 = sc.nextByte();
		System.out.println("Mark 1 is " + nextByte3);
		System.out.println("Mark 4");
		byte nextByte4 = sc.nextByte();
		System.out.println("Mark 1 is " + nextByte4);
		System.out.println("Mark 5");
		byte nextByte5 = sc.nextByte();
		System.out.println("Mark 1 is " + nextByte5);
		long nextLong = sc.nextLong();
		System.out.println(nextByte + nextByte2 + nextByte3 + nextByte4 + nextByte5);

	}
	private void Employee() {

		System.out.println("Employee name is deepan");
	}

}

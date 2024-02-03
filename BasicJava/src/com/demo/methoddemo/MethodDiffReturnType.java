package com.demo.methoddemo;

import java.util.Scanner;

public class MethodDiffReturnType {
	public static int add()
	{
		int a=10,b=20,sum;
		sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter choice : \n 1 add\n 2 sub");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			int ans=add();
			System.out.println("sum :"+ans);

	
		}
		
			}

}

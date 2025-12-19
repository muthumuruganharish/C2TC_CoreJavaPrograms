package com.tns.nonAccessModifier;

public class StaticDemo {
	
		//static variable
		static int count;
		
		//static block
		static {
			count=20;
			System.out.println("Shows the static " +  "count assigned : " + count);
		}
		//static method
		static void show() {
			System.out.println("Methd runs in static " + "with coount of : " + count);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Static in main " + "method :" + count);
			show();
		}

	}

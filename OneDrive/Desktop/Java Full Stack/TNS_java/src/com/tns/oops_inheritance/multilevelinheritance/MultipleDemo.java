package com.tns.oops_inheritance.multilevelinheritance;

interface a{
	
	void a1();
	
}

interface b{
	void b1();
	
}

public class MultipleDemo implements a,b {

	@Override
	public void b1() {
		// TODO Auto-generated method stub
		System.out.println("b1");
		
	}

	@Override
	public void a1() {
		// TODO Auto-generated method stub
		System.out.println("a1");
		
	}
	
	

}

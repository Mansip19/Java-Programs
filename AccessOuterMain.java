package com.innerdemo;
//Access outer class from inner class 
class Outer
{
	int x=10;
	class Inner
	{
		int y=20;
		public int innerMethod()
		{
			return x;
		}
	}
}
public class AccessOuterMain {

	public static void main(String[] args) {
		Outer out=new Outer();
		Outer.Inner in=out.new Inner();
		System.out.println(in.innerMethod());

	}

}

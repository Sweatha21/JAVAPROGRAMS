package com.Overriding;

public class Child extends Grandfather{
	@Override
	public void property(int age, long phnum) {
		super.property(age, phnum);
	}
	@Override
	public void property(String land, String house) {
		super.property(land, house);
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.property(25, 1234567890l);
		c.property("chennai", "tiruvallur");
	}

}

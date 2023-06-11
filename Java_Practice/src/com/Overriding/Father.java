package com.Overriding;

public class Father extends Grandfather {
	@Override
	public void property(int age, long phnum) {
		super.property(age, phnum);
	}
	@Override
	public void property(String land, String house) {
		super.property(land, house);
	}
	public static void main(String[] args) {
		Father f = new Father();
				f.property(50, 9944042896l);
		f.property("chennai", "tiruvallur");
		
	}

}

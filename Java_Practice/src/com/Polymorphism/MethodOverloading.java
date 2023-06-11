package com.Polymorphism;

public class MethodOverloading { // same method name but different argument
	public void biodata(String name) {
		System.out.println(name);
		}
	public void biodata(String degree,String department) {
		System.out.println(degree+" "+department);
	}
	public void biodata(String country,String state,String city) {
		System.out.println(country+" "+state+" "+city);
	}
	public void biodata(double cgpa,int age,String collegename, String place) {
		System.out.println(cgpa+" "+age+" "+collegename+" "+place);//float also can be given but should mention f at last. for double no need
	}
	public void biodata(long phonenumber,String bloodgroup){
		System.out.println(phonenumber+" "+bloodgroup);
	}
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.biodata("swetha");
		m.biodata("B.Tech", "Biotechnology");
		m.biodata("India", "Tamilnadu", "Tiruvallur");
		m.biodata(8.3, 24, "REC", "Chennai");
		m.biodata(9944042896l, "O+VE");// for double no need to put keyword at end and no need to put double quotes // for int no double quotes 
	} // FOR LONG NO DOUBLE QUOTES and mention l at end without space
}

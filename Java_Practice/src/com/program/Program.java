package com.program;

public class Program {
	public void grandFather() {
		System.out.println("M K Mannar");
		}
	private void father() {
		System.out.println("Moorthy");
		}
	protected void mother() {
		System.out.println("Bharathi");
		}
    void kids() {
    	System.out.println("Two");
    	}
    public static void main(String[] args) {
		Program s = new Program();
		s.grandFather();
		s.father();
		s.mother();
		s.kids();
	}
    }

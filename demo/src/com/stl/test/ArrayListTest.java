package com.stl.test;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListTest {

	

	public static void main(String[] args) {
		CopyOnWriteArrayList<Test> alTest = new CopyOnWriteArrayList<Test>() ;
		alTest.add(new Test("Ram"));
		alTest.add(new Test("Sam"));
		alTest.add(new Test("Kam"));
		alTest.add(new Test("Hari"));
		System.out.println(alTest);

		//method : 1
		/*for(int i = 0 ; i<alTest.size();i++){
			alTest.get(i).setName("Raja");
		}
		System.out.println(alTest);*/
		
		//method : 2
		/*for (Test test : alTest) {
			test.setName("Raja");
		}
		System.out.println(alTest);*/
		
		//method : 3
		Test t ;
		for (int i = 0 ; i < alTest.size(); i++) {
			t = alTest.get(i) ;
			System.out.println("t.hashCode() : "+t.hashCode());
			System.out.println("alTest.get(i).hashCode() : "+alTest.get(i).hashCode());
			t.setName("Raja");
		}
		System.out.println(alTest);
	}
	
	private static class Test{
		private String name ;

		Test(String name) {
			super();
			this.name = name;
		}

		@Override
		public String toString() {
			return "Test [name=" + name + "]";
		}

		String getName() {
			return name;
		}

		void setName(String name) {
			this.name = name;
		}
		
	}
}

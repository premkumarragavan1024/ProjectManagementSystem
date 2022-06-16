package com.java.OopsConcepts;

//				A-parents (Base)
//     B-dau	    C-dau       D-son(Derived from Based class A)




class A{///Base-parents
	public void printA() {
		System.out.println("Print A");
	}
}

class B extends A{ //-daughter
	public void printB() {
		System.out.println("Print B");
	}
}

class C extends A{//-daughter
	public void printC() {
		System.out.println("Print C");
	}
	
}

class D extends A{//-son
	
	public void printD() {
		System.out.println("Print D");
	}
}
public class HierarchicalDemo {//Main Class

	public static void main(String[] args) {//Main method
		// TODO Auto-generated method stub
		
		System.out.println("----------------B CLASS CALLED--------------");
		B bObj = new B();
		bObj.printA();
		bObj.printB(); 
	//	bObj.printC(); cannot be accessed becase b is not extended with C
		
		System.out.println("----------------C CLASS CALLED--------------");
		C cObj = new C();
		cObj.printA();
		cObj.printC();
		
		System.out.println("----------------D CLASS CALLED--------------");
		D dObj=new D();
		dObj.printA();
		dObj.printD();

	}

}

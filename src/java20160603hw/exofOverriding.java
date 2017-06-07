package java20160603hw;

//20170603 hw2 q4 
//overroading:in the sub class, super class is changed with different args
//

public class exofOverriding{

	public static void main(String args[]){
		A1 a1 = new A1();
		a1.disp();
		
		B1 b1 = new B1();
	    b1.disp();

	    B2 b2 = new B2();
	    b2.disp();
	  }
	}

	//superclass which is overrode
	class A1{
	  public void disp(){
		System.out.println("superclass");
	    System.out.println("A");
		System.out.println("");
	  }
	}

	//overriding ex.1, which is overriding class A
	//with different arges
	class B1 extends A1{
	  public void disp(){
		System.out.println("sub class overriding");
	    System.out.println("B1");
		System.out.println("");
	  }
	}

	//overriding ex.1, which is overriding class A as well
	//but without changning anything
	class B2 extends A1{
	}

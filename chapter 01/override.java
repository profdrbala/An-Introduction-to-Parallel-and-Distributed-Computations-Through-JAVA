//override.java
class A{
	void display(){ //overriding method  
		String a1="Hellow"; 
	}
} 
class B extends A{// inheriting class A with B
	void display(){  //overriding method
		super.display();// override the supper class method
		System.out.println("world");
	}
	public static void main(String BDP[]){
		B a=new B();
		a.display();   
	}
}

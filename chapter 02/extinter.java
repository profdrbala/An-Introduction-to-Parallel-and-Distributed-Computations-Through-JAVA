interface A1{  
	void display();  
}
interface A2 extends A1{   
	void show(); 
}
class B implements A2{
	public void display(){  
		System.out.println("Hello"); 
	}
	public void show(){ 
		System.out.println("World"); 
	}     
}
class C{
	public static void main(String BDP[]){
		B b=new B();
		b.display();  
		b.show();
    }
}	

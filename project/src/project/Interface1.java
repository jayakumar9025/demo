package project;

 interface Interface1 {
//	public void m1(int a, int b) {
//		System.out.println("hello..");
//	}
	public void m2();

}
interface Interface2 extends Interface1{
	public void m3() ;
		
	
}
class Imple implements Interface1,Interface2{

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("hello from m3");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("hello from m2");
	}
	
}

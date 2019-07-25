
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("Hello from The A Class ");
		UserInfo user=UserInfo.getInstance();
		user.setUsername("ALi Hrhera ");
		System.out.println("I'm Printer After Assign  user name  ");

		B b=new B();
		
	}

}

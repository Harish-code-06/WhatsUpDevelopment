public class FirstClass {
	
	int a=5; 
	
	public void getData()
	
	{
		System.out.println("I'm in first class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirstClass gd =new FirstClass();
gd.getData();
System.out.println(gd.a);
SecondClass sc= new SecondClass();
sc.setData();
	}

}
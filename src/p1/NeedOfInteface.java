package p1;

class NeedOfInteface {
	public static void main(String[] args) {
		
		
		Laptop lap=new Laptop();
		Desktop desk=new Desktop();
		Developer dev=new Developer();
		dev.devApp(lap);
		
		} 

}
 class Developer{
	public void devApp(Laptop lap)
	{
		lap.code();
	}
	
}
class Laptop{
public void code()
{
	System.out.println("code,compile, run");	
}
}
class Desktop{
	public void code()
	{
		System.out.println("code,compile, run and faster");	
	}
}

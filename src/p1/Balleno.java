package p1;

public class Balleno {
public void drive()
{
System.out.println("driver driving the car");	
}

static class Bitu{
	public void playMusic()
	{
	System.out.println("sing a song");	
	}
}
public static void main(String[] args) {
	

Balleno b=new Balleno();
b.drive();
Balleno.Bitu c=new Balleno.Bitu();
c.playMusic();
}
}

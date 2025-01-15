package p1;

public class Enum {
public static void main(String [] args)
{
	Status s=Status.Running;
	//Status s=Status.pending;
	//System.out.println(s.ordinal());
	//Status[] s=Status.values();
	
	//System.out.println(s);
//	for(Status ss:s)
//	{
//		System.out.println(ss);
//	}
	switch(s)
	{
	case Running:
	System.out.println("All good");
	break;
	case pending :
		System.out.println("Plz wait");
	     break;
	case Failed:
		System.out.println("Plz try again");
		break;
	 default:
		System.out.println("Done");
		break;
	};
}
}

import java.rmi.*;
class Client
{
	public static void main(String arg[]) throws Exception
	{
		double x,y;
		x=50.6;y=60.5;
		try
			{
				Arith a1=(Arith)
				Naming.lookup("rmi://localhost/4000");
                         System.out.println("Addition"+a1.add(x,y));
                        }
catch(Exception e)
 {
 }
}
}
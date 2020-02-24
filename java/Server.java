import java.rmi.*;
class Server
{
public static void main(String arg[]) throws Exception
{
try
{
Arithc a=new Arithc();
Naming.bind("//localhost/4000",a);
System.out.println("Server started");
}
catch(Exception e)
{
}
}
}
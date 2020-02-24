import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class Arithc extends UnicastRemoteObject implements Arith
{
Arithc() throws RemoteException
{
super();
}
public double add(double x,double y) throws RemoteException
{
return(x+y);
}
} 
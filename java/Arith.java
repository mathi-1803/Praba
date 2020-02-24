import java.rmi.*;
public interface Arith extends Remote 
{

public double add(double x,double y) throws RemoteException;

}
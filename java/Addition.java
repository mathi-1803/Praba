import java.rmi.*;
public interface Arith extend Remote 
{
public double add(double x,double y)
Throws Remote Exception;
}
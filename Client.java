//User defined package import
import PPA.Marvellous;
import PPA.Infosystems;
import PPA.LB.Pune;

public class Client 
{
    public static void main(String A[])
    {
        Marvellous mobj= new Marvellous();
        Infosystems iobj =new Infosystems();
        Pune pobj = new Pune();

        System.out.println("Inside Main of client");

        mobj.fun();
        iobj.gun();
        pobj.sun();
    }
    
}

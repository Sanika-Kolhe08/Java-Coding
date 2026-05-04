import java.util.*;

public class ArrayIndexException
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] ={11,21,51,101,111};

        System.out.println("Enter the index of array : ");
        int index = sobj.nextInt();

        try
        {
            System.out.println("Inside try block.");
            System.out.println("Elemet at that index is : "+Arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException aobj)
        {
            System.out.println("Inside catch block");
            System.out.println("Excetion occured :"+aobj);
        }

        System.out.println("End of application : ");
    }
}

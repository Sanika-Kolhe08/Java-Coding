import java.util.Scanner;

class DynamicMemory
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int size = 0;

        System.out.println("Enter no. of elements : ");
        size = sobj.nextInt();

        //Dynamic Memory Allocation
        float marks[] = new float[size];

        //Use the memory





        //Deallocate the memory
        marks=null;
        System.gc();


    }


}
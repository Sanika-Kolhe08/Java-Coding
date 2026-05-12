import java.util.Scanner;

class DynamicMemory
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int size = 0;
        int i = 0;

        System.out.println("Enter no. of elements : ");
        size = sobj.nextInt();

        //Dynamic Memory Allocation
        float marks[] = new float[size];

        //Use the memory
        System.out.println("Enter your marks: ");
        for(i=0;i<size;i++)
        {
            marks[i]=sobj.nextFloat();
        }

        System.out.println("Entered marks are : ");

        for(int j=0;j<size;j++)
        {
            System.out.println(marks[j]);
        }

        //Deallocate the memory
        marks=null;
        System.gc();


    }


}
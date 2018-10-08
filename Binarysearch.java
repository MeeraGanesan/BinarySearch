import java.util.*;
class Binarysearch
{
    public void main()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=SC.nextInt();
        int low=0;
        int high=n-1;
        int pos=-1;
        int a[]=new int[n];
        System.out.println("Enter the values");
        for (int i=0;i<n;i++)
        {
            a[i]=SC.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int se=SC.nextInt();
        while (low<=high)
        {
            int mid=(low+high)/2;
            if (a[mid]==se)
            {
                pos=mid+1;
                System.out.println("Position of number = "+pos);
                break;
            }
            else if(se<a[mid])
            {
                high=mid-1;
            }
            else if(se>a[mid])
            {
                low=mid+1;
            }
        }
        if (pos==-1)
        {
            System.out.println("Not found");
            }
        }
    }
            
        
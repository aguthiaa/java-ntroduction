package DataStructures;

public class OldArrayApp
{
   public static void main(String []args)
   {
       long [] arr;
       arr = new long[100];

       int nElmens = 0;
       int searchKey = 89;

       arr [0] = 77;
       arr [1] = 17;
       arr [2] = 39;
       arr [3] = 55;
       arr [4] = 89;
       arr [5] = 20;
       arr [6] = 26;
       arr [7] = 92;
       arr [8] = 43;
       arr [9] = 9;

       nElmens = 10;

       for (int i =0; i<nElmens; i++)
       {
           System.out.print(arr[i]+" ");

           if (searchKey == arr[i])
           {
               System.out.println("Found "+ searchKey);

               for (int k = i; k<nElmens - 1; k++)
               {
                   arr[k] = arr[k + 1];
                   nElmens--;

                   for (i =0; i<nElmens; i++)
                   {
                       //System.out.println(" ");
                       System.out.print(arr[i]+" ");
                   }
               }
           }
           else
           {
               System.out.println(searchKey+" could not be found");
           }
       }
   }
}


package lab4;

import java.util.Arrays;

/**
 * Created by ameen on 2/14/2021.
 */
public class GenralArrayMethod {
    public static <T> void print(T arr[])
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
     public static <T> void Merige(T a[],T b[]){
       T[] c= (T[]) new Object[a.length+b.length];
         for (int i = 0; i <a.length ; i++) {
             c[i]=a[i];
             c[i+a.length]=b[i];

         }
         System.out.println(Arrays.toString(c));

     }

    static int arr[]= {1,2,3,4,5};
    int b=arr.length-1;
    public void revers(){
        for(int i=0;i<arr.length/2;i++)
        {
            int a;
            a=arr[i];
            arr[i]=arr[b];
            arr[b]=a;
            b--;

        }}

 public static  <T> void Revers(T arr[]){
        int b= arr.length-1;
        for (int i = 0; i <arr.length/2 ; i++) {
            T a;
            a=arr[i];
            arr[i]=arr[b];
            arr[b]=a;
            b--;

        }
     System.out.println(Arrays.toString(arr));
        }

    public static void main(String[] args) {
        Integer a[]= {1,235,32};
        String a2[]={"a","b","s"};
      print(a);
        print(a2);
        Integer s[]={1,2,3,4,5};
       Integer b[]= {6,7,8,9,10};
        Merige(a,b);
        Revers(s);

}}

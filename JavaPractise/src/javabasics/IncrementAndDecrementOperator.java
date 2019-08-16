package javabasics;

public class IncrementAndDecrementOperator {

    public static void main(String[]args){

        //++ is called incremental
        //-- is called decremental

        int i=1;
        int j=i++;//post increment

        System.out.println(i);
        System.out.println(j);

        int k=1;
        int l=++k;//pre increment

        System.out.println(k);
        System.out.println(l);

        int a=2;
        int b=a--;//post decrement

        System.out.println(a);
        System.out.println(b);

        int m=2;
        int n=--m;

        System.out.println(m);
        System.out.println(n);
    }

}

package javabasics;

public class TwoDimensionArray {

    public static void main(String[]args){

       int a[][]=new int[4][5];

        System.out.println(a.length);//total no of rows =4
        System.out.println(a[0].length);//total no of columns =5

        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[0][3]=40;
        a[0][4]=50;

        a[1][0]=11;
        a[1][1]=12;
        a[1][2]=13;
        a[1][3]=14;
        a[1][4]=15;

        a[2][0]=10;
        a[2][1]=20;
        a[2][2]=30;
        a[2][3]=40;
        a[2][4]=50;

        a[3][0]=11;
        a[3][1]=12;
        a[3][2]=13;
        a[3][3]=14;
        a[3][4]=15;

        System.out.println(a[1][2]);
        System.out.println(a[0][3]);

        //to print all the values of 2d array

        for (int row=0;row<a.length;row++){
            for(int col=0;col<a[0].length;col++){
                System.out.println(a[row][col]);
            }

            }
        }

    }


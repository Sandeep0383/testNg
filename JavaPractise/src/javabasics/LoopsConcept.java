package javabasics;

public class LoopsConcept {



    public static void main(String[]args){

        //while loop :- disadvantages :it will generate infinite loop if incremental/decremental part is not given

        int i=1;
         while(i<=10){
             System.out.println(i);
             i=i+1;
         }
        System.out.println("*********************");

        for(int j=1;j<=10;j++){
            System.out.println(j);
        }

        System.out.println("*********************");

        for(int j=1;j>=-10;j--) {
            System.out.println(j);
        }


        System.out.println("*********************");

        for(int k=10;k>=1;k--){
            System.out.println(k);
        }


    }
}

package com.company.iterative;

public class employeeloop {



    String name;
    employeeloop(String name){
        this.name=name;
    }
    public String getName(){
        return name;

    }


    public static void main(String[] args) {
        employeeloop [] err = {new employeeloop("a"),new employeeloop("b"),
                new employeeloop("c")};

        for(int i=0;i<err.length;i++){
           employeeloop e = err [i];
            e.getName();

        }

       //for(enhanforloop e : err)
           //System.out.println(e.getName());
       // System.out.println(e);
        }


}





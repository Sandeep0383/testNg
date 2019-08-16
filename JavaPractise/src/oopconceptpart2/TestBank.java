package oopconceptpart2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TestBank {

    public static void main(String[]args){

     //COMBINED TIME POLYMORPHISM
        HSBCBank obj=new HSBCBank();
        obj.credit();
        obj.debit();
        obj.PersonalLoan();
        obj.TransferMoney();
        obj.educationalloan();
        obj.mutualfund();
        System.out.println(BrazilBank.i);

     //DYNAMIC POLYMORPHISM:-CHILD CLASS OBJECT CAN BE REFERRED BY PARENT CLASS VARIABLE

        USBank obj1  =new HSBCBank();

        obj1.credit();
        obj1.debit();
        obj1.TransferMoney();






    }
}
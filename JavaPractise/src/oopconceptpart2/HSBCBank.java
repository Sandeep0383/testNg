package oopconceptpart2;

public class HSBCBank implements USBank ,BrazilBank{ //WE ARE ACHIEVING MULTIPLE INTERFACE

    //IS-A RELATIONSHIP

    //WHEN A CLASS IS IMPLEMENTING ANY INTERFACE ,THEN ITS MANDATORY TO DEFINE/OVERRIDE ALL THE METHODS OF INTERFACE


    //OVERRIDING FROM USBank

    public void credit(){
        System.out.println("credit method");
    }


    public void debit(){
        System.out.println("debit method");
    }


    public void TransferMoney() {
        System.out.println("transfer money method");
    }

    //SEPERATE METHODS OF HSBCBank CLASS

    public void PersonalLoan(){
            System.out.println("personal loan method");
        }

    //OVERRIDDEN METHODS OF BrazilBank

    public void mutualfund(){
        System.out.println("mutual fund method");
    }

    public void educationalloan(){
        System.out.println("educational loan method");
    }

    }


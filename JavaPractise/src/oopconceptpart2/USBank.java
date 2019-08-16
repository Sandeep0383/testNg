package oopconceptpart2;

public interface USBank {

    int min_bal=100;

    public void credit();

    public void debit();

    public void TransferMoney();

    //ONLY METHOD DECLARATION
    //NO METHOD BODY....ONLY METHOD PROTOTYPE
    //IN INTERFACE WE CAN DECLARE THE VARIABLES(VARIABLES ARE BY DEFAULT STATIC IN NATURE)
    //VARIABLE VALUE WILL NOT BE CHANGED
    //NO STATIC METHOD IN INTERFACE
    //WE CAN NOT CREATE THE OBJECT OF INTERFACE
    //INTERFACE IS ABSTRACT IN NATURE

}

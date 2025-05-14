
class Bank {
    double getRateofInterest(){
        return 7.0;    
 }
}
class SBI extends Bank{
    double getRateofInterest(){
        return 10.0;
    }
}
class ICICI extends Bank{
    double getRateofInterest(){
        return 5.0;
    }
}

public class Bankoverride {
    public static void main(String[] args) {
        Bank b=new Bank();
        System.out.println(b.getRateofInterest());
        SBI sbi=new SBI();
        System.out.println( sbi.getRateofInterest());
        ICICI i=new ICICI();
        System.out.println(i.getRateofInterest());

        Bank b1=new SBI();
       System.out.println( b1.getRateofInterest());
        Bank b2=new ICICI();
       System.out.println(b2.getRateofInterest());
    }
}

class Teacher{
    String sub="general";
    void display()
    {
        System.out.println("Teacher:sub="+sub);
    }
    //System.out.println(sub);
}
class Maths extends Teacher{
Maths(){
    sub="Maths";
}
    void show(){
        System.out.println("Maths:sub="+sub);
    
    }

}
public class inheri {
    public static void main(String[] args) {
        Maths m=new Maths();
        m.display();
        m.show();
   
    }
}

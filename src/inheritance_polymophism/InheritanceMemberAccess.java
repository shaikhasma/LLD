package inheritance_polymophism;
class A{
    private String name;
    protected String surname;

    public A(){
        System.out.println("Parent Class Constructor");
    }
    public A(String name){
        this.name = name;
    }

    public String getFirstName(){
        return name;
    }

}
class B extends A{
    public B(){
        super("Asma");
        surname = " shaikh";
        System.out.println("Child Class Constructor");
    }
    @Override
    public  String toString(){
        //can not call first name of parent class here directly
        return "First Name : " + getFirstName() + "\nLast Name : " + super.surname;
    }
}
public class InheritanceMemberAccess {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b);
    }
}

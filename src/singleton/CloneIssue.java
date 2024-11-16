package singleton;

class SingletoneClone implements Cloneable{
    private static SingletoneClone singletoneClone;
    private SingletoneClone(){}

    protected Object clone() throws CloneNotSupportedException{
        return new CloneNotSupportedException();
    }

    public static SingletoneClone getInstance(){
        if(singletoneClone == null){
            singletoneClone = new SingletoneClone();
        }
        return singletoneClone;
    }
}
public class CloneIssue implements Cloneable{
    public static void main(String args[]) throws CloneNotSupportedException {
       /*CloneIssue c1 = new CloneIssue();
        CloneIssue c2= (CloneIssue)c1.clone();
        System.out.println("Object 1 : "+ c1.hashCode());
       System.out.println("Object 2 : "+ c2.hashCode());
*/
        SingletoneClone o1 = SingletoneClone.getInstance();
        SingletoneClone o2= (SingletoneClone)o1.clone();
        System.out.println("Object 1 : "+ o1.hashCode());
        System.out.println("Object 2 : "+ o2.hashCode());
    }

}

//Marker interface : must should implement cloneable

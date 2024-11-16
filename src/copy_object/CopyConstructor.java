package copy_object;
class Student{
    int id;
    String name;

    {
        System.out.println("Id - " +this.id + " Name - " + this.name);
    }

    public Student(Student student){
        this.id = student.id;
        this.name = student.name;
    }

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "Hashcode - "+ this.hashCode() + "Id - " +this.id + " Name - " + this.name;
    }
}
public class CopyConstructor {

    public static void main(String[] args) {
      Student aruna = new Student(1,"Aruna Salokhe");
      Student arunaCopy = new Student(aruna);
      Student arunaRef = aruna;

      System.out.println(aruna);
      System.out.println(arunaCopy);
      System.out.println(arunaRef);
    }
}

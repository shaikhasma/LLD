package builder;

public class ClientApp {
    public static void main(String[] args) {
        Student s = Student.builder()
                .setName("ASMA")
                .setAge(37)
                .setId(786)
                .build();

        System.out.println(s);


    }
}

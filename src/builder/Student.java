package builder;

public class Student {
    String name;
    int age;
    long id;
    String email;
    String phone;

    public Student(Builder builder){
        // validation
        this.name = builder.getName();
        this.age = builder.getAge();
    }

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class Builder {
        String name;
        int age;
        long id;
        String email;
        String phone;


        public Builder setName(String name) {
            this.name = name;
            return  this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return  this;
        }

        public Builder setId(long id) {
            this.id = id;
            return  this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return  this;
        }

        public Student build(){
            return new Student(this);
        }
        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public long getId() {
            return id;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }
    }
}

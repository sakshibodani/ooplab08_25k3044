//task 4 25k-3044
public interface User {
    void login();
}
class Student implements User{
    private String name;
    public Student(String name){
        this.name=name;
    }
    @Override
    public void login() {
        System.out.println("Student "+ name + " has logged in. Welcome to your portal");
    }
}
class Instructor implements User{
    private String name;
    public Instructor(String name){
        this.name=name;
    }
    @Override
    public void login(){
        System.out.println("Instructor" + name + " has logged in. Welcome to your panel");
    }
    public void uploadCourse(String Course)
    {
        System.out.println("Instructor " + name + " is uploading a new course: " + Course);
    }
}
class OnlineSystem{
    public static void main(String[] args){
        User std1= new Student("Sakshi");
        std1.login();

        Instructor i1= new Instructor("Ma'am Kinza");
        i1.login();
        i1.uploadCourse("object oriented programming");

    }
}


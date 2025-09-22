class student1{
    String student_name;
    public student1(String student_name){
        this.student_name = student_name;
    }
    public String getName(){
        return student_name;
    }

}

public class eg2 {
    public static void main(String[] args) {
        student1 s = new student1("aditya");
        System.out.println(s.student_name);
    }
}

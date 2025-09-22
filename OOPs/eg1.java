class student{      //using another class
    int id;         
    String name;

    // student(){      //using constrctor
    //     id =10;
    //     name = "aditya";
    // }

    student(int n){      //using parameterize constrctor
        id = n;
        name = "aditya";
    }
}

public class eg1 {
    // int id;          // inside the main class
    // String name;

    public static void main(String[] args) {
        // eg1 m = new eg1();  // inside the main class
        // student m = new student();  // using another class

        // m.id = 10;       // inside the main class
        // m.name = "java";

        student m = new student(10);
        System.out.println(m.id);        
        System.out.println(m.name);
    }
}

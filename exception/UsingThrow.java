package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class sample {
    private String name;

    void accept() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name : ");
        name = br.readLine();
    }

    void display() {
        System.out.println("Name : " + name);
    }
}

public class UsingThrow {
    public static void main(String[] args) throws IOException {
        sample s = new sample();
        s.accept();
        s.display();
    }
}

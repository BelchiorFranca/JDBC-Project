import model.entities.Department;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        System.out.println(obj);
    }
}
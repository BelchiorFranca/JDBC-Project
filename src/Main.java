import model.entities.Department;
import model.entities.Seller;
import java.util.Date;


public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21,"Bob","Bob@gmail.com",new Date(),2500.35,obj);
        System.out.println(obj);
        System.out.println(seller);
    }
}
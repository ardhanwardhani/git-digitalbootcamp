import childs.Item;
import parents.Product;
public class Main {
    Product product1 = new Product(); // Tidak dapat meninstansiasi karena abstract class
    Product product2 = new Item();// Instansiasi melaui child class
}
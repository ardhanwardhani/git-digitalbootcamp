/* Digital Bootcamp 79
 * Created by: Anugrah Wardhani (ardhanwardhani)
 * Updated at: 15:30 21/06/23
 */
public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    void sayHello(String paraName){
        System.out.println("Hello, "+ paraName +", my name is "+ name);
    }
}

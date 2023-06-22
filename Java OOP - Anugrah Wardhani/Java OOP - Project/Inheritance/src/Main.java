/* Digital Bootcamp 79
 * Created by: Anugrah Wardhani (ardhanwardhani)
 * Updated at: 15:30 22/06/23
 */

import childs.Doctor;
import childs.Programmer;
import childs.Teacher;
import parents.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Programmer("Anugrah", "Bandung Barat", "Java");
        Person person2 = new Teacher("Kamil", "Bandung Barat", "Sejarah");
        Person person3 = new Doctor("Samsul", "Bandung Barat", "Sp.KK");

        sayHello(person1);
        sayHello(person2);
        sayHello(person3);
    }

    static void sayHello(Person person){
        String message;
        if(person instanceof Programmer){
            Programmer programmer = (Programmer) person;
            message = "Nama saya " + programmer.getName() + " seorang programmer " + programmer.getTechnology() + ".";
        } else if(person instanceof Doctor){
            Doctor doctor = (Doctor) person;
            message = "Nama saya " + doctor.getName() + " seorang dokter " + doctor.getSpecialist() + ".";
        } else if(person instanceof Teacher){
            Teacher teacher = (Teacher) person;
            message = "Nama saya " + teacher.getName() + " seorang guru " + teacher.getSubject() + ".";
        }else{
            message = "Nama saya " + person.getName() + ".";
        }
        System.out.println(message);
    }
}
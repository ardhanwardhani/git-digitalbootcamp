package childs;

import parents.Person;

public class Programmer extends Person {
    private String technology;

    public Programmer() {
    }

    public Programmer(String name, String address, String technology) {
        super(name, address);
        this.technology = technology;
    }

    public void hacking(){
        System.out.println("I can hacking a website");
    }

    public void coding(){
        System.out.println("I can create an application using technology " + technology +".");
    }

    @Override
    public void greeting(){
        super.greeting();
        System.out.println("My job is a " + technology+ " programmer.");
    }

    //Getter dan Setter technology
    public String getTechnology(){
        return this.technology;
    }

    public void setTechnology(String technology){
        this.technology = technology;
    }
}

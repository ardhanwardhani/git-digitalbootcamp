package childs;

import parents.Person;

public class Doctor extends Person {
    private String specialist;

    public Doctor() {
    }

    public Doctor(String name, String address, String specialist) {
        super(name, address);
        this.specialist = specialist;
    }

    public void surgery(){
        System.out.println("I can surgery operation patients");
    }

    @Override
    public void greeting(){
        super.greeting();
        System.out.println("My occupation is a " + specialist + " doctor.");
    }

    //Getter dan Setter specialist
    public String getSpecialist(){
        return this.specialist;
    }

    public void setSpecialist(String specialist){
        this.specialist = specialist;
    }
}

package childs;

import parents.Person;

public class Teacher extends Person {
    private String subject;

    public Teacher() {
    }

    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }

    public void teaching(){
        System.out.println("I can teach "+ subject +", so anyone how wants to learn can talk to me.");
    }

    @Override
    public void greeting(){
        super.greeting();
        System.out.println("My job is a " + subject + " teacher.");
    }

    //Getter dan Setter subject
    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }
}

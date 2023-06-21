public class Categories {
    int id;
    String name;
    boolean expensive;

    public Categories() {
        super();
    }

    public Categories(int id, String name, boolean expensive) {
        super();
        this.id = id;
        this.name = name;
        this.expensive = expensive;
    }

    //Contoh Getter dan Setter tipe data boolean
    //Getter
    public boolean isExpensive(){
        return this.expensive;
    }

    //setter
    public void setExpensive(boolean expensive){
        this.expensive = expensive;
    }

    //Getter dan Setter tipe data object
    //Getter
    public String getName(){
        return this.name;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }

    //Getter dan Setter tipe data primitif (integer)
    //Getter
    public int getId(){
        return this.id;
    }

    //setter
    public void setId(int id){
        this.id = id;
    }
}

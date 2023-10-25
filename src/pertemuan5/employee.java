package pertemuan5;

public class employee extends person {
    //atribut

    private String id;
    public employee(String n, String a, String id) {
        super(n,a);
        this.id = id;
    }

    public String getId_emp() {
        return id;
    }

}



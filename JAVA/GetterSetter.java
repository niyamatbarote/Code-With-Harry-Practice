class MyStudent32121 {
    private int id;
    private String name;

    public void setId(int a) {
        id = a;
    }

    public void setName(String str) {
        name = str;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class GetterSetter {

    public static void main(String[] args) {
        MyStudent32121 m1 = new MyStudent32121();
        MyStudent32121 m2 = new MyStudent32121();

        // m1.id = 1;
        // m2.name = "Niyamat";         //---> Throws Error due to private access modifiers 
        
        m1.setId(1);
        System.out.println(m1.getId());
    }
}

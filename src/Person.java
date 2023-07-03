public class Person implements  Bank {

    private String first_Name;
    private String last_Name;
    private int age;
    private float balance;

    @Override
    public void plus(float a) {
        this.balance = this.balance + a;

    }

    @Override
    public void minus(float b) {
        this.balance=this.balance-b;

    }

    public Person(String first_Name, String last_Name, int age, float balance) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.age = age;
        this.balance = balance;


    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person:" +"\n"+
                "first_Name:" + first_Name + "\n" +
                "last_Name:" + last_Name + "\n" +
                "age:" + age +"\n"+
                "balance:" + balance;
    }
}


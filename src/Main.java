
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirst_Name("Tramp");
        person.setLast_Name("Donalt");
        person.setAge(78);
        person.setBalance(6);
        person.plus(2);
        person.minus(4);
        System.out.println(person);
    }
}
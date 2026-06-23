public class main
{
    public static void main(String[] args)
    {
        Person p1= new Person("Myat", "S100");
        Person p2 = new Student("Alice", "S101");
        Person p3 = new Lecturer("SU", "S102");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}
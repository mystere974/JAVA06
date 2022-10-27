public class Classroom {

    public static void main(String[] args) {

        Wilder student = new Wilder("Loghann", true);

        System.out.println(student.whoAmI());

        student.setAware(false);
        student.setFirstname("Farid");
        System.out.println(student.whoAmI());

        student.setFirstname("bob");
        student.setAware(true);
        System.out.println(student.whoAmI());
    }

}

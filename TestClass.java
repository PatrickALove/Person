public class TestClass {

    public static void main(String[] args) {
        //instantiate a person
        Person p1 = new Person(25);
        System.out.println(p1); // print out the memory address
        // p1.heightInInches=70;
        p1.setHeightInInches(70);
        p1.setWeightInPounds(150);
        //p1.setAge(25);
        System.out.println("BMI for p1: "+p1.getBMI());

        Person p2 = new Person();
        // p2.heightInInches=60;
        p2.setHeightInInches(60);
        p2.setWeightInPounds(135);
        p2.setAge(25);
        System.out.println("BMI for p2: "+p2.getBMI());

        Person p3 = new Person(63,300,32);
        // deleted setters because you no longer need them.
        System.out.println("BMI for p3: "+p3.getBMI());
    }
}

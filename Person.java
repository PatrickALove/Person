public class Person {

    //constructor
    Person() { //This one is the default constructor, no params

    }
    Person(int age) {
        this.age =age;
    }
    Person (int heightInInches, int weightInPounds, int age) {
        this.heightInInches=heightInInches;
        this.weightInPounds=weightInPounds;
        this.age=age;
    }

    //attribute

    private int heightInInches;
    private int weightInPounds;
    private  int age;


    // getter/setter methods

    public int getHeightInInches() { return heightInInches;}

    public void setHeightInInches (int heightInInches) {
        if (heightInInches<20) {
            this.heightInInches=-1;
        }
        this.heightInInches =heightInInches;
    }

    public int getWeightInPounds() {
        return weightInPounds;
    }
    public void setWeightInPounds(int weightInPounds) {
        this.weightInPounds=weightInPounds;
    }

    public int getAge() {return age;}

    public void setAge(int age) {this.age=age;}




    //methods
    double getBMI() {
        return (this.weightInPounds*703)/Math.pow(this.heightInInches,2);
    }
}

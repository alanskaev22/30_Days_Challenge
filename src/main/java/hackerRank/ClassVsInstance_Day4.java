package hackerRank;

public class ClassVsInstance_Day4 {

    private int age;

    public ClassVsInstance_Day4(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0){
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }else {
            this.age = initialAge;
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String statement = null;

        if (age < 13 ){
            statement = "You are young.";
        }else if ( age >= 13 && age < 18){
            statement = "You are a teenager.";
        }else {
            statement = "You are old.";
        }
        System.out.println(statement);
    }

    public void yearPasses() {
        // Increment this person's age.
        age++;
    }
}

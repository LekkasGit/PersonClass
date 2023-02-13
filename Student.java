public class Student extends Person
{
    private int gradeAverage;
    
    public Student(String name, int age, int gradeAverage) {
        super(name,age);
        this.gradeAverage = gradeAverage;
    }
    
    public String toString() {
        return (super.getName() + " grade average is " + this.gradeAverage);
    }

    public int getGradeAverage() {
        return this.gradeAverage;
    }

    public void setGradeAverage(int gradeAverage) {
        this.gradeAverage = gradeAverage;
    }
    
    public String checkAge() {
        if (super.getAge() < 18) {
            return super.getName() + " is underage, thank god they are in school!";
        } else if (super.getAge() >= 18) {
            return super.getName() + " is an adult! Why are they in school?";
        } else {
            return "?";
        }
    }
}

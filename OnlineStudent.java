public class OnlineStudent extends Student
{
    private boolean online = true;

    public OnlineStudent(String name, int age, int gradeAverage, boolean online) {
        super(name, age, gradeAverage);
        this.online = online;
    }

    public String toString() {
        return "Student " + super.getName() + " online status is " + online + " grade average is " + super.getGradeAverage();
    }
    
    public String checkAge() {
        if (super.getAge() < 18) {
            return super.getName() + " is underage, thank god they are in online school! It would be better if they were attending in person though...";
        } else if (super.getAge() >= 18) {
            return super.getName() + " is an adult! Why are they doing online school? Maybe it's not a real student!";
        } else {
            return "?";
        }
    }
}

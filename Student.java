public class Student {

    private int id;
    private String name;
    private int age;
    private double mark1;
    private double mark2;
    private double mark3;

    public Student(int id, String name, int age,
                   double mark1, double mark2, double mark3) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAverage() {
        return (mark1 + mark2 + mark3) / 3;
    }

    public char getGrade() {

        double average = getAverage();

        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 60) {
            return 'C';
        } else if (average >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public void displayStudent() {

        System.out.println("----------------------------");
        System.out.println("ID      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Average : " + getAverage());
        System.out.println("Grade   : " + getGrade());
        System.out.println("----------------------------");
    }
}
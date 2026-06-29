
class OldMarkSystem {
    public int getTotalMarks() {
        return 85;
    }
}


interface GradeSystem {
    String getGrade();
}


class MarkAdapter implements GradeSystem {

    private OldMarkSystem oldSystem;

    public MarkAdapter(OldMarkSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public String getGrade() {

        int marks = oldSystem.getTotalMarks();

        if (marks >= 90)
            return "A";
        else if (marks >= 80)
            return "B";
        else if (marks >= 70)
            return "C";
        else if (marks >= 60)
            return "D";
        else
            return "F";
    }
}


public class AdapterPatternDemo {

    public static void main(String[] args) {

        OldMarkSystem oldSystem = new OldMarkSystem();

        GradeSystem adapter = new MarkAdapter(oldSystem);

        System.out.println("Total Marks : " + oldSystem.getTotalMarks());
        System.out.println("Grade : " + adapter.getGrade());
    }
}
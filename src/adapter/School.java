package adapter;

public class School {
    public static void main(String[] args) {
        AssignmentWork aw = new AssignmentWork();
        Pen pen = new PenAdapter();
        aw.setPen(pen);
        aw.writeAssignment("I am bit tired to write an assignment");
    }
}

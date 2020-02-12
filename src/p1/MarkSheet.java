package p1;

import java.util.Map;

public class MarkSheet {
    private Map<Course,Result> markSheet;

    public MarkSheet(Map<Course, Result> markSheet) {
        this.markSheet = markSheet;
    }

    @Override
    public String toString() {
        return "MarkSheet{" +
                "markSheet=" + markSheet +
                '}';
    }
}

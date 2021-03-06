package ui;

import java.text.SimpleDateFormat;

public class MySchoolEvent extends MyEvent {
    MyAgenda myAgenda;
    String course;

    public void SetCourse(String course) {this.course = course;}

    public String CourseIs() {return course;}


    public String toString() {
        SimpleDateFormat datePrintform = new SimpleDateFormat("'<'E 'at' h a'>' MMM dd, yyyy");
        return (course + " " + context + " is due on " + datePrintform.format(date));
    }

}

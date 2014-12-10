package com.hipano.idecapmovil.Model;

/**
 * Created by Felix on 12/10/2014.
 */
public class Course {
    private String CourseID;
    private String CourseName;

    Course (String cid,String cn)
    {
    CourseID=cid;
    CourseName=cn;
    }

    public String getCourseID() {
        return CourseID;
    }

    public void setCourseID(String courseID) {
        CourseID = courseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }
}

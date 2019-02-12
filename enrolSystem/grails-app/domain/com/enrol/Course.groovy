package com.enrol

class Course {
String department
String courseTitle
Lecturer courseLeader
String courseCode
Date startDate
Date endDate
String description
int numberOfStudents
String studyMode
double tuitionFees
String toString(){
return courseTitle
}
    static constraints = 
{ 
department blank:false, nullable:false
courseTitle blank:false, nullable:false
courseLeader blank:false, nullable:false
courseCode blank:false, nullable:false
numberOfStudents blank:false, nullable:false, min:20, max:60 
startDate blank:false, nullable:false
endDate blank:false, nullable:false
studyMode blank:false, nullable:false, maxsize:20
description blank:false, nullable:false, maxsize:5000, widget:'textarea'
tuitionFees blank:false, nullable:false, scale:2    }
}

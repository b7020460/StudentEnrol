package com.enrol

class BootStrap {

def init = { servletContext ->

def computing=new
Course(
department:'computing',
courseCode:'CS123',
courseTitle:'BSc Hon Computing',
courseLeader:'Dr Michelle Murphy',
startDate:new Date('09/09/2019'),
endDate:new Date('07/07/2023'),
numberOfStudents:55,
studyMode:'Fulltime',
tuitionFees:9000.60,
description:"'Lorem ipsum dolor sit amet, cum sale error tantas ne. Te duo putant detracto. In duo sonet urbanitas, ad vim vide tacimates'").save()

def blobby=new
Student(
studentName:'Mr blobby',
studentID:'1',
dob: new Date('02/02/2019'),
studentEmail:'mblobby@gmail.com',
studentUsername:'Mr blobby',
studentPassword:'password',
isFundingAvailable:'true',
course:'computing'
).save()

def work=new
Student(
studentName:'why no work',
studentID:'2',
dob: new Date('04/02/2019'),
studentEmail:'work@gmail.com',
studentUsername:'no',
studentPassword:'password',
isFundingAvailable:'true',
course:'computing'
).save()

def albertwesker=new
Lecturer(
fullname:'Albert Wesker',
post:'Lecturer',
subject:'Computing',
lecturerEmail:'Awesker@Lecturer.com',
office:'C555',
bio: "'Lorem ipsum dolor sit amet, cum sale error tantas ne. Te duo putant detracto. In duo sonet urbanitas, ad vim vide tacimates'"
).save()

def lecturer2=new
Lecturer(
fullname:'red skull',
post:'Lecturer',
subject:'Computing',
lecturerEmail:'rskull@Lecturer.com',
office:'5554',
bio:"'Lorem ipsum dolor sit amet, cum sale error tantas ne. Te duo putant detracto. In duo sonet urbanitas, ad vim vide tacimates'").save()

def mod=new
Module(
module_title:'something',
module_code:'1ef2',
credits:20,
lecturer:'some guy',
course:'computer stuff',
description:"'n/a'"
).save()

def ule=new
Module(
module_title:'why',
module_code:'12geb',
credits:30,
lecturer:'some other crazy person',
course:'computer stuff',
description:"'no'"
).save()

    }
    def destroy = {
    }
}

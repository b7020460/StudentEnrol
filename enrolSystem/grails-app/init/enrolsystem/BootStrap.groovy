package com.enrol

class BootStrap {

def init = { servletContext ->

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

def lecturer3=new
Lecturer(
fullname:'Dr Michelle Murphy',
post:'Lecturer',
subject:'Computing',
lecturerEmail:'MMurphy@Lecturer.com',
office:'5554',
bio:"'Lorem ipsum dolor sit amet, cum sale error tantas ne. Te duo putant detracto. In duo sonet urbanitas, ad vim vide tacimates'").save()

def computing=new
Course(
department:'computing',
courseCode:'CS123',
courseTitle:'BSc Hon Computing',
courseLeader:lecturer3,
startDate:new Date('09/09/2019'),
endDate:new Date('07/07/2023'),
numberOfStudents:55,
studyMode:'Fulltime',
tuitionFees:9000.60,
description:"'Lorem ipsum dolor sit amet, cum sale error tantas ne. Te duo putant detracto. In duo sonet urbanitas, ad vim vide tacimates'").save()

def umbrella=new
Course(
department:'umbrella',
courseCode:'CS123',
courseTitle:'BSc Hon umbrella',
courseLeader:albertwesker,
startDate:new Date('09/09/2019'),
endDate:new Date('07/07/2023'),
numberOfStudents:55,
studyMode:'Fulltime',
tuitionFees:9000.60,
description:"'Lorem ipsum dolor sit amet, cum sale error tantas ne. Te duo putant detracto. In duo sonet urbanitas, ad vim vide tacimates'").save()

def unknown=new
Course(
department:'unknown',
courseCode:'CS123',
courseTitle:'BSc Hon unknown',
courseLeader:lecturer3,
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
course: umbrella
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
course:unknown
).save()

def extra=new
Student(
studentName:'extra',
studentID:'3',
dob: new Date('04/02/2019'),
studentEmail:'extra@gmail.com',
studentUsername:'why',
studentPassword:'password',
isFundingAvailable:'true',
course:computing
).save()

def stuff=new
Student(
studentName:'stuff',
studentID:'4',
dob: new Date('04/02/2019'),
studentEmail:'stuff@gmail.com',
studentUsername:'stuff',
studentPassword:'password',
isFundingAvailable:'true',
course:computing
).save()

def more=new
Student(
studentName:'more',
studentID:'5',
dob: new Date('04/02/2019'),
studentEmail:'more@gmail.com',
studentUsername:'more',
studentPassword:'password',
isFundingAvailable:'true',
course:unknown
).save()

def mod=new
Module(
module_title:'something',
module_code:'1ef2',
credits:20,
lecturer:'some guy',
course:'computing',
description:"'n/a'"
).save()

def ule=new
Module(
module_title:'why',
module_code:'12geb',
credits:30,
lecturer:'some other crazy person',
course:'computing',
description:"'no'"
).save()

def fun=new
Module(
module_title:'fun',
module_code:'12gb',
credits:30,
lecturer:'fun',
course:'Computing',
description:"'no'"
).save()

albertwesker.addToModules(mod)
albertwesker.addToModules(ule)
albertwesker.addToModules(fun)
lecturer2.addToModules(mod)
lecturer2.addToModules(ule)
lecturer2.addToModules(fun)
lecturer3.addToModules(mod)
lecturer3.addToModules(ule)
lecturer3.addToModules(fun)
    }
    def destroy = {
    }
}

import com.library.*

class BootStrap {

    def init = { servletContext ->


def course1 = new Course(title: 'Computing',
		code: 'COMP125',
		tutor: 'Tonderai',
		description: '''The course provides you with knowledge and understanding of the methods, tools and techniques used in developing and 					operating IT systems and data processing.''',
		department: 'Web Architectures').save() 

def course2 = new Course(title: 'Computer Science',
		code: 'COS124',
		tutor: 'Lynne Dawson',
		description: '''The heart of this course lies in programming. We give you the skills and knowledge to write robust, 
		leading-edge software. It is suitable for people with or without previous programming experience. 
		If you have programmed before, it quickly builds on what you know, giving you challenging new areas, such as algorithmic 
		analysis or compiler design, to which to apply yourself.''',
		department: 'Computers within Science').save() 

def course3 = new Course(title: 'Computer Networks',
		code: 'CON126',
		tutor: 'Lynne Cinderey',
		description: '''This course prepares you for work in this networked world, giving you the skills to thrive in a 
                global environment. You become a networking specialist ready for a career as a developer, designer, manager or 
		administrator of complex networked systems.''',
		department: 'Computing').save()





def student1 = new Student(studentid: 'B4010311',
		name: 'Shabaz Khalid',
		email: 'ShabazKhalid@student.shu.ac.uk',
		course:course1).save()  

def student2 = new Student(studentid: 'B4019796',
		name: 'Frank Sekyere',
		email: 'FrankSekyere@student.shu.ac.uk',
		course:course1).save()

def student3 = new Student(studentid: 'B4010456',
		name: 'Will Smith',
		email: 'WillSmith@student.shu.ac.uk',
		course:course2).save()





def librarian1 = new Librarian(userName: 'Timmy',
		password: 'password',
		name: 'Timothy Street',
		email: 'TimothyStreet@librarian.shu.ac.uk',
		telephone: '01725856023').save() 

def librarian2 = new Librarian(userName: 'Sophie',
		password: 'password',
		name: 'Sophie Lance',
		email: 'SophieLance@librarian.shu.ac.uk',
		telephone: '01725669512').save() 

def librarian3 = new Librarian(userName: 'Dave',
		password: 'password',
		name: 'Dave Smith',
		email: 'DaveSmith@librarian.shu.ac.uk',
		telephone: '01725674298').save() 





def book1 = new Book(title: 'Mice and Men',
		author: 'John Steinback',
		isbn: '9783423620727',
		dateBorrowed: '23/03/2016',
		returnDate: '23/05/2016',
		student: 'Shabaz Khalid').save()

def book2 = new Book(title: 'Winnie the Pooh',
		author: 'A.A Milne',
		isbn: '9788700235687',
		dateBorrowed: '23/03/2016',
		returnDate: '23/05/2016',
		student: 'Frank Sekyere').save() 
 
def book3 = new Book(title: 'Horrid Henry',
		author: 'Francessca Simon',
		isbn: '9781599611853',
		dateBorrowed: '23/03/2016',
		returnDate: '23/05/2016',
		student: 'Shabaz Khalid').save() 




def library1 = new Library(location: 'Sheffield, Addsetts-City',
		openingHours: '24/7',
		book: 'Mice and Men',
		student: 'Shabaz Khalid',
		librarian: 'Timothy Street').save()

def library2 = new Library(location: 'Sheffield, Addsetts-City',
		openingHours: '24/7',
		book: 'Winnie the Pooh',
		student: 'Frank Sekyere',
		librarian: 'Dave Smith').save()

def library3 = new Library(location: 'Sheffield, Addsetts-City',
		openingHours: '24/7',
		book: 'Horrid Henry',
		student: 'Shabaz Khalid',
		librarian: 'Sophie Lance').save()

course1.addToStudents(student1)
course1.addToStudents(student2)
course2.addToStudents(student3)

    }

    def destroy = {
    }
}

import com.library.*

class BootStrap {

    def init = { servletContext ->


def course1 = new Course(title: 'Web Architectures',
		code: 'WA125',
		tutor: 'Tonderai',
		description: '''This module aims to equip the student with the knowledge, skills and confidence to tackle and solve
				unforeseen problems such as might occur when installing, configuring and supporting website
				infrastructure systems.''',
		department: 'Computing').save() 

def course2 = new Course(title: 'I.T Service Delivery',
		code: 'ISD124',
		tutor: 'Lynne Dawson',
		description: '''The module aim to introduce students to the theoretical concepts involved in IT Service Delivery
				and the ITIL framework, and to develop their practical skills to enable them to deliver a wide
				variety of IT Services, whilst encouraging students to evaluate and reflect upon the alternative
				approaches to delivering IT Services within a business environment.''',
		department: 'Computing').save() 

def course3 = new Course(title: 'Database Systems',
		code: 'DS126',
		tutor: 'Lynne Cinderey',
		description: '''This module aims to consolidate and extend its' students skills in using data-centred system 
		development techniques and tools, which will enable them to successfully contribute to database development, 
		implementation and management.''',
		department: 'Computing').save()


def student1 = new Student(studentid: 'B4010311',
		name: 'Shabaz Khalid',
		email: 'ShabazKhalid@student.shu.ac.uk',
		course: 'Computing').save()  

def student2 = new Student(studentid: 'B4019796',
		name: 'Frank Sekyere',
		email: 'FrankSekyere@student.shu.ac.uk',
		course: 'Computing').save()

def student3 = new Student(studentid: 'B4010456',
		name: 'Will Smith',
		email: 'WillSmith@student.shu.ac.uk',
		course: 'Computing').save()







    }

    def destroy = {
    }
}

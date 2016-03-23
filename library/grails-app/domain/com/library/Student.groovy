package com.library

class Student {

String name

String email

String studentid

Course course

String toString(){

"$name, $studentid"

}

    static constraints = {

studentid()

name()

email()

course()
    }
}

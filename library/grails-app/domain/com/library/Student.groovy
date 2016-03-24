package com.library

class Student {

String name

String email

String studentid

Course course

static hasMany=[books:Book]

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

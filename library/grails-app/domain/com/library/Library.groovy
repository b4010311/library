package com.library

class Library {

String location

String openingHours

String book

Student student

Librarian librarian 

static hasMany=[students:Student]

String toString() {

"$location, $openingHours"

}

    static constraints = {

location()

openingHours()

book()

student()

librarian()

    }
}

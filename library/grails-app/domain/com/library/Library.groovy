package com.library

class Library {

String location

String openingHours

Book book

Student student

Librarian librarian 


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

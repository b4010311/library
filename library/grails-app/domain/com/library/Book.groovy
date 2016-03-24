package com.library

class Book {

String title

String author

String isbn

String dateBorrowed

String returnDate

Student student

static belongsTo=Library

String toString(){

"$title, $author"

}

    static constraints = {

title()

author()

isbn()

dateBorrowed()

returnDate()

student()


    }
}

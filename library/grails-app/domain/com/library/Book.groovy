package com.library

class Book {

String title

String author

String isbn

String dateBorrowed

String returnDate

String student

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

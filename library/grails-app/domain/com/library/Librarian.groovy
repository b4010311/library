package com.library

class Librarian {

String name

String email

String userName

String password

String telephone

static belongsTo=Library

String toString() {

"$name, $email, $telephone"

}

    static constraints = {

userName()

password()

name()

email() 

telephone()

    }
}

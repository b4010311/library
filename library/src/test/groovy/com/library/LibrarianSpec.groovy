package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

        void toString() {

when: "A Librarian has name, email and telephone"

def librarian = new Librarian(name:'Tonderai',

                 email:'Tonderai@librarian.shu.ac.uk',

                 telephone:'02245769210')

then: "the to String method will merge them."

librarian.toString() == 'Tonderai, Tonderai@librarian.shu.ac.uk, 02245769210'
        
    }
}

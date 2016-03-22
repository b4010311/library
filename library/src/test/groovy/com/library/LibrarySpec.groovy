package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Library)
class LibrarySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

         void toString() {

when: "A Library has location and openingHours"

def library = new Library(location:'Sheffield',

                 openingHours:'9-5pm Monday to Friday and 10-4pm Saturday and Sunday')

then: "the to String method will merge them."

library.toString() == 'Sheffield, 9-5pm Monday to Friday and 10-4pm Saturday and Sunday'
        
    }
}

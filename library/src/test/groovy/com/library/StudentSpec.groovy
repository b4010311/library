package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

       void toString() {

when: "A Student has name and studentid"

def student = new Student(name:'Frank Sekyere',

                 studentid:'B4019796')

then: "the to String method will merge them."

student.toString() == 'Frank Sekyere, B4019796'
        
    }
}

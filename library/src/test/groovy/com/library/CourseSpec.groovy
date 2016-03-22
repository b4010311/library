package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

      void toString() {

when: "A Course has title, code and department"

def course = new Course(title:'Web Architectures',

                 code:'WA5012',

                 department:'Information Technology')

then: "the to String method will merge them."

course.toString() == 'Web Architectures, WA5012, Information Technology'
        
    }
}

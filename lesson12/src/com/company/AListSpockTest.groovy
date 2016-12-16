package com.company

import spock.lang.Specification

class AListSpockTest extends Specification {

    def 'check is add element correct'(){
        given: 'initialize AList'
        AList list = new AList();
        
        when: 'Try to add one element'
        list.add(num)

        then: 'Check list size'
        list.size() == 1

        where:
        num << [0, 5, 7, 256]
    }
}

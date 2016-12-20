package com.company

import spock.lang.Specification

import static org.junit.Assert.assertArrayEquals

class SorterTest extends Specification {
    def "BubbleSort"() {
        int[] actual = [8,5,3,6,1,0];
        int[] expected = [0,1,3,5,6,8];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected,actual)
    }

    def "BubbleSortTest2"() {
        int[] actual = [0,1,3,5,6,8];
        int[] expected = [0,1,3,5,6,8];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected,actual)
    }

    def "BubbleSortTest3"() {
        int[] actual = [0,1,1,3,8,6];
        int[] expected = [0,1,1,3,6,8];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected,actual)
    }

    def "BubbleSortTest4"() {
        int[] actual = [0];
        int[] expected = [0];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected,actual)
    }

    def "BubbleSortTest5"() {
        int[] actual = [-2,4,0];
        int[] expected = [-2,0,4];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected,actual)
    }
}

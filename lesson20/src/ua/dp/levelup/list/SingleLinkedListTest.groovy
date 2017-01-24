package ua.dp.levelup.list

import spock.lang.Specification


class SingleLinkedListTest extends Specification {
    def "AddNode"() {
        SingleLinkedList list = new SingleLinkedList();

        when: 'add node element'
        list.addNode(new Node(1))

        then: 'check size'
        list.size == 1
        list.root != null
        list.root.next == null;

        when: 'add one more node element'
        list.addNode(new Node(1))

        then: 'check size'
        list.size == 2
        list.root != null
    }
}

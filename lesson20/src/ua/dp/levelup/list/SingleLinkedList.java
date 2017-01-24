package ua.dp.levelup.list;

public class SingleLinkedList extends AbstractList{
    private Node root = null;

    public void addNode(Node n)
    {

    }

    @Override
    public void addFirst(Node node) {

    }

    @Override
    public void addLast(Node node) {
        if(null == root)
            root = node;
        else
        {
            Node tmp = root;
            while (tmp.next() != null)
            {
                tmp = tmp.next();
            }
            tmp.setNext(node);
        }
        size++;
    }

    @Override
    public void removeFirst() {
        Node first = root;
        if(null == first) return;
        root = first.next();
        if(first.next() != null) {
            first.setNext(null);
        }
        size--;
    }

    @Override
    public void removeLast() {

    }

    @Override
    public Node getFirst() {
        return null;
    }

    @Override
    public Node getLast() {
        return null;
    }

    @Override
    public Node get(int index) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isNotEmpty() {
        return false;
    }
}

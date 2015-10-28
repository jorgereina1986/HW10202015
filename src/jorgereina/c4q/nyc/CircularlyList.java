package jorgereina.c4q.nyc;

public class CircularlyList{
    public static void main(String[] args)
    {
    }

    Node head;

    public void addToHead(String data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void addToTail(String data){
        Node newNode = new Node(data);
        Node pointer = head;
        while(pointer.next != head) {
            pointer = pointer.next;
        }
        pointer.next = newNode;
        newNode.next = head;
    }

    public void delete(String data){
        Node pointer = head;

        if(head.data.equals(data)){
            head = head.next;
        }

        while(!pointer.next.data.equals(data) && pointer.next != head) {
            pointer = pointer.next;
        };
        pointer.next = pointer.next.next;


    }

    public void insertAfter(String data, String prevData){
        Node newNode = new Node(data);
        Node spot = findSpot(prevData);
        if(spot != null)
        {
            spot.next = newNode;
            newNode.next = spot.next;
        }



    }

    public Node findSpot(String data) {
        Node pointer = head;
        //when is not equal then u walk
        while(!pointer.data.equals(data) && pointer.next != head) {
            pointer = pointer.next;
        }
        if(pointer.data.equals(data)){
            return null;
        }

        return pointer;

    }
}

class LinkedList{
    
    private Node head;
    
    public void insertAtTail(int data){
        Node newNode = new Node(data);
        Node curr = head;
        if(head == null)
            head = newNode;
        else{
            while(curr.getNext() != null){
                curr = curr.getNext();
            }
            curr.setNext(newNode);
        }
    }

    public void inserAtHead(int data){
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
        else{
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void insertAtMiddle(int data, int position){
        Node newNode = new Node(data);
        Node low = head;
        Node high;
        int count = 1;
        if(head == null){
            head = newNode;
        }
        else{
            while(count != position){
                low = low.getNext();
                count++;
            }
            high = low.getNext();
            newNode.setNext(high);
            low.setNext(newNode);
        }
    }

    public void deleteAtTail(){
        Node n = null;
        Node p = head;
        if(head == null)
            System.out.println("Empty List");
        else{
            while(p.getNext() != null){
                n = p;
                p = p.getNext();
            }
            n.setNext(null);
        }
    }

    public void deleteAtHead(){
        if(head == null){
            System.out.println("No node left...");
        }
        else{
            head = head.getNext();
        }
    }

    public void deleteAtMiddle(int position){
        int count = 1;
        Node p = head;
        Node n = null;
        if(head == null){
            System.out.println("No node left...");
        }
        else{
            while(count != position){
                n = p;
                p = p.getNext();
                count++;
            }
            n.setNext(p.getNext());
        }
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData()+" -> ");
            temp = temp.getNext();
        }
        System.out.println();
    }
    
    public Node getHead(){
        return head;
    }

    public void setHead(Node newHead){
        head = newHead;
    }
    /*public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtTail(6);
        ll.insertAtTail(8);
        ll.insertAtTail(9);
        ll.inserAtHead(5);
        ll.insertAtMiddle(7,2);
        ll.insertAtMiddle(10,4);
        ll.printList();
        ll.deleteAtTail();
        ll.printList();
        // ll.deleteAtTail();
        // ll.deleteAtTail();
        // ll.printList();
        ll.deleteAtHead();
        ll.printList();
        ll.inserAtHead(5);
        ll.printList();
        ll.deleteAtMiddle(3);
        ll.printList();
    }*/
}
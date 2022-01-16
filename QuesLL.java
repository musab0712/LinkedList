public class QuesLL {
    private Node head;

    public void sortInsert(int data){
        Node newNode = new Node(data);
        Node tempNode = head;
        if(head == null || head.getData() > data){
            newNode.setNext(head);
            head = newNode;
        }
        else{
            while(tempNode.getNext() != null && tempNode.getNext().getData() < data){
                tempNode = tempNode.getNext();
            }
            newNode.setNext(tempNode.getNext());
            tempNode.setNext(newNode);
        }
    }

    

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData()+"   ");
            temp = temp.getNext();
        }
        System.out.println();
    }


    
    public static void main(String[] args) {
        QuesLL ll = new QuesLL();
        ll.sortInsert(5);
        ll.sortInsert(6);
        ll.sortInsert(9);
        ll.printList();
        ll.sortInsert(3);
        ll.sortInsert(7);
        ll.printList();
    }
}

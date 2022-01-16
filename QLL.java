public class QLL {
    LinkedList ll;
    boolean findData(int data){
        Node temp = ll.getHead();
        while(temp != null){
            if(temp.getData()==data){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    /*void eliminateDub(){
        Node temp = ll.getHead();
        int data = temp.getData();
        while(temp != null){

        }
    }*/

    void appendLastNtoF(int n){
        Node temp = ll.getHead();
        int count = 0;
        while(temp != null){
            count += 1;
            temp = temp.getNext();
        }
        temp = ll.getHead();
        for(int i = 0; i < (count-n); i++){
            temp = temp.getNext();
            if(i==(count-n)-1)
                temp.setNext(null);
        }
        Node newHead = temp;
        Node last = temp;
        while(last.getNext() != null){
            last = last.getNext();
        }
        last.setNext(ll.getHead());
        ll.setHead(newHead);
    }

    public static void main(String[] args) {
        QLL qll = new QLL();
        qll.ll = new LinkedList();
        qll.ll.insertAtTail(10);
        qll.ll.insertAtTail(15);
        qll.ll.insertAtTail(18);
        qll.ll.insertAtTail(20);
        qll.ll.insertAtTail(22);
        qll.ll.insertAtTail(24);
        //System.out.println(qll.findData(25));
        qll.ll.printList();
        qll.appendLastNtoF(2);
        qll.ll.printList();
    }    
}

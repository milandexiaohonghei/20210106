public class TestDemo {
    public static void main(String[] args) {
        MylinkedList mylinkedList = new MylinkedList();
        mylinkedList.addLast(1);
        mylinkedList.display();
        System.out.println("=====================");
        mylinkedList.addFirst(10);
        mylinkedList.display();
        System.out.println("=====================");
        mylinkedList.addLast(7);
        mylinkedList.display();
        System.out.println("=====================");
        //mylinkedList.remove(4);
        //mylinkedList.display();
        mylinkedList.addLast(2);
        mylinkedList.addLast(13);
        mylinkedList.display();
        System.out.println("=====================");
        //mylinkedList.removeAllKey(2);
        // mylinkedList.display();
        mylinkedList.inversionList();
        mylinkedList.display();
        System.out.println("=====================");
        mylinkedList.inversionList2();
        mylinkedList.display();
        System.out.println("=====================");
        MylinkedList mylinkedList2 = new MylinkedList();
        mylinkedList2.addLast(1);
        mylinkedList2.addLast(8);
        mylinkedList2.addLast(3);
        mylinkedList2.addLast(4);
        mylinkedList2.addLast(5);
        mylinkedList2.addLast(6);
        mylinkedList2.addLast(7);
        mylinkedList2.display();
        System.out.println("=====================");
        Node headA = mylinkedList.head;
        Node headB = mylinkedList2.head;
        Node head = mylinkedList2.mergeTwoLists(headA,headB);
        mylinkedList2.display(head);


    }

}



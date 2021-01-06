public class MylinkedList {
    Node head;

    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = this.head;
        this.head = node;

    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        Node cur = this.head;
        if(this.head == null){
            this.head = node;
        }else{
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
        }
    };
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        return false;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        return false;
    }
    //寻找关键字K的节点引用
    public Node searchPrev(int key) {


        Node cur = this.head;
        while(cur.next != null){
            if(cur.next.val == key){
                return cur;
            }
            cur = cur.next;
        }
        return null;


    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head== null){
            return;
        }

        if(this.head.val == key){
            this.head = this.head.next;
        }else{
            Node cur = searchPrev(4);
            if(cur == null){
                System.out.println("没有这个数字");
            }else{
                Node del = cur.next;
                cur.next = del.next;
            }

        }


    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node prev = this.head;
        Node cur = prev.next;
        while(cur != null){
            if(cur.val == key){
                prev.next = cur.next;
                cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.val == key){
            this.head = this.head.next;
        }

    }
    //得到单链表的长度
    public int size(){
        Node cur = this.head;
        int len = 0;
        while(cur != null){
            len++;
            cur = cur.next;
        }
        return len;
    }
    //打印链表值
    public void display(){
        if(this.head == null){
            System.out.println("你的链表为空");
        }else{
            Node cur = this.head;
            while(cur != null){
                System.out.println(cur.val);
                cur = cur.next;
            }
        }
    }
    public void display(Node newHead){
        if(newHead == null){
            System.out.println("你的链表为空");
        }else{
            Node cur = newHead;
            while(cur != null){
                System.out.println(cur.val);
                cur = cur.next;
            }
        }
    }
    //删除一个链表节点
    public void clear(){
        this.head = null;

    }
    //反转列表-头插法
    public void inversionList(){
        Node cur = this.head;
        Node cur2 = this.head;
        Node prev = cur.next;
        while(prev != null){
            Node cur3 = prev.next;
            prev.next = cur;
            cur = prev;
            prev = cur3;

        }
        this.head = cur;
        cur2.next = null;
    }
    //反转列表
    public void inversionList2(){
        Node cur = this.head;
        Node prev = null;
        Node curNext;
        Node newHead = null;
        while(cur != null){
            curNext = cur.next;
            if(curNext == null){
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        this.head = newHead;
    }
    //寻找倒数第K个节点
    public Node FindKthToTail(int k){
        if(this.head == null || k <= 0){
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        for(int i = 0;i < k-1;i++){
            if(fast.next == null){
                fast = fast.next;
            }else{
                return null;
            }

        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
    //合并两个列表
    public Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while(headA != null && headB != null) {
            if(headA.val >= headB.val){
                tmp.next = headB;
                headB = headB.next;
            }else{
                tmp.next = headA;
                headA = headA.next;
            }
            tmp = tmp.next;

        }
        //代码走到这里肯定是一个为空 一个不为空
        if(headA != null) {
            tmp.next = headA;
        }
        if(headB != null) {
            tmp.next = headB;
        }
        return newHead.next;
    }

    public boolean chkPalindrome() {
        // write code here
        //1、找到当前链表的中间位置

        //2、从中间位置开始，后半部分进行翻转

        //3、head从头往后走   slow从后往前走
        //只要发现 对应的val值不一样 就返回false  直到head和slow相遇
       //调用函数 prev
        return false;
    }


}




class Node{
    public int val;
    public Node next;
    public Node(int val){
        this.val = val;
    }
}




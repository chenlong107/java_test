package Collection_Test;

/**
 * @Auther: chenlong
 * @Date: 2022/04/21/13:59
 * @Description:
 */
public class Link {

    private Node head;
    private Node tail;
    private int size;

    public void add(Object obj){
        Node newNode = new Node(obj);
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size ++;
    }

    public boolean delete(Object del){
        if (head.value.equals(del)){
            head = head.next;
            return true;
        } else {
            Node pre =head;
            while (pre.next != null){
                if(pre.next.value.equals(del)){
                    if (pre.next == tail){
                        tail = pre;
                    }
                    pre.next = pre.next.next;
                    size --;
                    return true;
                }
                pre = pre.next;
            }
            return false;
        }
    }

    public void travel(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}

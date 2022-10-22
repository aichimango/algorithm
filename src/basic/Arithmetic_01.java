package basic;




import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @Auther:PengChao
 * @Date: 2022/10/22
 */
public class Arithmetic_01 {
    public static void main(String[] args) {



    }


    /**
     * 单链表反转
     * @param: 节点指针
     */
    public static Node reverseList(Node node) {
        if (node.getNextSibling() == null) return null;
        Stack<LinkedList> stack = new Stack<>();
        return null;
    }

}
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

     public ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }

     @Override
     public String toString() {
         StringBuilder stringBuilder = new StringBuilder(String.valueOf(val));
         ListNode node = this.next;
         while (node != null) {
             stringBuilder.append(node);
             node = node.next;
         }
         return stringBuilder.toString();
     }
 }



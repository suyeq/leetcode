package suyeq;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-04-03
 * @time: 15:43
 */
public class Q21 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args){
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        //l1.next.next=new ListNode(4);
        ListNode l2=new ListNode(1);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(4);
        ListNode head=mergeTwoLists(l1,l2);
        while (head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }

    /**
     * 1->2->4, 1->3->4
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null && l2!=null){
            return l2;
        }
        if (l2==null && l1!=null){
            return l1;
        }
        if (l2==null && l1==null){
            return null;
        }
        ListNode head=null;
        if (l1.val<=l2.val){
            head=l1;
            l1=l1.next;
        }else if (l1.val>l2.val){
            head=l2;
            l2=l2.next;
        }
        ListNode temp=head;
        while (l1!=null && l2!=null){
            if (l1.val<=l2.val){
                temp.next=l1;
                temp=temp.next;
                l1=l1.next;
            }else if (l1.val>l2.val){
                temp.next=l2;
                temp=temp.next;
                l2=l2.next;
            }
        }
        if (l1!=null){
            temp.next=l1;
        }

        if (l2!=null){
            temp.next=l2;
        }
        return head;
    }

}

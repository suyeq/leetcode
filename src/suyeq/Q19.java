package suyeq;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-04-02
 * @time: 15:07
 */
public class Q19 {
    /**
     * 1->2->3->4->5, 和 n = 2
     */
    static class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
     }
     public static void main(String[] args){
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=new ListNode(5);
        removeNthFromEnd(listNode,5);
        ListNode index=listNode;
        while (index!=null){
            System.out.print(index.val+" ");
            index=index.next;
        }
     }

    /**
     * 两个指针，一前一后，差距n，刚好可以得到前节点遍历到最后得到要删除节点的前一个
     * 注意首节点处理情况
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first=head,second=head;
        int index=0;
        while (first!=null){
            if (index<=n){
                first=first.next;
            }else {
                first=first.next;
                second=second.next;
            }
            index++;
        }
        if (index==n){
            head=head.next;
        }else {
            second.next=second.next.next;
        }
        return head;
    }
}

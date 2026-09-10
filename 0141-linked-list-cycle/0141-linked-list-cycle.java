public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode a=head;
        ListNode b=head;
        for(int i=0;b!=null && b.next!=null;i++){
            a=a.next;
            b=b.next.next;
            if(a==b) return true;
        }
        return false;
    }
}
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode a=head;
        ListNode b=head;
        for(int i=0;b!=null && b.next!=null;i++){
            a=a.next;
            b=b.next.next;
            if(a==b){
              a=head;
            while(a!=b){
                a=a.next;
                b=b.next;
            }
            return a;
        }
    }
        return null;
    }
}
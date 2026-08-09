class Solution {
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        int carry=0;
        ListNode d=new ListNode(0), c=d;
        while(a!=null || b!= null || carry>0){
            int sum=carry;
            if(a!=null){
                sum+=a.val;
                a=a.next;
            }
            if(b!=null){
                sum+=b.val;
                b=b.next;
            }
            c.next=new ListNode(sum%10);
            carry = sum/10;
            c=c.next;
        }
        return d.next;
    }
}
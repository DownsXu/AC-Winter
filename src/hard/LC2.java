package hard;

/**
 * 2两数之和(LeetCode)
 */

//public class LC2 {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode pre = new ListNode(0);
//        ListNode cur = pre;
//
//        int e = 0;
//        int u = 0;
//        while(l1 != null || l2 != null){
//            int x = l1 == null ? 0 : l1.val;
//            int y = l2 == null ? 0 : l2.val;
//
//            e = (x + y + u) % 10;
//            u = (x + y + u) / 10;
//
//            cur.next = new ListNode(e);
//            cur = cur.next;
//
//            if(l1 != null) l1 = l1.next;
//            if(l2 != null) l2 = l2.next;
//        }
//
//        if(u == 1){
//            cur.next = new ListNode(u);
//            cur = cur.next;
//        }
//        return pre.next;
//    }
//}

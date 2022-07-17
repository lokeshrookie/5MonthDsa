package LeetCode.Day2;
import  java.util.*;
public class LinkedListWaveJosh {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode two  = new ListNode(2);
        ListNode three =  new ListNode(3);
        ListNode four =  new ListNode(4);
        ListNode five =  new ListNode(5);
        ListNode six =  new ListNode(6);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = null;

        ListNode temp = head;
        while(temp != null){
            System.out.println(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
        middleNode(head);

    }

    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static void middleNode(ListNode head) {
        ListNode temp = head;
        //This can be done with slow and fast pointer method.4
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // return slow;
        ListNode mid = slow;
        Stack<Integer> max = new Stack<Integer>();
        List<Integer> min = new ArrayList<>();
        // Stack<Integer> min = new Stack<Integer>();
        List<Integer> ans = new ArrayList<>();

        while(temp != mid){
            min.add(temp.val);
            temp = temp.next;
        }
        while(mid!=null){
            max.push(mid.val);
            mid = mid.next;
        }
        while(min.size() >0 && !max.empty()){
            ans.add(max.pop());
            ans.add(min.remove(0));
        }
        while(!max.empty()){
            ans.add(max.pop());
        }
        while(min.size() > 0){
            ans.add(min.remove(0));
        }


        System.out.println(ans);

        ListNode h = new ListNode(ans.remove(0));
        while(ans.size() >1){
            ListNode node = new ListNode(ans.remove(1));
            h.next = node;

        }
        temp = h;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

//        System.out.println(ans);




    }

}

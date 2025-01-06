package org.example.leetcode;

import org.example.common.ListNode;

public class leetcode19 {

    /*
    Given the head of a linked list, remove the nth node from the end of the list and return its head.
     */

    public ListNode removeNthFromEnd(ListNode head, int k) {
        ListNode temp = head;
        ListNode temp2 = head;
        int n = 0;
        while (temp != null) {
            temp = temp.next;
            n++;
        }

        int tar = n - k;
        if (tar == 0) {
            return null;
        }

        System.out.println(n);
        System.out.println(k);
        System.out.println(tar);

        while (tar > 1) {
            tar--;
            temp2 = temp2.next;
        }

        temp2.next = temp2.next.next;

        return head;
    }

    public ListNode removeNthFromEndMethod2(ListNode head, int k) {
        ListNode temp1 = head;
        ListNode temp2 = head;

        for (int i = 0; i < k; i++) {
            temp1 = temp1.next;
        }

        if (temp1 == null) {
            return head.next;
        }

        while (temp1.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;

        return head;
    }

}

package org.example.common;

import lombok.Data;

@Data
public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


}

import java.util.Scanner;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        ListNode head1 = null, tail1 = null;
        for (int i = 0; i < n1; i++) {
            int val = sc.nextInt();
            ListNode node = new ListNode(val);
            if (head1 == null) {
                head1 = tail1 = node;
            } else {
                tail1.next = node;
                tail1 = node;
            }
        }

        int n2 = sc.nextInt();
        ListNode head2 = null, tail2 = null;
        for (int i = 0; i < n2; i++) {
            int val = sc.nextInt();
            ListNode node = new ListNode(val);
            if (head2 == null) {
                head2 = tail2 = node;
            } else {
                tail2.next = node;
                tail2 = node;
            }
        }
        sc.close();

        ListNode head = mergeTwoLists(head1, head2);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        if (h1 == null) {
            return h2;
        }
        if (h2 == null) {
            return h1;
        }

        ListNode head, tail;
        if (h1.val < h2.val) {
            head = tail = h1;
            h1 = h1.next;
        } else {
            head = tail = h2;
            h2 = h2.next;
        }

        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                tail.next = h1;
                h1 = h1.next;
            } else {
                tail.next = h2;
                h2 = h2.next;
            }
            tail = tail.next;
        }

        if (h1 != null) {
            tail.next = h1;
        } else {
            tail.next = h2;
        }

        return head;
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

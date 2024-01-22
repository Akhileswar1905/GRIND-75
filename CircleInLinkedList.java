import java.util.Scanner;

public class CircleInLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode head = null, tail = null, temp = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ListNode node = new ListNode(val);
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        int p = sc.nextInt();
        temp = head;
        for (int i = 0; i < p; i++) {
            temp = temp.next;
        }

        tail.next = temp;
        sc.close();
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {

        ListNode p1, p2;
        p1 = p2 = head;
        while (p2 != null && p2.next != null) {
            p2 = p2.next.next;
            p1 = p1.next;
            if (p1 == p2) {
                return true;
            }

        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
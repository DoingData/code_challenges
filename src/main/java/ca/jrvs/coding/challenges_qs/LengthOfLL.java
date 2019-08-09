package ca.jrvs.coding.challenges_qs;

public class LengthOfLL extends LinkedList {
    public int lenOfLL() {
        Node tempNode = head;
        int count = 0;

        while (tempNode != null) {
            tempNode = tempNode.next;
            count++;
        }
        return count;
    }
}
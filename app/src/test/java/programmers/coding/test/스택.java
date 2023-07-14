package programmers.coding.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class 스택 {

    public static class Stack<Integer> {

        private Node first;
        private int N;

        private class Node {

            Integer data;
            Node next;
        }

        public boolean isEmpty() {
            return first == null;
        }

        public int size() {
            return N;
        }

        public void push(Integer data) {
            Node oldfirst = first;
            first = new Node();
            first.data = data;
            first.next = oldfirst;
            N++;
        }

        public Integer pop() {
            Integer data = first.data;
            first = first.next;
            N--;
            return data;
        }

    }

    @Test
    void result() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        assertThat(stack.size()).isEqualTo(1);
        assertThat(stack.isEmpty()).isFalse();
        assertThat(stack.pop()).isEqualTo(1);
    }
}

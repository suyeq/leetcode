package suyeq;

import java.util.Stack;

/**
 * @author: 苍术
 * @date: 2019-07-09
 * @time: 21:12
 */
public class Q232 {

    static class MyQueue {

        private Stack<Integer> stack1;

        private Stack<Integer> stack2;

        /** Initialize your data structure here. */
        public MyQueue() {
            stack1=new Stack<>();
            stack2=new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            stack1.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if (stack2.size()<=0){
                while (stack1.size()!=0){
                    stack2.push(stack1.pop());
                }
            }

            if (stack2.size() == 0){
                throw new IndexOutOfBoundsException();
            }
            return stack2.pop();
        }

        /** Get the front element. */
        public int peek() {
            if (stack2.size()!=0){
                return stack2.lastElement();
            }else if (stack1.size()!=0){
                return stack1.firstElement();
            }
            return -1;
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return stack2.isEmpty() && stack1.isEmpty();
        }
    }

    public static void main(String []args){
        MyQueue queue=new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }

}

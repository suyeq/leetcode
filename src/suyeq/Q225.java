package suyeq;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: 苍术
 * @date: 2019-07-09
 * @time: 22:04
 */
public class Q225 {



    static class MyStack {

        private LinkedList<Integer> queue1;

        private LinkedList<Integer> queue2;

        /** Initialize your data structure here. */
        public MyStack() {
            queue1=new LinkedList<>();
            queue2=new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue1.offer(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            while (queue1.size() > 1) {
                queue2.offer(queue1.poll());
            }
            int result=queue1.poll();
            while (queue2.size()>0){
                queue1.offer(queue2.poll());
            }
            return result;
        }

        /** Get the top element. */
        public int top() {
            return queue1.getLast();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue1.isEmpty();
        }
    }


    public static void  main(String []args){
        MyStack stack=new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}

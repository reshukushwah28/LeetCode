class Solution {

    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    class Deque {
        Node front, rear;

        boolean isEmpty() {
            return front == null;
        }

        void insertrear(int x) {
            Node n = new Node(x);
            if (rear == null) {
                front = rear = n;
            } else {
                rear.next = n;
                n.prev = rear;
                rear = n;
            }
        }

        void deletefront() {
            if (front == null) return;

            if (front == rear) {
                front = rear = null;
            } else {
                front = front.next;
                front.prev = null;
            }
        }

        void deleterear() {
            if (rear == null) return;

            if (front == rear) {
                front = rear = null;
            } else {
                rear = rear.prev;
                rear.next = null;
            }
        }

        int getfront() {
            return front.data;
        }

        int getrear() {
            return rear.data;
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int idx = 0;

        Deque dq = new Deque();

        for (int i = 0; i < n; i++) {

            // remove smaller elements from rear
            while (!dq.isEmpty() && nums[dq.getrear()] <= nums[i]) {
                dq.deleterear();
            }

            // insert current index
            dq.insertrear(i);

            // remove out-of-window index
            if (!dq.isEmpty() && dq.getfront() <= i - k) {
                dq.deletefront();
            }

            // store answer
            if (i >= k - 1) {
                ans[idx++] = nums[dq.getfront()];
            }
        }
        return ans;
    }
    }


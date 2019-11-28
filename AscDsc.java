import java.util.*;

class asc implements Runnable {
    Thread t;
    int[] a = { 2, 1, 5, 4, 3 };

    asc() {
        t = new Thread(this, "Ascending");
        t.start();
    }

    public void run() {
        try {
            int n = a.length, temp;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println(a[i] + " ");
            }
            System.out.println();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

class desc implements Runnable {
    Thread t;
    int[] a = { 2, 1, 5, 4, 3 };

    desc() {
        t = new Thread(this, "Descending");
        t.start();
    }

    public void run() {
        try {
            int n = a.length, temp;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (a[j] < a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println(a[i] + " ");
            }
            System.out.println();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

class AscDsc {
    public static void main(String[] args) throws InterruptedException{
        new asc().t.join();
        new desc();
    }
}

package codeforces.contest.c1472;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/*
https://codeforces.com/problemset/problem/1472/D
 */
public class Task1472_D {

    static void solve() {
        int n = FS.nextInt();
        List<Long> even = new ArrayList<>(n);
        List<Long> odd = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            long a = FS.nextLong();
            if (a % 2 == 0) {
                even.add(a);
            } else {
                odd.add(a);
            }
        }
        even.sort(Comparator.naturalOrder());
        odd.sort(Comparator.naturalOrder());

        int x = 1; // 1 - alice, 2 - bob
        int oddR = odd.size() - 1;
        int eventR = even.size() - 1;
        long sAlice = 0;
        long sBob = 0;
        while (oddR >= 0 || eventR >= 0) {
            long lastEven = 0;
            if (eventR >= 0) {
                lastEven = even.get(eventR);
            }
            long lastOdd = 0;
            if (oddR >= 0) {
                lastOdd = odd.get(oddR);
            }

            if (x == 1) {
                if (lastEven > lastOdd) {
                    sAlice += lastEven;
                    eventR--;
                } else {
                    oddR--;
                }
                x = 2;
            } else {
                if (lastOdd > lastEven) {
                    sBob += lastOdd;
                    oddR--;
                } else {
                    eventR--;
                }
                x = 1;
            }
        }

        if (sAlice > sBob) {
            FS.pt.println("Alice");
        } else if (sBob > sAlice) {
            FS.pt.println("Bob");
        } else {
            FS.pt.println("Tie");
        }
    }

    public static void main(String[] args) {
        int T = FS.nextInt();
        for (int tt = 0; tt < T; tt++) {
            solve();
        }
        FS.pt.close();
    }

    static class FS {
        private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private static StringTokenizer st = new StringTokenizer("");
        static PrintWriter pt = new PrintWriter(System.out);

        static String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        static int nextInt() {
            return Integer.parseInt(next());
        }

        static int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        static double nextDouble() {
            return Double.parseDouble(next());
        }

        static int[][] read2Array(int n, int m) {
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }

        static long[][] read2ArrayL(int n, int m) {
            long[][] a = new long[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = nextLong();
                }
            }
            return a;
        }

        void printArr(long[] arr) {
            for (long value : arr) {
                pt.print(value);
                pt.print(" ");
            }
            pt.println();
        }

        static long[] readArrayL(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }

        static void printArr(int[] arr) {
            for (int value : arr) {
                pt.print(value);
                pt.print(" ");
            }
            pt.println();
        }

        static void printArrL(int[] arr) {
            for (int value : arr) {
                pt.print(value);
                pt.print(" ");
            }
            pt.println();
        }

        static void print2Arr(int[][] arr, int n, int m) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    pt.print(arr[i][j]);
                    pt.print(" ");
                }
                pt.println();
            }
            pt.println();
        }

        static void print2Arr(long[][] arr, int n, int m) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    pt.print(arr[i][j]);
                    pt.print(" ");
                }
                pt.println();
            }
            pt.println();
        }

        static List<Long> readListLong(int n) {
            List<Long> list = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                list.add(nextLong());
            }
            return list;
        }

        static List<Integer> readListInt(int n) {
            List<Integer> list = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                list.add(nextInt());
            }
            return list;
        }

        static <T> void printList(List<T> list) {
            for (T value : list) {
                pt.print(value);
                pt.print(" ");
            }
            pt.println();
        }

        static void close() {
            pt.close();
        }

        static long nextLong() {
            return Long.parseLong(next());
        }
    }

    static class Mat {
        public static long pow(long a, long exp) {
            return (long) Math.pow(a, exp);
        }
    }

    static class NumberTheory {
        public static long gcd(long a, long b) {
            while (b != 0) {
                long tmp = a % b;
                a = b;
                b = tmp;
            }
            return a;
        }

        public static long lcm(long a, long b) {
            return a * b / gcd(a, b);
        }

        public static List<Long> primeFactors(long n) {
            List<Long> ans = new ArrayList<>();
            while (n % 2 == 0) {
                ans.add(2L);
                n /= 2;
            }

            // n must be odd at this point.  So we can
            // skip one element (Note i = i + 2)
            for (long i = 3; i <= Math.sqrt(n); i += 2) {
                // While i divides n, print i and divide n
                while (n % i == 0) {
                    ans.add(i);
                    n /= i;
                }
            }

            // This condition is to handle the case when
            // n is a prime number greater than 2
            if (n > 2) {
                ans.add(n);
            }
            return ans;
        }

        static long fact(long n) {
            if (n == 0 || n == 1) return 1L;
            long r = 1;
            for (int i = 1; i <= n; i++) {
                r *= i;
            }
            return r;
        }
    }

    static class Pair<T, K> {
        T first;
        K second;

        public Pair(T first, K second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(first, pair.first) &&
                    Objects.equals(second, pair.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }
}

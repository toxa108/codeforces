package codeforces.archieve.с1459;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/*
https://codeforces.com/problemset/problem/1459/B
 */
public class Task1459_B {

    static void solve() {
        int n = FS.nextInt();
        int ans;
        if (n % 2 == 0) {
            int m = (n / 2 + 1);
            ans = m * m;
        } else {
            int m = (n - 1) / 2 + 1;
            ans = 2 * m * m + 2 * m;
        }

        FS.pt.println(ans);
    }

    public static void main(String[] args) {
//        int T = FS.nextInt();
//        for (int tt = 0; tt < T; tt++) {
        solve();
//        }
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
                    a[i][j] = nextInt();
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
            for (int i = 0; i < n; i++) a[i] = nextInt();
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

    static class Pair<T, K> {
        T first;
        K second;
        CLAZZ clazz;

        enum CLAZZ {
            X, Y;
        }

        public Pair(T first, K second, CLAZZ clazz) {
            this.first = first;
            this.second = second;
            this.clazz = clazz;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(first, pair.first) &&
                    Objects.equals(second, pair.second) &&
                    clazz == pair.clazz;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second, clazz);
        }
    }

    static class Points<T, K> {
        T x;
        K y;

        public Points(T x, K y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Points<?, ?> points = (Points<?, ?>) o;
            return Objects.equals(x, points.x) &&
                    Objects.equals(y, points.y);
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}

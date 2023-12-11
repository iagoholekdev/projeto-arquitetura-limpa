package org.example.utils.aleatorios;

public class ThreadForPrint {

        public static void printDynamicDotsFirstLog(String msg, int count) {
            System.out.print(msg);
            for (int i = 0; i < count; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public static void clean() {
            System.out.print("\b\b\b");
        }

}

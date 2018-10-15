package com.chandra;
    public class Main {
        public static void main(String[] args) {
            // write your code here
            System.out.println("1st line in main");
            drawline();
            System.out.println("\n2nd line in main");
            drawline(45);
        }

        static void drawline() {
            for (int i = 0; i < 100; i++) {
                System.out.print("-");
            }
        }

        static void drawline(int width ) {
            for (int i = 0; i < width; i++) {
                System.out.print("-");
            }

        }
    }
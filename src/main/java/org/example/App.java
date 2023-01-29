package org.example;


public class App {
        public int averageMatrix(int[] array) {

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            int average = sum / array.length;
            return average;
        }

        public boolean isSquare(int[][] array) {

            if (array.length != array[0].length){
                return false;
            }
            return true;


        }
}


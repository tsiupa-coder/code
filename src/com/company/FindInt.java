package com.company;

public class FindInt {

    public static void main(String[] args) {
        byte max = 100;
        byte min = 0;
        byte middle = 50;
        boolean isStop = false;
        byte random = (byte)(Math.random()*100);
        int loop = 0;
        System.out.println("random is " + random + "  ---- " );


        while (!isStop) {
            loop ++;
            if(middle == random){
                System.out.println("I find random number, it is  " + middle + ", and it is  "  +  loop + " circle");
                isStop = true;
            }
            else if (!(middle == random)){
                if(random > middle){
                    min = middle;
                    middle = (byte) ((min + max)/2);
                }else {
                    max=middle;
                    middle = (byte) ((min + max)/2);
                }
            }
        }
    }
}

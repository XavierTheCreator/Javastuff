package TortioseHare;

import java.util.Random;

public class RunnerThread implements Runnable {
       private String runner; 
       private int speed,progress,rest;
       private Random rnd = new Random();
       private int runrest = rnd.nextInt(100);
       


       public RunnerThread(String runner){
         this.runner = runner;
       }

       public RunnerThread(String runner, int speed,int rest){
         this.runner = runner;
         this.speed = speed;
         this.rest = rest;
       }



        @Override
        public void run(){

            for(int i = 0; i < 30;i++){

                if(this.rest <= runrest){
                    this.progress += speed;
                    System.out.println(this.runner + ": " + progress);
                }
                else
                    System.out.println(this.runner + " took a break");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.err.println(e);
                }
            }
        }
}

package org.shark.common.mistakes;

public class Low {

    public static void main(String [] args){
        slowSum();
    }

    private static void slowSum(){
        long startTime = System.currentTimeMillis();

        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++){
            sum += i;
        }
        System.out.println(sum);
        System.out.println("耗时： " + (double)(System.currentTimeMillis() - startTime)/1000);
    }
}

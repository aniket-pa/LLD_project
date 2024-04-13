package PrintNumber;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class  Client{


    public static void main(String[] args) {

        ExecutorService ec = Executors.newCachedThreadPool();

        for(int i=0 ; i <= 100 ; i++){

            PrintNumber p1 = new PrintNumber(i);
            ec.execute(p1);
        }


    }

}
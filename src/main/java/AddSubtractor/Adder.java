package AddSubtractor;


import java.util.concurrent.Callable;

class Adder implements Callable<Void>{


    private Value v1;

    public Adder(Value v2){
        v1 = v2;
    }

    @Override
    public Void call(){

        for(int i=0; i< 5000000; i++)
        {
           this.v1.value +=i;
        }

        return  null;
    }
}
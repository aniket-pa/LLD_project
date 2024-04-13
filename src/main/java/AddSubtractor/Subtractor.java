package AddSubtractor;


import java.util.concurrent.Callable;

class Subtractor implements Callable<Void>{


    private Value v1;

    public Subtractor(Value v2){
        v1 = v2;
    }

    @Override
    public Void call(){

        for(int i=0; i< 5000000; i++)
        {
            this.v1.value -=i;
        }

        return  null;
    }
}
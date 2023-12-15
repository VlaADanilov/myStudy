package Inter;

import java.util.Arrays;

public class Ant extends Entity implements Mover, Sayer{

    public Ant(int x, int y){
        cor[0] = y; cor[1] = x;
    }

    public void move() {
        int doing = (int) ((Math.random())*4);
        if(doing == 0){
            if(cor[1]+1<=1000) cor[1]+=1;
        }
        if(doing == 1){
            if(cor[1]-1>=0) cor[1]-=1;
        }
        if(doing == 2){
            if(cor[0]+1<=1000) cor[0]+=1;
        }
        if(doing == 3){
            if(cor[0]-1>=0) cor[0]+=-1;
        }
    }

    @Override
    public void print() {
        System.out.println( "Ant{" +
                "cor=" + Arrays.toString(cor) +
                '}');
    }
}

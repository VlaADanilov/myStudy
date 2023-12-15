package Inter;

import java.util.Arrays;

public class Other extends Entity implements Mover, Sayer {

    public Other(int x, int y){
        cor[0] = y; cor[1] = x;
    }

    @Override
    public void move() {
        cor[0] = (int) (Math.random()*1000+1);
        cor[1] = (int) (Math.random()*1000+1);
    }

    @Override
    public void print() {
        System.out.println("Other{" +
                "cor=" + Arrays.toString(cor) +
                '}');
    }
}

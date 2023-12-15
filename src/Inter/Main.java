package Inter;

public class Main {
    public static void main(String[] args) {
        Ant ant = new Ant((int) (Math.random()*1000+1),(int) (Math.random()*1000+1));
        ant.print();
        System.out.println();
        Insict insict = new Insict((int) (Math.random()*1000+1),(int) (Math.random()*1000+1));
        insict.print();
        System.out.println();
        Turtle turtle = new Turtle((int) (Math.random()*1000+1),(int) (Math.random()*1000+1));
        turtle.print();
        System.out.println();
        Other other = new Other((int) (Math.random()*1000+1),(int) (Math.random()*1000+1));
        other.print();
        System.out.println();
        int winner = movers(ant,insict,turtle,other);
        switch (winner){
            case 1:
                System.out.println("Winner is ant");
                break;
            case 2:
                System.out.println("Winner is insict");
                break;
            case 3:
                System.out.println("Winner is turtle");
                break;
            case 4:
                System.out.println("Winner is other");
                break;
        }

    }
    public static int movers(Ant ant,Insict insict,Turtle turtle, Other other){
        System.out.println("Start");
        while((ant.cor[0]<400||ant.cor[0]>600||ant.cor[1]<400||ant.cor[1]>600)&&
                (insict.cor[0]<400||insict.cor[0]>600||insict.cor[1]<400||insict.cor[1]>600)&&
                (turtle.cor[0]<400||turtle.cor[0]>600||turtle.cor[1]<400||turtle.cor[1]>600)&&
                (other.cor[0]<400||other.cor[0]>600||other.cor[1]<400||other.cor[1]>600)){
            System.out.println();
            ant.move();
            ant.print();
            System.out.println();
            insict.move();
            insict.print();
            System.out.println();
            turtle.move();
            turtle.print();
            System.out.println();
            other.move();
            other.print();
            System.out.println();
        }
        if(((400<=ant.cor[0]&&ant.cor[0]<=600)&&(400<=ant.cor[1]&&ant.cor[1]<=600))) { return 1;}
        if(((400<=insict.cor[0]&&insict.cor[0]<=600)&&(400<=insict.cor[1]&&insict.cor[1]<=600))) { return 2;}
        if(((400<=turtle.cor[0]&&turtle.cor[0]<=600)&&(400<=turtle.cor[1]&&turtle.cor[1]<=600))) { return 3;}
        if(((400<=other.cor[0]&&other.cor[0]<=600)&&(400<=other.cor[1]&&other.cor[1]<=600))) { return 4;}
        return 0;
    }
}

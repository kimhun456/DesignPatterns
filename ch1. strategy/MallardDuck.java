/**
 * Created by hyunjae on 16. 8. 7.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();


    }

    public void diplay(){
        System.out.println("I am MallardDuck ");
    }
}

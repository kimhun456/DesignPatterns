/**
 * Created by hyunjae on 16. 8. 7.
 */
public class ModelDuck extends Duck {


    public ModelDuck(){
        flyBehavior = new FlayNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display(){
        System.out.println("I am Model Duck");
    }


}

package examples.solid.model.animal;

public class Avian extends BaseAnimal implements IFlyer, IWalker
{


    public Avian(Integer id, String name)
    {
        super(id, name);
    }

    @Override
    public void doNoise()
    {
        System.out.println("< Avian sound >");
    }

    @Override
    public void move()
    {
        fly();
    }

    @Override
    public void fly()
    {
        System.out.println(this.getClass().getSimpleName()+"-"+getName()+" WITH ID "+getId()+" IS FLYING !!!");
    }

    @Override
    public void walk()
    {
        System.out.println(this.getClass().getSimpleName()+"-"+getName()+" WITH ID "+getId()+" IS WALKING !!!");
    }
}

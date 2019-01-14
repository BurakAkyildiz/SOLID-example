package examples.solid.model.animal;

public class Feline extends BaseAnimal implements IWalker
{

    public Feline(Integer id, String name)
    {
        super(id, name);
    }

    @Override
    public void doNoise()
    {
        System.out.println("< Feline sound >");
    }

    @Override
    public void move()
    {
        walk();
    }

    @Override
    public void walk()
    {
        System.out.println(this.getClass().getSimpleName()+"-"+getName()+" WITH ID "+getId()+" IS WALKING !!!");
    }
}

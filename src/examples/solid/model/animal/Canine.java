package examples.solid.model.animal;

public class Canine extends BaseAnimal implements IWalker
{

    public Canine(Integer id, String name)
    {
        super(id, name);
    }

    @Override
    public void doNoise()
    {
        System.out.println("< Canine sound >");
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

package examples.solid.model.animal;

public class Fish extends BaseAnimal implements ISwimmer
{

    public Fish(Integer id, String name)
    {
        super(id, name);
    }

    @Override
    public void doNoise()
    {
        System.out.println("< Fish sound >");
    }

    @Override
    public void move()
    {
        swim();
    }

    @Override
    public void swim()
    {
        System.out.println(this.getClass().getSimpleName()+"-"+getName()+" WITH ID "+getId()+" IS SWIMMING !!!");
    }
}

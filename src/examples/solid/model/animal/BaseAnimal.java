package examples.solid.model.animal;

import java.util.Objects;


/**
 * Base implementation class for animals.
 */
public abstract class BaseAnimal implements IAnimal
{

    private Integer id;
    private String name;


    public BaseAnimal(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void move();
    public abstract void doNoise();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseAnimal animal = (BaseAnimal) o;
        return Objects.equals(id, animal.id) &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "BaseAnimal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

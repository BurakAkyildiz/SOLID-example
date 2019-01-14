package examples.solid.model.area;

import examples.solid.model.animal.BaseAnimal;

import java.util.List;
import java.util.Objects;

public abstract class BaseArea implements IArea
{

    private Integer id;
    private String name;
    private List<BaseAnimal> animals;

    public BaseArea(Integer id, String name, List<BaseAnimal> animals)
    {
        this.id = id;
        this.name = name;
        this.animals = animals;
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

    public List<BaseAnimal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<BaseAnimal> animals) {
        this.animals = animals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseArea area = (BaseArea) o;
        return Objects.equals(id, area.id) &&
                Objects.equals(name, area.name) &&
                Objects.equals(animals, area.animals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, animals);
    }

    @Override
    public String toString() {
        return "BaseArea{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", animals=" + animals +
                '}';
    }
}

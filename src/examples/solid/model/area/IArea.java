package examples.solid.model.area;

import examples.solid.model.animal.BaseAnimal;

import java.util.List;

public interface IArea
{
    Integer getId();

    void setId(Integer id);

    String getName();

    void setName(String name);

    List<BaseAnimal> getAnimals();

    void setAnimals(List<BaseAnimal> animals);
}

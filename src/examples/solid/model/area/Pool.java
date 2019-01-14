package examples.solid.model.area;

import examples.solid.model.animal.BaseAnimal;

import java.util.List;

public class Pool extends BaseArea implements ISwimmableArea
{

    public Pool(Integer id, String name, List<BaseAnimal> animals)
    {
        super(id, name, animals);
    }

    @Override
    public Integer getWaterTemperature() {
        return Math.toIntExact(System.currentTimeMillis() % 50);
    }
}

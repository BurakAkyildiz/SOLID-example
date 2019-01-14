package examples.solid.model.area;

import examples.solid.model.animal.BaseAnimal;

import java.util.List;

public class Desert extends BaseArea implements IWalkableArea, IFlyableArea
{

    public Desert(Integer id, String name, List<BaseAnimal> animals)
    {
        super(id, name, animals);
    }

    @Override
    public String getAirCondition()
    {
        return "SUNNY";
    }

    @Override
    public boolean isAreaClear()
    {
        return System.currentTimeMillis() % 2 == 0;
    }
}

package examples.solid.model.area;

import examples.solid.model.animal.BaseAnimal;

import java.util.List;

public class Forest extends BaseArea implements IWalkableArea, IFlyableArea
{

    public Forest(Integer id, String name, List<BaseAnimal> animals)
    {
        super(id, name, animals);
    }

    @Override
    public String getAirCondition() {
        return System.currentTimeMillis() % 2 == 0 ? "RAINY" : "SUNNY";
    }

    @Override
    public boolean isAreaClear() {
        return false;
    }
}

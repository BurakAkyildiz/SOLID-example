package examples.solid.model.area;

import examples.solid.model.animal.BaseAnimal;

import java.util.List;

public class Park extends BaseArea implements IWalkableArea
{

    public Park(Integer id, String name, List<BaseAnimal> animals)
    {
        super(id, name, animals);
    }

    @Override
    public boolean isAreaClear() {
        return System.currentTimeMillis() % 2 == 0;
    }

}

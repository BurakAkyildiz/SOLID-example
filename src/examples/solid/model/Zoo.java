package examples.solid.model;


import examples.solid.model.area.IArea;
import examples.solid.model.area.IFlyableArea;
import examples.solid.model.area.ISwimmableArea;
import examples.solid.model.area.IWalkableArea;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Zoo
{

    private List<IArea> areas;


    public List<ISwimmableArea> getSwimmableAreas()
    {
        return this.areas.stream().filter( area -> area instanceof ISwimmableArea).map(area -> (ISwimmableArea)area).collect(Collectors.toList());
    }

    public List<IWalkableArea> getWalkableAreas()
    {
        return this.areas.stream().filter( area -> area instanceof IWalkableArea).map(area -> (IWalkableArea)area).collect(Collectors.toList());
    }

    public List<IFlyableArea> getFlyableAreas()
    {
        return this.areas.stream().filter( area -> area instanceof IFlyableArea).map(area -> (IFlyableArea)area).collect(Collectors.toList());
    }


    public List<IArea> getAreas() {
        return areas;
    }

    public void setAreas(List<IArea> areas) {
        this.areas = areas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return Objects.equals(areas, zoo.areas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areas);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "areas=" + areas +
                '}';
    }
}

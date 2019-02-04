package examples.solid;

import examples.solid.model.Zoo;
import examples.solid.model.animal.*;
import examples.solid.model.area.Desert;
import examples.solid.model.area.Forest;
import examples.solid.model.area.Park;
import examples.solid.model.area.Pool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MAIN
{
    public static void main(String[] args) throws InterruptedException
    {

        //Initialization of example data
        Zoo zoo = new Zoo();

        List<BaseAnimal> saharaAnimals = new ArrayList<>();
        saharaAnimals.add(new Avian(100, "Vulture"));
        saharaAnimals.add(new Feline(101, "Lion"));

        List<BaseAnimal> gobiAnimals = new ArrayList<>();
        gobiAnimals.add(new Avian(102, "Cheetah"));
        gobiAnimals.add(new Canine(103, "Jackal"));

        List<BaseAnimal> bergamaAnimals = new ArrayList<>();
        bergamaAnimals.add( new Avian(104, "Parrot"));
        bergamaAnimals.add( new Avian(105, "Piggot"));
        bergamaAnimals.add( new Feline(106, "Cat"));

        List<BaseAnimal> parkAnimals = new ArrayList<>();
        parkAnimals.add(new Avian(107, "Piggot"));

        List<BaseAnimal> zooPool1Animals = new ArrayList<>();
        zooPool1Animals.add( new Fish(108, "Golden Fish"));
        zooPool1Animals.add( new Fish(109, "Piranha"));
        zooPool1Animals.add( new Fish(110, "Piranha"));
        zooPool1Animals.add( new Fish(111, "Piranha"));


        List<BaseAnimal> zooPool2Animals = new ArrayList<>();
        zooPool2Animals.add( new Fish(112, "Catfish"));
        zooPool2Animals.add( new Fish(113, "Anchovy"));


        Desert saharaDesert = new Desert(1, "Sahara", saharaAnimals);
        Desert gobiDesert = new Desert(2, "Gobi", gobiAnimals);
        Forest bergamaForest = new Forest(3, "Bergama", bergamaAnimals);
        Park zooPark = new Park(4, "Zoo Park", parkAnimals);
        Pool zooPool1 = new Pool(5, "Zoo Pool 1", zooPool1Animals);
        Pool zooPool2 = new Pool(6, "Zoo Pool 2", zooPool2Animals);


        zoo.setAreas(Arrays.asList( saharaDesert, gobiDesert, bergamaForest, zooPark, zooPool1, zooPool2));
        // end of example data initialization.


        // Example zoo life

        Consumer<BaseAnimal> animalConsumer = animal -> { if( System.nanoTime() % 5 == 0 ) { animal.doNoise(); } animal.move(); };

        while( true )
        {


            if( System.nanoTime() % 2 == 0 )
            {
                zoo.getSwimmableAreas().stream().peek( iSwimmable -> System.out.println(iSwimmable.getName()+" Water temperature "+iSwimmable.getWaterTemperature())).flatMap( iSwimmable -> iSwimmable.getAnimals().stream()).forEach( animalConsumer );
                System.out.println("---\r\n");

            }

            if( System.nanoTime() % 3 == 0 )
            {
                zoo.getFlyableAreas().stream().peek( iFlyable -> System.out.println(iFlyable.getName()+" Air condition is "+iFlyable.getAirCondition())).flatMap( iFlyable -> iFlyable.getAnimals().stream()).forEach( animalConsumer );
                System.out.println("---\r\n");

            }

            if( System.nanoTime() % 5 == 0 )
            {
                zoo.getWalkableAreas().stream().peek( iWalkable -> System.out.println(iWalkable.getName()+" area is "+(iWalkable.isAreaClear() ? "" : "NOT ")+" clear !")).flatMap( iWalkable -> iWalkable.getAnimals().stream()).forEach( animalConsumer );
                System.out.println("---\r\n");

            }

            Thread.sleep(1000L * (System.nanoTime() % 10));

        }


    }


}


import Abstraction.AbstractStuff;
import AllAnimals.*;
import java.util.*;



public class Main {
    public static void main(String[] args) {


        List<AbstractStuff> srcCollection = new ArrayList<>();
        Mammals animal0 = new Ultra_Hedgehog("Hedgehog alfa ");
        Mammals animal1 = new Manul("Manul beta ");
        Mammals animal2 = new Lynx("Lynx sigma ");
        Insectivores animal3 = new Ultra_Hedgehog("Hedgehog sigma ");
        Feline animal4 = new Lynx("Lynx beta ");

        srcCollection.add(animal0);
        srcCollection.add(animal1);
        srcCollection.add(animal2);
        srcCollection.add(animal3);
        srcCollection.add(animal4);

        List<Hedgehogs> collection1 =   new ArrayList<>();
        List<Feline> collection2    =   new ArrayList<>();
        List<Predators> collection3 =   new ArrayList<>();

        segregate(srcCollection,collection1,collection2,collection3);

        System.out.println("Collection 1 ");
            collection1.forEach(System.out::println);
        System.out.println("collection 2 ");
            collection2.forEach(System.out::println);
        System.out.println("collection 3 ");
            collection3.forEach(System.out::println);


    }
    public static void segregate(Collection<? extends  AbstractStuff> srcCollection,
                                 Collection<? super    Ultra_Hedgehog> collection1,
                                 Collection<? super    Manul> collection2,
                                 Collection<? super    Predators> collection3
                                )
    {

        for (var animal: srcCollection)
        {

            if(Ultra_Hedgehog.class.isAssignableFrom(animal.getClass())){
                collection1.add((Ultra_Hedgehog) animal);
            }
            if (Manul.class.isAssignableFrom(animal.getClass())){
                collection2.add((Manul) animal);
            }
            if(Lynx.class.isAssignableFrom(animal.getClass())){
                collection3.add((Lynx) animal);
            }
        }


    }
}
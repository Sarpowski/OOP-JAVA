package Abstraction;

import AllAnimals.Chordate;

abstract public class AbstractStuff {

    private String name_;

    public AbstractStuff(String name){
        this.name_=name;
    }


    //Getter And Setter
    public void SetName(String name){
        this.name_=name;
    }
    public  String GetName(){
        return name_;

    }
    @Override
    public String toString(){
        return "Animal name : \" " + name_ +"\" ";

    }
}

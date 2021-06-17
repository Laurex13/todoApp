package se.lexicon.laurita_charles.model;

public class Person {

        final int min=0;
        final int max=2021;

    //Fields

private int personId;
private String firstName;
private String lastName;

//Constructors

    public Person(int personId, String firsName, String lastName){
        this.personId= personId;
        this.firstName=firsName;
        this.lastName=lastName;
    }
    //Getters and Setters

    public int getPersonId(){
        return personId;
    }
    public void setPersonId(int personId){
        this.personId=personId;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName= firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
}

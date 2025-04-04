package module.io;
import java.io.Serializable;

public class Address implements  Serializable
{
    String Country,State,City;

    public String getCountry() 
    {
        return Country;
    }

    public void setCountry(String country)
    {
        Country = country;
    }

    public String getState() 
    {
        return State;
    }

    public void setState(String state) 
    {
        State = state;
    }

    public String getCity() 
    {
        return City;
    }

    public void setCity(String City) 
    {
        this.City = City;
    }
    @Override
    public String toString()
    {
        return new StringBuffer("Country : ").append(Country)
                .append(" , State : ").append(State)
                .append(" , City : ").append(City).toString();
    }
    
}

public class Airport {
    public String name;
    public String city;
    public String country;

    public Airport(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public String getCity() { return city; }
    public String getCountry() { return country; }
    public String getName() { return name; }

    public void setCity(String city) {
        this.city = city;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() { return name + " " + city + " " + country; }
}

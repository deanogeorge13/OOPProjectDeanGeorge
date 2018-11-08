public class Vehicle {
    private int seats;
    private String type;
    private double cost;

    public Vehicle(int seats, String type, double cost)
    {
        setSeats(seats);
        setType(type);
        setCost(cost);
    }

    public void setSeats(int seats)
    {
        this.seats = seats;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public int getSeats()
    {
        return seats;
    }

    public String getType()
    {
        return type;
    }

    public double getCost()
    {
        return cost;
    }
}

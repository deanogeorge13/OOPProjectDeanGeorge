public class Electronics {
    private String type;
    private double cost;


    public Electronics( String type, double cost)
    {
        setType(type);
        setCost(cost);
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
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

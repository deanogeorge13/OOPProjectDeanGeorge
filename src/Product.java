public class Product {
    private String type;
    private double cost;
    private int id;

    public Product()
    {
        this("Unknown", 0.00, 12345);
    }

    public Product( String type, double cost, int id)
    {
        setType(type);
        setCost(cost);
        setId(id);
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public void setId(int id) { this.id = id; }

    public String getType()
    {
        return type;
    }

    public double getCost()
    {
        return cost;
    }

    public int getId() { return id; }
}

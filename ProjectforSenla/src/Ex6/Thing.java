package Ex6;
class Thing {
    private int weight =0;
    private int cost = 0;
    private String name;

    Thing (String name, int weight, int cost){
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public int getCost (){
        return this.cost;
    }

    public int getWeight (){
        return this.weight;
    }

    @Override
    public String toString() {
        return this.name + " - "+ this.weight + " кг - " + this.cost + " $";
    }
}

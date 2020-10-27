class Factory {
    private double iron;
    private double copper;
    private double silver;
    private double gold;
    private int ton=1000000;
    private double CircuitBoard;

    public Factory(double iron, double copper, double silver, double gold) {
        this.iron = iron;
        this.copper = copper;
        this.silver = silver;
        this.gold = gold;
    }

    public double getIron() {
        return iron;
    }

    public void setIron(double iron) {
        this.iron = iron;
    }

    public double getCopper() {
        return copper;
    }

    public void setCopper(double copper) {
        this.copper = copper;
    }

    public double getSilver() {
        return silver;
    }

    public void setSilver(double silver) {
        this.silver = silver;
    }

    public double getGold() {
        return gold;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }

    public double getCircuitBoard() {
        return CircuitBoard;
    }

    public void buildCircuitBoard(double circuitBoard) {
        //2gram sil 0.01 gold 5 copper
        System.out.println("CB "+this.CircuitBoard);
        this.CircuitBoard+=circuitBoard;
        while (circuitBoard>=0){
            this.silver-= 0.0000002;
            this.gold-= 0.000000001;
            this.copper-=0.0000005;
            circuitBoard--;
        }

    }
}

class Mains {
    public static void main(String[] args) {
        Factory fac1 = new Factory(67, 9, 10, 1);
        System.out.println(fac1.getIron());
        System.out.println(fac1.getSilver());
        System.out.println(fac1.getCopper());
        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
        fac1.buildCircuitBoard(500000);
        fac1.buildCircuitBoard(850000);
        System.out.println(fac1.getIron());
        System.out.println(fac1.getSilver());
        System.out.println(fac1.getCopper());
        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
    }
}

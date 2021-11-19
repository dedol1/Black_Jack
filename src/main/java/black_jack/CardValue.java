package black_jack;

public enum CardValue {
    Two(2) ,Three(3), Four(4),Five(5),Six(6),Seven(7)
    ,Eight(8),Nine(9),Ten(10), Jack(10), King(10), Queen(10),Ace(11);

    private int val;

    CardValue(int val) {
        this.val = val;
    }

    public int getVal() {        return val;
    }
}

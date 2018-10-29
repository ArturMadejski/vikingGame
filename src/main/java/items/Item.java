package items;

public class Item {

    int ItemAp;
    int ItemDp;

    public Item(int itemAp, int itemDp) {
        ItemAp = itemAp;
        ItemDp = itemDp;
    }

    public int getItemAp() {
        return ItemAp;
    }

    public int getItemDp() {
        return ItemDp;
    }

    @Override
    public String toString() {
        return "Ap=" + ItemAp +
                ", Dp=" + ItemDp;
    }
}
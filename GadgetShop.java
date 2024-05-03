import java.util.ArrayList;

class GadgetShop {
    private ArrayList<Gadget> gadgets;

    public GadgetShop() {
        gadgets = new ArrayList<>();
    }

    public void addGadget(Gadget gadget) {
        gadgets.add(gadget);
    }

    public void displayAllGadgets() {
        for (Gadget gadget : gadgets) {
            gadget.display();
        }
    }
}
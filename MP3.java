class MP3 extends Gadget {
    private int availableMemory;

    public MP3(String model, double price, int weight, String size, int availableMemory) {
        super(model, price, weight, size);
        this.availableMemory = availableMemory;
    }

    public int getAvailableMemory() {
        return availableMemory;
    }

    public void downloadMusic(int memory) {
        if (availableMemory >= memory) {
            availableMemory -= memory;
        } else {
            System.out.println("Not enough memory to download the music.");
        }
    }

    public void deleteMusic(int memory) {
        availableMemory += memory;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Available Memory: " + availableMemory + " MB");
    }
}
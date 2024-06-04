package multithreading.storage;

public class GeneralTons {
    private int generalTons;

    public GeneralTons(int generalTons) {
        this.generalTons = generalTons;
    }

    public void setGeneralTons(int generalTons) {
        this.generalTons -= generalTons;
    }

    public int getGeneralTons() {
        return generalTons;
    }

}

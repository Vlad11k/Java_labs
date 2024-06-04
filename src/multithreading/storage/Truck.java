package multithreading.storage;

public class Truck {

    private int number; //Номер грузовика (1 - маленький, 2 - средний, 3 - большой)
    private int maxTons; //Максимальный груз, который может вывезти грузовик
    private long leavingTime; //Время, чтобы грузовик отъехал, и заехал новый

    private int summaryTons; //Общая масса, которую вывез грузовик
    private long summaryTime; //Общее время, которое затратил один грузовик

    public Truck(int number, int maxTons, long leavingTime) {
        this.number = number;
        this.maxTons = maxTons;
        this.leavingTime = leavingTime;
    }

    public void setSummaryTons(int summaryTons) {
        this.summaryTons = summaryTons;
    }

    public int getSummaryTons() {
        return summaryTons;
    }

    public int getNumber() {
        return number;
    }

    public long getSummaryTime() {
        return summaryTime;
    }

    public void setSummaryTime(long summaryTime) {
        this.summaryTime = summaryTime;
    }

    public int getMaxTons() {
        return maxTons;
    }

    public long getLeavingTime() {
        return leavingTime;
    }

    public long getProcessingTime() {
        long a = 0;
        a += getMaxTons() * 3L; // Время на погрузку
        a += getLeavingTime(); // Время на отъезд/заезд
        return a;
    }
}

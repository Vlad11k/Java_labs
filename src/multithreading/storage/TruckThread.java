package multithreading.storage;

public class TruckThread extends Thread {
    public static long allTime;

    final Truck truck;
    GeneralTons generalTons;

    public TruckThread(GeneralTons generalTons, Truck truck) {
        this.generalTons = generalTons;
        this.truck = truck;
    }

    @Override
    public void run() {
        while (generalTons.getGeneralTons() > 0) {
            try {
                sleep(truck.getProcessingTime()); //Приостановка потока
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (truck) {
                if (generalTons.getGeneralTons() - truck.getMaxTons() <= 0) {
                    int ostatokTons = generalTons.getGeneralTons();
                    generalTons.setGeneralTons(generalTons.getGeneralTons());
                    truck.setSummaryTons(truck.getSummaryTons() + ostatokTons);
                    truck.setSummaryTime(truck.getSummaryTime() + ostatokTons * 3L);
                    break;
                }
                generalTons.setGeneralTons(truck.getMaxTons());
                truck.setSummaryTons(truck.getSummaryTons() + truck.getMaxTons());
                truck.setSummaryTime(truck.getSummaryTime() + truck.getProcessingTime());
            }
        }
        if (truck.getSummaryTime() > allTime) allTime = truck.getSummaryTime();
    }

    public void print() {
        System.out.println("Количество груза, через ворота номер " + truck.getNumber() + " = " + truck.getSummaryTons() + " тонн");
    }
}

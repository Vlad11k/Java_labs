package inheritance_override;

public class WriterInfo {
    public static void main(String[] args) {
        Cabinet cabinet1 = new Cabinet();
        Cabinet cabinet2 = new Cabinet(100, "Дерево", 100);
        Cabinet cabinet3 = new Cabinet(110, "Дерево", 100 ,100 ,200);

        Table table1 = new Table();
        Table table2 = new Table(70, "Фанера", 4);
        Table table3 = new Table(80, "Фанера", 4, 100);

        Chair chair1 = new Chair();
        Chair chair2 = new Chair(50, "ДСП");
        Chair chair3 = new Chair(60, "ДСП", true);

        System.out.println("Шкаф 1:");
        System.out.println("Производитель: "+cabinet1.getmanufacturer()+"; Цена: "+cabinet1.getPrice()+"; Материал: "+cabinet1.getMaterial()+
                "; Ширина: "+cabinet1.getWidth()+"; Высота: "+cabinet1.getHeight()+"; Глубина: "+ cabinet1.getDepth());
        System.out.println("Шкаф 2:");
        System.out.println("Производитель: "+cabinet2.getmanufacturer()+"; Цена: "+cabinet2.getPrice()+"; Материал: "+cabinet2.getMaterial()+
                "; Ширина: "+cabinet2.getWidth()+"; Высота: "+cabinet2.getHeight()+"; Глубина: "+ cabinet2.getDepth());
        System.out.println("Шкаф 3:");
        System.out.println("Производитель: "+cabinet3.getmanufacturer()+"; Цена: "+cabinet3.getPrice()+"; Материал: "+cabinet3.getMaterial()+
                "; Ширина: "+cabinet3.getWidth()+"; Высота: "+cabinet3.getHeight()+"; Глубина: "+ cabinet3.getDepth());
        System.out.println("____________________________________________________________________________________________");

        System.out.println("Стол 1:");
        System.out.println("Производитель: "+table1.getmanufacturer()+"; Цена: "+table1.getPrice()+"; Материал: "+table1.getMaterial()+
                "; Количество полок: "+table1.getNumber_cases()+"; Площадь: "+table1.getArea());
        System.out.println("Стол 2:");
        System.out.println("Производитель: "+table2.getmanufacturer()+"; Цена: "+table2.getPrice()+"; Материал: "+table2.getMaterial()+
                "; Количество полок: "+table2.getNumber_cases()+"; Площадь: "+table2.getArea());
        System.out.println("Стол 3:");
        System.out.println("Производитель: "+table3.getmanufacturer()+"; Цена: "+table3.getPrice()+"; Материал: "+table3.getMaterial()+
                "; Количество полок: "+table3.getNumber_cases()+"; Площадь: "+table3.getArea());
        System.out.println("____________________________________________________________________________________________");

        System.out.println("Стул 1:");
        System.out.println("Производитель: "+chair1.getmanufacturer()+"; Цена: "+chair1.getPrice()+"; Материал: "+chair1.getMaterial()+
                "; Возможность регулировать спинку: "+chair1.isControl_back());
        System.out.println("Стул 2:");
        System.out.println("Производитель: "+chair2.getmanufacturer()+"; Цена: "+chair2.getPrice()+"; Материал: "+chair2.getMaterial()+
                "; Возможность регулировать спинку: "+chair2.isControl_back());
        System.out.println("Стул 3:");
        System.out.println("Производитель: "+chair3.getmanufacturer()+"; Цена: "+chair3.getPrice()+"; Материал: "+chair3.getMaterial()+
                "; Возможность регулировать спинку: "+chair3.isControl_back());
    }
}

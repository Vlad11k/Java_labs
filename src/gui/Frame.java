package gui;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Frame extends JFrame {
    String text1;
    int choice;
    Object boxA, boxB, boxC;
    File file = new File("GUI.txt");
    static JLabel product_name, product_description, product_date ,product_age;
    JComboBox day_box, month_box, year_box;
    JRadioButton yes, no;
    ButtonGroup bg;
    static JButton writing, cleaning;
    static JTextField name_field;
    static JTextArea description_area;
    static String[] day =
            {"1","2","3","4","5","6","7","8","9","10","11","12","13",
            "14","15","16","17","18","19","20","21","22",
             "23","24","25","26","27","28","29","30","31"};
    static String[] month =
            {"Январь","Февраль","Март","Апрель","Май","Июнь","Июль",
            "Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
    static String[] year =
            {"2007","2008","2009","2010","2011","2012","2013","2014",
            "2015","2016","2017","2018","2019","2020","2021"};
    public Frame (String str) {
        super(str);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        writing = new JButton("Добавить продукт");
        cleaning = new JButton("Очистить поля");
        name_field = new JTextField(9);
        description_area = new JTextArea(9,9);

        product_name = new JLabel("Наименование продукта");
        product_description = new JLabel("Описание продукта");
        product_date = new JLabel("Дата поступления");
        product_age = new JLabel("Продажа без паспорта");

        day_box = new JComboBox(day);
        month_box = new JComboBox(month);
        year_box = new JComboBox<Object>(year);
        yes = new JRadioButton("Да");
        no = new JRadioButton("Нет");
        bg = new ButtonGroup();
        bg.add(yes);
        bg.add(no);

        setLayout(null);
        product_name.setSize(200,25);
        product_name.setLocation(10,20);
        name_field.setSize(220,25);
        name_field.setLocation(250,20);

        product_description.setSize(220,25);
        product_description.setLocation(10,60);
        description_area.setSize(220,150);
        description_area.setLocation(250,60);

        product_date.setSize(200,25);
        product_date.setLocation(10,250);
        day_box.setSize(40,25);
        day_box.setLocation(250,250);
        month_box.setSize(100,25);
        month_box.setLocation(300,250);
        year_box.setSize(70,25);
        year_box.setLocation(410,250);

        product_age.setSize(200,25);
        product_age.setLocation(10,310);
        yes.setSize(50,25);
        yes.setLocation(250,310);
        no.setSize(50,25);
        no.setLocation(310,310);

        writing.setSize(200,30);
        writing.setLocation(270,400);
        cleaning.setSize(200,30);
        cleaning.setLocation(30,400);

        add(product_name);
        add(name_field);

        add(product_description);
        add(description_area);

        add(product_date);
        add(day_box);
        add(month_box);
        add(year_box);

        add(product_age);
        add(yes);
        add(no);

        add(writing);
        add(cleaning);

        writing.addActionListener(new ButtonActionListener());
        yes.addActionListener(new FlagActionListener());
        no.addActionListener(new FlagActionListener());
        cleaning.addActionListener(new CleaningActionListener());
        day_box.addActionListener(new BoxActionListener());
        month_box.addActionListener(new BoxActionListener());
        year_box.addActionListener(new BoxActionListener());
    }

    class ButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                if(!file.exists()) {
                    file.createNewFile();
                }
                FileWriter out = new FileWriter(file, true);
                try{
                    String text = name_field.getText();
                    String area = description_area.getText();
                    out.write(text + " - ");
                    out.write(area + "\n");
                    if (choice == 1)
                        out.write("Продажа осуществляется без паспорта. "+"\n");
                    else if (choice == -1)
                        out.write("Продажа осуществляется c паспортом. "+"\n");
                    out.write(" (Дата поступления:"+boxA+" "+boxB+" "+boxC+ ")\n");
                } finally {
                    out.close();
                }
            } catch (IOException e1) {
                throw new RuntimeException(e1);
            }
        }
    }

    class FlagActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            choice = 0;
            if(e.getSource() == yes) {
                choice++;
            }
            else if (e.getSource() == no) {
                choice--;
            }
        }
    }

    class CleaningActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == cleaning) {
                name_field.setText(null);
                description_area.setText(null);
            }
        }
    }

    class BoxActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == day_box) {
                boxA = day_box.getSelectedItem();
            }
            if(e.getSource() == month_box) {
                boxB = month_box.getSelectedItem();
            }
            if(e.getSource() == year_box) {
                boxC = year_box.getSelectedItem();
            }
        }
    }
}

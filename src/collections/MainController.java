package collections;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;

import java.text.ParseException;
import java.util.ArrayList;

public class MainController {
    @FXML
    private TextField name;
    @FXML
    private TextField art;
    @FXML
    private TextField model;
    @FXML
    private TextField proizvod;
    @FXML
    private TextField color;
    @FXML
    private TextField size;
    @FXML
    private TextField date;
    @FXML
    private TextField price;
    @FXML
    private TextField find;
    @FXML
    private Label info;

    @FXML
    private Button add;
    @FXML
    private Button remove;
    @FXML
    private Button edit;
    @FXML
    private Button sort;
    @FXML
    private Button search;
    @FXML
    private Button reset;

    private ObservableList<Shoplist> CollectsData = FXCollections.observableArrayList();

    @FXML
    private TableView<Shoplist> table;
    @FXML
    private TableColumn<Shoplist, String> Cname;
    @FXML
    private TableColumn<Shoplist, String> Cart;
    @FXML
    private TableColumn<Shoplist, String> Cmodel;
    @FXML
    private TableColumn<Shoplist, String> Cproizvod;
    @FXML
    private TableColumn<Shoplist, String> Ccolor;
    @FXML
    private TableColumn<Shoplist, Integer> Csize;
    @FXML
    private TableColumn<Shoplist, String> Cdate;
    @FXML
    private TableColumn<Shoplist, Integer> Cprice;

    protected void initialize() {
        Cname.setCellValueFactory(new PropertyValueFactory<Shoplist, String>("name"));
        Cart.setCellValueFactory(new PropertyValueFactory<Shoplist, String>("art"));
        Cmodel.setCellValueFactory(new PropertyValueFactory<Shoplist, String>("model"));
        Cproizvod.setCellValueFactory(new PropertyValueFactory<Shoplist, String>("proizvod"));
        Ccolor.setCellValueFactory(new PropertyValueFactory<Shoplist, String>("color"));
        Csize.setCellValueFactory(new PropertyValueFactory<Shoplist, Integer>("size"));
        Cdate.setCellValueFactory(new PropertyValueFactory<Shoplist, String>("date"));
        Cprice.setCellValueFactory(new PropertyValueFactory<Shoplist, Integer>("price"));

        table.setEditable(true);
        Cname.setCellFactory(TextFieldTableCell.forTableColumn());
        Cart.setCellFactory(TextFieldTableCell.forTableColumn());
        Cmodel.setCellFactory(TextFieldTableCell.forTableColumn());
        Cproizvod.setCellFactory(TextFieldTableCell.forTableColumn());
        Ccolor.setCellFactory(TextFieldTableCell.forTableColumn());
        Csize.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        Cdate.setCellFactory(TextFieldTableCell.forTableColumn());
        Cprice.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        table.setItems(CollectsData);
        Cname.setSortType(TableColumn.SortType.ASCENDING);
    }

    @FXML
    protected void addItem() throws ParseException {
        try {
            if (name.getText().length()!=0 && art.getText().length()!=0
        && model.getText().length()!=0 && proizvod.getText().length()!=0
        && color.getText().length()!=0 && date.getText().length()!=0) {
                if (Integer.parseInt(size.getText()) > 0 && Integer.parseInt(price.getText()) > 0) {
                        Shoplist col = new Shoplist(name.getText(), art.getText(),
                model.getText(), proizvod.getText(), color.getText(),
                Integer.parseInt(size.getText()), date.getText(), Integer.parseInt(price.getText()));
                    CollectsData.add(col);
                    info.setText("Данные успешно добавлены в таблицу");
                    initialize();
                } else info.setText("Поля: \"Размер\" и \"Цена\" должны содержать положительные значения");
            } else info.setText("Все поля должны быть заполнены");
        } catch (IllegalStateException exc) {
            info.setText("Неверный формат ввода");
        }
        catch (NumberFormatException ex) {
            info.setText("Неверный формат ввода");
        }
        name.setText(null);
        art.setText(null);
        model.setText(null);
        proizvod.setText(null);
        color.setText(null);
        size.setText(null);
        date.setText(null);
        price.setText(null);
    }

    @FXML
    protected void remove() {
        CollectsData=table.getSelectionModel().getSelectedItems();
        ObservableList<Shoplist> allCollects = table.getItems();

        if (CollectsData!=null) {
            ArrayList<Shoplist> rows = new ArrayList<>(CollectsData);
            rows.forEach(row->table.getItems().remove(row));
            info.setText("Строка успешна удалена");
            CollectsData=allCollects;
        }
    }

    @FXML
    protected void edit() {
        table.setEditable(true);
        Cname.setCellFactory(TextFieldTableCell.forTableColumn());
        Cart.setCellFactory(TextFieldTableCell.forTableColumn());
        Cmodel.setCellFactory(TextFieldTableCell.forTableColumn());
        Cproizvod.setCellFactory(TextFieldTableCell.forTableColumn());
        Ccolor.setCellFactory(TextFieldTableCell.forTableColumn());
        Csize.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        Cdate.setCellFactory(TextFieldTableCell.forTableColumn());
        Cprice.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));

        Cname.setOnEditCommit((TableColumn.CellEditEvent<Shoplist, String> e)->{
            TablePosition<Shoplist, String> pos=e.getTablePosition();
            String newName=e.getNewValue();
            int row = pos.getRow();
            Shoplist col=e.getTableView().getItems().get(row);
            col.setName(newName);
        });

        Cart.setOnEditCommit((TableColumn.CellEditEvent<Shoplist, String> e)->{
            TablePosition<Shoplist, String> pos=e.getTablePosition();
            String newArt=e.getNewValue();
            int row = pos.getRow();
            Shoplist col=e.getTableView().getItems().get(row);
            col.setArt(newArt);
        });

        Cmodel.setOnEditCommit((TableColumn.CellEditEvent<Shoplist, String> e)->{
            TablePosition<Shoplist, String> pos=e.getTablePosition();
            String newModel=e.getNewValue();
            int row = pos.getRow();
            Shoplist col=e.getTableView().getItems().get(row);
            col.setModel(newModel);
        });
        Cproizvod.setOnEditCommit((TableColumn.CellEditEvent<Shoplist, String> e)->{
            TablePosition<Shoplist, String> pos=e.getTablePosition();
            String newProizvod=e.getNewValue();
            int row = pos.getRow();
            Shoplist col=e.getTableView().getItems().get(row);
            col.setProizvod(newProizvod);
        });
        Ccolor.setOnEditCommit((TableColumn.CellEditEvent<Shoplist, String> e)->{
            TablePosition<Shoplist, String> pos=e.getTablePosition();
            String newColor=e.getNewValue();
            int row = pos.getRow();
            Shoplist col=e.getTableView().getItems().get(row);
            col.setColor(newColor);
        });
        Cdate.setOnEditCommit((TableColumn.CellEditEvent<Shoplist, String> e)->{
            TablePosition<Shoplist, String> pos=e.getTablePosition();
            String newDate=e.getNewValue();
            int row = pos.getRow();
            Shoplist col=e.getTableView().getItems().get(row);
            col.setDate(newDate);
        });
        Csize.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Shoplist, Integer>>(){
                    @Override
                    public void handle(TableColumn.CellEditEvent<Shoplist, Integer> e) {
                        ((Shoplist)e.getTableView().getItems().get(e.getTablePosition().getRow())).setSize(e.getNewValue());
                    }
                });
        Cprice.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Shoplist, Integer>>(){
            @Override
            public void handle(TableColumn.CellEditEvent<Shoplist, Integer> e) {
                ((Shoplist)e.getTableView().getItems().get(e.getTablePosition().getRow())).setPrice(e.getNewValue());
            }
        });
    }

    @FXML
    protected void sort() {
        if(!CollectsData.isEmpty()) {
            table.getSortOrder().addAll(Csize);
            info.setText("Одежда отсортирована");
        }
        else info.setText("Таблица пустая");
    }

    @FXML
    protected void search() {
        table.setItems(CollectsData);
        ObservableList<Shoplist> name=FXCollections.observableArrayList();
        if (!CollectsData.isEmpty()) {
            for (int i = 0; i<CollectsData.size();i++) {
                if (Cname.getCellData(i).equals(find.getText())) {
                    name.add(CollectsData.get(i));
                }
            }
        } else info.setText("Таблица пустая");
        if (!name.isEmpty()) {
            table.setItems(name);
            reset.setDisable(false);
        }
        else info.setText("Такое наименование не найдено");
    }

    @FXML
    protected void reset() {
        table.setItems(CollectsData);
        find.setText(null);
        reset.setDisable(true);
    }
}

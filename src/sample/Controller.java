package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {


    //getAllProducts
    public ObservableList<Product> getProduct() {
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Glat"));
        return products;

    }

    //Таблица TreeTableView
    @FXML
    private TreeTableView<String> tableColumn;

    //Колонка в TreeTableView
    @FXML
    private TreeTableColumn<String, String> humansColumn1;

    //Удаление пользователей
    @FXML
    void addButtonCliked(ActionEvent event) {
        if (root.getChildren().remove(child1)) {
            System.out.println("Пользователь " + child1 + " Удален ");
        } else if (root.getChildren().remove(child2)) {
            System.out.println("Пользователь " + child2 + " Удален ");
        } else if (root.getChildren().remove(child3)) ;

        {
            System.out.println("Пользователь " + child3 + " Удален ");
        }

    }

    //Создание нового User'a
    public void createNewUser() {

        TreeItem<String> child = new TreeItem<>("Петя");
        TreeItem<String> age4 = new TreeItem<>("Age");
        TreeItem<String> birtday4 = new TreeItem<>("Birtday");
        root.getChildren().setAll(child, child1, child2, child3);
        child.getChildren().setAll(age4, birtday4);


    }


    //дети(после реализация родителей)
    TreeItem<String> child1 = new TreeItem<>("Жора");
    TreeItem<String> child2 = new TreeItem<>("Миша");
    TreeItem<String> child3 = new TreeItem<>("Аня");

    //Age в него входит само поле Возраст
    TreeItem<String> age1 = new TreeItem<>("Age");
    TreeItem<String> age2 = new TreeItem<>("Age");
    TreeItem<String> age3 = new TreeItem<>("Age");
    TreeItem<String> sub_age1 = new TreeItem<>("20");
    TreeItem<String> sub_age2 = new TreeItem<>("30");
    TreeItem<String> sub_age3 = new TreeItem<>("40");


    //Дата рождения в него входит сама дата рож.
    TreeItem<String> birthday1 = new TreeItem<>("Birthday");
    TreeItem<String> birthday2 = new TreeItem<>("Birthday");
    TreeItem<String> birthday3 = new TreeItem<>("Birthday");
    TreeItem<String> sub_birthday1 = new TreeItem<>("24/07/1998");
    TreeItem<String> sub_birthday2 = new TreeItem<>("31/03/1988");
    TreeItem<String> sub_birthday3 = new TreeItem<>("30/09/1978");

    //родители
    TreeItem<String> root = new TreeItem<>("Name");


    @Override
    public void initialize(URL url, ResourceBundle bd) {
        root.getChildren().setAll(child1, child2, child3);
        child1.getChildren().setAll(age1, birthday1);
        child2.getChildren().setAll(age2, birthday2);
        child3.getChildren().setAll(age3, birthday3);
        age1.getChildren().setAll(sub_age1);
        age2.getChildren().setAll(sub_age2);
        age3.getChildren().setAll(sub_age3);
        birthday1.getChildren().setAll(sub_birthday1);
        birthday2.getChildren().setAll(sub_birthday2);
        birthday3.getChildren().setAll(sub_birthday3);


        humansColumn1.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getValue()));
        tableColumn.setRoot(root);

    }


}
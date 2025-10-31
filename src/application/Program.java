package application;

import model.entities.Deparment;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Deparment obj = new Deparment(1, "Books");

        Seller seller = new Seller(21, "John","john@gmail.com", new Date(), 3000.0, obj);

        System.out.println(seller.toString());




    }
}
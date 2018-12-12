package main;

import Cart.Cart;
import Cart.DiscoutDecorator;
import Cart.OnlineCart;
import Payment.CCard;
import Payment.Cash;
import Payment.Context;
import java.util.Scanner;


public class FlowerShop {
    public static void main(String[] args) {
        FlowerBucket bucket = new FlowerBucket();
        Scanner scanner = new Scanner( System.in );

        while(true) {
            System.out.println("What flower to add?" +
                    "Print:\n" +
                    "r for Rose\n" +
                    "t for Tulip\n" +
                    "c for Chamomile\n" +
                    "f for finish");
            String input = scanner.nextLine();
            if (input.equals("r")) {
                bucket.addFlower(new Rose(12,"Blue",
                        35, "Smooth", "Spain", false));
            }
            else if (input.equals("t")) {
                bucket.addFlower(new Tulip(5,"Blue",
                        20, "Smooth", "Netherlands", false));            }
            else if (input.equals("c")) {
                bucket.addFlower(new Chamomile(2,"Blue",
                        5, "Smooth", "Poland", true));            }

            else {
                break;
            }
        }


        System.out.println(bucket.toString());
        Cart cart = new DiscoutDecorator(new OnlineCart());

        double discount = 0.95;
        cart.proceed(bucket, discount);
        System.out.println("Paying by cah or card?: ");
        String input = scanner.nextLine();
        Pay(input, bucket.getPrice());
    }

    public static void Pay(String way, double amount){
        if(way.equals("cash")){
            Context context = new Context(new Cash());
            context.executeStrategy(amount);
        }else if(way.equals("ccard")){
            Context context = new Context(new CCard());
            context.executeStrategy(amount);
        }
    }
}

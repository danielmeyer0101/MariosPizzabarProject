import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Product productList = new Product();

        Product vesuvio = new Product(1, 57);
        Product amerikaner = new Product(2, 53);
        Product cacciatore = new Product(3, 57);
        Product carbona = new Product(4,63);
        Product dennis = new  Product(5, 65);
        Product bertil = new Product(6, 57);
        Product silvia = new Product(7, 61);
        Product victoria = new Product(8,61);
        Product toronto = new Product(9,61);
        Product capricciosa = new Product(10,61);
        Product hawaii = new Product(11,61);
        Product le_Blissola = new Product(12,61);
        Product venezia = new Product(13,61);
        Product mafia = new Product(14,61);
        Product margherita = new Product(15,56);
        Product kartoffel = new Product(16,67);
        Product italinano = new Product(17,64);
        Product speciale = new Product(18,70);
        Product parken = new Product(19,62);
        Product kebab = new Product(20,64);
        Product venezio = new Product(21,65);
        Product forte = new Product(22,67);
        Product carne = new Product(23,71);
        Product picante = new Product(24,68);
        Product amor = new Product(25,67);
        Product mario_Special = new Product(26,73);
        Product antonelli = new Product(27,65);
        Product nørrebro = new Product(28,62);
        Product vegetare = new Product(29,64);
        Product filip = new Product(30,66);

        productList.addProduct(vesuvio);
        productList.addProduct(amerikaner);
        productList.addProduct(cacciatore);

        productList.showProductlist();

        productList.getProduct(0).showProductInformation();

        productList.getProduct(1).showProductInformation();

        boolean programmetSkalKøre = true;

        while (programmetSkalKøre) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("1: Vis menu ");
            System.out.println("2: Opret ordre/bestilling ");
            System.out.println("3: Vis ordreoversigt/bestillingsliste ");
            System.out.println("4:... ");
            System.out.println("5:...");
            System.out.println("6: Afslut programmet");
            System.out.println("Vælg funktion:");

            int brugerValg = scanner.nextInt();

            if (brugerValg == 2) {

                System.out.println("Indtast antallet af produktet");
                int quantityOfProduct = scanner.nextInt();

                scanner.nextLine();

                System.out.println("Indtast nummeret på produktet");

                int productInput = scanner.nextInt();

                Order ordreLinie = new Order(quantityOfProduct, productList.getProduct(productInput));


            }

            else if (brugerValg == 3) {
            }

            else if (brugerValg == 6) {
                programmetSkalKøre = false;
            }
        }
        System.out.println("Programmet er afsluttet");



    }
}

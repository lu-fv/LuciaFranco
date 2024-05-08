import INTERRFACES.SpecialDiscount;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Desk> desks = getDeskList();
        showDesk();
        List<Chairs> chairs = getChairList();
        showChairs();
        List<Printer> printers = getPrinterList();
        showPrinters();
        List<Notebooks> notebooks = getNotebookList();
        showNotebooks();



    }

    private static List<Desk> getDeskList() {
        List<Desk> desks = new ArrayList<Desk>();

        Desk desk1 = new Desk(5, 500f, "Desk1", 0.5f, 0.8f);
        Desk desk2 = new Desk(5, 600f, "Desk2", 0.4f, 0.9f);
        Desk desk3 = new Desk(5, 400f, "Desk3", 0.6f, 0.7f);

        desks.add(desk1);
        desks.add(desk2);
        desks.add(desk3);

        return desks;
    }

    public static void showDesk() {
        getDeskList().forEach(System.out::println);
    }

    private static List<Chairs> getChairList() {
        List<Chairs> chairs = new ArrayList<Chairs>();

        Chairs chairs1 = new Chairs(6, 200f, "Chair1", 3);
        Chairs chairs2 = new Chairs(6, 150f, "Chair2", 2);
        Chairs chairs3 = new Chairs(6, 100f, "Chair3", 0);

        chairs.add(chairs1);
        chairs.add(chairs2);
        chairs.add(chairs3);

        return chairs;
    }

    public static void showChairs() {
        getChairList().forEach(System.out::println);
    }

    private static List<Printer> getPrinterList() {
        List<Printer> printers = new ArrayList<Printer>();

        Printer printer1 = new Printer(5, 220f, "Printer1", "Lexmark", 20);
        Printer printer2 = new Printer(5, 260f, "Printer2", "Ricoh", 40);
        Printer printer3 = new Printer(5, 280f, "Printer1", "Epson", 60);

        printers.add(printer1);
        printers.add(printer2);
        printers.add(printer3);

        return printers;
    }

    public static void showPrinters() {
        getPrinterList().forEach(System.out::println);
    }

    private static List<Notebooks> getNotebookList() {
        List<Notebooks> notebooks = new ArrayList<Notebooks>();

        Notebooks notebooks1 = new Notebooks(7, 1000f, "Notebook1", "Lenovo", 32);
        Notebooks notebooks2 = new Notebooks(7, 1500f, "Notebook2", "HP", 64);
        Notebooks notebooks3 = new Notebooks(7, 2000f, "Notebook3", "Smsung", 128);

        notebooks.add(notebooks1);
        notebooks.add(notebooks2);
        notebooks.add(notebooks3);

        return notebooks;
    }

    public static void showNotebooks() {
        getNotebookList().forEach(System.out::println);
    }
}
package grigorykhakov.modificators;

public class Printer
{
    private Integer printerNumber;
    private String PrinterModel = "Epson";

    public Printer(Integer number)
    {
        printerNumber = number;
    }


    public void printDocument(String text)
    {
        System.out.println("Printer " + printerNumber);
        System.out.println("Printer Model " + PrinterModel);
        System.out.println(text);
        System.out.println("====");
    }

    public String getSupportedMediaType()
    {
        return "String";
    }
}

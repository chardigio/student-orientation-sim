package studentOrientation.attributes;

public interface Cost {
    // CampusTour
    public static double busRide = 2;
    public static double onFoot = 0.10;

    // BookStore
    public static double mandoBooks = 200;
    public static double buBookStore = mandoBooks * 1.05;

    // DormSelector
    public static double standOutside = 10;
    public static double gamingContest = standOutside * 1.02;

    // Registration
    public static double registrar = computerLab * 0.97;
    public static double computerLab = 150;
}
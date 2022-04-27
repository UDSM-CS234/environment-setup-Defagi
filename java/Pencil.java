public class Pencil{
    String color;
    double length;
    double price;

    Pencil (String col, double len, double pri){
        color= col;
        length= len;
        price= pri;
    }
    public void display(){
        System.out.println("the color is:" +color);
        System.out.println("the length is:" +length);
        System.out.println("the price is:" +price );

    }
    public static void main(String[] args) {
        Pencil P1 = new Pencil("Red",12.3,500.00);
        Pencil P2 = new Pencil("black",12.5,700.00);
        P2.display();
        P1.display();


        
    }


}
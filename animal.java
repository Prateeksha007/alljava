package all;
    class animalsuper {
       String color = "white";
    }
    class dog extends animalsuper{
       String color = "Black";
       void print()
       {
           System.out.println(color);
           System.out.println(super.color);
       }
       
    }
    public class animal{
       public static void main(String[] args) {
           dog d = new dog();
           d.print();
       }
    }
    
    


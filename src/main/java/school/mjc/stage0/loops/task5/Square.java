package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for(int i = 1; i <= sideLength; i++){
            for (int j = 1; j < sideLength; j++){
                if(j == 1){
                    System.out.print("8");
                } else if(i==1 || i==sideLength){
                    System.out.print("8");
                }else {
                    System.out.print(" ");
                }
                           }
            System.out.println("8");
        }

    }

    public static void main(String[] args) {
        Square sqr = new Square();
        sqr.printSquareFrom8s(4);
    }
}

package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {

        for(int i = 1; i <= sideLength; i++){
            for (int j = 1; j < sideLength; j++){
                if(j == 1 && i==sideLength/2+1){
                    System.out.print("8");
                } else if( i==sideLength/2+1){
                    System.out.print("8");
                }else if(j==(sideLength+1)/2) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }

            if( i==sideLength/2+1){
                System.out.println("8");
            }else {
                System.out.println(" ");
            }
        }

    }

    public static void main(String[] args) {
        Cross crss = new Cross();
        crss.printCross(7);
    }


}

package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        /*for(int i = 1; i <= cathetusLength; i++){
            for (int  j = 1; j <= cathetusLength * 2 - 1; j++){
                if(j <= cathetusLength - i || j >= cathetusLength + i)
                    System.out.print(" ");
                else
                    System.out.print(i);
            }
            System.out.println();
        }*/
        for (int i = 1; i <= cathetusLength; i++) {

            for (int j = 1; j <= cathetusLength - i; j++)
                System.out.print(" ");

            for (int k = i; k >= 1; k--)
                System.out.print(k);

            for (int k = 2; k <=i; k++)
                System.out.print(k);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }
}

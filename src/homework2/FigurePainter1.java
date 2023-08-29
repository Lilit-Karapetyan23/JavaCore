package homework2;

public class FigurePainter1 {
    public static void main(String[] args) {
        for (int i = 0; i<5; i++){
            for (int j = 3; j >= i; j--){
                System.out.println(" ");
            }
            for (int x = 0; x<= i; x++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
}

public class Q6 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Q6 <N>");
            return;
        }
        int N;
        try {
            N = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Le paramètre doit être un entier.");
            return;
        }
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}

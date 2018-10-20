public class DessertShoppe {
        public static final float taxRate = (float)0.065;
        public static final int maxNameSize = 20;
        public static final int maxDisWidth = 50;
        public static final String shopname = "M & M Dessert Shoppe";
        public static String cents2dollarsAndCents(int cents) {
            double total = cents/ 100.0;
            String out = String.format("%.2f", total);
            // 0.77 -> .77
            if (total < 1.0){
                return out.substring(1);
            }else{
                return out;
            }
        }
}

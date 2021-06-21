public class Main {

    public static void main(String[] args) {

//        String str = null; // result: e
//        String str = ""; // result: e
//        String str = "  AD  legal %^& \n  Before IMAGE   "; // result: ad_legal_before_image
//        String str = " 1ad Find ONE"; // result: e
//        String str = "1 ad Find ONE"; // result: e
//        String str = "ad Find ONE 1"; // result: e
//        String str = "ad Find ONE 1a"; // result: e
//        String str = "123 456 11"; // result: e
        ///////////////////
        String str = "BOB loves-coding"; // result: bob_loves_coding
//        String str = "cats AND*Dogs-are Awesome"; // result: cats_and_dogs_are_awesome
//        String str = "a b c d-e-f%g"; // result: a_b_c_d_e_f_g

        try {
            System.out.println(snakeCase(str));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String snakeCase(String str) throws NullPointerException, IllegalArgumentException {
        if (str == null) {
            throw new NumberFormatException("Illegal argument: null");
        }
        if (str == "") {
            throw new IllegalArgumentException("Illegal argument: empty string");
        }
        String temp = str.replaceAll("\\d", "");
        if (temp.length() < str.length()) {
            throw new IllegalArgumentException("Illegal argument: numbers present");
        }

        String properSnakeCaseFormat = "";
        properSnakeCaseFormat = str.trim()
                .replaceAll("\\s+", "_")
                .replaceAll("\\t+", "_")
                .replaceAll("\\n+", "-")
                .replaceAll("\\p{Punct}", "_")
                .replaceAll("_+", "_")
                .toLowerCase();

        return properSnakeCaseFormat;
    }
}

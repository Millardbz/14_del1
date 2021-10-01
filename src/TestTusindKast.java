public class TestTusindKast {

        public static void main(String[] args) {
            int die1;
            int die2;
            int one = 0;
            int two = 0;
            int three = 0;
            int four = 0;
            int five = 0;
            int six = 0;
            int seven = 0;
            int eight = 0;
            int nine = 0;
            int ten = 0;
            int eleven = 0;
            int twelve = 0;

            int rolls = 0;

            while (rolls < 1000) {
                rolls++;
                die1 = (int) (Math.random() * 6 + 1);
                die2 = (int) (Math.random() * 6 + 1);

                if (die1 == 1) {
                    one++;}

                if (die1 == 2) {
                    two++;}

                if (die1 == 3) {
                    three++;}

                if (die1 == 4) {
                    four++;}

                if (die1 == 5) {
                    five++;}

                if (die1 == 6) {
                    six++;}

                if (die2 == 1) {
                    seven++;}

                if (die2 == 2) {
                    eight++;}

                if (die2 == 3) {
                    nine++;}

                if (die2 == 4) {
                    ten++;}

                if (die2 == 5) {
                    eleven++;}

                if (die2 == 6) {
                    twelve++;}

            }
            System.out.println("After 1000 rolls there were:");
            System.out.println(one + " ones");
            System.out.println(two + " twos");
            System.out.println(three + " threes");
            System.out.println(four + " fours");
            System.out.println(five + " fives");
            System.out.println(six + " sixes");
            System.out.println(seven + " sevens");
            System.out.println(eight + " eights");
            System.out.println(nine + " nines");
            System.out.println(ten + " tens");
            System.out.println(eleven + " elevens");
            System.out.println(twelve + " twelves");

        }
    }

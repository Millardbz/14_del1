public class TestAfSum {

    public static void main(String[] args){

        int die1, die2, sum, rolls = 0;
        int sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0,sum6 = 0;
        int sum7 = 0, sum8 = 0, sum9 = 0, sum10 = 0, sum11 = 0, sum12 = 0;

        while (rolls < 1000){
            rolls++;

            die1 = (int) (Math.random() * 6 + 1);
            die2 = (int) (Math.random() * 6 + 1);

            sum = die1 + die2;

            switch (sum) {
                case 2 -> sum2++;
                case 3 -> sum3++;
                case 4 -> sum4++;
                case 5 -> sum5++;
                case 6 -> sum6++;
                case 7 -> sum7++;
                case 8 -> sum8++;
                case 9 -> sum9++;
                case 10 -> sum10++;
                case 11 -> sum11++;
                case 12 -> sum12++;
            }

        }

        System.out.println("Sum af 2: " + sum2);
        System.out.println("Sum af 3: " + sum3);
        System.out.println("Sum af 4: " + sum4);
        System.out.println("Sum af 5: " + sum5);
        System.out.println("Sum af 6: " + sum6);
        System.out.println("Sum af 7: " + sum7);
        System.out.println("Sum af 8: " + sum8);
        System.out.println("Sum af 9: " + sum9);
        System.out.println("Sum af 10: " + sum10);
        System.out.println("Sum af 11: " + sum11);
        System.out.println("Sum af 12: " + sum12);



    }
}

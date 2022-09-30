
        public class Main {
            public static void main(String[] args) {
                // Массивы.Часть 2.Домашнее задание 1.
                // Задание 1.
                System.out.println("Домашнее задание 1");
                System.out.println("Задание 1");
                int[] dailyExpenses = new int[30];
                int sum = 0;
                dailyExpenses[0] = 100_000;
                dailyExpenses[1] = 110_000;
                dailyExpenses[2] = 105_000;
                dailyExpenses[3] = 105_505;
                dailyExpenses[4] = 120_000;
                dailyExpenses[5] = 113_600;
                dailyExpenses[6] = 117_672;
                dailyExpenses[7] = 112_569;
                dailyExpenses[8] = 114_562;
                dailyExpenses[9] = 190_002;
                dailyExpenses[10] = 200_000;
                dailyExpenses[11] = 181_301;
                dailyExpenses[12] = 179_537;
                dailyExpenses[13] = 199_002;
                dailyExpenses[14] = 119_500;
                dailyExpenses[15] = 189_154;
                dailyExpenses[16] = 174_621;
                dailyExpenses[17] = 166_890;
                dailyExpenses[18] = 132_111;
                dailyExpenses[19] = 147_681;
                dailyExpenses[20] = 115_261;
                dailyExpenses[21] = 199_123;
                dailyExpenses[22] = 113_999;
                dailyExpenses[23] = 117_099;
                dailyExpenses[24] = 145_235;
                dailyExpenses[25] = 156_332;
                dailyExpenses[26] = 156_991;
                dailyExpenses[27] = 117_338;
                dailyExpenses[28] = 161_999;
                dailyExpenses[29] = 185_098;


                for (int i = 0; i < dailyExpenses.length; i++){
                    sum = dailyExpenses[i] + sum;
                }
                System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
                // Задание 2
                System.out.println("Задание 2");
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for(int i = 0; i < dailyExpenses.length; i++) {
                    if(dailyExpenses[i]> max) {
                        max = dailyExpenses[i];
                    }
                    if(dailyExpenses[i] < min ) {
                        min = dailyExpenses[i];
                    }
                }
                System.out.println("Минимальная сумма трат за день составила " + min +" рублей. " +
                        "Максимальная сумма трат за день составила " + max + " рублей.");
                // Задание 3
                System.out.println("Задание 3");
                double middleSum = 0;
                middleSum = sum / 30;
                System.out.println("Средняя сумма трат за месяц составила " + middleSum + " рублей в день.");

                // Задание 4
                System.out.println("Задание 4");
                char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                for (int i = reverseFullName.length - 1; i >= 0; i--) {
                    System.out.print(reverseFullName[i]);

                }
            }



        }





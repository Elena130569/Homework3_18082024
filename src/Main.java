public class Main {
    public static void main(String[] args) {
        int x = 850;
        System.out.println("Значение переменной " + x + " с типом " + " int " + " равно " + 850);
        byte y = 67;
        System.out.println("Значение переменной " + y + " с типом " + " byte " + " равно " + 67);
        short z = 29;
        System.out.println("Значение переменной " + z + " с типом " + " short " + " равно " + 29);
        long q = 11432L;
        System.out.println("Значение переменной " + q + " с типом " + " long " + " равно " + 11432L);
        float p = 22.345f;
        System.out.println("Значение переменной " + p + " с типом " + " float " + " равно " + 22.345f);
        double s = 163.765;
        System.out.println("Значение переменной " + s + " с типом " + " double " + " равно " + 163.765);

        double a = 27.12;
        System.out.println("Значение переменной " + a + " инициализируется как тип " + " double");
        long b = 987678965549L;
        System.out.println("Значение переменной " + b + " инициализируется как тип " + " long");
        float c = 2.786f;
        System.out.println("Значение переменной " + c + " инициализируется как тип " + " float");
        short d = 569;
        System.out.println("Значение переменной " + d + " инициализируется как тип " + " short");
        int e = -159;
        System.out.println("Значение переменной " + e + " инициализируется как тип " + " int");
        int g = 27897;
        System.out.println("Значение переменной " + g + " инициализируется как тип " + " int");
        byte h = 67;
        System.out.println("Значение переменной " + h + " инициализируется как тип " + " byte");

        short teacher1 = 23;
        short teacher2 = 27;
        short teacher3 = 30;
        int numberListPaper = 480 / (teacher1 + teacher2 + teacher3);
        System.out.println("На каждого ученика рассчитано " + numberListPaper + " листов бумаги ");

        int numberBottle = 16;
        int durationTime = 2;
        int performanceMachine = numberBottle / durationTime;
        int durationTime1 = 20;
        int numberBottle1 = performanceMachine * durationTime1;
        System.out.println("За " + durationTime1 + " минут машина произвела " + numberBottle1 + " штук бутылок");
        int durationTime2 = 1;
        int numberBottle2 = (performanceMachine * durationTime2) * 24 * 60 * 60;
        System.out.println("За " + durationTime2 + " сутки машина произвела " + numberBottle2 + " штук бутылок");
        int durationTime3 = 3;
        int numberBottle3 = (performanceMachine * durationTime3) * 24 * 60 * 60 * 3;
        System.out.println("За " + durationTime3 + " дня машина произвела " + numberBottle3 + " штук бутылок");
        int durationTime4 = 1;
        int numberBottle4 = (performanceMachine * durationTime2) * 24 * 60 * 60 * 30;
        System.out.println("За " + durationTime4 + " месяц машина произвела " + numberBottle4 + " штук бутылок");

        byte canPaintBrown = 4;
        byte canPaintWhite = 2;
        int canPaintSum = canPaintBrown + canPaintWhite;
        int classes = 120 / canPaintSum;
        int numberCanPaintBrown = classes * 4;
        int numberCanPaintWhite = classes * 2;
        System.out.println("В школе, где " + classes + " классов, нужно " + numberCanPaintWhite + " банок белой краски и " + numberCanPaintBrown + " банок коричневой краски ");

        short banana = 5;
        int weightBananaGram = banana * 80;
        short milk = 200;
        int weightMilkGram = milk / 100 * 105;
        short iceCream = 2;
        int weightIceCreamGram = iceCream * 100;
        short egg = 4;
        int weightEggGram = egg * 70;
        int weightCocktailGram = weightBananaGram + weightMilkGram + weightIceCreamGram + weightEggGram;
        float weightCocktailKiloGram = (float) (weightCocktailGram / 1000);
        System.out.println("Вес коктейля для спортсменов - " + weightCocktailGram + " (в г) и " + weightCocktailKiloGram + " (в кг)");

        int weightExcessKiloGram = 7;
        int weightExcessGram = weightExcessKiloGram * 1000;
        int weightLess1Gram = 250;
        int weightLess2Gram = 500;
        int days1 = weightExcessGram / weightLess1Gram;
        int days2 = weightExcessGram / weightLess2Gram;
        int daysAverageValue = (days1 + days2) / 2;
        System.out.println(days1 + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + weightLess1Gram + " г в день ");
        System.out.println(days2 + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + weightLess2Gram + " г в день ");
        System.out.println(daysAverageValue + " дней в среднем уйдет на похудение, если спортсмен будет терять каждый день от " + weightLess1Gram + " до " + weightLess2Gram + " г в день ");

        int salaryMasha1 = 67760;
        int salaryDenis1 = 83690;
        int salaryKristina1 = 76230;
        int salaryMasha2 = (salaryMasha1 / 100 * 10) + salaryMasha1;
        int salaryDenis2 = (salaryDenis1 / 100 * 10) + salaryDenis1;
        int salaryKristina2 = (salaryKristina1 / 100 * 10) + salaryKristina1;
        int salaryAnnualMasha1 = salaryMasha1 * 12;
        int salaryAnnualDenis1 = salaryDenis1 * 12;
        int salaryAnnualKristina1 = salaryKristina1 * 12;
        int salaryAnnualMasha2 = salaryMasha2 * 12;
        int salaryAnnualDenis2 = salaryDenis2 * 12;
        int salaryAnnualKristina2 = salaryKristina2 * 12;
        int deltaMasha = salaryAnnualMasha2 - salaryAnnualMasha1;
        int deltaDenis = salaryAnnualDenis2 - salaryAnnualDenis1;
        int deltaKristina = salaryAnnualKristina2 - salaryAnnualKristina1;
        System.out.println("Маша теперь получает " + salaryMasha2 + " рублей. Годовой доход вырос на " + deltaMasha + " рублей ");
        System.out.println("Денис теперь получает " + salaryDenis2 + " рублей. Годовой доход вырос на " + deltaDenis + " рублей ");
        System.out.println("Кристина теперь получает " + salaryKristina2 + " рублей. Годовой доход вырос на " + deltaKristina + " рублей ");}
}
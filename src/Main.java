public class Main {
    public static void main(String[] args) {

        var a = 1;
        byte b = 2;
        short c = 3;
        int d = 4;
        long e = 5L;
        float f = 6.1f;
        double g = 7.1d;
        char h = 12;
        char i = '!';
        boolean j = true;

        float weightFirstBoxer = 78.2f;
        float weightSecondBoxer = 82.7f;
        float totalWeightBoxers = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес двух боксеров " + totalWeightBoxers + ( "кг."));

        float differenceWeightBoxers = weightSecondBoxer % weightFirstBoxer ;
        System.out.println("Разница в весе двух боксеров " + differenceWeightBoxers + " кг.");

        int bananaGram = 80;
        int milkGram = 105;
        int iceCreamGram = 100;
        int eggGram = 70;
       int allBananasGram = bananaGram * 5;
       int allMilkGram = milkGram * 2;
       int allIceCreamGram = iceCreamGram * 2;
       int allEggsGram = eggGram * 4;
       int atletesBreakfastGram = allBananasGram + allMilkGram + allIceCreamGram + allEggsGram;
       float atletesBreakfastKilogram = atletesBreakfastGram / 1000f;
       System.out.println("Завтрак спортсмена " + atletesBreakfastKilogram + " кг.");

       int loseWeightKilogram = 7;
       int loseWeightGram = loseWeightKilogram * 1000;
       int oneDiet = 250;
       int daysOneDiet = loseWeightGram / oneDiet;
       int twoDiet = 500;
       int daysTwoDiet = loseWeightGram / twoDiet;
       System.out.println(daysOneDiet + " дней.");
        System.out.println(daysTwoDiet + " дней.");
        int averageDaysDiet = (daysOneDiet + daysTwoDiet) /2;
        System.out.println("В среднем потребуется " + averageDaysDiet + " день.");

        float everyYearRise = 0.1f;
       int salaryMaria = 67_760;
        int salaryDenis = 83_690;
        int salaryCristine = 76_230;
        float newSalaryMaria = salaryMaria * everyYearRise + salaryMaria;
        float newSalaryDenis = salaryDenis * everyYearRise + salaryDenis;
        float newSalaryCristine = salaryCristine * everyYearRise + salaryCristine;
        int year = 12;
        int annualIncomeMaria = salaryMaria * year;
        int annualIncomeDenis = salaryDenis * year;
        int annualIncomeCristine = salaryCristine * year;
        float newAnnualIncomeMaria = newSalaryMaria * year;
        float newAnnualIncomeDenis = newSalaryDenis * year;
        float newAnnualIncomeCristine = newSalaryCristine * year;
        float differenceMaria = newAnnualIncomeMaria - annualIncomeMaria;
        float differenceDenis = newAnnualIncomeDenis - annualIncomeDenis;
        float differenceCristine = newAnnualIncomeCristine - annualIncomeCristine;
        System.out.println("Маша теперь получает " + newSalaryMaria + " рублей." + " Годовой доход вырос на " + differenceMaria + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей." + " Годовой доход вырос на " + differenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryCristine + " рублей." + " Годовой доход вырос на " + differenceCristine + " рублей.");









    }
}
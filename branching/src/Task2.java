public class Task2 {
    public static void main(String[] args) {
        double money_per_year=656000;
        double tax_money;
        String name="Transport";

        switch(name){
            case "Transport":{
                if (money_per_year < 100000) {
                    tax_money = money_per_year * 0.09;
                    System.out.println("Налог на сумму " + money_per_year + " для отрасли " + name + " составляет " + tax_money + ". Это составляет 9% процентов");
                } else if (money_per_year >= 100000 && money_per_year <= 299999) {
                    tax_money = money_per_year * 0.13;
                    System.out.println("Налог на сумму " + money_per_year + " для отрасли " + name + " составляет " + tax_money + ". Это составляет 13% процентов");
                } else if (money_per_year > 300000) {
                    tax_money = money_per_year * 0.17;
                    System.out.println("Налог на сумму " + money_per_year + " для отрасли " + name + " составляет " + tax_money + ". Это составляет 17% процентов");
                }
                break;
            }
            case "Health": {
                if (money_per_year < 400000) {
                    tax_money = money_per_year * 0.07;
                    System.out.println("Налог на сумму " + money_per_year + " для отрасли " + name + " составляет " + tax_money + ". Это составляет 7% процентов");
                } else if (money_per_year >= 400000 && money_per_year <= 899999) {
                    tax_money = money_per_year * 0.12;
                    System.out.println("Налог на сумму " + money_per_year + " для отрасли " + name + " составляет " + tax_money + ". Это составляет 12% процентов");
                } else if (money_per_year > 900000) {
                    tax_money = money_per_year * 0.15;
                    System.out.println("Налог на сумму " + money_per_year + " для отрасли " + name + " составляет " + tax_money + ". Это составляет 15% процентов");
                }
                break;
            }
            case "Bank": {
                if (money_per_year < 250000) {
                    tax_money = money_per_year * 0.1;
                    System.out.println("Налог на сумму " + money_per_year + " для отрасли " + name + " составляет " + tax_money + ". Это составляет 10% процентов");
                } else if (money_per_year >= 250000 && money_per_year <= 499999) {
                    tax_money = money_per_year * 0.15;
                    System.out.println("Налог на сумму " + money_per_year + " для отрасли " + name + " составляет " + tax_money + ". Это составляет 15% процентов");
                } else if (money_per_year > 500000) {
                    tax_money = money_per_year * 0.18;
                    System.out.println("Налог на сумму " + money_per_year + " для отрасли " + name + " составляет " + tax_money + ". Это составляет 18% процентов");
                }
                break;
            }

        }

    }
}

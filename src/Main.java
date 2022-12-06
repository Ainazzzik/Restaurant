public class Main {
    public static void main(String[] args) {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~МЕНЮ~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Блюда : ");

        Food food1 = new Food("Суп",250,200);
        Food food2 = new Food("Манты",270,320);
        Food food3 = new Food("Паста",320,250);
        Food food4 = new Food("Лагман",280,300);


        System.out.println(food1);
        System.out.println(food2);
        System.out.println(food3);
        System.out.println(food4);

        System.out.println("---------------------------------------");
        System.out.println("Салаты : ");

        Salad salad1 = new Salad("Цезарь",270,200);
        Salad salad2 = new Salad("Свежий",160,180);
        Salad salad3 = new Salad("Оливье",250,200);
        Salad salad4 = new Salad("Греческий",290,230);

        System.out.println(salad1);
        System.out.println(salad2);
        System.out.println(salad3);
        System.out.println(salad4);

        System.out.println("---------------------------------------");


        System.out.println("Десерты : ");

        Desserts desserts1 = new Desserts("Фисташковый рулет",270,1);
        Desserts desserts2 = new Desserts("Медовое пироженое",180,1);
        Desserts desserts3 = new Desserts("Мороженое(шариковое)",150,1);
        Desserts desserts4 = new Desserts("Похлава",220,1);

        System.out.println(desserts1);
        System.out.println(desserts2);
        System.out.println(desserts3);
        System.out.println(desserts4);

        System.out.println("---------------------------------------");

        System.out.println("Напитки : ");

        Drinks drinks1 = new Drinks("Апельсиновый сок",200,1);
        Drinks drinks2 = new Drinks("Кока-кола",80,1);
        Drinks drinks3 = new Drinks("Пико",120,1);
        Drinks drinks4 = new Drinks("Фанта",80,1);

        System.out.println(drinks1);
        System.out.println(drinks2);
        System.out.println(drinks3);
        System.out.println(drinks4);
    }
}
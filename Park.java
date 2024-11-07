public class Park {
    private String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    public class Attraction {
        String name;
        String openingHours;
        int price;

        public Attraction(String name, String openingHours, int price) {
            this.name = name;
            this.openingHours = openingHours;
            this.price = price;
        }

        public void getAttractionInfo() {
            System.out.println("Аттракцион: " + name + ", Часы работы: " + openingHours + ", Цена: $" + price);
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Веселый парк");

        // Создаем аттракционы через внутренний класс
        Attraction attraction1 = park.new Attraction("Карусель", "09:00 - 21:00", 5);
        Attraction attraction2 = park.new Attraction("Комната страха", "17:00 - 01:00", 10);
        Attraction attraction3 = park.new Attraction("Американские горки", "09:00 - 21:00", 15);

        attraction1.getAttractionInfo();
        attraction2.getAttractionInfo();
        attraction3.getAttractionInfo();
    }
}

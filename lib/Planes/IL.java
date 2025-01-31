package Planes;

/**
 * Класс IL представляет самолет типа IL, наследующий основные характеристики от класса Plane.
 * Ограничения: максимальная вместимость — 1810 пассажиров, максимальная емкость топлива — 310.
 */
public class IL extends Plane {

    // Максимальное количество пассажиров для IL
    public static int maxPassengers = 1810;

    // Максимальное количество топлива для IL
    public static int maxFuel = 310;

    /**
     * Конструктор класса IL.
     * Инициализирует самолет с заданными названием, количеством топлива и пассажиров, 
     * проверяя их на соответствие ограничениям по максимальному топливу и пассажирам.
     * 
     * @param name название самолета
     * @param fuel количество топлива
     * @param passengers количество пассажиров
     */
    public IL(String name, int fuel, int passengers) {
        // Используем Math.min для предотвращения превышения максимальных значений топлива и пассажиров
        super(name, Math.min(fuel, maxFuel), Math.min(passengers, maxPassengers), maxFuel);

        // Выводим сообщение об ошибке, если заданные параметры превышают допустимые пределы
        if (fuel > maxFuel || passengers > maxPassengers) {
            System.out.println("Creation error: Exceeded max limits");
        } 
    }

    /**
     * Переопределенный метод для вывода информации о самолете.
     * Выводит название, количество топлива и пассажиров, а также указывает, что это IL.
     */
    @Override
    public void print() {
        System.out.printf("Name: %s \tfuel: %d\t passagers: %d\ntype: IL\n", 
                        super.getName(), super.getFuel(), super.getPassengers(), super.getMaxFuel());
    }
}
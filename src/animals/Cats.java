package animals;

public class Cats extends Аnimals {

    private static int numb;

    public Cats(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        numb++;
    }
    @Override
    public void runrun() {
        if (run <= 200) {
            System.out.println(name + " пробежал " + run + " метров... Что очень странно... Кот бежит по команде человека... Хммммм... Так или вы показываете паспорт с фамилией Куклачев или я вызываю инквизицию!!!");
        } else {
            System.out.println("Услышав СКОЛЬКО " + name + " должен пробежать, он не просто возмулился, а сделала немаленький такой кусь... на всю вашу руку... Ваш персонаж моментально потерял слишком много крови и пустыня поглатила его... тогда как война, война никогда не... А нет стоп это из другой игры... Ну, а вы продолжайте требовать от кота невозможного");
        }
    }
    @Override
    public void swimswim() {
            if(swim != 0) {
                System.out.println("Ой да при лебом значении Какое бы вы не ввели кот по имени " + name + " не поплывет... ОН КОТ... ");
            }
        }

    public static int counter() {
        return numb;
    }
}

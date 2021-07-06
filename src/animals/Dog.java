package animals;

public class Dog extends Аnimals {
    private static int numb;
    public Dog(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        numb++;
    }

    @Override
    public void runrun() {
        if (run <= 500) {
            System.out.println(name + " пробежал " + run + " метров");
        } else {
            System.out.println("Шибко много сказали бежать песику " + name + ". Будучи очень умной собакой и оценив обстановку, " +
                    "а также смерив вас взглядом полного собачъего призрения, " + name +
                    " издал один короткий Гааф что в переводе с собачьего означало: Сам столько беги... " +
                    "Нет, конечно он мог сказать еще много чего хозяину который заставляет его пробежать " + run +
                    " метров, но " + name + " был очень воспитанным песилем");
        }
    }
    public void swimswim(){
        if(swim<=10) {
            System.out.println("Собака " + name + " проплыла: " + swim);
        }
        else{
            System.out.println("Да вы его утопить удумали?! Люди добрыя что ж делатся то, А? Собаке " + swim + " метров сказали плыть... КАРРРАУЛЛЛ УТОПЛЯЮТ!!!");
        }
    }
    public static int counter() {
        return numb;
    }
}
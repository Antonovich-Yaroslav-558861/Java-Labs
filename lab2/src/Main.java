import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {

    public static void main(String[] args) {
        Battle battle = new Battle();

        Pokemon first = new Furfrou("Ярик", 48);
        Pokemon second = new Porygon2("Анфиса", 18);
        Pokemon third = new Pansage("Рома", 4);
        Pokemon fourth = new Simisage("Лиза", 1);
        Pokemon fifth = new Porygon("Вера", 18);
        Pokemon sixth = new PorygonZ("Леша", 18);

        Pokemon[] boys = {first, third, sixth};
        Pokemon[] girls = {second, fourth, fifth};

        for (Pokemon i: boys) {
            battle.addAlly(i);
        }

        for (Pokemon i: girls) {
            battle.addFoe(i);
        }

        battle.go();
    }
}

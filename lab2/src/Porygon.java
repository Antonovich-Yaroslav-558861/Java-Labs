import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Porygon extends Pokemon {

    public Porygon(String name, int level) {
        super(name, level);

        setStats(65, 60, 70, 85, 75, 40);
        setType(Type.NORMAL);
        setMove(new Blizzard(), new Recover());
    }
}

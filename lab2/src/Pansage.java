import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pansage extends Pokemon {

    public Pansage(String name, int level) {
        super(name, level);

        setType(Type.GRASS);
        setStats(50, 53, 48, 53, 48, 64);
        setMove(new WorkUp(), new Swagger(), new Leer());
    }
}

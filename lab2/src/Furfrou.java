import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Furfrou extends Pokemon {

    public Furfrou(String name, int level) {
        super(name, level);
    
        setType(Type.NORMAL);
        setStats(75, 80, 60, 65, 90, 102);
        setMove(new DoubleTeam(), new Facade(), new ThunderWave(), new CottonGuard());
    }
}

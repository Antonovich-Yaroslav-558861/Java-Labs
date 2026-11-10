import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public final class Recover extends StatusMove {
    public Recover() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon attacker, Pokemon defender) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        // getStat(HP) gives maximum HP; getHP() gives remaining HP.
        double maximumHP = pokemon.getStat(Stat.HP);
        double missingHP = Math.max(0, maximumHP - pokemon.getHP());

        // setMod accepts int; round down and never heal beyond maximum HP.
        int healing = (int) Math.floor(Math.min(maximumHP / 2, missingHP));
        if (healing > 0) {
            pokemon.setMod(Stat.HP, -healing);
        }
    }

    @Override
    protected String describe() {
        return "использует Recover";
    }
}


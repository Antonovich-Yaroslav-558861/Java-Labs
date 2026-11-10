import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public final class Facade extends PhysicalMove{

    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected double calcBaseDamage(Pokemon attacker, Pokemon defender) {
        Status condition = attacker.getCondition();

        if (condition == Status.BURN || condition == Status.PARALYZE || condition == Status.POISON) {
            this.power = 140;
        }
        else {
            this.power = 70;
        }

        return super.calcBaseDamage(attacker, defender);
    }

    @Override
    protected String describe() {
        return "Использует Facade";
    }
}

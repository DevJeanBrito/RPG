package rpgPastaPrincipal;

import java.util.List;
import java.util.Map;

public class Teste{
    Bioma floresta = new Bioma(
        "floresta",
        List.of("Goblin", "Slime")
    );

    Inimigo goblin = new Inimigo("Goblin", 100, 30, 0, "Floresta");
    goblin.aplicarBuffBioma(floresta);

    goblin.atacar();

}
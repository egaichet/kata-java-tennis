import static org.fest.assertions.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class testPartie {
     @Test
    public void afficherLeScoreDeDébutDePartie(){
         Partie unePartie = new Partie();
         String score = unePartie.score();
         assertThat(score).isEqualTo("0 - 0");
     }
}

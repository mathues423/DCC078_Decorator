package teste;

import main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PopUPInterfaceTest {

    @Test
    void deveRetornarPropaganda(){
        PopUPInterface propaganda = new Propaganda("TT");
        assertEquals("TT", propaganda.getADD_conteudo());
    }

    @Test
    void deveRetornarPropagandaDCC(){
        PopUPInterface propaganda = new Propaganda_DCC(new Propaganda("TT"), new PopUP(12,12));
        assertEquals("TT/Prop_DCC", propaganda.getADD_conteudo());
    }

    @Test
    void deveRetornarPropagandaDCE(){
        PopUPInterface propaganda = new Propaganda_DCE(new Propaganda("TT"), new PopUP(12,12));
        assertEquals("TT/Prop_DCE", propaganda.getADD_conteudo());
    }

    @Test
    void deveRetornarPropagandaDF(){
        PopUPInterface propaganda = new Propaganda_DF(new Propaganda("TT"), new PopUP(12,12));
        assertEquals("TT/Prop_DF", propaganda.getADD_conteudo());
    }

    @Test
    void deveRetornarPropagandaDCC_DCE(){
        PopUPInterface propaganda = new Propaganda_DCE(new Propaganda_DCC(new Propaganda("TT")), new PopUP(12,12));
        assertEquals("TT/Prop_DCC/Prop_DCE", propaganda.getADD_conteudo());
    }

    @Test
    void deveRetornarPropagandaDCC_DF(){
        PopUPInterface propaganda = new Propaganda_DF(new Propaganda_DCC(new Propaganda("TT")), new PopUP(12,12));
        assertEquals("TT/Prop_DCC/Prop_DF", propaganda.getADD_conteudo());
    }

    @Test
    void deveRetornarPropagandaDCE_DF(){
        PopUPInterface propaganda = new Propaganda_DF(new Propaganda_DCE(new Propaganda("TT")), new PopUP(12,12));
        assertEquals("TT/Prop_DCE/Prop_DF", propaganda.getADD_conteudo());
    }

    @Test
    void deveRetornarPropagandaDCC_DCE_DF(){
        PopUPInterface propaganda = new Propaganda_DF(new Propaganda_DCE(new Propaganda_DCC(new Propaganda("TT"))), new PopUP(12,12));
        assertEquals("TT/Prop_DCC/Prop_DCE/Prop_DF", propaganda.getADD_conteudo());
    }
}
package main;

public class Propaganda_DCC extends PopUPDecorator{


    public Propaganda_DCC(PopUPInterface inter,PopUP prop) {
        super(inter,prop);
    }

    public Propaganda_DCC(PopUPInterface inter) {
        super(inter);
    }
    @Override
    public String getConteudo() {
        return "Prop_DCC";
    }
}

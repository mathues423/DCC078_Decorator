package main;

public class Propaganda_DCE extends PopUPDecorator{
    public Propaganda_DCE(PopUPInterface inter,PopUP prop) {
        super(inter,prop);
    }
    public Propaganda_DCE(PopUPInterface inter) {
        super(inter);
    }
    @Override
    public String getConteudo() {
        return "Prop_DCE";
    }
}

package main;

public class Propaganda_DF extends PopUPDecorator{
    public Propaganda_DF(PopUPInterface inter, PopUP prop) {
        super(inter, prop);
    }
    public Propaganda_DF(PopUPInterface inter) {
        super(inter);
    }
    @Override
    public String getConteudo() {
        return "Prop_DF";
    }
}

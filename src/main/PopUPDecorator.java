package main;

public abstract class PopUPDecorator implements PopUPInterface{
    private PopUPInterface inter;
    public PopUP prop;

    public PopUPDecorator(PopUPInterface inter, PopUP prop) {
        this.inter = inter;
        this.prop = prop;
    }
    public PopUPDecorator(PopUPInterface inter) {
        this.inter = inter;
    }
    public PopUPInterface getInter() {
        return inter;
    }

    public void setInter(PopUPInterface inter) {
        this.inter = inter;
    }

    public abstract String getConteudo();

    public String getADD_conteudo(){
        return this.inter.getADD_conteudo()
                + "/" + this.getConteudo();
    }
}

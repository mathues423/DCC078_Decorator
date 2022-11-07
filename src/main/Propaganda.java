package main;

public class Propaganda implements PopUPInterface{
    public PopUP propaganda;
    private String conteudo;

    public Propaganda(String conteudo) {
        this.conteudo = conteudo;
    }

    public PopUP getPropaganda(){
        return propaganda;
    }

    @Override
    public String getADD_conteudo() {
        return conteudo;
    }
}

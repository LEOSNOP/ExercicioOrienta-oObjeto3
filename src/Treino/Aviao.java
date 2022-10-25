package Treino;

public class Aviao extends Transporte{
    private String codigo;

    public Aviao(){
        this.setMarca("Gol");
        this.setModelo("A321neo");
        this.setQuilometragem(60);
        this.setCapacidadeTanque(320);
        this.setCodigo("234532");
    }


    @Override
    public void mover(int km){
        this.setQuilometragem(this.getQuilometragem() + km);

        this.setCapacidadeTanque(this.getCapacidadeTanque() - 10);
        System.out.println("---------------");
        System.out.println("O aviao se move");
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Codigo: "+this.getCodigo());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}

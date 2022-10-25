package Treino;

public class Transporte {
    protected String marca;
    protected String modelo;
    protected int quilometragem;
    protected double capacidadeTanque;

    public Transporte(){
        this.setMarca("HONDA");
        this.setModelo("hb20");
        this.setQuilometragem(1);
        this.setCapacidadeTanque(40);

    }


    public void mover(int km) {

        this.setQuilometragem(this.getQuilometragem() + km);
        System.out.println("O transporte se move: " + this.getQuilometragem()+"km");
    }
    public void abastecer(double bstece){
        this.setCapacidadeTanque(this.getCapacidadeTanque()+bstece);
        System.out.println("-----------------------");
        System.out.println("abastecido: "+ this.getCapacidadeTanque() + "L");
    }



    public void exibir(){

        System.out.println("-------------------------------------");
        System.out.println("marca "+ this.getMarca());
        System.out.println("modelo "+this.getModelo());
        System.out.println("quilometragem: "+ this.getQuilometragem());
        System.out.println("tanque: "+this.getCapacidadeTanque()+ "L");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
}

package Treino;

public class Automovel extends Transporte {
    private String placa;

    public Automovel() {
        this.setMarca("Fiat");
        this.setModelo("Fiat Uno");
        this.setQuilometragem(40);
        this.setCapacidadeTanque(35);
        this.setPlaca("P2M46");
    }
    @Override
    public void mover(int km) {
        this.setQuilometragem(getQuilometragem() + km);
        if(km >=8){
            setCapacidadeTanque(getCapacidadeTanque()-1);
        }
        System.out.println("-------------------");
        System.out.println("o automovel se move");

    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Placa: "+this.getPlaca());
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}

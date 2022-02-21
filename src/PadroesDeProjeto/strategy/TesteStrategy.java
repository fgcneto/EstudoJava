package PadroesDeProjeto.strategy;

public class TesteStrategy {

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }

    public static void main(String[] args) {
        TesteStrategy robo = new TesteStrategy();
        CompornamentoNormal compornamentoNormal = new CompornamentoNormal();
        ComportamentoDefensivo comportamentoDefensivo = new ComportamentoDefensivo();
        ComportamentoOfensivo comportamentoOfensivo = new ComportamentoOfensivo();

        robo.setComportamento(comportamentoOfensivo);
        robo.mover();
        robo.setComportamento(comportamentoDefensivo);
        robo.mover();
        robo.setComportamento(compornamentoNormal);
        robo.mover();

    }
}

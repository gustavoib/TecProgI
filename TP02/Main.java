public class Main {
    public static void main(String[] args) {
        Mesa mesa = new MesaDePingPong(new MesaComToalha(new MesaComRodas(new MesaBasica())));
        mesa.decorarMesa();
    }
}
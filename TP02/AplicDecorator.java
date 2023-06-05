//componente
public abstract class Mesa  {
    abstract void decorarMesa();
}
//componente concreto
class  MesaBasica extends Mesa {
    void decorarMesa() {
        System.out.println("MESA BÁSICA");
    }
}
//decorator
abstract class Decorador extends Mesa {
    Mesa mesaDecorada;
    Decorador(Mesa mesaDecorada) {
        this.mesaDecorada = mesaDecorada;
    }
    void decorarMesa() {
        mesaDecorada.decorarMesa();
    }
}
//decorators concretos
class MesaComToalha extends Decorador {
    MesaComToalha(Mesa mesaDecorada) {
        super(mesaDecorada);
    }
    void decorarMesa() {
        super.decorarMesa();
        adicionarToalha();
    }
    void adicionarToalha() {
        System.out.println("MESA COM TOALHA");
    }
}
class MesaComRodas extends Decorador {
    MesaComRodas(Mesa mesaDecorada) {
        super(mesaDecorada);
    }
    void decorarMesa() {
        super.decorarMesa();
        adicionarRodas();
    }
    void adicionarRodas() {
        System.out.println("MESA COM RODAS");
    }
}
class MesaDePingPong extends Decorador {
    MesaDePingPong(Mesa mesaDecorada) {
        super(mesaDecorada);
    }
    void decorarMesa() {
        super.decorarMesa();
        adicionarRede();
    }
    void adicionarRede() {
        System.out.println("TIPO DE MESA: MESA COM REDE DE PING PONG");
    }
}

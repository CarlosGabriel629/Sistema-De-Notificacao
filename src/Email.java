public class Email implements Notificador {


    @Override
    public void EnviarMensagem(String mensagem) {
        IO.println("Enviando Email: " + IO.readln());
    }

    @Override
    public String toString() {
        return "Email{}";
    }
}

public class SMS implements Notificador{
    @Override
    public void EnviarMensagem(String mensagem) {
        IO.println("Enviando SMS: " + IO.readln() );

    }

    @Override
    public String toString() {
        return "SMS{}";
    }
}

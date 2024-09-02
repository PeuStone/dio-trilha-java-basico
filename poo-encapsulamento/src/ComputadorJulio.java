import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorJulio {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        /*
            Não se sabe qual app
            mas qualquer um deverá enviar e receber mensagem
         */

        String appEscolhido = "msn";

        if (appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}

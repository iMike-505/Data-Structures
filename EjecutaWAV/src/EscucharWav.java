
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class EscucharWav{
    public static void main(String[] args) {
        try {
        Clip sonido = AudioSystem.getClip();
        File a = new File(args[0]);
        sonido.open(AudioSystem.getAudioInputStream(a));
        sonido.start();
        System.out.println("Reproduciendo 10s. de sonido...");
        Thread.sleep(10000); // 10000 milisegundos (10 segundos)
        sonido.close();
        }
        catch (Exception tipoerror) {
        System.out.println("" + tipoerror);
        }
    }
}
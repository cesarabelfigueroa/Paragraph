package Core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JOptionPane;
import org.apache.commons.net.ftp.FTPClient;

public class FTPClientExample extends Thread {

    File file;
    int BufferSize = 512;

    public FTPClientExample(String url) {
        file = new File(url);
    }

    public void conect() {
        try {
            URL url = new URL("ftp://UsuarioOA%40webbpa.com:Seccion25@ftp.webbpa.com/" + file.getName());
            URLConnection conn = url.openConnection();
            OutputStream os = conn.getOutputStream();
            FileInputStream is = new FileInputStream(file);
            byte[] buffer = new byte[BufferSize];
            int BytesRead = -1;
            while ((BytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, BytesRead);
            }
            is.close();
            os.close();
            JOptionPane.showMessageDialog(null, "Se ha enviado el archivo");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }

    @Override
    public void run() {
        this.conect();
    }
}

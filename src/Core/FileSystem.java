package Core;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.namespace.QName;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "file")
public class FileSystem {

    private String name;
    private String date;
    private String directory;
    private int autor;
    private byte[] content;

    public FileSystem() {

    }

    public FileSystem(String name, String date, String directory, int autor, byte[] content) {
        this.name = name;
        this.date = date;
        this.directory = directory;
        this.autor = autor;
        this.content = content;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @XmlElement
    public String getDirectory() {
        return directory;
    }

    @XmlElement
    public int getAutor() {
        return autor;
    }

    public void setAutor(int autor) {
        this.autor = autor;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @XmlElement
    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String SerielizarXml() {
        StringWriter writer = new StringWriter();
        JAXBContext context;
        try {
            context = JAXBContext.newInstance(FileSystem.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(this, writer);
            return writer.toString();
        } catch (Exception ex) {
            Logger.getLogger(FileSystem.class.getName()).log(Level.SEVERE, null, ex);
            return ex.toString();
        }
    }

    public FileSystem DeserielizarXml(String Serial) {
        StringWriter writer = new StringWriter();
        FileSystem A1 = new FileSystem();
        JAXBContext context;
        try {
            context = JAXBContext.newInstance(FileSystem.class);
            Unmarshaller m = context.createUnmarshaller();
            return (FileSystem) m.unmarshal(new StringReader(Serial));
        } catch (JAXBException ex) {
            Logger.getLogger(FileSystem.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return A1;
        }
    }
}

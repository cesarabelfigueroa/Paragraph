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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileSystem {

    private String name;
    private String directory;
    private int autor;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    private ArrayList<Paragraph> paragraphs = new ArrayList();

    public FileSystem() {

    }

    public FileSystem(String name, String directory, int autor, int size) {
        this.name = name;
        this.directory = directory;
        this.autor = autor;
        this.size = size;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the directory
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * @return the autor
     */
    public int getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(int autor) {
        this.autor = autor;
    }

    /**
     * @param directory the directory to set
     */
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    /**
     * @return the paragraphs
     */
    public ArrayList<Paragraph> getParagraphs() {
        return paragraphs;
    }

    /**
     * @param paragraphs the date to set
     */
    public void setParagraphs(ArrayList<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("name:").append(name)
                .append(",directory:").append(directory)
                .append(",autor:").append(autor)
                .append(",paragraphs:").append(paragraphs)
                .toString();
    }

}

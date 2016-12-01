package Core;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class Paragraph   implements Serializable{
    
    private String content="";

    public Paragraph() {
    }
    
    public Paragraph(String content) {
       this.content = content;
    }
    
    @XmlElement
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
      
}
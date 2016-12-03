package Core;

import java.io.Serializable;

public class Paragraph implements Serializable {

    private String content = "";

    public Paragraph() {
    }

    public Paragraph(String content) {
        this.content = content;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("content:").append(content)
                .toString();
    }

}

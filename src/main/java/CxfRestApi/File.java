package CxfRestApi;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "File")
public class File {
    private Integer id;
    private String Name;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return Name;
    }
}

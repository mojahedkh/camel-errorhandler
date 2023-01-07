package CxfRestApi.beans;


import com.google.gson.annotations.SerializedName;

public class FileMoveRequest {
    @SerializedName("fileName")
    private String fileName;


    public FileMoveRequest() {

    }

    public FileMoveRequest(String fileName) {
        this.fileName = fileName;
    }


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }



    @Override
    public String toString() {
        return "FileMoveRequest{" +
                "fileName='" + fileName + '\'' +
                '}';
    }
}

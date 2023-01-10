
package CxfRestApi.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class FileMoveResponse {

    @SerializedName("responseCode")
    private String mResponseCode;
    @SerializedName("responseMessage")
    private String mResponseMessage;

    public String getResponseCode() {
        return mResponseCode;
    }
    public String getResponseMessage() {
        return mResponseMessage;
    }
    public void setmResponseCode(String mResponseCode) {
        this.mResponseCode = mResponseCode;
    }

    public void setmResponseMessage(String mResponseMessage) {
        this.mResponseMessage = mResponseMessage;
    }

    @Override
    public String toString() {
        return "FileMoveResponse{" +
                "mResponseCode='" + mResponseCode + '\'' +
                ", mResponseMessage='" + mResponseMessage + '\'' +
                '}';
    }
}

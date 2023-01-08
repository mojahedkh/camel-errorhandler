
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

    public static class Builder {

        private String mResponseCode;
        private String mResponseMessage;

        public FileMoveResponse.Builder withResponseCode(String responseCode) {
            mResponseCode = responseCode;
            return this;
        }

        public FileMoveResponse.Builder withResponseMessage(String responseMessage) {
            mResponseMessage = responseMessage;
            return this;
        }

        public FileMoveResponse build() {
            FileMoveResponse fileMoveResponse = new FileMoveResponse();
            fileMoveResponse.mResponseCode = mResponseCode;
            fileMoveResponse.mResponseMessage = mResponseMessage;
            return fileMoveResponse;
        }

    }

    @Override
    public String toString() {
        return "FileMoveResponse{" +
                "mResponseCode='" + mResponseCode + '\'' +
                ", mResponseMessage='" + mResponseMessage + '\'' +
                '}';
    }
}

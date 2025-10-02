package au.com.woolworths.android.onesite.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public class ApiError {

    @SerializedName("error")
    private String mError;

    @SerializedName("errorCode")
    private String mErrorCode;

    @SerializedName("errorDetail")
    private String mErrorDetail;

    @SerializedName("errorMessage")
    private String mErrorMessage;

    @SerializedName("httpStatusCode")
    private long mHttpStatusCode;

    public ApiError(String str, String str2) {
        this.mErrorMessage = str;
        this.mErrorCode = str2;
    }

    public String getError() {
        return this.mError;
    }

    public String getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorDetail() {
        return this.mErrorDetail;
    }

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public long getHttpStatusCode() {
        return this.mHttpStatusCode;
    }
}

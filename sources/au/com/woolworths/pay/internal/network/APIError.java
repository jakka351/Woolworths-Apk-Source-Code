package au.com.woolworths.pay.internal.network;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Keep
/* loaded from: classes4.dex */
public class APIError {

    @NonNull
    @JSONField
    private String errorCode;

    @Nullable
    @JSONField(optional = true)
    private String errorDetail;

    @Nullable
    @JSONField(optional = true)
    private String errorMessage;
    private int httpStatusCode;

    @NonNull
    public String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public String getErrorDetail() {
        return this.errorDetail;
    }

    @Nullable
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public void setErrorCode(@NonNull String str) {
        this.errorCode = str;
    }

    public void setErrorDetail(@Nullable String str) {
        this.errorDetail = str;
    }

    public void setErrorMessage(@Nullable String str) {
        this.errorMessage = str;
    }

    public void setHttpStatusCode(int i) {
        this.httpStatusCode = i;
    }
}

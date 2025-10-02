package au.com.woolworths.pay.sdk.models.errors;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes4.dex */
public class HTTPNotOkError extends BaseError {

    @NonNull
    private Integer httpStatusCode;

    public HTTPNotOkError(@NonNull Integer num, @NonNull String str) {
        super(PayErrorCode.HTTP_NOT_OK, str);
        this.httpStatusCode = num;
    }

    @Override // au.com.woolworths.pay.sdk.models.errors.BaseError
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof HTTPNotOkError)) {
            HTTPNotOkError hTTPNotOkError = (HTTPNotOkError) obj;
            if (super.equals(hTTPNotOkError) && hTTPNotOkError.httpStatusCode.equals(this.httpStatusCode)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    @Override // au.com.woolworths.pay.sdk.models.errors.BaseError
    @NonNull
    public String toString() {
        return super.toString() + " HTTP Status=" + this.httpStatusCode;
    }
}

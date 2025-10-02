package au.com.woolworths.pay.sdk.models.errors;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import au.com.woolworths.pay.internal.network.JSONField;

@Keep
/* loaded from: classes4.dex */
public class JSONError extends BaseError {

    @NonNull
    @JSONField("errorCode")
    String code;

    @NonNull
    @JSONField("errorDetail")
    String detail;

    public JSONError(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        super(PayErrorCode.JSON_ERROR, str2);
        this.code = str;
        this.detail = str3;
    }

    @NonNull
    public String getCode() {
        return this.code;
    }

    @NonNull
    public String getDetail() {
        return this.detail;
    }
}

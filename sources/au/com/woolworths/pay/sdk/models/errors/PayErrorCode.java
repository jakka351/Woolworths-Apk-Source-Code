package au.com.woolworths.pay.sdk.models.errors;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes4.dex */
public enum PayErrorCode {
    FATAL_ERROR("FATAL_ERROR", 0),
    NETWORK_ERROR("NETWORK_ERROR", 1),
    TIMEOUT_ERROR("TIMEOUT_ERROR", 2),
    HTTP_NOT_OK("HTTP_NOT_OK", 3),
    INVALID_JSON("INVALID_JSON", 4),
    INVALID_MODEL("INVALID_MODEL", 5),
    FORM_ERROR("FORM_ERROR", 6),
    JSON_ERROR("JSON_ERROR", 7),
    RETRIES_EXHAUSTED_ERROR("RETRIES_EXHAUSTED_ERROR", 8);


    @NonNull
    private String stringValue;
    private int value;

    PayErrorCode(@NonNull String str, int i) {
        this.stringValue = str;
        this.value = i;
    }

    @NonNull
    public String getStringValue() {
        return this.stringValue;
    }

    public int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.stringValue;
    }
}

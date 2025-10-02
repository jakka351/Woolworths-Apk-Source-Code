package au.com.woolworths.pay.sdk.models.errors;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.sdk.interfaces.PayError;

@Keep
/* loaded from: classes4.dex */
public abstract class BaseError implements PayError {

    @NonNull
    private PayErrorCode errorCode;

    @Nullable
    private String message;

    public BaseError(@NonNull PayErrorCode payErrorCode) {
        this.errorCode = payErrorCode;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof BaseError)) {
            BaseError baseError = (BaseError) obj;
            if (TextUtils.equals(baseError.errorCode.getStringValue(), this.errorCode.getStringValue()) && TextUtils.equals(baseError.message, this.message)) {
                return true;
            }
        }
        return false;
    }

    @Override // au.com.woolworths.pay.sdk.interfaces.PayError
    @Nullable
    public String getErrorMessage() {
        return this.message;
    }

    @Override // au.com.woolworths.pay.sdk.interfaces.PayError
    @NonNull
    public PayErrorCode getPayErrorCode() {
        return this.errorCode;
    }

    @NonNull
    public String toString() {
        return getClass().getSimpleName() + "[" + this.errorCode + "]: " + this.message;
    }

    public BaseError(@NonNull PayErrorCode payErrorCode, @Nullable String str) {
        this.errorCode = payErrorCode;
        this.message = str;
    }
}

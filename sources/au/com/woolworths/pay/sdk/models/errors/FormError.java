package au.com.woolworths.pay.sdk.models.errors;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes4.dex */
public class FormError extends BaseError {

    @NonNull
    private String auditId;

    @NonNull
    private String formErrorCode;

    public FormError(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        super(PayErrorCode.FORM_ERROR, str);
        this.formErrorCode = str2;
        this.auditId = str3;
    }

    @NonNull
    public String getAuditId() {
        return this.auditId;
    }

    @NonNull
    public String getFormErrorCode() {
        return this.formErrorCode;
    }
}

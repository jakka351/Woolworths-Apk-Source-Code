package au.com.woolworths.pay.sdk.web;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.network.JSONField;

@Keep
/* loaded from: classes4.dex */
public class FrameResponseFocusState extends FrameResponse {

    @NonNull
    @JSONField("allFieldsEmpty")
    boolean allFieldsEmpty;

    @Nullable
    @JSONField(optional = true)
    Boolean cardAccepted;

    @Nullable
    @JSONField(optional = true)
    Boolean cardValid;

    @Nullable
    @JSONField(optional = true)
    Boolean cvvValid;

    @Nullable
    @JSONField(optional = true)
    Boolean expiryMonthValid;

    @Nullable
    @JSONField(optional = true)
    Boolean expiryYearValid;

    @NonNull
    @JSONField("field")
    String fieldName;
}

package au.com.woolworths.pay.sdk.web;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.network.JSONField;

@Keep
/* loaded from: classes4.dex */
public class FrameResponseError extends FrameResponse {

    @Nullable
    @JSONField(optional = true)
    String auditId;

    @NonNull
    @JSONField
    String code;

    @NonNull
    @JSONField
    String message;
}

package au.com.woolworths.pay.sdk.web;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.network.JSONField;

@Keep
/* loaded from: classes4.dex */
public class FrameResponseSuccess extends FrameResponse {

    @NonNull
    @JSONField
    String auditId;

    @Nullable
    @JSONField
    String code;

    @Nullable
    @JSONField
    String message;

    @NonNull
    @JSONField
    String paymentInstrumentId;

    @NonNull
    @JSONField
    String stepUpToken;
}

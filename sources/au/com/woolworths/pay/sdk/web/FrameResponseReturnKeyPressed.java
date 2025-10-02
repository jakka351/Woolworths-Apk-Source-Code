package au.com.woolworths.pay.sdk.web;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import au.com.woolworths.pay.internal.network.JSONField;

@Keep
/* loaded from: classes4.dex */
public class FrameResponseReturnKeyPressed extends FrameResponse {

    @NonNull
    @JSONField
    boolean allFieldsValid;

    @NonNull
    @JSONField("enterKeyPressedAtField")
    String fieldName;
}

package au.com.woolworths.pay.sdk.models.merchantprofile;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.network.JSONField;

@Keep
/* loaded from: classes4.dex */
public class PayPalInfo {

    @Nullable
    @JSONField
    public String clientToken;

    @Nullable
    @JSONField
    private String serviceStatus;

    @Nullable
    public String getServiceStatus() {
        return this.serviceStatus;
    }
}

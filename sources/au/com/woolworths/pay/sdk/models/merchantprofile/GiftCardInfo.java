package au.com.woolworths.pay.sdk.models.merchantprofile;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import au.com.woolworths.pay.internal.network.JSONField;

@Keep
/* loaded from: classes4.dex */
public class GiftCardInfo {

    @NonNull
    @JSONField
    private String[] allowedBins;

    @NonNull
    @JSONField
    private String serviceStatus;

    @NonNull
    public String[] getAllowedBins() {
        return this.allowedBins;
    }

    @NonNull
    public String getServiceStatus() {
        return this.serviceStatus;
    }
}

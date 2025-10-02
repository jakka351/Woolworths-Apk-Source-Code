package au.com.woolworths.pay.sdk.models.merchantprofile;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import au.com.woolworths.pay.internal.network.JSONField;

@Keep
/* loaded from: classes4.dex */
public class CreditCardInfo {

    @NonNull
    @JSONField
    private String[] allowedNetworks;

    @NonNull
    @JSONField
    private String[] allowedTransactionTypes;

    @NonNull
    @JSONField
    private String serviceStatus;

    @NonNull
    public String[] getAllowedNetworks() {
        return this.allowedNetworks;
    }

    @NonNull
    public String[] getAllowedTransactionTypes() {
        return this.allowedTransactionTypes;
    }

    @NonNull
    public String getServiceStatus() {
        return this.serviceStatus;
    }
}

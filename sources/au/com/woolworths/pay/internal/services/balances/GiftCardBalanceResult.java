package au.com.woolworths.pay.internal.services.balances;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.sdk.models.errors.JSONError;

@Keep
/* loaded from: classes4.dex */
public abstract class GiftCardBalanceResult {

    @Nullable
    GiftCardBalanceInfo balanceInfo;

    @Nullable
    JSONError error;

    @Nullable
    public GiftCardBalanceInfo getBalanceInfo() {
        return this.balanceInfo;
    }

    @Nullable
    public JSONError getError() {
        return this.error;
    }

    public abstract void setFieldsFromElement(@NonNull GiftCardBalanceResponseElement giftCardBalanceResponseElement);
}

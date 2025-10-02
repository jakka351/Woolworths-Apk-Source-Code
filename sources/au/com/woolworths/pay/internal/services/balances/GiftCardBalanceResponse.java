package au.com.woolworths.pay.internal.services.balances;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes4.dex */
abstract class GiftCardBalanceResponse {
    @NonNull
    public abstract GiftCardBalanceResponseElement[] getElements();
}

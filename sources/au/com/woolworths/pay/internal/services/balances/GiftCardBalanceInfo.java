package au.com.woolworths.pay.internal.services.balances;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.network.JSONField;
import java.math.BigDecimal;

@Keep
/* loaded from: classes4.dex */
public class GiftCardBalanceInfo {

    @Nullable
    @JSONField(optional = true)
    BigDecimal balance;

    @JSONField(optional = true)
    boolean expired;

    @Nullable
    @JSONField(optional = true)
    String expiryDay;

    @Nullable
    @JSONField(optional = true)
    String expiryMonth;

    @Nullable
    @JSONField(optional = true)
    String expiryYear;

    @Nullable
    public BigDecimal getBalance() {
        return this.balance;
    }

    @Nullable
    public boolean getExpired() {
        return this.expired;
    }

    @Nullable
    public String getExpiryDay() {
        return this.expiryDay;
    }

    @Nullable
    public String getExpiryMonth() {
        return this.expiryMonth;
    }

    @Nullable
    public String getExpiryYear() {
        return this.expiryYear;
    }
}

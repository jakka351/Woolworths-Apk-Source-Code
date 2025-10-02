package au.com.woolworths.android.onesite.models.checkout;

import YU.a;
import au.com.woolworths.android.onesite.utils.Objects;
import au.com.woolworths.android.onesite.utils.Strings;
import java.math.BigDecimal;
import timber.log.Timber;

/* loaded from: classes3.dex */
public class NewGiftCardData {
    private BigDecimal mCardBalance;
    private String mCardNumber;
    private String mExpiryDate;
    private boolean mIsExpired;
    private BigDecimal mPaymentAmount;
    private String mPaymentInstrumentId;
    private String mPin;
    private boolean mSaveForLater;

    public NewGiftCardData(String str, String str2, String str3, BigDecimal bigDecimal, boolean z) {
        this.mCardNumber = str;
        this.mExpiryDate = str2;
        this.mPin = str3;
        this.mCardBalance = bigDecimal;
        this.mIsExpired = z;
    }

    public BigDecimal getBalance() {
        return this.mCardBalance;
    }

    public String getCardNumber() {
        return this.mCardNumber;
    }

    public String getExpiry() {
        return this.mExpiryDate;
    }

    public long getId() {
        return Objects.a(this.mCardNumber) + hashCode();
    }

    public String getMaskedCardNumber() {
        if (Strings.b(this.mCardNumber) && this.mCardNumber.length() >= 4) {
            return "";
        }
        String str = this.mCardNumber;
        return a.A("X-", str.substring(str.length() - 4));
    }

    public BigDecimal getPaymentAmount() {
        return this.mPaymentAmount;
    }

    public String getPaymentInstrumentId() {
        return this.mPaymentInstrumentId;
    }

    public String getPin() {
        return this.mPin;
    }

    public boolean isExpired() {
        return this.mIsExpired;
    }

    public boolean isPaymentAmountEqualsToBalance() {
        return (this.mPaymentAmount == null || getBalance() == null || this.mPaymentAmount.compareTo(this.mCardBalance) != 0) ? false : true;
    }

    public boolean isPaymentAmountValid() {
        BigDecimal bigDecimal;
        if (isExpired() || (bigDecimal = this.mPaymentAmount) == null || bigDecimal.compareTo(BigDecimal.ZERO) != 1) {
            return false;
        }
        return getBalance() == null || this.mPaymentAmount.compareTo(getBalance()) < 1;
    }

    public boolean isSaveForLater() {
        return this.mSaveForLater;
    }

    public void setPaymentAmount(String str) {
        if (Strings.b(str)) {
            this.mPaymentAmount = null;
            return;
        }
        try {
            setPaymentAmount(new BigDecimal(str.replaceAll("[$,]", "")));
        } catch (NumberFormatException e) {
            Timber.f27013a.f(e);
            this.mPaymentAmount = null;
        }
    }

    public void setPaymentInstrumentId(String str) {
        this.mPaymentInstrumentId = str;
    }

    public void setPin(String str) {
        this.mPin = str;
    }

    public void setSaveForLater(boolean z) {
        this.mSaveForLater = z;
    }

    public boolean shouldShowPaymentAmountValid() {
        BigDecimal bigDecimal;
        if (isExpired() || this.mPaymentAmount != null) {
            if (isExpired() || (bigDecimal = this.mPaymentAmount) == null || bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
                return false;
            }
            if (getBalance() != null && this.mPaymentAmount.compareTo(getBalance()) >= 1) {
                return false;
            }
        }
        return true;
    }

    public void setPaymentAmount(BigDecimal bigDecimal) {
        if (isExpired()) {
            return;
        }
        this.mPaymentAmount = bigDecimal;
    }
}

package au.com.woolworths.android.onesite.models.checkout;

import au.com.woolworths.android.onesite.utils.Strings;
import java.math.BigDecimal;
import timber.log.Timber;

/* loaded from: classes3.dex */
public class SavedGiftCardData {
    private BigDecimal mCardBalance;
    private String mExpiryDate;
    private boolean mIsAllowed;
    private boolean mIsExpired;
    private boolean mIsSelectedForPayment = false;
    private String mMaskedCardNumber;
    private BigDecimal mPaymentAmount;
    private String mPaymentInstrumentId;

    public SavedGiftCardData(String str, String str2, String str3, BigDecimal bigDecimal, boolean z, boolean z2) {
        this.mMaskedCardNumber = str2;
        this.mExpiryDate = str3;
        this.mCardBalance = bigDecimal;
        this.mIsExpired = z;
        this.mPaymentInstrumentId = str;
        this.mIsAllowed = z2;
    }

    public BigDecimal getBalance() {
        return this.mCardBalance;
    }

    public String getExpiry() {
        return this.mExpiryDate;
    }

    public String getMaskedCardNumber() {
        return this.mMaskedCardNumber;
    }

    public BigDecimal getPaymentAmount() {
        return this.mPaymentAmount;
    }

    public String getPaymentInstrumentId() {
        return this.mPaymentInstrumentId;
    }

    public boolean isAllowed() {
        return this.mIsAllowed;
    }

    public boolean isExpired() {
        return this.mIsExpired;
    }

    public boolean isPaymentAmountValid() {
        BigDecimal bigDecimal;
        if (!isSelectedForPayment() || isExpired() || (bigDecimal = this.mPaymentAmount) == null || bigDecimal.compareTo(BigDecimal.ZERO) != 1) {
            return false;
        }
        return getBalance() == null || this.mPaymentAmount.compareTo(getBalance()) < 1;
    }

    public boolean isSelectedForPayment() {
        return this.mIsSelectedForPayment;
    }

    public void setPaymentAmount(String str) {
        if (isSelectedForPayment()) {
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
    }

    public void setSelectedForPayment(boolean z) {
        if (isExpired()) {
            this.mIsSelectedForPayment = false;
            return;
        }
        this.mIsSelectedForPayment = z;
        if (z) {
            return;
        }
        this.mPaymentAmount = null;
    }

    public boolean shouldShowPaymentAmountValid() {
        BigDecimal bigDecimal;
        if ((isSelectedForPayment() || isExpired()) && (!isSelectedForPayment() || isExpired() || this.mPaymentAmount != null)) {
            if (!isSelectedForPayment() || isExpired() || (bigDecimal = this.mPaymentAmount) == null || bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
                return false;
            }
            if (getBalance() != null && this.mPaymentAmount.compareTo(getBalance()) >= 1) {
                return false;
            }
        }
        return true;
    }

    public void setPaymentAmount(BigDecimal bigDecimal) {
        if (isSelectedForPayment()) {
            this.mPaymentAmount = bigDecimal;
        }
    }
}

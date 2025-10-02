package au.com.woolworths.android.onesite.models.checkout;

/* loaded from: classes3.dex */
public class NewCreditCardData {
    private String mPaymentInstrumentId;
    private boolean mSaveForLater;

    public NewCreditCardData(String str, boolean z) {
        this.mPaymentInstrumentId = str;
        this.mSaveForLater = z;
    }

    public String getPaymentInstrumentId() {
        return this.mPaymentInstrumentId;
    }

    public boolean isSaveForLater() {
        return this.mSaveForLater;
    }
}

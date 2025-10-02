package au.com.woolworths.pay.sdk.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.network.JSONField;
import java.net.URL;

@Keep
/* loaded from: classes4.dex */
public class CreditCardInstrument extends PaymentInstrument {

    @NonNull
    @JSONField
    private String scheme = "";

    @Nullable
    @JSONField(optional = true)
    private String cardName = null;

    @NonNull
    @JSONField
    private String cardSuffix = "";

    @NonNull
    @JSONField
    private boolean cvvValidated = false;

    @NonNull
    @JSONField
    private boolean requiresCVV = false;

    @NonNull
    @JSONField
    private boolean expired = false;

    @NonNull
    @JSONField
    private String expiryMonth = "";

    @NonNull
    @JSONField
    private String expiryYear = "";

    @Nullable
    @JSONField
    private StepUp stepUp = null;

    @NonNull
    @JSONField
    private URL updateURL = null;

    @Nullable
    public String getCardName() {
        return this.cardName;
    }

    @NonNull
    public String getCardSuffix() {
        return this.cardSuffix;
    }

    @NonNull
    public String getExpiryMonth() {
        return this.expiryMonth;
    }

    @NonNull
    public String getExpiryYear() {
        return this.expiryYear;
    }

    @NonNull
    public String getScheme() {
        return this.scheme;
    }

    @Nullable
    public StepUp getStepUp() {
        return this.stepUp;
    }

    @NonNull
    public URL getUpdateURL() {
        return this.updateURL;
    }

    @NonNull
    public boolean isCVVValidated() {
        return this.cvvValidated;
    }

    @NonNull
    public boolean isExpired() {
        return this.expired;
    }

    @NonNull
    public boolean isRequiresCVV() {
        return this.requiresCVV;
    }

    @Override // au.com.woolworths.pay.sdk.models.PaymentInstrument
    @NonNull
    public String toString() {
        return super.toString() + "cardName: " + getCardName() + "\ncardSuffix: " + getCardSuffix() + "\ncvvValidated: " + isCVVValidated() + "\nexpired: " + isExpired() + "\nexpiryMonth: " + getExpiryMonth() + "\nexpiryYear: " + getExpiryYear() + "\npaymentInstrumentId: " + getInstrumentId() + "\nprimary: " + isPrimary() + "\nrequiresCVV: " + isRequiresCVV() + "\nscheme: " + getScheme() + "\nstepUp: " + getStepUp() + "\nupdateURL: " + getUpdateURL();
    }
}

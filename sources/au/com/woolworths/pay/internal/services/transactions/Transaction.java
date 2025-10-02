package au.com.woolworths.pay.internal.services.transactions;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.network.JSONField;
import java.math.BigDecimal;
import java.util.Date;

@Keep
/* loaded from: classes4.dex */
public class Transaction {

    @Nullable
    @JSONField(optional = true)
    String bin;

    @Nullable
    @JSONField(optional = true)
    String cardSuffix;

    @Nullable
    @JSONField(optional = true)
    String orderNumber;

    @NonNull
    @JSONField("transactionRef")
    String reference = "";

    @NonNull
    @JSONField("transactionTimestamp")
    Date date = new Date();

    @NonNull
    @JSONField("transactionType")
    String type = "";

    @NonNull
    @JSONField
    String clientReference = "";

    @NonNull
    @JSONField
    String applicationName = "";

    @NonNull
    @JSONField
    BigDecimal amount = new BigDecimal(-1);

    @NonNull
    @JSONField
    String network = "";

    @NonNull
    public BigDecimal getAmount() {
        return this.amount;
    }

    @NonNull
    public String getApplicationName() {
        return this.applicationName;
    }

    @Nullable
    public String getBin() {
        return this.bin;
    }

    @Nullable
    public String getCardSuffix() {
        return this.cardSuffix;
    }

    @NonNull
    public String getClientReference() {
        return this.clientReference;
    }

    @NonNull
    public Date getDate() {
        return this.date;
    }

    @NonNull
    public String getNetwork() {
        return this.network;
    }

    @NonNull
    public String getOrderNumber() {
        return this.orderNumber;
    }

    @NonNull
    public String getReference() {
        return this.reference;
    }

    @NonNull
    public String getType() {
        return this.type;
    }

    public String toString() {
        return "amount: " + this.amount + "\napplicationName: " + this.applicationName + "\nbin: " + this.bin + "\nclientReference: " + this.clientReference + "\ncardSuffix: " + this.cardSuffix + "\ndate: " + this.date + "\norderNumber: " + this.orderNumber + "\nreference: " + this.reference + "\nnetwork: " + this.network + "\ntype: " + this.type;
    }
}

package au.com.woolworths.pay.sdk.models;

import YU.a;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.network.JSONField;
import java.io.Serializable;
import java.util.Date;

@Keep
/* loaded from: classes4.dex */
public abstract class PaymentInstrument implements Serializable {

    @NonNull
    @JSONField
    private String paymentInstrumentId = "";

    @NonNull
    @JSONField
    private String status = "";

    @JSONField
    private boolean primary = false;

    @Nullable
    @JSONField(optional = true)
    private Date lastUsed = null;

    @NonNull
    @JSONField
    private Date lastUpdated = null;

    @JSONField
    private boolean allowed = false;

    @NonNull
    public String getInstrumentId() {
        return this.paymentInstrumentId;
    }

    @NonNull
    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    @Nullable
    public Date getLastUsed() {
        return this.lastUsed;
    }

    @NonNull
    public String getStatus() {
        return this.status;
    }

    public boolean isAllowed() {
        return this.allowed;
    }

    @NonNull
    public boolean isPrimary() {
        return this.primary;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("paymentInstrumentId: ");
        sb.append(this.paymentInstrumentId);
        sb.append("\nstatus: ");
        sb.append(this.status);
        sb.append("\nprimary: ");
        sb.append(this.primary);
        sb.append("\nlastUsed: ");
        sb.append(this.lastUsed);
        sb.append("\nlastUpdated: ");
        sb.append(this.lastUpdated);
        sb.append("\nallowed: ");
        return a.k("\n", sb, this.allowed);
    }
}

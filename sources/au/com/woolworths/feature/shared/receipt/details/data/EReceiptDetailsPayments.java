package au.com.woolworths.feature.shared.receipt.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsPayments;", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsElement;", "", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsPayment;", "payments", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EReceiptDetailsPayments extends EReceiptDetailsElement {

    @SerializedName("payments")
    @NotNull
    private final List<EReceiptDetailsPayment> payments;

    public EReceiptDetailsPayments(@NotNull List<EReceiptDetailsPayment> payments) {
        Intrinsics.h(payments, "payments");
        this.payments = payments;
    }

    /* renamed from: a, reason: from getter */
    public final List getPayments() {
        return this.payments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EReceiptDetailsPayments) && Intrinsics.c(this.payments, ((EReceiptDetailsPayments) obj).payments);
    }

    public final int hashCode() {
        return this.payments.hashCode();
    }

    public final String toString() {
        return a.l("EReceiptDetailsPayments(payments=", ")", this.payments);
    }
}

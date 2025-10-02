package au.com.woolworths.foundation.rewards.common.ui.shop.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/shop/data/PaymentSummaryLineItem;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentSummaryLineItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f8599a;
    public final PaymentSummaryLineType b;
    public final String c;
    public final PaymentSummaryLineType d;

    public PaymentSummaryLineItem(String str, PaymentSummaryLineType paymentSummaryLineType, String str2, PaymentSummaryLineType paymentSummaryLineType2) {
        this.f8599a = str;
        this.b = paymentSummaryLineType;
        this.c = str2;
        this.d = paymentSummaryLineType2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentSummaryLineItem)) {
            return false;
        }
        PaymentSummaryLineItem paymentSummaryLineItem = (PaymentSummaryLineItem) obj;
        return Intrinsics.c(this.f8599a, paymentSummaryLineItem.f8599a) && this.b == paymentSummaryLineItem.b && Intrinsics.c(this.c, paymentSummaryLineItem.c) && this.d == paymentSummaryLineItem.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + b.c((this.b.hashCode() + (this.f8599a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "PaymentSummaryLineItem(title=" + this.f8599a + ", titleType=" + this.b + ", value=" + this.c + ", valueType=" + this.d + ")";
    }
}

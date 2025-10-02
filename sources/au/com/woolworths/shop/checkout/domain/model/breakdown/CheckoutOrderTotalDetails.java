package au.com.woolworths.shop.checkout.domain.model.breakdown;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import au.com.woolworths.foundation.shop.bottomsheet.CheckoutRefundInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/breakdown/CheckoutOrderTotalDetails;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutOrderTotalDetails {

    /* renamed from: a, reason: collision with root package name */
    public final InlineMessage f10645a;
    public final ArrayList b;
    public final OrderTotalDetailsTotal c;
    public final int d;
    public final CheckoutRefundInfo e;
    public final String f;

    public CheckoutOrderTotalDetails(InlineMessage inlineMessage, ArrayList arrayList, OrderTotalDetailsTotal orderTotalDetailsTotal, int i, CheckoutRefundInfo checkoutRefundInfo, String str) {
        this.f10645a = inlineMessage;
        this.b = arrayList;
        this.c = orderTotalDetailsTotal;
        this.d = i;
        this.e = checkoutRefundInfo;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutOrderTotalDetails)) {
            return false;
        }
        CheckoutOrderTotalDetails checkoutOrderTotalDetails = (CheckoutOrderTotalDetails) obj;
        return Intrinsics.c(this.f10645a, checkoutOrderTotalDetails.f10645a) && this.b.equals(checkoutOrderTotalDetails.b) && this.c.equals(checkoutOrderTotalDetails.c) && this.d == checkoutOrderTotalDetails.d && Intrinsics.c(this.e, checkoutOrderTotalDetails.e) && Intrinsics.c(this.f, checkoutOrderTotalDetails.f);
    }

    public final int hashCode() {
        InlineMessage inlineMessage = this.f10645a;
        int iA = b.a(this.d, (this.c.hashCode() + a.b((inlineMessage == null ? 0 : inlineMessage.hashCode()) * 31, 31, this.b)) * 31, 31);
        CheckoutRefundInfo checkoutRefundInfo = this.e;
        int iHashCode = (iA + (checkoutRefundInfo == null ? 0 : checkoutRefundInfo.hashCode())) * 31;
        String str = this.f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CheckoutOrderTotalDetails(message=" + this.f10645a + ", sections=" + this.b + ", total=" + this.c + ", totalUnavailableItems=" + this.d + ", refundInfo=" + this.e + ", panelMarkdown=" + this.f + ")";
    }
}

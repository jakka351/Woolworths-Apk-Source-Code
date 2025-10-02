package au.com.woolworths.shop.checkout.domain.model.breakdown;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.checkout.domain.model.ProgressId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/breakdown/OrderTotalDetailsTotal;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderTotalDetailsTotal {

    /* renamed from: a, reason: collision with root package name */
    public final String f10648a;
    public final String b;
    public final double c;
    public final String d;
    public final ProgressId e;
    public final boolean f;

    public OrderTotalDetailsTotal(String str, String str2, double d, String str3, ProgressId progressId, boolean z) {
        this.f10648a = str;
        this.b = str2;
        this.c = d;
        this.d = str3;
        this.e = progressId;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderTotalDetailsTotal)) {
            return false;
        }
        OrderTotalDetailsTotal orderTotalDetailsTotal = (OrderTotalDetailsTotal) obj;
        return Intrinsics.c(this.f10648a, orderTotalDetailsTotal.f10648a) && Intrinsics.c(this.b, orderTotalDetailsTotal.b) && Double.compare(this.c, orderTotalDetailsTotal.c) == 0 && Intrinsics.c(this.d, orderTotalDetailsTotal.d) && this.e == orderTotalDetailsTotal.e && this.f == orderTotalDetailsTotal.f;
    }

    public final int hashCode() {
        int iC = b.c(a.a(this.c, b.c(this.f10648a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        ProgressId progressId = this.e;
        return Boolean.hashCode(this.f) + ((iC + (progressId == null ? 0 : progressId.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("OrderTotalDetailsTotal(title=", this.f10648a, ", value=", this.b, ", balanceToPay=");
        sbV.append(this.c);
        sbV.append(", buttonTitle=");
        sbV.append(this.d);
        sbV.append(", progressId=");
        sbV.append(this.e);
        sbV.append(", isEnabled=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}

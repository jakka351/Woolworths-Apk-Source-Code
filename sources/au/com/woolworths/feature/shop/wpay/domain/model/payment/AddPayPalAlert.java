package au.com.woolworths.feature.shop.wpay.domain.model.payment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/AddPayPalAlert;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AddPayPalAlert {

    /* renamed from: a, reason: collision with root package name */
    public final String f8289a;
    public final String b;
    public final String c;
    public final String d;
    public final AnalyticsData e;

    public AddPayPalAlert(String str, String str2, String str3, String str4, AnalyticsData analyticsData) {
        this.f8289a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = analyticsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddPayPalAlert)) {
            return false;
        }
        AddPayPalAlert addPayPalAlert = (AddPayPalAlert) obj;
        return Intrinsics.c(this.f8289a, addPayPalAlert.f8289a) && Intrinsics.c(this.b, addPayPalAlert.b) && Intrinsics.c(this.c, addPayPalAlert.c) && Intrinsics.c(this.d, addPayPalAlert.d) && Intrinsics.c(this.e, addPayPalAlert.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b.c(b.c(b.c(this.f8289a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbV = a.v("AddPayPalAlert(title=", this.f8289a, ", message=", this.b, ", primaryButtonTitle=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", secondaryButtonTitle=", this.d, ", clickAnalytics=");
        return au.com.woolworths.android.onesite.a.n(sbV, this.e, ")");
    }
}

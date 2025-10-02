package au.com.woolworths.feature.shop.wpay.domain.model.payment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/AddCreditCardResponse;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AddCreditCardResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f8287a;
    public final Map b;
    public final boolean c;
    public final String d;
    public final AnalyticsData e;

    public AddCreditCardResponse(String url, Map map, boolean z, String str, AnalyticsData clickAnalytics) {
        Intrinsics.h(url, "url");
        Intrinsics.h(clickAnalytics, "clickAnalytics");
        this.f8287a = url;
        this.b = map;
        this.c = z;
        this.d = str;
        this.e = clickAnalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddCreditCardResponse)) {
            return false;
        }
        AddCreditCardResponse addCreditCardResponse = (AddCreditCardResponse) obj;
        return Intrinsics.c(this.f8287a, addCreditCardResponse.f8287a) && Intrinsics.c(this.b, addCreditCardResponse.b) && this.c == addCreditCardResponse.c && Intrinsics.c(this.d, addCreditCardResponse.d) && Intrinsics.c(this.e, addCreditCardResponse.e);
    }

    public final int hashCode() {
        int iE = b.e(d.d(this.b, this.f8287a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddCreditCardResponse(url=");
        sb.append(this.f8287a);
        sb.append(", headers=");
        sb.append(this.b);
        sb.append(", isMandatorySave=");
        a.y(", infoText=", this.d, ", clickAnalytics=", sb, this.c);
        return a.n(sb, this.e, ")");
    }
}

package au.com.woolworths.feature.shop.myorders.details.models;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderProofOfDeliveryDetailsData;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderProofOfDeliveryDetailsData {

    /* renamed from: a, reason: collision with root package name */
    public final String f7768a;
    public final InsetBannerApiData b;
    public final String c;
    public final String d;

    public OrderProofOfDeliveryDetailsData(String str, InsetBannerApiData insetBannerApiData, String str2, String str3) {
        this.f7768a = str;
        this.b = insetBannerApiData;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderProofOfDeliveryDetailsData)) {
            return false;
        }
        OrderProofOfDeliveryDetailsData orderProofOfDeliveryDetailsData = (OrderProofOfDeliveryDetailsData) obj;
        return Intrinsics.c(this.f7768a, orderProofOfDeliveryDetailsData.f7768a) && Intrinsics.c(this.b, orderProofOfDeliveryDetailsData.b) && Intrinsics.c(this.c, orderProofOfDeliveryDetailsData.c) && Intrinsics.c(this.d, orderProofOfDeliveryDetailsData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f7768a.hashCode() * 31;
        InsetBannerApiData insetBannerApiData = this.b;
        int iHashCode2 = (iHashCode + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderProofOfDeliveryDetailsData(title=");
        sb.append(this.f7768a);
        sb.append(", insetBanner=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        return a.l(sb, this.c, ", footnote=", this.d, ")");
    }
}

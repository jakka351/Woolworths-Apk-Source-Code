package au.com.woolworths.shop.checkout.domain.model.address;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/address/OrderAddresses;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderAddresses {

    /* renamed from: a, reason: collision with root package name */
    public final String f10644a;
    public final ArrayList b;
    public final InsetBannerApiData c;

    public OrderAddresses(String str, ArrayList arrayList, InsetBannerApiData insetBannerApiData) {
        this.f10644a = str;
        this.b = arrayList;
        this.c = insetBannerApiData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderAddresses)) {
            return false;
        }
        OrderAddresses orderAddresses = (OrderAddresses) obj;
        return this.f10644a.equals(orderAddresses.f10644a) && this.b.equals(orderAddresses.b) && Intrinsics.c(this.c, orderAddresses.c);
    }

    public final int hashCode() {
        int iB = a.b(this.f10644a.hashCode() * 31, 31, this.b);
        InsetBannerApiData insetBannerApiData = this.c;
        return iB + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode());
    }

    public final String toString() {
        StringBuilder sbX = d.x("OrderAddresses(title=", this.f10644a, ", addressSections=", ", insetBanner=", this.b);
        sbX.append(this.c);
        sbX.append(")");
        return sbX.toString();
    }
}

package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutProductCampaign;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutProductCampaign {

    /* renamed from: a, reason: collision with root package name */
    public final String f10566a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;
    public final CheckoutProductCampaignInfo g;

    public CheckoutProductCampaign(String str, String str2, String str3, int i, String str4, boolean z, CheckoutProductCampaignInfo checkoutProductCampaignInfo) {
        this.f10566a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = z;
        this.g = checkoutProductCampaignInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutProductCampaign)) {
            return false;
        }
        CheckoutProductCampaign checkoutProductCampaign = (CheckoutProductCampaign) obj;
        return Intrinsics.c(this.f10566a, checkoutProductCampaign.f10566a) && Intrinsics.c(this.b, checkoutProductCampaign.b) && Intrinsics.c(this.c, checkoutProductCampaign.c) && this.d == checkoutProductCampaign.d && Intrinsics.c(this.e, checkoutProductCampaign.e) && this.f == checkoutProductCampaign.f && Intrinsics.c(this.g, checkoutProductCampaign.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + b.e(b.c(b.a(this.d, b.c(b.c(this.f10566a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbV = a.v("CheckoutProductCampaign(label=", this.f10566a, ", title=", this.b, ", subtitle=");
        a.x(this.d, this.c, ", id=", ", imageUrl=", sbV);
        d.A(this.e, ", isOptedIn=", ", campaignInfo=", sbV, this.f);
        sbV.append(this.g);
        sbV.append(")");
        return sbV.toString();
    }
}

package au.com.woolworths.shop.checkout.domain.model;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/MarketSellerGroup;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MarketSellerGroup {

    /* renamed from: a, reason: collision with root package name */
    public final String f10621a;
    public final String b;
    public final ArrayList c;

    public MarketSellerGroup(String str, String str2, ArrayList arrayList) {
        this.f10621a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSellerGroup)) {
            return false;
        }
        MarketSellerGroup marketSellerGroup = (MarketSellerGroup) obj;
        return this.f10621a.equals(marketSellerGroup.f10621a) && this.b.equals(marketSellerGroup.b) && this.c.equals(marketSellerGroup.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f10621a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.q(")", YU.a.v("MarketSellerGroup(sellerName=", this.f10621a, ", dispatchNote=", this.b, ", products="), this.c);
    }
}

package au.com.woolworths.foundation.shop.cart.data.model;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/MarketplaceSeller;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MarketplaceSeller {

    /* renamed from: a, reason: collision with root package name */
    public final String f8696a;
    public final String b;
    public final Object c;

    public MarketplaceSeller(String str, String str2, List list) {
        this.f8696a = str;
        this.b = str2;
        this.c = list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceSeller)) {
            return false;
        }
        MarketplaceSeller marketplaceSeller = (MarketplaceSeller) obj;
        return this.f8696a.equals(marketplaceSeller.f8696a) && this.b.equals(marketplaceSeller.b) && this.c.equals(marketplaceSeller.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f8696a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.o(this.c, ")", YU.a.v("MarketplaceSeller(sellerName=", this.f8696a, ", dispatchNote=", this.b, ", products="));
    }
}

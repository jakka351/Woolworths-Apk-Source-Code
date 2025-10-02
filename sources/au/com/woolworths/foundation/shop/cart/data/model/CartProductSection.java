package au.com.woolworths.foundation.shop.cart.data.model;

import android.support.v4.media.session.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartProductSection;", "Lau/com/woolworths/foundation/shop/cart/data/model/CartSection;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartProductSection implements CartSection {

    /* renamed from: a, reason: collision with root package name */
    public final String f8685a;
    public final SectionHeader b;
    public final ArrayList c;

    public CartProductSection(String str, SectionHeader sectionHeader, ArrayList arrayList) {
        this.f8685a = str;
        this.b = sectionHeader;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartProductSection)) {
            return false;
        }
        CartProductSection cartProductSection = (CartProductSection) obj;
        return Intrinsics.c(this.f8685a, cartProductSection.f8685a) && Intrinsics.c(this.b, cartProductSection.b) && this.c.equals(cartProductSection.c);
    }

    public final int hashCode() {
        String str = this.f8685a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SectionHeader sectionHeader = this.b;
        return this.c.hashCode() + ((iHashCode + (sectionHeader != null ? sectionHeader.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CartProductSection(title=");
        sb.append(this.f8685a);
        sb.append(", sectionHeader=");
        sb.append(this.b);
        sb.append(", products=");
        return a.q(")", sb, this.c);
    }
}

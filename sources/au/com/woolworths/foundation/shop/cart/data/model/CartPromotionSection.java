package au.com.woolworths.foundation.shop.cart.data.model;

import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartPromotionSection;", "Lau/com/woolworths/foundation/shop/cart/data/model/CartSection;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartPromotionSection implements CartSection {

    /* renamed from: a, reason: collision with root package name */
    public final String f8687a;
    public final String b;
    public final ArrayList c;
    public final CartPromotionInfo d;

    public CartPromotionSection(String str, String str2, ArrayList arrayList, CartPromotionInfo cartPromotionInfo) {
        this.f8687a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = cartPromotionInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartPromotionSection)) {
            return false;
        }
        CartPromotionSection cartPromotionSection = (CartPromotionSection) obj;
        return this.f8687a.equals(cartPromotionSection.f8687a) && Intrinsics.c(this.b, cartPromotionSection.b) && this.c.equals(cartPromotionSection.c) && this.d.equals(cartPromotionSection.d);
    }

    public final int hashCode() {
        int iHashCode = this.f8687a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + a.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("CartPromotionSection(promotionId=", this.f8687a, ", title=", this.b, ", products=");
        sbV.append(this.c);
        sbV.append(", info=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}

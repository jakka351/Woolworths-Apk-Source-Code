package au.com.woolworths.foundation.shop.cart.data.model;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartFooterData;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartFooterData {

    /* renamed from: a, reason: collision with root package name */
    public final ButtonApiData f8674a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ CartFooterData(ButtonApiData buttonApiData, String str, String str2, int i) {
        this(buttonApiData, (i & 2) != 0 ? "" : "Total", (i & 4) == 0 ? "$420.00" : "", (i & 8) != 0 ? null : str, null, (i & 32) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartFooterData)) {
            return false;
        }
        CartFooterData cartFooterData = (CartFooterData) obj;
        return Intrinsics.c(this.f8674a, cartFooterData.f8674a) && Intrinsics.c(this.b, cartFooterData.b) && Intrinsics.c(this.c, cartFooterData.c) && Intrinsics.c(this.d, cartFooterData.d) && Intrinsics.c(this.e, cartFooterData.e) && Intrinsics.c(this.f, cartFooterData.f);
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.f8674a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CartFooterData(button=");
        sb.append(this.f8674a);
        sb.append(", totalLabel=");
        sb.append(this.b);
        sb.append(", totalAmount=");
        a.B(sb, this.c, ", totalDescription=", this.d, ", panelMarkdown=");
        return a.l(sb, this.e, ", savings=", this.f, ")");
    }

    public CartFooterData(ButtonApiData buttonApiData, String totalLabel, String totalAmount, String str, String str2, String str3) {
        Intrinsics.h(totalLabel, "totalLabel");
        Intrinsics.h(totalAmount, "totalAmount");
        this.f8674a = buttonApiData;
        this.b = totalLabel;
        this.c = totalAmount;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }
}

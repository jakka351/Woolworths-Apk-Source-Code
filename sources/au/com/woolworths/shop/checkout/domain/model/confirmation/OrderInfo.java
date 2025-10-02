package au.com.woolworths.shop.checkout.domain.model.confirmation;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderInfo {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10653a;
    public final boolean b;
    public final Boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final boolean r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;

    public OrderInfo(ArrayList arrayList, boolean z, Boolean bool, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, boolean z3, String str7, boolean z4, String str8, String str9, String str10, String str11, boolean z5, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        this.f10653a = arrayList;
        this.b = z;
        this.c = bool;
        this.d = z2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = z3;
        this.l = str7;
        this.m = z4;
        this.n = str8;
        this.o = str9;
        this.p = str10;
        this.q = str11;
        this.r = z5;
        this.s = str12;
        this.t = str13;
        this.u = str14;
        this.v = str15;
        this.w = str16;
        this.x = str17;
        this.y = str18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderInfo)) {
            return false;
        }
        OrderInfo orderInfo = (OrderInfo) obj;
        return this.f10653a.equals(orderInfo.f10653a) && this.b == orderInfo.b && this.c.equals(orderInfo.c) && this.d == orderInfo.d && this.e.equals(orderInfo.e) && this.f.equals(orderInfo.f) && this.g.equals(orderInfo.g) && this.h.equals(orderInfo.h) && this.i.equals(orderInfo.i) && this.j.equals(orderInfo.j) && this.k == orderInfo.k && this.l.equals(orderInfo.l) && this.m == orderInfo.m && this.n.equals(orderInfo.n) && this.o.equals(orderInfo.o) && this.p.equals(orderInfo.p) && this.q.equals(orderInfo.q) && this.r == orderInfo.r && this.s.equals(orderInfo.s) && this.t.equals(orderInfo.t) && this.u.equals(orderInfo.u) && this.v.equals(orderInfo.v) && this.w.equals(orderInfo.w) && this.x.equals(orderInfo.x) && this.y.equals(orderInfo.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + b.c(b.c(b.c(b.c(b.c(b.c(b.e(b.c(b.c(b.c(b.c(b.e(b.c(b.e(b.c(b.c(b.c(b.c(b.c(b.c(b.e((this.c.hashCode() + b.e(this.f10653a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderInfo(productsInfo=");
        sb.append(this.f10653a);
        sb.append(", isDeliveryNow=");
        sb.append(this.b);
        sb.append(", isDirectToBootNow=");
        sb.append(this.c);
        sb.append(", isDeliveryUnlimited=");
        sb.append(this.d);
        sb.append(", shopperID=");
        a.B(sb, this.e, ", orderNumber=", this.f, ", orderTotal=");
        a.B(sb, this.g, ", deliveryFee=", this.h, ", deliveryCity=");
        a.B(sb, this.i, ", deliveryMethod=", this.j, ", isCrowdSourced=");
        au.com.woolworths.android.onesite.a.y(", packagingFeeLabel=", this.l, ", hasRewards=", sb, this.k);
        au.com.woolworths.android.onesite.a.y(", orderDiscount=", this.n, ", subtotal=", sb, this.m);
        a.B(sb, this.o, ", rewardsCreditsUsed=", this.p, ", fulfilmentMethod=");
        d.A(this.q, ", isEditedOrder=", ", orderReference=", sb, this.r);
        a.B(sb, this.s, ", rewardsDollarsAmount=", this.t, ", storeCreditAmount=");
        a.B(sb, this.u, ", promoCodeCreditAmount=", this.v, ", discountSavingsTotal=");
        a.B(sb, this.w, ", storeCreditCode=", this.x, ", promoCodeValue=");
        return YU.a.o(sb, this.y, ")");
    }
}

package au.com.woolworths.graphql.common.fragment;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductTrolley;", "Lcom/apollographql/apollo/api/Fragment$Data;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductTrolley implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final double f9025a;
    public final double b;
    public final double c;
    public final double d;
    public final String e;
    public final Double f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public ProductTrolley(double d, double d2, double d3, double d4, String str, Double d5, String str2, String str3, String str4, String str5) {
        this.f9025a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = str;
        this.f = d5;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTrolley)) {
            return false;
        }
        ProductTrolley productTrolley = (ProductTrolley) obj;
        return Double.compare(this.f9025a, productTrolley.f9025a) == 0 && Double.compare(this.b, productTrolley.b) == 0 && Double.compare(this.c, productTrolley.c) == 0 && Double.compare(this.d, productTrolley.d) == 0 && Intrinsics.c(this.e, productTrolley.e) && Intrinsics.c(this.f, productTrolley.f) && Intrinsics.c(this.g, productTrolley.g) && Intrinsics.c(this.h, productTrolley.h) && Intrinsics.c(this.i, productTrolley.i) && Intrinsics.c(this.j, productTrolley.j);
    }

    public final int hashCode() {
        int iA = a.a(this.d, a.a(this.c, a.a(this.b, Double.hashCode(this.f9025a) * 31, 31), 31), 31);
        String str = this.e;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f;
        int iC = b.c(b.c((iHashCode + (d == null ? 0 : d.hashCode())) * 31, 31, this.g), 31, this.h);
        String str2 = this.i;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = androidx.constraintlayout.core.state.a.n(this.f9025a, "ProductTrolley(minimum=", ", maximum=");
        sbN.append(this.b);
        au.com.woolworths.android.onesite.a.z(sbN, ", increment=", this.c, ", defaultValue=");
        sbN.append(this.d);
        sbN.append(", unit=");
        sbN.append(this.e);
        sbN.append(", inTrolley=");
        sbN.append(this.f);
        sbN.append(", buttonState=");
        sbN.append(this.g);
        androidx.constraintlayout.core.state.a.B(sbN, ", buttonLabel=", this.h, ", buttonQuantity=", this.i);
        return YU.a.p(sbN, ", title=", this.j, ")");
    }
}

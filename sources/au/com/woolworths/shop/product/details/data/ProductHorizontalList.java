package au.com.woolworths.shop.product.details.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/ProductHorizontalList;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductHorizontalList {

    /* renamed from: a, reason: collision with root package name */
    public final String f12614a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;

    public ProductHorizontalList(String str, String str2, String str3, String str4, String str5, List list) {
        this.f12614a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = str5;
    }

    public static ProductHorizontalList a(ProductHorizontalList productHorizontalList, List list, int i) {
        String str = productHorizontalList.f12614a;
        String str2 = productHorizontalList.b;
        String str3 = productHorizontalList.c;
        String str4 = productHorizontalList.d;
        if ((i & 16) != 0) {
            list = productHorizontalList.e;
        }
        List items = list;
        String str5 = (i & 32) != 0 ? productHorizontalList.f : null;
        productHorizontalList.getClass();
        Intrinsics.h(items, "items");
        return new ProductHorizontalList(str, str2, str3, str4, str5, items);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductHorizontalList)) {
            return false;
        }
        ProductHorizontalList productHorizontalList = (ProductHorizontalList) obj;
        return Intrinsics.c(this.f12614a, productHorizontalList.f12614a) && Intrinsics.c(this.b, productHorizontalList.b) && Intrinsics.c(this.c, productHorizontalList.c) && Intrinsics.c(this.d, productHorizontalList.d) && Intrinsics.c(this.e, productHorizontalList.e) && Intrinsics.c(this.f, productHorizontalList.f);
    }

    public final int hashCode() {
        String str = this.f12614a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iD = b.d((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.e);
        String str5 = this.f;
        return iD + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ProductHorizontalList(title=", this.f12614a, ", subtitle=", this.b, ", actionTitle=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", deepLink=", this.d, ", items=");
        sbV.append(this.e);
        sbV.append(", nodeId=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}

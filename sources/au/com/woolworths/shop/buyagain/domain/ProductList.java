package au.com.woolworths.shop.buyagain.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/domain/ProductList;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductList {

    /* renamed from: a, reason: collision with root package name */
    public final List f10259a;
    public final Integer b;
    public final Integer c;
    public final List d;

    public ProductList(List list, Integer num, Integer num2, List list2) {
        this.f10259a = list;
        this.b = num;
        this.c = num2;
        this.d = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public static ProductList a(ProductList productList, List list, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            list = productList.f10259a;
        }
        Integer num = productList.b;
        Integer num2 = productList.c;
        ArrayList arrayList2 = arrayList;
        if ((i & 8) != 0) {
            arrayList2 = productList.d;
        }
        return new ProductList(list, num, num2, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductList)) {
            return false;
        }
        ProductList productList = (ProductList) obj;
        return Intrinsics.c(this.f10259a, productList.f10259a) && Intrinsics.c(this.b, productList.b) && Intrinsics.c(this.c, productList.c) && Intrinsics.c(this.d, productList.d);
    }

    public final int hashCode() {
        int iHashCode = this.f10259a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ProductList(items=" + this.f10259a + ", totalNumberOfProducts=" + this.b + ", nextPageKey=" + this.c + ", chips=" + this.d + ")";
    }
}

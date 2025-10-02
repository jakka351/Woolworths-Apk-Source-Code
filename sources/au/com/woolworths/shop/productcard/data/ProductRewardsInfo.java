package au.com.woolworths.shop.productcard.data;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/productcard/data/ProductRewardsInfo;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductRewardsInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f12656a;

    public ProductRewardsInfo(String str) {
        this.f12656a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductRewardsInfo) && Intrinsics.c(this.f12656a, ((ProductRewardsInfo) obj).f12656a);
    }

    public final int hashCode() {
        return this.f12656a.hashCode();
    }

    public final String toString() {
        return a.h("ProductRewardsInfo(offerId=", this.f12656a, ")");
    }
}

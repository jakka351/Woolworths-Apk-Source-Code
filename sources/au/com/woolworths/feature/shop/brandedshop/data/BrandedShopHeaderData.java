package au.com.woolworths.feature.shop.brandedshop.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopHeaderData;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BrandedShopHeaderData {

    /* renamed from: a, reason: collision with root package name */
    public final String f6692a;

    public BrandedShopHeaderData(String str) {
        this.f6692a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BrandedShopHeaderData) && Intrinsics.c(this.f6692a, ((BrandedShopHeaderData) obj).f6692a);
    }

    public final int hashCode() {
        String str = this.f6692a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.h("BrandedShopHeaderData(pageTitle=", this.f6692a, ")");
    }
}

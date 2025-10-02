package au.com.woolworths.feature.shop.myorders.details.epoxy;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/epoxy/YourGroceriesCategoryItem;", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$YourGroceriesItem;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class YourGroceriesCategoryItem implements YourGroceriesContract.YourGroceriesItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f7702a;

    public YourGroceriesCategoryItem(String str) {
        this.f7702a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof YourGroceriesCategoryItem) && Intrinsics.c(this.f7702a, ((YourGroceriesCategoryItem) obj).f7702a);
    }

    public final int hashCode() {
        return this.f7702a.hashCode();
    }

    public final String toString() {
        return YU.a.h("YourGroceriesCategoryItem(title=", this.f7702a, ")");
    }
}

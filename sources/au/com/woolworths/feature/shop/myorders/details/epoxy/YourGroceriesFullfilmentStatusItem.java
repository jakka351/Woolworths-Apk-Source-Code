package au.com.woolworths.feature.shop.myorders.details.epoxy;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/epoxy/YourGroceriesFullfilmentStatusItem;", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$YourGroceriesItem;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class YourGroceriesFullfilmentStatusItem implements YourGroceriesContract.YourGroceriesItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f7705a;
    public final String b;

    public YourGroceriesFullfilmentStatusItem(String str, String str2) {
        this.f7705a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YourGroceriesFullfilmentStatusItem)) {
            return false;
        }
        YourGroceriesFullfilmentStatusItem yourGroceriesFullfilmentStatusItem = (YourGroceriesFullfilmentStatusItem) obj;
        return Intrinsics.c(this.f7705a, yourGroceriesFullfilmentStatusItem.f7705a) && Intrinsics.c(this.b, yourGroceriesFullfilmentStatusItem.b);
    }

    public final int hashCode() {
        int iHashCode = this.f7705a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return YU.a.j("YourGroceriesFullfilmentStatusItem(title=", this.f7705a, ", message=", this.b, ")");
    }
}

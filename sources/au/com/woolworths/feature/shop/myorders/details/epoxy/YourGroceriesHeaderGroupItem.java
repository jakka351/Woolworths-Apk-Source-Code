package au.com.woolworths.feature.shop.myorders.details.epoxy;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import com.google.android.material.chip.ChipGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/epoxy/YourGroceriesHeaderGroupItem;", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$YourGroceriesItem;", "CheckedListenerMediator", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class YourGroceriesHeaderGroupItem implements YourGroceriesContract.YourGroceriesItem {

    /* renamed from: a, reason: collision with root package name */
    public final YourGroceriesFilterGroupItem f7706a;
    public final String b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/epoxy/YourGroceriesHeaderGroupItem$CheckedListenerMediator;", "Lcom/google/android/material/chip/ChipGroup$OnCheckedChangeListener;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckedListenerMediator implements ChipGroup.OnCheckedChangeListener {
        @Override // com.google.android.material.chip.ChipGroup.OnCheckedChangeListener
        public final void a(ChipGroup chipGroup) {
            throw null;
        }
    }

    public YourGroceriesHeaderGroupItem(YourGroceriesFilterGroupItem yourGroceriesFilterGroupItem, String str) {
        this.f7706a = yourGroceriesFilterGroupItem;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YourGroceriesHeaderGroupItem)) {
            return false;
        }
        YourGroceriesHeaderGroupItem yourGroceriesHeaderGroupItem = (YourGroceriesHeaderGroupItem) obj;
        return Intrinsics.c(this.f7706a, yourGroceriesHeaderGroupItem.f7706a) && Intrinsics.c(this.b, yourGroceriesHeaderGroupItem.b);
    }

    public final int hashCode() {
        YourGroceriesFilterGroupItem yourGroceriesFilterGroupItem = this.f7706a;
        return this.b.hashCode() + ((yourGroceriesFilterGroupItem == null ? 0 : yourGroceriesFilterGroupItem.f7703a.hashCode()) * 31);
    }

    public final String toString() {
        return "YourGroceriesHeaderGroupItem(filterGroupItem=" + this.f7706a + ", countLabel=" + this.b + ")";
    }
}

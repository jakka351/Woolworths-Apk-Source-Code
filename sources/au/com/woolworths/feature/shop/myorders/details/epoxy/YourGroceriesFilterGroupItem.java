package au.com.woolworths.feature.shop.myorders.details.epoxy;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/epoxy/YourGroceriesFilterGroupItem;", "", "YourGroceriesFilterItem", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class YourGroceriesFilterGroupItem {

    /* renamed from: a, reason: collision with root package name */
    public final List f7703a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/epoxy/YourGroceriesFilterGroupItem$YourGroceriesFilterItem;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class YourGroceriesFilterItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f7704a;
        public final String b;
        public final boolean c;
        public final Integer d;

        public YourGroceriesFilterItem(String str, String str2, boolean z, Integer num) {
            this.f7704a = str;
            this.b = str2;
            this.c = z;
            this.d = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof YourGroceriesFilterItem)) {
                return false;
            }
            YourGroceriesFilterItem yourGroceriesFilterItem = (YourGroceriesFilterItem) obj;
            return Intrinsics.c(this.f7704a, yourGroceriesFilterItem.f7704a) && Intrinsics.c(this.b, yourGroceriesFilterItem.b) && this.c == yourGroceriesFilterItem.c && Intrinsics.c(this.d, yourGroceriesFilterItem.d);
        }

        public final int hashCode() {
            int iE = b.e(b.c(this.f7704a.hashCode() * 31, 31, this.b), 31, this.c);
            Integer num = this.d;
            return iE + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("YourGroceriesFilterItem(key=", this.f7704a, ", title=", this.b, ", isSelected=");
            sbV.append(this.c);
            sbV.append(", count=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    public YourGroceriesFilterGroupItem(List list) {
        this.f7703a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof YourGroceriesFilterGroupItem) && Intrinsics.c(this.f7703a, ((YourGroceriesFilterGroupItem) obj).f7703a);
    }

    public final int hashCode() {
        return this.f7703a.hashCode();
    }

    public final String toString() {
        return au.com.woolworths.android.onesite.a.l("YourGroceriesFilterGroupItem(filter=", ")", this.f7703a);
    }
}

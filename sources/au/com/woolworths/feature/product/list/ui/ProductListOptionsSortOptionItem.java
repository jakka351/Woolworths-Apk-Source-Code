package au.com.woolworths.feature.product.list.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.product.list.data.SortOption;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/product/list/ui/ProductListOptionsSortOptionItem;", "", "SortOptionItem", "SortOptionsToggleItem", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsSortOptionItem$SortOptionItem;", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsSortOptionItem$SortOptionsToggleItem;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProductListOptionsSortOptionItem {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ui/ProductListOptionsSortOptionItem$SortOptionItem;", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsSortOptionItem;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SortOptionItem extends ProductListOptionsSortOptionItem {

        /* renamed from: a, reason: collision with root package name */
        public final SortOption f5398a;

        public SortOptionItem(SortOption data) {
            Intrinsics.h(data, "data");
            this.f5398a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SortOptionItem) && Intrinsics.c(this.f5398a, ((SortOptionItem) obj).f5398a);
        }

        public final int hashCode() {
            return this.f5398a.hashCode();
        }

        public final String toString() {
            return "SortOptionItem(data=" + this.f5398a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ui/ProductListOptionsSortOptionItem$SortOptionsToggleItem;", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsSortOptionItem;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SortOptionsToggleItem extends ProductListOptionsSortOptionItem {

        /* renamed from: a, reason: collision with root package name */
        public final int f5399a;

        public SortOptionsToggleItem(int i) {
            this.f5399a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SortOptionsToggleItem) && this.f5399a == ((SortOptionsToggleItem) obj).f5399a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f5399a);
        }

        public final String toString() {
            return YU.a.e(this.f5399a, "SortOptionsToggleItem(titleRes=", ")");
        }
    }
}

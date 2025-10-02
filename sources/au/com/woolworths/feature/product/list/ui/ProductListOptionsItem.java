package au.com.woolworths.feature.product.list.ui;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.feature.product.list.ProductsDisplayMode;
import au.com.woolworths.feature.product.list.data.ProductFilterSwitch;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem;", "", "Header", "FilterOptionItem", "SortOptionsSection", "MarketplaceSwitch", "DisplayMode", "FilterCard", "SortOptionsInsetBanner", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem$DisplayMode;", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem$FilterCard;", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem$FilterOptionItem;", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem$Header;", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem$MarketplaceSwitch;", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem$SortOptionsInsetBanner;", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem$SortOptionsSection;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProductListOptionsItem {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem$DisplayMode;", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DisplayMode extends ProductListOptionsItem {

        /* renamed from: a, reason: collision with root package name */
        public final ProductsDisplayMode f5391a;

        public DisplayMode(ProductsDisplayMode displayMode) {
            Intrinsics.h(displayMode, "displayMode");
            this.f5391a = displayMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayMode) && this.f5391a == ((DisplayMode) obj).f5391a;
        }

        public final int hashCode() {
            return this.f5391a.hashCode();
        }

        public final String toString() {
            return "DisplayMode(displayMode=" + this.f5391a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem$FilterCard;", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterCard extends ProductListOptionsItem {

        /* renamed from: a, reason: collision with root package name */
        public static final FilterCard f5392a = new FilterCard();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem$FilterOptionItem;", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FilterOptionItem extends ProductListOptionsItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5393a;
        public final String b;
        public final int c;

        public FilterOptionItem(String key, String headerTitle, int i) {
            Intrinsics.h(key, "key");
            Intrinsics.h(headerTitle, "headerTitle");
            this.f5393a = key;
            this.b = headerTitle;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterOptionItem)) {
                return false;
            }
            FilterOptionItem filterOptionItem = (FilterOptionItem) obj;
            return Intrinsics.c(this.f5393a, filterOptionItem.f5393a) && Intrinsics.c(this.b, filterOptionItem.b) && this.c == filterOptionItem.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + b.c(this.f5393a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.m(YU.a.v("FilterOptionItem(key=", this.f5393a, ", headerTitle=", this.b, ", activeFilterCount="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem$Header;", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header extends ProductListOptionsItem {

        /* renamed from: a, reason: collision with root package name */
        public final int f5394a;

        public Header(int i) {
            this.f5394a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Header) && this.f5394a == ((Header) obj).f5394a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f5394a);
        }

        public final String toString() {
            return YU.a.e(this.f5394a, "Header(titleRes=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem$MarketplaceSwitch;", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MarketplaceSwitch extends ProductListOptionsItem {

        /* renamed from: a, reason: collision with root package name */
        public final ProductFilterSwitch f5395a;

        public MarketplaceSwitch(ProductFilterSwitch productFilterSwitch) {
            this.f5395a = productFilterSwitch;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MarketplaceSwitch) && Intrinsics.c(this.f5395a, ((MarketplaceSwitch) obj).f5395a);
        }

        public final int hashCode() {
            return this.f5395a.hashCode();
        }

        public final String toString() {
            return "MarketplaceSwitch(data=" + this.f5395a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem$SortOptionsInsetBanner;", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SortOptionsInsetBanner extends ProductListOptionsItem {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerData f5396a;

        public SortOptionsInsetBanner(InsetBannerData insetBannerData) {
            this.f5396a = insetBannerData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SortOptionsInsetBanner) && Intrinsics.c(this.f5396a, ((SortOptionsInsetBanner) obj).f5396a);
        }

        public final int hashCode() {
            return this.f5396a.hashCode();
        }

        public final String toString() {
            return "SortOptionsInsetBanner(insetBanner=" + this.f5396a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem$SortOptionsSection;", "Lau/com/woolworths/feature/product/list/ui/ProductListOptionsItem;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SortOptionsSection extends ProductListOptionsItem {

        /* renamed from: a, reason: collision with root package name */
        public final List f5397a;

        public SortOptionsSection(List list) {
            this.f5397a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SortOptionsSection) && Intrinsics.c(this.f5397a, ((SortOptionsSection) obj).f5397a);
        }

        public final int hashCode() {
            return this.f5397a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.l("SortOptionsSection(data=", ")", this.f5397a);
        }
    }
}

package au.com.woolworths.shop.legacy.graphql;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.ProductListChannelType;
import au.com.woolworths.shop.graphql.type.ProductListFacetType;
import au.com.woolworths.shop.graphql.type.adapter.ProductFilterOption_InputAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ProductListChannelType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ProductListFacetType_ResponseAdapter;
import au.com.woolworths.shop.legacy.graphql.adapter.ProductsByFacetQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.woolworths.product.list.legacy.fragment.InsetBanner;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0010\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$Data;", "Data", "ProductsByFacet", "Product", "Filter", "FilterItem", "Banner", "Action", "SortOption", "SortOptionsBanner", "MarketplaceInfo", "Item", "Footer", "MarketplaceBottomSheet", "PrimaryCta", "SecondaryCta", "Companion", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductsByFacetQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final ProductListChannelType f12143a;
    public final ProductListFacetType b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final String f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final boolean j;
    public final Optional k;
    public final Optional l;
    public final boolean m;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$Action;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f12144a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;

        public Action(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f12144a = insetBannerActionPlacement;
            this.b = insetBannerActionType;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.f12144a == action.f12144a && this.b == action.b && Intrinsics.c(this.c, action.c) && Intrinsics.c(this.d, action.d);
        }

        public final int hashCode() {
            int iC = b.c(d.c(this.b, this.f12144a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(d.t("Action(placement=", this.f12144a, ", type=", this.b, ", label="), this.c, ", url=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$Banner;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Banner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f12145a;
        public final String b;
        public final String c;
        public final String d;
        public final Action e;

        public Banner(InsetBannerDisplayType insetBannerDisplayType, String str, String str2, String str3, Action action) {
            this.f12145a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            return this.f12145a == banner.f12145a && Intrinsics.c(this.b, banner.b) && Intrinsics.c(this.c, banner.c) && Intrinsics.c(this.d, banner.d) && Intrinsics.c(this.e, banner.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f12145a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Action action = this.e;
            return iHashCode2 + (action != null ? action.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbU = d.u("Banner(displayType=", this.f12145a, ", message=", this.b, ", bannerTitle=");
            a.B(sbU, this.c, ", iconUrl=", this.d, ", action=");
            sbU.append(this.e);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ProductsByFacet f12146a;

        public Data(ProductsByFacet productsByFacet) {
            this.f12146a = productsByFacet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f12146a, ((Data) obj).f12146a);
        }

        public final int hashCode() {
            ProductsByFacet productsByFacet = this.f12146a;
            if (productsByFacet == null) {
                return 0;
            }
            return productsByFacet.hashCode();
        }

        public final String toString() {
            return "Data(productsByFacet=" + this.f12146a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$Filter;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Filter {

        /* renamed from: a, reason: collision with root package name */
        public final String f12147a;
        public final String b;
        public final ArrayList c;
        public final Banner d;

        public Filter(String str, String str2, ArrayList arrayList, Banner banner) {
            this.f12147a = str;
            this.b = str2;
            this.c = arrayList;
            this.d = banner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Filter)) {
                return false;
            }
            Filter filter = (Filter) obj;
            return this.f12147a.equals(filter.f12147a) && this.b.equals(filter.b) && this.c.equals(filter.c) && Intrinsics.c(this.d, filter.d);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(b.c(this.f12147a.hashCode() * 31, 31, this.b), 31, this.c);
            Banner banner = this.d;
            return iB + (banner == null ? 0 : banner.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Filter(headerKey=", this.f12147a, ", headerTitle=", this.b, ", filterItems=");
            sbV.append(this.c);
            sbV.append(", banner=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$FilterItem;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FilterItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f12148a;
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;
        public final boolean f;

        public FilterItem(String str, String str2, String str3, String str4, boolean z, boolean z2) {
            this.f12148a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = z;
            this.f = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterItem)) {
                return false;
            }
            FilterItem filterItem = (FilterItem) obj;
            return Intrinsics.c(this.f12148a, filterItem.f12148a) && Intrinsics.c(this.b, filterItem.b) && Intrinsics.c(this.c, filterItem.c) && Intrinsics.c(this.d, filterItem.d) && this.e == filterItem.e && this.f == filterItem.f;
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f12148a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return Boolean.hashCode(this.f) + b.e((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("FilterItem(key=", this.f12148a, ", title=", this.b, ", label=");
            a.B(sbV, this.c, ", parentKey=", this.d, ", hasChildren=");
            return au.com.woolworths.android.onesite.a.q(sbV, this.e, ", isApplied=", this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$Footer;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final String f12149a;
        public final String b;
        public final String c;

        public Footer(String str, String str2, String str3) {
            this.f12149a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return Intrinsics.c(this.f12149a, footer.f12149a) && Intrinsics.c(this.b, footer.b) && Intrinsics.c(this.c, footer.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f12149a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("Footer(title=", this.f12149a, ", subtitle=", this.b, ", linkUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$Item;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f12150a;
        public final String b;
        public final String c;

        public Item(String str, String str2, String str3) {
            this.f12150a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f12150a, item.f12150a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f12150a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("Item(title=", this.f12150a, ", description=", this.b, ", imageUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$MarketplaceBottomSheet;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MarketplaceBottomSheet {

        /* renamed from: a, reason: collision with root package name */
        public final String f12151a;
        public final String b;
        public final PrimaryCta c;
        public final SecondaryCta d;
        public final Boolean e;

        public MarketplaceBottomSheet(String str, String str2, PrimaryCta primaryCta, SecondaryCta secondaryCta, Boolean bool) {
            this.f12151a = str;
            this.b = str2;
            this.c = primaryCta;
            this.d = secondaryCta;
            this.e = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketplaceBottomSheet)) {
                return false;
            }
            MarketplaceBottomSheet marketplaceBottomSheet = (MarketplaceBottomSheet) obj;
            return Intrinsics.c(this.f12151a, marketplaceBottomSheet.f12151a) && Intrinsics.c(this.b, marketplaceBottomSheet.b) && Intrinsics.c(this.c, marketplaceBottomSheet.c) && Intrinsics.c(this.d, marketplaceBottomSheet.d) && Intrinsics.c(this.e, marketplaceBottomSheet.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f12151a.hashCode() * 31, 31, this.b);
            PrimaryCta primaryCta = this.c;
            int iHashCode = (iC + (primaryCta == null ? 0 : primaryCta.f12153a.hashCode())) * 31;
            SecondaryCta secondaryCta = this.d;
            int iHashCode2 = (iHashCode + (secondaryCta == null ? 0 : secondaryCta.f12156a.hashCode())) * 31;
            Boolean bool = this.e;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("MarketplaceBottomSheet(bottomSheetTitle=", this.f12151a, ", bottomSheetBody=", this.b, ", primaryCta=");
            sbV.append(this.c);
            sbV.append(", secondaryCta=");
            sbV.append(this.d);
            sbV.append(", showOnceOnly=");
            return au.com.woolworths.android.onesite.a.o(sbV, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$MarketplaceInfo;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MarketplaceInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f12152a;
        public final ArrayList b;
        public final Footer c;

        public MarketplaceInfo(String str, ArrayList arrayList, Footer footer) {
            this.f12152a = str;
            this.b = arrayList;
            this.c = footer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketplaceInfo)) {
                return false;
            }
            MarketplaceInfo marketplaceInfo = (MarketplaceInfo) obj;
            return this.f12152a.equals(marketplaceInfo.f12152a) && this.b.equals(marketplaceInfo.b) && Intrinsics.c(this.c, marketplaceInfo.c);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(this.f12152a.hashCode() * 31, 31, this.b);
            Footer footer = this.c;
            return iB + (footer == null ? 0 : footer.hashCode());
        }

        public final String toString() {
            StringBuilder sbX = d.x("MarketplaceInfo(title=", this.f12152a, ", items=", ", footer=", this.b);
            sbX.append(this.c);
            sbX.append(")");
            return sbX.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$PrimaryCta;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f12153a;

        public PrimaryCta(String str) {
            this.f12153a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrimaryCta) && Intrinsics.c(this.f12153a, ((PrimaryCta) obj).f12153a);
        }

        public final int hashCode() {
            return this.f12153a.hashCode();
        }

        public final String toString() {
            return YU.a.h("PrimaryCta(label=", this.f12153a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$Product;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product {

        /* renamed from: a, reason: collision with root package name */
        public final String f12154a;
        public final ProductCard b;

        public Product(String str, ProductCard productCard) {
            this.f12154a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return Intrinsics.c(this.f12154a, product.f12154a) && Intrinsics.c(this.b, product.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12154a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("Product(__typename=", this.f12154a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$ProductsByFacet;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsByFacet {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f12155a;
        public final Integer b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;
        public final SortOptionsBanner f;
        public final MarketplaceInfo g;
        public final MarketplaceBottomSheet h;

        public ProductsByFacet(Integer num, Integer num2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SortOptionsBanner sortOptionsBanner, MarketplaceInfo marketplaceInfo, MarketplaceBottomSheet marketplaceBottomSheet) {
            this.f12155a = num;
            this.b = num2;
            this.c = arrayList;
            this.d = arrayList2;
            this.e = arrayList3;
            this.f = sortOptionsBanner;
            this.g = marketplaceInfo;
            this.h = marketplaceBottomSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductsByFacet)) {
                return false;
            }
            ProductsByFacet productsByFacet = (ProductsByFacet) obj;
            return Intrinsics.c(this.f12155a, productsByFacet.f12155a) && Intrinsics.c(this.b, productsByFacet.b) && this.c.equals(productsByFacet.c) && this.d.equals(productsByFacet.d) && this.e.equals(productsByFacet.e) && Intrinsics.c(this.f, productsByFacet.f) && Intrinsics.c(this.g, productsByFacet.g) && Intrinsics.c(this.h, productsByFacet.h);
        }

        public final int hashCode() {
            Integer num = this.f12155a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.b;
            int iB = androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
            SortOptionsBanner sortOptionsBanner = this.f;
            int iHashCode2 = (iB + (sortOptionsBanner == null ? 0 : sortOptionsBanner.hashCode())) * 31;
            MarketplaceInfo marketplaceInfo = this.g;
            int iHashCode3 = (iHashCode2 + (marketplaceInfo == null ? 0 : marketplaceInfo.hashCode())) * 31;
            MarketplaceBottomSheet marketplaceBottomSheet = this.h;
            return iHashCode3 + (marketplaceBottomSheet != null ? marketplaceBottomSheet.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = d.v("ProductsByFacet(totalNumberOfProducts=", this.f12155a, ", nextPage=", this.b, ", products=");
            sbV.append(this.c);
            sbV.append(", filters=");
            sbV.append(this.d);
            sbV.append(", sortOptions=");
            sbV.append(this.e);
            sbV.append(", sortOptionsBanner=");
            sbV.append(this.f);
            sbV.append(", marketplaceInfo=");
            sbV.append(this.g);
            sbV.append(", marketplaceBottomSheet=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$SecondaryCta;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecondaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f12156a;

        public SecondaryCta(String str) {
            this.f12156a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SecondaryCta) && Intrinsics.c(this.f12156a, ((SecondaryCta) obj).f12156a);
        }

        public final int hashCode() {
            return this.f12156a.hashCode();
        }

        public final String toString() {
            return YU.a.h("SecondaryCta(label=", this.f12156a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$SortOption;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SortOption {

        /* renamed from: a, reason: collision with root package name */
        public final String f12157a;
        public final String b;
        public final String c;
        public final boolean d;

        public SortOption(String str, String str2, String str3, boolean z) {
            this.f12157a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SortOption)) {
                return false;
            }
            SortOption sortOption = (SortOption) obj;
            return Intrinsics.c(this.f12157a, sortOption.f12157a) && Intrinsics.c(this.b, sortOption.b) && Intrinsics.c(this.c, sortOption.c) && this.d == sortOption.d;
        }

        public final int hashCode() {
            int iC = b.c(this.f12157a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return Boolean.hashCode(this.d) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return d.r(this.c, ", isApplied=", ")", YU.a.v("SortOption(key=", this.f12157a, ", title=", this.b, ", subtitle="), this.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/ProductsByFacetQuery$SortOptionsBanner;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SortOptionsBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f12158a;
        public final InsetBanner b;

        public SortOptionsBanner(String str, InsetBanner insetBanner) {
            Intrinsics.h(insetBanner, "insetBanner");
            this.f12158a = str;
            this.b = insetBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SortOptionsBanner)) {
                return false;
            }
            SortOptionsBanner sortOptionsBanner = (SortOptionsBanner) obj;
            return Intrinsics.c(this.f12158a, sortOptionsBanner.f12158a) && Intrinsics.c(this.b, sortOptionsBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12158a.hashCode() * 31);
        }

        public final String toString() {
            return "SortOptionsBanner(__typename=" + this.f12158a + ", insetBanner=" + this.b + ")";
        }
    }

    public ProductsByFacetQuery(ProductListChannelType channel, ProductListFacetType facet, Optional optional, Optional optional2, Optional optional3, String name, Optional optional4, Optional optional5, Optional optional6, boolean z, boolean z2) {
        Intrinsics.h(channel, "channel");
        Intrinsics.h(facet, "facet");
        Intrinsics.h(name, "name");
        this.f12143a = channel;
        this.b = facet;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
        this.f = name;
        this.g = optional4;
        this.h = optional5;
        this.i = optional6;
        this.j = z;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.k = absent;
        this.l = absent;
        this.m = z2;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ProductsByFacetQuery_ResponseAdapter.Data.f12180a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query productsByFacet($channel: ProductListChannelType!, $facet: ProductListFacetType!, $pageSize: Int, $pageNumber: Int, $id: String, $name: String!, $source: String, $sortOption: String, $filterOptions: [ProductFilterOption], $includeProductAvailabilityStates: Boolean!, $includeOfferMinimumSpend: Boolean!, $includeUnitPriceInsetBanner: Boolean!, $includeAvailabilityInfoStatus: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { productsByFacet(channel: $channel, facet: $facet, id: $id, name: $name, pageSize: $pageSize, pageNumber: $pageNumber, sortOption: $sortOption, filterOptions: $filterOptions, source: $source) { totalNumberOfProducts nextPage products { __typename ...productCard } filters { headerKey headerTitle filterItems { key title label parentKey hasChildren isApplied } banner { displayType message bannerTitle: title iconUrl action { placement type label url } } } sortOptions { key title subtitle isApplied } sortOptionsBanner @include(if: $includeUnitPriceInsetBanner) { __typename ...insetBanner } marketplaceInfo { title items { title description imageUrl } footer { title subtitle linkUrl } } marketplaceBottomSheet { bottomSheetTitle bottomSheetBody primaryCta { label } secondaryCta { label } showOnceOnly } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }  fragment insetBanner on InsetBanner { displayType message bannerTitle: title iconUrl action { placement type label url } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductsByFacetQuery)) {
            return false;
        }
        ProductsByFacetQuery productsByFacetQuery = (ProductsByFacetQuery) obj;
        return this.f12143a == productsByFacetQuery.f12143a && this.b == productsByFacetQuery.b && this.c.equals(productsByFacetQuery.c) && this.d.equals(productsByFacetQuery.d) && this.e.equals(productsByFacetQuery.e) && Intrinsics.c(this.f, productsByFacetQuery.f) && this.g.equals(productsByFacetQuery.g) && this.h.equals(productsByFacetQuery.h) && this.i.equals(productsByFacetQuery.i) && this.j == productsByFacetQuery.j && this.k.equals(productsByFacetQuery.k) && this.l.equals(productsByFacetQuery.l) && this.m == productsByFacetQuery.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.l, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.k, b.e(b.e(b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.i, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.h, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.g, b.c(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.e, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, (this.b.hashCode() + (this.f12143a.hashCode() * 31)) * 31, 31), 31), 31), 31, this.f), 31), 31), 31), 31, true), 31, false), 31, this.j), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "ebe963679320df884571f786eed81ef5529ab7d4be7f2285f908aa2396612d05";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "productsByFacet";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("channel");
        ProductListChannelType_ResponseAdapter.b(jsonWriter, customScalarAdapters, this.f12143a);
        jsonWriter.F1("facet");
        ProductListFacetType_ResponseAdapter.b(jsonWriter, customScalarAdapters, this.b);
        Optional optional = this.c;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("pageSize");
            Adapters.d(Adapters.k).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        Optional optional2 = this.d;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("pageNumber");
            Adapters.d(Adapters.k).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        }
        Optional optional3 = this.e;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("id");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        }
        jsonWriter.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f);
        Optional optional4 = this.g;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("source");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        }
        Optional optional5 = this.h;
        if (optional5 instanceof Optional.Present) {
            jsonWriter.F1("sortOption");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional5);
        }
        Optional optional6 = this.i;
        if (optional6 instanceof Optional.Present) {
            jsonWriter.F1("filterOptions");
            Adapters.d(Adapters.b(Adapters.a(Adapters.b(Adapters.c(ProductFilterOption_InputAdapter.f12100a, false))))).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional6);
        }
        jsonWriter.F1("includeProductAvailabilityStates");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.TRUE);
        jsonWriter.F1("includeOfferMinimumSpend");
        Boolean bool = Boolean.FALSE;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        jsonWriter.F1("includeUnitPriceInsetBanner");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.j));
        Optional optional7 = this.k;
        if (optional7 instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional7);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, bool);
        }
        Optional optional8 = this.l;
        if (optional8 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional8);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, bool);
        }
        jsonWriter.F1("includeLowestPrice14Days");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.m));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductsByFacetQuery(channel=");
        sb.append(this.f12143a);
        sb.append(", facet=");
        sb.append(this.b);
        sb.append(", pageSize=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.c, ", pageNumber=", this.d, ", id=");
        sb.append(this.e);
        sb.append(", name=");
        sb.append(this.f);
        sb.append(", source=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.g, ", sortOption=", this.h, ", filterOptions=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.y(sb, this.i, ", includeProductAvailabilityStates=true, includeOfferMinimumSpend=false, includeUnitPriceInsetBanner=", this.j, ", includeAvailabilityInfoStatus=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.k, ", includePricingFootnote=", this.l, ", includeLowestPrice14Days=");
        return YU.a.k(")", sb, this.m);
    }
}

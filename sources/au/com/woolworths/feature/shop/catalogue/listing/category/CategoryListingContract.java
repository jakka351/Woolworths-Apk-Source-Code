package au.com.woolworths.feature.shop.catalogue.listing.category;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.shop.catalogue.common.BottomSheetResult;
import au.com.woolworths.feature.shop.catalogue.listing.category.model.ListingHeader;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingContract;", "", "Action", "ViewState", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CategoryListingContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingContract$Action;", "", "LaunchProductDetails", "LaunchProductBottomSheet", "LaunchListsBottomSheet", "LaunchViewShoppingList", "Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingContract$Action$LaunchListsBottomSheet;", "Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingContract$Action$LaunchProductBottomSheet;", "Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingContract$Action$LaunchProductDetails;", "Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingContract$Action$LaunchViewShoppingList;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingContract$Action$LaunchListsBottomSheet;", "Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchListsBottomSheet extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f6865a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchListsBottomSheet(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f6865a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchListsBottomSheet) && Intrinsics.c(this.f6865a, ((LaunchListsBottomSheet) obj).f6865a);
            }

            public final int hashCode() {
                return this.f6865a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchListsBottomSheet(productCard=", this.f6865a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingContract$Action$LaunchProductBottomSheet;", "Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductBottomSheet extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f6866a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductBottomSheet(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f6866a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductBottomSheet) && Intrinsics.c(this.f6866a, ((LaunchProductBottomSheet) obj).f6866a);
            }

            public final int hashCode() {
                return this.f6866a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchProductBottomSheet(productCard=", this.f6866a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingContract$Action$LaunchProductDetails;", "Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductDetails extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f6867a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductDetails(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f6867a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductDetails) && Intrinsics.c(this.f6867a, ((LaunchProductDetails) obj).f6867a);
            }

            public final int hashCode() {
                return this.f6867a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchProductDetails(productCard=", this.f6867a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingContract$Action$LaunchViewShoppingList;", "Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchViewShoppingList extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f6868a;

            public LaunchViewShoppingList(String id) {
                Intrinsics.h(id, "id");
                this.f6868a = id;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchViewShoppingList) && Intrinsics.c(this.f6868a, ((LaunchViewShoppingList) obj).f6868a);
            }

            public final int hashCode() {
                return this.f6868a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchViewShoppingList(id=", this.f6868a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingContract$ViewState;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6869a;
        public final boolean b;
        public final Integer c;
        public final ListingHeader d;
        public final Flow e;
        public final BottomSheetResult f;

        public ViewState(boolean z, boolean z2, Integer num, ListingHeader listingHeader, Flow flow, BottomSheetResult bottomSheetResult) {
            this.f6869a = z;
            this.b = z2;
            this.c = num;
            this.d = listingHeader;
            this.e = flow;
            this.f = bottomSheetResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v2, types: [au.com.woolworths.feature.shop.catalogue.common.BottomSheetResult] */
        public static ViewState a(ViewState viewState, Integer num, ListingHeader listingHeader, Flow flow, BottomSheetResult.AddToListSuccess addToListSuccess, int i) {
            boolean z = viewState.f6869a;
            boolean z2 = viewState.b;
            if ((i & 4) != 0) {
                num = viewState.c;
            }
            Integer num2 = num;
            if ((i & 8) != 0) {
                listingHeader = viewState.d;
            }
            ListingHeader listingHeader2 = listingHeader;
            if ((i & 16) != 0) {
                flow = viewState.e;
            }
            Flow flow2 = flow;
            BottomSheetResult.AddToListSuccess addToListSuccess2 = addToListSuccess;
            if ((i & 32) != 0) {
                addToListSuccess2 = viewState.f;
            }
            viewState.getClass();
            return new ViewState(z, z2, num2, listingHeader2, flow2, addToListSuccess2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f6869a == viewState.f6869a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && Intrinsics.c(this.f, viewState.f);
        }

        public final int hashCode() {
            int iE = b.e(Boolean.hashCode(this.f6869a) * 31, 31, this.b);
            Integer num = this.c;
            int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
            ListingHeader listingHeader = this.d;
            int iHashCode2 = (iHashCode + (listingHeader == null ? 0 : listingHeader.hashCode())) * 31;
            Flow flow = this.e;
            int iHashCode3 = (iHashCode2 + (flow == null ? 0 : flow.hashCode())) * 31;
            BottomSheetResult bottomSheetResult = this.f;
            return iHashCode3 + (bottomSheetResult != null ? bottomSheetResult.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = b.v("ViewState(inStore=", ", showCart=", ", cartItemCount=", this.f6869a, this.b);
            sbV.append(this.c);
            sbV.append(", header=");
            sbV.append(this.d);
            sbV.append(", items=");
            sbV.append(this.e);
            sbV.append(", bottomSheetResult=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }
}

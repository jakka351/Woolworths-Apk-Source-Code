package au.com.woolworths.shop.product.navigation.ui.subcategory;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.shop.product.navigation.data.ProductCategoryList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ui/subcategory/SubCategoryContract;", "", "Actions", "ViewState", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SubCategoryContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ui/subcategory/SubCategoryContract$Actions;", "", "LaunchSubCategory", "LaunchProductList", "Lau/com/woolworths/shop/product/navigation/ui/subcategory/SubCategoryContract$Actions$LaunchProductList;", "Lau/com/woolworths/shop/product/navigation/ui/subcategory/SubCategoryContract$Actions$LaunchSubCategory;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ui/subcategory/SubCategoryContract$Actions$LaunchProductList;", "Lau/com/woolworths/shop/product/navigation/ui/subcategory/SubCategoryContract$Actions;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductList extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Activities.ProductList.ExtrasPageData f12644a;
            public final Activities.ProductList.ExtraProductListSource b;

            public LaunchProductList(Activities.ProductList.ExtrasPageData extrasPageData, Activities.ProductList.ExtraProductListSource extraProductListSource) {
                this.f12644a = extrasPageData;
                this.b = extraProductListSource;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchProductList)) {
                    return false;
                }
                LaunchProductList launchProductList = (LaunchProductList) obj;
                return Intrinsics.c(this.f12644a, launchProductList.f12644a) && Intrinsics.c(this.b, launchProductList.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f12644a.hashCode() * 31);
            }

            public final String toString() {
                return "LaunchProductList(extrasPageData=" + this.f12644a + ", extras=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ui/subcategory/SubCategoryContract$Actions$LaunchSubCategory;", "Lau/com/woolworths/shop/product/navigation/ui/subcategory/SubCategoryContract$Actions;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSubCategory extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Activities.ProductSubCategory.Extras f12645a;

            public LaunchSubCategory(Activities.ProductSubCategory.Extras extras) {
                this.f12645a = extras;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchSubCategory) && Intrinsics.c(this.f12645a, ((LaunchSubCategory) obj).f12645a);
            }

            public final int hashCode() {
                return this.f12645a.hashCode();
            }

            public final String toString() {
                return "LaunchSubCategory(extra=" + this.f12645a + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ui/subcategory/SubCategoryContract$ViewState;", "", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12646a;
        public final ProductCategoryList b;
        public final FullPageErrorCause c;

        public ViewState(boolean z, ProductCategoryList productCategoryList, FullPageErrorCause fullPageErrorCause) {
            this.f12646a = z;
            this.b = productCategoryList;
            this.c = fullPageErrorCause;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f12646a == viewState.f12646a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f12646a) * 31;
            ProductCategoryList productCategoryList = this.b;
            int iHashCode2 = (iHashCode + (productCategoryList == null ? 0 : productCategoryList.hashCode())) * 31;
            FullPageErrorCause fullPageErrorCause = this.c;
            return iHashCode2 + (fullPageErrorCause != null ? fullPageErrorCause.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f12646a + ", productSubCategoryList=" + this.b + ", errorState=" + this.c + ")";
        }
    }
}

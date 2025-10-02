package au.com.woolworths.feature.shop.catalogue.details;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueTracking;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueSaleDetailInfo;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract;", "", "Actions", "ViewState", "PageState", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CatalogueDetailsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$Actions;", "", "LaunchCatalogueProductList", "LaunchWebUrl", "LaunchProductList", "LaunchRecipeDetails", "LaunchDeepLink", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$Actions$LaunchCatalogueProductList;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$Actions$LaunchProductList;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$Actions$LaunchRecipeDetails;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$Actions$LaunchWebUrl;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$Actions$LaunchCatalogueProductList;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$Actions;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCatalogueProductList extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6820a;
            public final String b;
            public final String c;
            public final CatalogueTracking d;

            public LaunchCatalogueProductList(String str, String str2, String str3, CatalogueTracking catalogueTracking) {
                this.f6820a = str;
                this.b = str2;
                this.c = str3;
                this.d = catalogueTracking;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchCatalogueProductList)) {
                    return false;
                }
                LaunchCatalogueProductList launchCatalogueProductList = (LaunchCatalogueProductList) obj;
                return Intrinsics.c(this.f6820a, launchCatalogueProductList.f6820a) && Intrinsics.c(this.b, launchCatalogueProductList.b) && Intrinsics.c(this.c, launchCatalogueProductList.c) && Intrinsics.c(this.d, launchCatalogueProductList.d);
            }

            public final int hashCode() {
                int iC = b.c(b.c(this.f6820a.hashCode() * 31, 31, this.b), 31, this.c);
                CatalogueTracking catalogueTracking = this.d;
                return iC + (catalogueTracking == null ? 0 : catalogueTracking.hashCode());
            }

            public final String toString() {
                StringBuilder sbV = a.v("LaunchCatalogueProductList(itemId=", this.f6820a, ", itemName=", this.b, ", storeId=");
                sbV.append(this.c);
                sbV.append(", tracking=");
                sbV.append(this.d);
                sbV.append(")");
                return sbV.toString();
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$Actions;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeepLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6821a;

            public LaunchDeepLink(String str) {
                this.f6821a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchDeepLink) && Intrinsics.c(this.f6821a, ((LaunchDeepLink) obj).f6821a);
            }

            public final int hashCode() {
                return this.f6821a.hashCode();
            }

            public final String toString() {
                return a.h("LaunchDeepLink(deepLink=", this.f6821a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$Actions$LaunchProductList;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$Actions;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductList extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Activities.ProductList.Extras f6822a;

            public LaunchProductList(Activities.ProductList.Extras extras) {
                this.f6822a = extras;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductList) && Intrinsics.c(this.f6822a, ((LaunchProductList) obj).f6822a);
            }

            public final int hashCode() {
                return this.f6822a.hashCode();
            }

            public final String toString() {
                return "LaunchProductList(extras=" + this.f6822a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$Actions$LaunchRecipeDetails;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$Actions;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchRecipeDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6823a;

            public LaunchRecipeDetails(String recipeId) {
                Intrinsics.h(recipeId, "recipeId");
                this.f6823a = recipeId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchRecipeDetails) && Intrinsics.c(this.f6823a, ((LaunchRecipeDetails) obj).f6823a);
            }

            public final int hashCode() {
                return this.f6823a.hashCode();
            }

            public final String toString() {
                return a.h("LaunchRecipeDetails(recipeId=", this.f6823a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$Actions$LaunchWebUrl;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$Actions;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchWebUrl extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6824a;

            public LaunchWebUrl(String url) {
                Intrinsics.h(url, "url");
                this.f6824a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchWebUrl) && Intrinsics.c(this.f6824a, ((LaunchWebUrl) obj).f6824a);
            }

            public final int hashCode() {
                return this.f6824a.hashCode();
            }

            public final String toString() {
                return a.h("LaunchWebUrl(url=", this.f6824a, ")");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$PageState;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PageState {
        public static final PageState d;
        public static final PageState e;
        public static final PageState f;
        public static final /* synthetic */ PageState[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            PageState pageState = new PageState("LOADING", 0);
            d = pageState;
            PageState pageState2 = new PageState("CATALOGUES_DETAILS", 1);
            e = pageState2;
            PageState pageState3 = new PageState("ERROR", 2);
            f = pageState3;
            PageState[] pageStateArr = {pageState, pageState2, pageState3};
            g = pageStateArr;
            h = EnumEntriesKt.a(pageStateArr);
        }

        public static PageState valueOf(String str) {
            return (PageState) Enum.valueOf(PageState.class, str);
        }

        public static PageState[] values() {
            return (PageState[]) g.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$ViewState;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final PageState f6825a;
        public final CatalogueDetailsPageErrorState b;
        public final CatalogueSaleDetailInfo c;
        public final int d;

        public ViewState(PageState pageState, CatalogueDetailsPageErrorState catalogueDetailsPageErrorState, CatalogueSaleDetailInfo catalogueSaleDetailInfo, int i) {
            Intrinsics.h(catalogueSaleDetailInfo, "catalogueSaleDetailInfo");
            this.f6825a = pageState;
            this.b = catalogueDetailsPageErrorState;
            this.c = catalogueSaleDetailInfo;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f6825a == viewState.f6825a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d;
        }

        public final int hashCode() {
            int iHashCode = this.f6825a.hashCode() * 31;
            CatalogueDetailsPageErrorState catalogueDetailsPageErrorState = this.b;
            return Integer.hashCode(this.d) + ((this.c.hashCode() + ((iHashCode + (catalogueDetailsPageErrorState == null ? 0 : catalogueDetailsPageErrorState.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "ViewState(pageState=" + this.f6825a + ", errorState=" + this.b + ", catalogueSaleDetailInfo=" + this.c + ", catalogueDetailsSelectedPage=" + this.d + ")";
        }
    }
}

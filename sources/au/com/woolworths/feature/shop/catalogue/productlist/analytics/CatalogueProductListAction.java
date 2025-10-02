package au.com.woolworths.feature.shop.catalogue.productlist.analytics;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.shop.catalogue.CatalogueScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction;", "Lau/com/woolworths/android/onesite/analytics/Action;", "AddToList", "ApiNetworkError", "ApiNoResults", "ApiServerError", "ChooseProduct", "LoadSuccess", "SeeLess", "SeeMore", "TryAgain", "CheckStock", "SeeInStore", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$AddToList;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$ApiNetworkError;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$ApiNoResults;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$ApiServerError;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$CheckStock;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$ChooseProduct;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$LoadSuccess;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$SeeInStore;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$SeeLess;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$SeeMore;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$TryAgain;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CatalogueProductListAction implements Action {
    public final Screen d = CatalogueScreen.i;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$AddToList;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddToList extends CatalogueProductListAction {
        public static final AddToList e = new AddToList();
        public static final Category f = Category.m;
        public static final String g = "Add To List";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$ApiNetworkError;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ApiNetworkError extends CatalogueProductListAction {
        public static final ApiNetworkError e = new ApiNetworkError();
        public static final Category f = Category.v;
        public static final String g = "Network Error";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$ApiNoResults;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ApiNoResults extends CatalogueProductListAction {
        public static final ApiNoResults e = new ApiNoResults();
        public static final Category f = Category.v;
        public static final String g = "No Results Found";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$ApiServerError;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ApiServerError extends CatalogueProductListAction {
        public static final ApiServerError e = new ApiServerError();
        public static final Category f = Category.v;
        public static final String g = "Server Error";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$CheckStock;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckStock extends CatalogueProductListAction {
        public static final CheckStock e = new CheckStock();
        public static final Category f = Category.m;
        public static final String g = "check stock";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$ChooseProduct;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ChooseProduct extends CatalogueProductListAction {
        public static final ChooseProduct e = new ChooseProduct();
        public static final Category f = Category.m;
        public static final String g = "Product item";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$LoadSuccess;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoadSuccess extends CatalogueProductListAction {
        public static final LoadSuccess e = new LoadSuccess();
        public static final Category f = Category.B;
        public static final String g = "Product Data Loaded";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$SeeInStore;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SeeInStore extends CatalogueProductListAction {
        public final String e;
        public final Category f = Category.m;

        public SeeInStore(String str) {
            this.e = str;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getF() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SeeInStore) && Intrinsics.c(this.e, ((SeeInStore) obj).e);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return a.h("SeeInStore(label=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$SeeLess;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SeeLess extends CatalogueProductListAction {
        public static final SeeLess e = new SeeLess();
        public static final Category f = Category.m;
        public static final String g = "See Less";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$SeeMore;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SeeMore extends CatalogueProductListAction {
        public static final SeeMore e = new SeeMore();
        public static final Category f = Category.m;
        public static final String g = "See More";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction$TryAgain;", "Lau/com/woolworths/feature/shop/catalogue/productlist/analytics/CatalogueProductListAction;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TryAgain extends CatalogueProductListAction {
        public static final TryAgain e = new TryAgain();
        public static final Category f = Category.m;
        public static final String g = "Try Again";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}

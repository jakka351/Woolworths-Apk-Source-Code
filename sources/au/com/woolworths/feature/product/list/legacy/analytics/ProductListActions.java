package au.com.woolworths.feature.product.list.legacy.analytics;

import YU.a;
import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:+\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,\u0082\u0001+-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVW¨\u0006X"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "ActionableCardClick", "ActionableCardImpression", "UserMessageImpression", "FullScreenMessageImpression", "AddToList", "AddToListFromRecipe", "DataLoadedInfoImpression", "DeleteSearchQuery", "FilterChipInStockApply", "ApiFilterChip", "FilterChipInStockRemove", "FilterChipsNoProductsError", "FilterChipSpecialsApply", "FilterChipSpecialsRemove", "FilterClick", "FullScreenMessageCTAClick", "GoogleAdBannerClick", "GoogleAdBannerImpression", "NetworkError", "NetworkErrorTryAgain", "ProductClick", "ProductListEmpty", "ProductListEmptySnackBarShown", "ProductListEmptyTryAgain", "RestrictedItemLoginPrompt", "RestrictedItemLoginPromptCancel", "RestrictedItemLoginPromptLogin", "RestrictedItemLoginPromptOk", "SearchIconClick", "ServerError", "ServerErrorTryAgain", "ShowAvailabilityInfoFromRecipe", "ShowAvailabilityInfo", "UpdateSearchQuery", "AddToListSnackbarImpression", "ProductVarietiesClick", "ProductVarietiesBoostAllClick", "BoostAllFailSnackbarImpression", "BoostAllSuccessSnackbarImpression", "VoiceProductFinderClick", "SaveToWatchlistClick", "RemoveFromWatchlistClick", "SaveToWatchlistSnackbarImpression", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ActionableCardClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ActionableCardImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$AddToList;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$AddToListFromRecipe;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$AddToListSnackbarImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ApiFilterChip;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$BoostAllFailSnackbarImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$BoostAllSuccessSnackbarImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$DataLoadedInfoImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$DeleteSearchQuery;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$FilterChipInStockApply;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$FilterChipInStockRemove;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$FilterChipSpecialsApply;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$FilterChipSpecialsRemove;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$FilterChipsNoProductsError;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$FilterClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$FullScreenMessageCTAClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$FullScreenMessageImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$GoogleAdBannerClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$GoogleAdBannerImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$NetworkError;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$NetworkErrorTryAgain;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ProductClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ProductListEmpty;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ProductListEmptySnackBarShown;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ProductListEmptyTryAgain;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ProductVarietiesBoostAllClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ProductVarietiesClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$RemoveFromWatchlistClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$RestrictedItemLoginPrompt;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$RestrictedItemLoginPromptCancel;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$RestrictedItemLoginPromptLogin;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$RestrictedItemLoginPromptOk;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$SaveToWatchlistClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$SaveToWatchlistSnackbarImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$SearchIconClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ServerError;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ServerErrorTryAgain;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ShowAvailabilityInfo;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ShowAvailabilityInfoFromRecipe;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$UpdateSearchQuery;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$UserMessageImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$VoiceProductFinderClick;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProductListActions implements Action {
    public final Screen d = ProductListScreens.e;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ActionableCardClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionableCardClick extends ProductListActions {
        public static final ActionableCardClick e = new ActionableCardClick();
        public static final Category f = Category.g;
        public static final String g = "Actionable Card";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ActionableCardImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionableCardImpression extends ProductListActions {
        public static final ActionableCardImpression e = new ActionableCardImpression();
        public static final Category f = Category.h;
        public static final String g = "Actionable Card";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$AddToList;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddToList extends ProductListActions {
        public static final AddToList e = new AddToList();
        public static final Category f = Category.m;
        public static final String g = "Add To List";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$AddToListFromRecipe;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddToListFromRecipe extends ProductListActions {
        public static final AddToListFromRecipe e = new AddToListFromRecipe();
        public static final Category f = Category.m;
        public static final String g = "Add To List";
        public static final ProductListScreens h = ProductListScreens.f;

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }

        @Override // au.com.woolworths.feature.product.list.legacy.analytics.ProductListActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return h;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$AddToListSnackbarImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddToListSnackbarImpression extends ProductListActions {
        public static final AddToListSnackbarImpression e = new AddToListSnackbarImpression();
        public static final Category f = Category.g0;
        public static final ProductListScreens g = ProductListScreens.e;
        public static final String h = "saved in my shopping list";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return h;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }

        @Override // au.com.woolworths.feature.product.list.legacy.analytics.ProductListActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return g;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ApiFilterChip;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ApiFilterChip extends ProductListActions {
        public final String e;
        public final boolean f;
        public final Category g;
        public final String h;

        public ApiFilterChip(String filterLabel, boolean z) {
            Intrinsics.h(filterLabel, "filterLabel");
            this.e = filterLabel;
            this.f = z;
            this.g = Category.m;
            this.h = a.i("Filter Chip - ", filterLabel, " - ", z ? "On" : "Off");
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getF() {
            return this.h;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApiFilterChip)) {
                return false;
            }
            ApiFilterChip apiFilterChip = (ApiFilterChip) obj;
            return Intrinsics.c(this.e, apiFilterChip.e) && this.f == apiFilterChip.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + (this.e.hashCode() * 31);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.j("ApiFilterChip(filterLabel=", this.e, ", isOn=", this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$BoostAllFailSnackbarImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BoostAllFailSnackbarImpression extends ProductListActions {
        public static final BoostAllFailSnackbarImpression e = new BoostAllFailSnackbarImpression();
        public static final Category f = Category.g0;
        public static final String g = "unable to boost your rewards offer";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$BoostAllSuccessSnackbarImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BoostAllSuccessSnackbarImpression extends ProductListActions {
        public static final BoostAllSuccessSnackbarImpression e = new BoostAllSuccessSnackbarImpression();
        public static final Category f = Category.g0;
        public static final String g = "your rewards offer has been boosted";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$DataLoadedInfoImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DataLoadedInfoImpression extends ProductListActions {
        public final ProductListScreens e;
        public final Category f = Category.B;
        public final String g = "Product List Data Loaded";

        public DataLoadedInfoImpression(ProductListScreens productListScreens) {
            this.e = productListScreens;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getF() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DataLoadedInfoImpression) && Intrinsics.c(this.e, ((DataLoadedInfoImpression) obj).e);
        }

        @Override // au.com.woolworths.feature.product.list.legacy.analytics.ProductListActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return "DataLoadedInfoImpression(screen=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$DeleteSearchQuery;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeleteSearchQuery extends ProductListActions {
        public static final DeleteSearchQuery e = new DeleteSearchQuery();
        public static final Category f = Category.C;
        public static final String g = "Delete Search Entry";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$FilterChipInStockApply;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterChipInStockApply extends ProductListActions {
        public static final Category e;
        public static final String f;

        static {
            new FilterChipInStockApply();
            e = Category.m;
            f = "Filter Chip - In stock - On";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$FilterChipInStockRemove;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterChipInStockRemove extends ProductListActions {
        public static final Category e;
        public static final String f;

        static {
            new FilterChipInStockRemove();
            e = Category.m;
            f = "Filter Chip - In stock - Off";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$FilterChipSpecialsApply;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterChipSpecialsApply extends ProductListActions {
        public static final Category e;
        public static final String f;

        static {
            new FilterChipSpecialsApply();
            e = Category.m;
            f = "Filter Chip - Specials - On";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$FilterChipSpecialsRemove;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterChipSpecialsRemove extends ProductListActions {
        public static final Category e;
        public static final String f;

        static {
            new FilterChipSpecialsRemove();
            e = Category.m;
            f = "Filter Chip - Specials - Off";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$FilterChipsNoProductsError;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterChipsNoProductsError extends ProductListActions {
        public static final Category e;
        public static final String f;

        static {
            new FilterChipsNoProductsError();
            e = Category.v;
            f = "Unable to Filter";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$FilterClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterClick extends ProductListActions {
        public static final FilterClick e = new FilterClick();
        public static final Category f = Category.m;
        public static final String g = "Filter";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$FullScreenMessageCTAClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SuppressLint
    public static final class FullScreenMessageCTAClick extends ProductListActions {
        public static final FullScreenMessageCTAClick e = new FullScreenMessageCTAClick();
        public static final Category f = Category.m;
        public static final String g = "Message CTA";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$FullScreenMessageImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FullScreenMessageImpression extends ProductListActions {
        public static final FullScreenMessageImpression e = new FullScreenMessageImpression();
        public static final Category f = Category.B;
        public static final String g = "Full screen message";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$GoogleAdBannerClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GoogleAdBannerClick extends ProductListActions {
        public static final GoogleAdBannerClick e = new GoogleAdBannerClick();
        public static final Category f = Category.y;
        public static final String g = "Promotion";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$GoogleAdBannerImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GoogleAdBannerImpression extends ProductListActions {
        public static final GoogleAdBannerImpression e = new GoogleAdBannerImpression();
        public static final Category f = Category.z;
        public static final String g = "Promotion";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$NetworkError;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NetworkError extends ProductListActions {
        public static final NetworkError e = new NetworkError();
        public static final Category f = Category.v;
        public static final String g = "Network Error";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$NetworkErrorTryAgain;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NetworkErrorTryAgain extends ProductListActions {
        public static final NetworkErrorTryAgain e = new NetworkErrorTryAgain();
        public static final Category f = Category.m;
        public static final String g = "Network Error - Try Again";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ProductClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductClick extends ProductListActions {
        public final Screen e = ProductListScreens.e;
        public final Category f = Category.m;
        public final String g = "Product";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getF() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductClick) && Intrinsics.c(this.e, ((ProductClick) obj).e);
        }

        @Override // au.com.woolworths.feature.product.list.legacy.analytics.ProductListActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("ProductClick(screen=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ProductListEmpty;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductListEmpty extends ProductListActions {
        public static final ProductListEmpty e = new ProductListEmpty();
        public static final Category f = Category.v;
        public static final String g = "No Products Found";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ProductListEmptySnackBarShown;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductListEmptySnackBarShown extends ProductListActions {
        public static final ProductListEmptySnackBarShown e = new ProductListEmptySnackBarShown();
        public static final Category f = Category.v;
        public static final String g = "Unable to Filter";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ProductListEmptyTryAgain;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductListEmptyTryAgain extends ProductListActions {
        public static final ProductListEmptyTryAgain e = new ProductListEmptyTryAgain();
        public static final Category f = Category.m;
        public static final String g = "No Result - Try Again";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ProductVarietiesBoostAllClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductVarietiesBoostAllClick extends ProductListActions {
        public static final ProductVarietiesBoostAllClick e = new ProductVarietiesBoostAllClick();
        public static final Category f = Category.m;
        public static final String g = "Activate Offer";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ProductVarietiesClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductVarietiesClick extends ProductListActions {
        public static final ProductVarietiesClick e = new ProductVarietiesClick();
        public static final Category f = Category.D;
        public static final String g = "View product varieties";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$RemoveFromWatchlistClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RemoveFromWatchlistClick extends ProductListActions {
        public static final RemoveFromWatchlistClick e = new RemoveFromWatchlistClick();
        public static final Category f = Category.m0;
        public static final String g = "unsave from watchlist";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RemoveFromWatchlistClick);
        }

        public final int hashCode() {
            return -1411717786;
        }

        public final String toString() {
            return "RemoveFromWatchlistClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$RestrictedItemLoginPrompt;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RestrictedItemLoginPrompt extends ProductListActions {
        public static final RestrictedItemLoginPrompt e = new RestrictedItemLoginPrompt();
        public static final Category f = Category.B;
        public static final String g = "Restricted Item - Login Prompt";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$RestrictedItemLoginPromptCancel;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RestrictedItemLoginPromptCancel extends ProductListActions {
        public static final RestrictedItemLoginPromptCancel e = new RestrictedItemLoginPromptCancel();
        public static final Category f = Category.m;
        public static final String g = "Restricted Item - Cancel";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$RestrictedItemLoginPromptLogin;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RestrictedItemLoginPromptLogin extends ProductListActions {
        public static final RestrictedItemLoginPromptLogin e = new RestrictedItemLoginPromptLogin();
        public static final Category f = Category.m;
        public static final String g = "Restricted Item - Login";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$RestrictedItemLoginPromptOk;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RestrictedItemLoginPromptOk extends ProductListActions {
        public static final RestrictedItemLoginPromptOk e = new RestrictedItemLoginPromptOk();
        public static final Category f = Category.m;
        public static final String g = "Restricted Item - OK";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$SaveToWatchlistClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SaveToWatchlistClick extends ProductListActions {
        public static final SaveToWatchlistClick e = new SaveToWatchlistClick();
        public static final Category f = Category.m0;
        public static final String g = "save to watchlist";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SaveToWatchlistClick);
        }

        public final int hashCode() {
            return 587653360;
        }

        public final String toString() {
            return "SaveToWatchlistClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$SaveToWatchlistSnackbarImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SaveToWatchlistSnackbarImpression extends ProductListActions {
        public final String e;
        public final Category f;
        public final String g;

        public SaveToWatchlistSnackbarImpression(String snackbarMessage) {
            Intrinsics.h(snackbarMessage, "snackbarMessage");
            this.e = snackbarMessage;
            this.f = Category.n0;
            this.g = snackbarMessage;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getF() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SaveToWatchlistSnackbarImpression) && Intrinsics.c(this.e, ((SaveToWatchlistSnackbarImpression) obj).e);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return a.h("SaveToWatchlistSnackbarImpression(snackbarMessage=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$SearchIconClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SearchIconClick extends ProductListActions {
        public static final SearchIconClick e = new SearchIconClick();
        public static final Category f = Category.m;
        public static final String g = "Tap Search Icon";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ServerError;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServerError extends ProductListActions {
        public static final ServerError e = new ServerError();
        public static final Category f = Category.v;
        public static final String g = "Server Error";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ServerErrorTryAgain;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServerErrorTryAgain extends ProductListActions {
        public static final ServerErrorTryAgain e = new ServerErrorTryAgain();
        public static final Category f = Category.m;
        public static final String g = "Server Error - Try Again";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ShowAvailabilityInfo;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShowAvailabilityInfo extends ProductListActions {
        public final String e;
        public final Category f = Category.m;

        public ShowAvailabilityInfo(String str) {
            this.e = str;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getF() {
            return this.e;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowAvailabilityInfo) && Intrinsics.c(this.e, ((ShowAvailabilityInfo) obj).e);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return a.h("ShowAvailabilityInfo(label=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$ShowAvailabilityInfoFromRecipe;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShowAvailabilityInfoFromRecipe extends ProductListActions {
        public final String e;
        public final Category f = Category.m;
        public final ProductListScreens g = ProductListScreens.f;

        public ShowAvailabilityInfoFromRecipe(String str) {
            this.e = str;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getF() {
            return this.e;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowAvailabilityInfoFromRecipe) && Intrinsics.c(this.e, ((ShowAvailabilityInfoFromRecipe) obj).e);
        }

        @Override // au.com.woolworths.feature.product.list.legacy.analytics.ProductListActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.g;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return a.h("ShowAvailabilityInfoFromRecipe(label=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$UpdateSearchQuery;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateSearchQuery extends ProductListActions {
        public static final UpdateSearchQuery e = new UpdateSearchQuery();
        public static final Category f = Category.C;
        public static final String g = "Update Search Entry";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$UserMessageImpression;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UserMessageImpression extends ProductListActions {
        public static final UserMessageImpression e = new UserMessageImpression();
        public static final Category f = Category.u;
        public static final String g = "User message";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions$VoiceProductFinderClick;", "Lau/com/woolworths/feature/product/list/legacy/analytics/ProductListActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VoiceProductFinderClick extends ProductListActions {
        public final Category e = Category.k0;
        public final String f = "tap on olive voice product finder";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getF() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.e;
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public Screen getD() {
        return this.d;
    }
}

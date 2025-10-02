package au.com.woolworths.feature.product.list;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.unit.IntSizeKt;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.feature.product.list.analytics.ProductListScreens;
import au.com.woolworths.feature.product.list.data.FullScreenMessage;
import au.com.woolworths.feature.product.list.data.IngredientCardApiData;
import au.com.woolworths.feature.product.list.data.PopupMessage;
import au.com.woolworths.feature.product.list.data.ProductListZeroResults;
import au.com.woolworths.feature.product.list.data.ZeroResultPageData;
import au.com.woolworths.feature.product.list.errorstates.ProductListErrorState;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBoostState;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import au.com.woolworths.product.models.DietaryInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostAllBannerState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract;", "", "Actions", "ProductListActivityActions", "ViewState", "ProductListFilterState", "CoachMark", "ProductListFlow", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ProductListContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001c\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u0082\u0001\u001c\u001e\u001f !\"#$%&'()*+,-./0123456789¨\u0006:"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "", "ChangeDisplayMode", "ShowNoResultsMessage", "LaunchProductListProductGroup", "LaunchProductAddOrReplace", "LaunchProductSearch", "LaunchProductUpdate", "LaunchAddToList", "LaunchAvailabilityMessage", "DisplayRestrictedItemPrompt", "ShowTransientEdrOfferBoostError", "HandleBannerClick", "DisplayPopupMessage", "LaunchEducationBottomSheet", "LaunchProductVarieties", "LaunchProductsTab", "LaunchDeeplink", "NavigateToLink", "BoostAllSucceeded", "BoostAllFailed", "LaunchNutritionInfo", "LaunchVideoAdBottomSheet", "NavigateBack", "LaunchVoiceProductSearch", "DisplaySnackbarForWatchlist", "LaunchWatchlistGuestOnboardingScreen", "ShowMapFeatureHighlight", "LaunchCartScreen", "OpenOliveChat", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$BoostAllFailed;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$BoostAllSucceeded;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$ChangeDisplayMode;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$DisplayPopupMessage;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$DisplayRestrictedItemPrompt;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$DisplaySnackbarForWatchlist;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$HandleBannerClick;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchAddToList;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchAvailabilityMessage;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchCartScreen;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchDeeplink;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchEducationBottomSheet;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchNutritionInfo;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchProductAddOrReplace;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchProductListProductGroup;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchProductSearch;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchProductUpdate;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchProductVarieties;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchProductsTab;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchVideoAdBottomSheet;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchVoiceProductSearch;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$NavigateBack;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$NavigateToLink;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$OpenOliveChat;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$ShowMapFeatureHighlight;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$ShowNoResultsMessage;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions$ShowTransientEdrOfferBoostError;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$BoostAllFailed;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BoostAllFailed extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final TrackingMetadata f5213a;

            public BoostAllFailed(TrackingMetadata trackingMetadata) {
                this.f5213a = trackingMetadata;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BoostAllFailed) && Intrinsics.c(this.f5213a, ((BoostAllFailed) obj).f5213a);
            }

            public final int hashCode() {
                return this.f5213a.d.hashCode();
            }

            public final String toString() {
                return "BoostAllFailed(boostMetadata=" + this.f5213a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$BoostAllSucceeded;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BoostAllSucceeded extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final TrackingMetadata f5214a;

            public BoostAllSucceeded(TrackingMetadata trackingMetadata) {
                this.f5214a = trackingMetadata;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BoostAllSucceeded) && Intrinsics.c(this.f5214a, ((BoostAllSucceeded) obj).f5214a);
            }

            public final int hashCode() {
                return this.f5214a.d.hashCode();
            }

            public final String toString() {
                return "BoostAllSucceeded(boostMetadata=" + this.f5214a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$ChangeDisplayMode;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ChangeDisplayMode extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductsDisplayMode f5215a;

            public ChangeDisplayMode(ProductsDisplayMode productsDisplayMode) {
                Intrinsics.h(productsDisplayMode, "productsDisplayMode");
                this.f5215a = productsDisplayMode;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeDisplayMode) && this.f5215a == ((ChangeDisplayMode) obj).f5215a;
            }

            public final int hashCode() {
                return this.f5215a.hashCode();
            }

            public final String toString() {
                return "ChangeDisplayMode(productsDisplayMode=" + this.f5215a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$DisplayPopupMessage;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayPopupMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final PopupMessage f5216a;

            public DisplayPopupMessage(PopupMessage popupMessage) {
                Intrinsics.h(popupMessage, "popupMessage");
                this.f5216a = popupMessage;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayPopupMessage) && Intrinsics.c(this.f5216a, ((DisplayPopupMessage) obj).f5216a);
            }

            public final int hashCode() {
                return this.f5216a.hashCode();
            }

            public final String toString() {
                return "DisplayPopupMessage(popupMessage=" + this.f5216a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$DisplayRestrictedItemPrompt;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayRestrictedItemPrompt extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f5217a;
            public final boolean b;

            static {
                int i = ProductCard.$stable;
            }

            public DisplayRestrictedItemPrompt(ProductCard data, boolean z) {
                Intrinsics.h(data, "data");
                this.f5217a = data;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DisplayRestrictedItemPrompt)) {
                    return false;
                }
                DisplayRestrictedItemPrompt displayRestrictedItemPrompt = (DisplayRestrictedItemPrompt) obj;
                return Intrinsics.c(this.f5217a, displayRestrictedItemPrompt.f5217a) && this.b == displayRestrictedItemPrompt.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.f5217a.hashCode() * 31);
            }

            public final String toString() {
                return "DisplayRestrictedItemPrompt(data=" + this.f5217a + ", isLoggedIn=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$DisplaySnackbarForWatchlist;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplaySnackbarForWatchlist extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5218a;
            public final ResText b;
            public final boolean c;
            public final ProductCard d;

            public DisplaySnackbarForWatchlist(String str, ResText resText, boolean z, ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f5218a = str;
                this.b = resText;
                this.c = z;
                this.d = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DisplaySnackbarForWatchlist)) {
                    return false;
                }
                DisplaySnackbarForWatchlist displaySnackbarForWatchlist = (DisplaySnackbarForWatchlist) obj;
                return this.f5218a.equals(displaySnackbarForWatchlist.f5218a) && this.b.equals(displaySnackbarForWatchlist.b) && this.c == displaySnackbarForWatchlist.c && Intrinsics.c(this.d, displaySnackbarForWatchlist.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + androidx.camera.core.impl.b.e((this.b.hashCode() + (this.f5218a.hashCode() * 31)) * 31, 31, this.c);
            }

            public final String toString() {
                return "DisplaySnackbarForWatchlist(watchlistId=" + this.f5218a + ", message=" + this.b + ", showViewListAction=" + this.c + ", productCard=" + this.d + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$HandleBannerClick;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class HandleBannerClick extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5219a;

            public HandleBannerClick(String link) {
                Intrinsics.h(link, "link");
                this.f5219a = link;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HandleBannerClick) && Intrinsics.c(this.f5219a, ((HandleBannerClick) obj).f5219a);
            }

            public final int hashCode() {
                return this.f5219a.hashCode();
            }

            public final String toString() {
                return YU.a.h("HandleBannerClick(link=", this.f5219a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchAddToList;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAddToList extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f5220a;
            public final ProductListScreens b;
            public final TrackingMetadata c;
            public final boolean d;

            public LaunchAddToList(ProductCard data, ProductListScreens productListScreens, TrackingMetadata trackingMetadata, boolean z) {
                Intrinsics.h(data, "data");
                this.f5220a = data;
                this.b = productListScreens;
                this.c = trackingMetadata;
                this.d = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchAddToList)) {
                    return false;
                }
                LaunchAddToList launchAddToList = (LaunchAddToList) obj;
                return Intrinsics.c(this.f5220a, launchAddToList.f5220a) && this.b.equals(launchAddToList.b) && Intrinsics.c(this.c, launchAddToList.c) && this.d == launchAddToList.d;
            }

            public final int hashCode() {
                int iHashCode = (this.b.hashCode() + (this.f5220a.hashCode() * 31)) * 31;
                TrackingMetadata trackingMetadata = this.c;
                return Boolean.hashCode(this.d) + ((iHashCode + (trackingMetadata == null ? 0 : trackingMetadata.d.hashCode())) * 31);
            }

            public final String toString() {
                return "LaunchAddToList(data=" + this.f5220a + ", screen=" + this.b + ", trackingMetadata=" + this.c + ", hasVarieties=" + this.d + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchAvailabilityMessage;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAvailabilityMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f5221a;
            public final ProductListScreens b;
            public final TrackingMetadata c;

            public LaunchAvailabilityMessage(ProductCard data, ProductListScreens productListScreens, TrackingMetadata trackingMetadata) {
                Intrinsics.h(data, "data");
                this.f5221a = data;
                this.b = productListScreens;
                this.c = trackingMetadata;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchAvailabilityMessage)) {
                    return false;
                }
                LaunchAvailabilityMessage launchAvailabilityMessage = (LaunchAvailabilityMessage) obj;
                return Intrinsics.c(this.f5221a, launchAvailabilityMessage.f5221a) && this.b.equals(launchAvailabilityMessage.b) && Intrinsics.c(this.c, launchAvailabilityMessage.c);
            }

            public final int hashCode() {
                int iHashCode = (this.b.hashCode() + (this.f5221a.hashCode() * 31)) * 31;
                TrackingMetadata trackingMetadata = this.c;
                return iHashCode + (trackingMetadata == null ? 0 : trackingMetadata.d.hashCode());
            }

            public final String toString() {
                return "LaunchAvailabilityMessage(data=" + this.f5221a + ", screen=" + this.b + ", trackingMetadata=" + this.c + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchCartScreen;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCartScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchCartScreen f5222a = new LaunchCartScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchCartScreen);
            }

            public final int hashCode() {
                return -2025003477;
            }

            public final String toString() {
                return "LaunchCartScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchDeeplink;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeeplink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5223a;
            public final List b;

            public LaunchDeeplink(String deeplink, List list) {
                Intrinsics.h(deeplink, "deeplink");
                this.f5223a = deeplink;
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchDeeplink)) {
                    return false;
                }
                LaunchDeeplink launchDeeplink = (LaunchDeeplink) obj;
                return Intrinsics.c(this.f5223a, launchDeeplink.f5223a) && Intrinsics.c(this.b, launchDeeplink.b);
            }

            public final int hashCode() {
                int iHashCode = this.f5223a.hashCode() * 31;
                List list = this.b;
                return iHashCode + (list == null ? 0 : list.hashCode());
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.i("LaunchDeeplink(deeplink=", this.f5223a, ", analyticsExtraContent=", ")", this.b);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchEducationBottomSheet;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchEducationBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final BottomSheetContent.Marketplace f5224a;
            public final InfoSection b;

            public LaunchEducationBottomSheet(BottomSheetContent.Marketplace bottomSheet, InfoSection infoSection) {
                Intrinsics.h(bottomSheet, "bottomSheet");
                Intrinsics.h(infoSection, "infoSection");
                this.f5224a = bottomSheet;
                this.b = infoSection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchEducationBottomSheet)) {
                    return false;
                }
                LaunchEducationBottomSheet launchEducationBottomSheet = (LaunchEducationBottomSheet) obj;
                return Intrinsics.c(this.f5224a, launchEducationBottomSheet.f5224a) && Intrinsics.c(this.b, launchEducationBottomSheet.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f5224a.hashCode() * 31);
            }

            public final String toString() {
                return "LaunchEducationBottomSheet(bottomSheet=" + this.f5224a + ", infoSection=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchNutritionInfo;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchNutritionInfo extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final DietaryInfo f5225a;

            static {
                int i = DietaryInfo.$stable;
            }

            public LaunchNutritionInfo(DietaryInfo dietaryInfo) {
                this.f5225a = dietaryInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchNutritionInfo) && Intrinsics.c(this.f5225a, ((LaunchNutritionInfo) obj).f5225a);
            }

            public final int hashCode() {
                return this.f5225a.hashCode();
            }

            public final String toString() {
                return "LaunchNutritionInfo(dietaryInfo=" + this.f5225a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchProductAddOrReplace;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductAddOrReplace extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f5226a;
            public final ProductListScreens b;
            public final TrackingMetadata c;
            public final ProductCard d;

            public LaunchProductAddOrReplace(ProductCard productToAdd, ProductListScreens productListScreens, TrackingMetadata trackingMetadata, ProductCard productCard) {
                Intrinsics.h(productToAdd, "productToAdd");
                this.f5226a = productToAdd;
                this.b = productListScreens;
                this.c = trackingMetadata;
                this.d = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchProductAddOrReplace)) {
                    return false;
                }
                LaunchProductAddOrReplace launchProductAddOrReplace = (LaunchProductAddOrReplace) obj;
                return Intrinsics.c(this.f5226a, launchProductAddOrReplace.f5226a) && this.b.equals(launchProductAddOrReplace.b) && Intrinsics.c(this.c, launchProductAddOrReplace.c) && Intrinsics.c(this.d, launchProductAddOrReplace.d);
            }

            public final int hashCode() {
                int iHashCode = (this.b.hashCode() + (this.f5226a.hashCode() * 31)) * 31;
                TrackingMetadata trackingMetadata = this.c;
                int iHashCode2 = (iHashCode + (trackingMetadata == null ? 0 : trackingMetadata.d.hashCode())) * 31;
                ProductCard productCard = this.d;
                return iHashCode2 + (productCard != null ? productCard.hashCode() : 0);
            }

            public final String toString() {
                return "LaunchProductAddOrReplace(productToAdd=" + this.f5226a + ", screen=" + this.b + ", trackingMetadata=" + this.c + ", productToRemove=" + this.d + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchProductListProductGroup;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductListProductGroup extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5227a;
            public final String b;
            public final String c;

            public LaunchProductListProductGroup(String str, String str2, String str3) {
                this.f5227a = str;
                this.b = str2;
                this.c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchProductListProductGroup)) {
                    return false;
                }
                LaunchProductListProductGroup launchProductListProductGroup = (LaunchProductListProductGroup) obj;
                return Intrinsics.c(this.f5227a, launchProductListProductGroup.f5227a) && Intrinsics.c(this.b, launchProductListProductGroup.b) && Intrinsics.c(this.c, launchProductListProductGroup.c);
            }

            public final int hashCode() {
                int iHashCode = this.f5227a.hashCode() * 31;
                String str = this.b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return YU.a.o(YU.a.v("LaunchProductListProductGroup(groupId=", this.f5227a, ", title=", this.b, ", type="), this.c, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchProductSearch;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductSearch extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5228a;
            public final ProductCard b;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductSearch(ProductCard productCard, String str) {
                this.f5228a = str;
                this.b = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchProductSearch)) {
                    return false;
                }
                LaunchProductSearch launchProductSearch = (LaunchProductSearch) obj;
                return Intrinsics.c(this.f5228a, launchProductSearch.f5228a) && Intrinsics.c(this.b, launchProductSearch.b);
            }

            public final int hashCode() {
                String str = this.f5228a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                ProductCard productCard = this.b;
                return iHashCode + (productCard != null ? productCard.hashCode() : 0);
            }

            public final String toString() {
                return "LaunchProductSearch(searchTerm=" + this.f5228a + ", productToReplace=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchProductUpdate;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductUpdate extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f5229a;
            public final ProductListScreens b;
            public final TrackingMetadata c;

            public LaunchProductUpdate(ProductCard data, ProductListScreens productListScreens, TrackingMetadata trackingMetadata) {
                Intrinsics.h(data, "data");
                this.f5229a = data;
                this.b = productListScreens;
                this.c = trackingMetadata;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchProductUpdate)) {
                    return false;
                }
                LaunchProductUpdate launchProductUpdate = (LaunchProductUpdate) obj;
                return Intrinsics.c(this.f5229a, launchProductUpdate.f5229a) && this.b.equals(launchProductUpdate.b) && Intrinsics.c(this.c, launchProductUpdate.c);
            }

            public final int hashCode() {
                int iHashCode = (this.b.hashCode() + (this.f5229a.hashCode() * 31)) * 31;
                TrackingMetadata trackingMetadata = this.c;
                return iHashCode + (trackingMetadata == null ? 0 : trackingMetadata.d.hashCode());
            }

            public final String toString() {
                return "LaunchProductUpdate(data=" + this.f5229a + ", screen=" + this.b + ", trackingMetadata=" + this.c + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchProductVarieties;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductVarieties extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5230a;

            public LaunchProductVarieties(String priceFamilyId) {
                Intrinsics.h(priceFamilyId, "priceFamilyId");
                this.f5230a = priceFamilyId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductVarieties) && Intrinsics.c(this.f5230a, ((LaunchProductVarieties) obj).f5230a);
            }

            public final int hashCode() {
                return this.f5230a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchProductVarieties(priceFamilyId=", this.f5230a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchProductsTab;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductsTab extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchProductsTab f5231a = new LaunchProductsTab();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchProductsTab);
            }

            public final int hashCode() {
                return -157055758;
            }

            public final String toString() {
                return "LaunchProductsTab";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchVideoAdBottomSheet;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchVideoAdBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final VideoAdBottomSheet f5232a;

            public LaunchVideoAdBottomSheet(VideoAdBottomSheet videoAdBottomSheet) {
                Intrinsics.h(videoAdBottomSheet, "videoAdBottomSheet");
                this.f5232a = videoAdBottomSheet;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchVideoAdBottomSheet) && Intrinsics.c(this.f5232a, ((LaunchVideoAdBottomSheet) obj).f5232a);
            }

            public final int hashCode() {
                return this.f5232a.hashCode();
            }

            public final String toString() {
                return "LaunchVideoAdBottomSheet(videoAdBottomSheet=" + this.f5232a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchVoiceProductSearch;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchVoiceProductSearch extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchVoiceProductSearch f5233a = new LaunchVoiceProductSearch();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchVoiceProductSearch);
            }

            public final int hashCode() {
                return -921016604;
            }

            public final String toString() {
                return "LaunchVoiceProductSearch";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchWatchlistGuestOnboardingScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchWatchlistGuestOnboardingScreen f5234a = new LaunchWatchlistGuestOnboardingScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchWatchlistGuestOnboardingScreen);
            }

            public final int hashCode() {
                return 1934460273;
            }

            public final String toString() {
                return "LaunchWatchlistGuestOnboardingScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$NavigateBack;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateBack extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateBack f5235a = new NavigateBack();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateBack);
            }

            public final int hashCode() {
                return -915059100;
            }

            public final String toString() {
                return "NavigateBack";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$NavigateToLink;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5236a;

            public NavigateToLink(String url) {
                Intrinsics.h(url, "url");
                this.f5236a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateToLink) && Intrinsics.c(this.f5236a, ((NavigateToLink) obj).f5236a);
            }

            public final int hashCode() {
                return this.f5236a.hashCode();
            }

            public final String toString() {
                return YU.a.h("NavigateToLink(url=", this.f5236a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$OpenOliveChat;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenOliveChat extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenOliveChat f5237a = new OpenOliveChat();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenOliveChat);
            }

            public final int hashCode() {
                return 312446397;
            }

            public final String toString() {
                return "OpenOliveChat";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$ShowMapFeatureHighlight;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowMapFeatureHighlight extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowMapFeatureHighlight f5238a = new ShowMapFeatureHighlight();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowMapFeatureHighlight);
            }

            public final int hashCode() {
                return -1272269391;
            }

            public final String toString() {
                return "ShowMapFeatureHighlight";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$ShowNoResultsMessage;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowNoResultsMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowNoResultsMessage f5239a = new ShowNoResultsMessage();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowNoResultsMessage);
            }

            public final int hashCode() {
                return -1986783013;
            }

            public final String toString() {
                return "ShowNoResultsMessage";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$Actions$ShowTransientEdrOfferBoostError;", "Lau/com/woolworths/feature/product/list/ProductListContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowTransientEdrOfferBoostError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5240a;

            public ShowTransientEdrOfferBoostError(String str) {
                this.f5240a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowTransientEdrOfferBoostError) && Intrinsics.c(this.f5240a, ((ShowTransientEdrOfferBoostError) obj).f5240a);
            }

            public final int hashCode() {
                return this.f5240a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ShowTransientEdrOfferBoostError(errorMessage=", this.f5240a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions;", "", "LaunchProductListOptions", "LaunchAlternativeProducts", "LaunchProductDetails", "LaunchInstoreMap", "ShowFindInfoBottomSheet", "LaunchProductAvailability", "Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions$LaunchAlternativeProducts;", "Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions$LaunchInstoreMap;", "Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions$LaunchProductAvailability;", "Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions$LaunchProductDetails;", "Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions$LaunchProductListOptions;", "Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions$ShowFindInfoBottomSheet;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ProductListActivityActions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions$LaunchAlternativeProducts;", "Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAlternativeProducts extends ProductListActivityActions {

            /* renamed from: a, reason: collision with root package name */
            public final IngredientCardApiData f5242a;

            public LaunchAlternativeProducts(IngredientCardApiData ingredientCard) {
                Intrinsics.h(ingredientCard, "ingredientCard");
                this.f5242a = ingredientCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchAlternativeProducts) && Intrinsics.c(this.f5242a, ((LaunchAlternativeProducts) obj).f5242a);
            }

            public final int hashCode() {
                return this.f5242a.hashCode();
            }

            public final String toString() {
                return "LaunchAlternativeProducts(ingredientCard=" + this.f5242a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions$LaunchInstoreMap;", "Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchInstoreMap extends ProductListActivityActions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f5243a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchInstoreMap(ProductCard data) {
                Intrinsics.h(data, "data");
                this.f5243a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchInstoreMap) && Intrinsics.c(this.f5243a, ((LaunchInstoreMap) obj).f5243a);
            }

            public final int hashCode() {
                return this.f5243a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchInstoreMap(data=", this.f5243a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions$LaunchProductAvailability;", "Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductAvailability extends ProductListActivityActions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f5244a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductAvailability(ProductCard data) {
                Intrinsics.h(data, "data");
                this.f5244a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductAvailability) && Intrinsics.c(this.f5244a, ((LaunchProductAvailability) obj).f5244a);
            }

            public final int hashCode() {
                return this.f5244a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchProductAvailability(data=", this.f5244a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions$LaunchProductDetails;", "Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductDetails extends ProductListActivityActions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f5245a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductDetails(ProductCard data) {
                Intrinsics.h(data, "data");
                this.f5245a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductDetails) && Intrinsics.c(this.f5245a, ((LaunchProductDetails) obj).f5245a);
            }

            public final int hashCode() {
                return this.f5245a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchProductDetails(data=", this.f5245a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions$LaunchProductListOptions;", "Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductListOptions extends ProductListActivityActions {

            /* renamed from: a, reason: collision with root package name */
            public final Activities.ProductList.Extras f5246a;

            public LaunchProductListOptions(Activities.ProductList.Extras extras) {
                this.f5246a = extras;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductListOptions) && Intrinsics.c(this.f5246a, ((LaunchProductListOptions) obj).f5246a);
            }

            public final int hashCode() {
                return this.f5246a.hashCode();
            }

            public final String toString() {
                return "LaunchProductListOptions(pageExtras=" + this.f5246a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions$ShowFindInfoBottomSheet;", "Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowFindInfoBottomSheet extends ProductListActivityActions {
            static {
                int i = ProductCard.$stable;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowFindInfoBottomSheet);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "ShowFindInfoBottomSheet(data=null)";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$ProductListFilterState;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListFilterState {

        /* renamed from: a, reason: collision with root package name */
        public final int f5247a;
        public final boolean b;

        public ProductListFilterState(int i, boolean z) {
            this.f5247a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductListFilterState)) {
                return false;
            }
            ProductListFilterState productListFilterState = (ProductListFilterState) obj;
            return this.f5247a == productListFilterState.f5247a && this.b == productListFilterState.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.f5247a) * 31);
        }

        public final String toString() {
            return "ProductListFilterState(activeFilterCount=" + this.f5247a + ", shouldShowDot=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$ProductListFlow;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListFlow {

        /* renamed from: a, reason: collision with root package name */
        public final String f5248a;
        public final List b;
        public final List c;
        public final ZeroResultPageData d;
        public final ProductListZeroResults e;
        public final int f;
        public final ProductListFilterState g;
        public final List h;

        public ProductListFlow(String str, List chips, List facetChips, ZeroResultPageData zeroResultPageData, ProductListZeroResults productListZeroResults, int i, ProductListFilterState productListFilterState, List insetBanners) {
            Intrinsics.h(chips, "chips");
            Intrinsics.h(facetChips, "facetChips");
            Intrinsics.h(insetBanners, "insetBanners");
            this.f5248a = str;
            this.b = chips;
            this.c = facetChips;
            this.d = zeroResultPageData;
            this.e = productListZeroResults;
            this.f = i;
            this.g = productListFilterState;
            this.h = insetBanners;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v9, types: [java.util.List] */
        public static ProductListFlow a(ProductListFlow productListFlow, String str, List list, List list2, ZeroResultPageData zeroResultPageData, ProductListZeroResults productListZeroResults, int i, ProductListFilterState productListFilterState, ArrayList arrayList, int i2) {
            if ((i2 & 1) != 0) {
                str = productListFlow.f5248a;
            }
            String str2 = str;
            if ((i2 & 2) != 0) {
                list = productListFlow.b;
            }
            List chips = list;
            productListFlow.getClass();
            productListFlow.getClass();
            productListFlow.getClass();
            productListFlow.getClass();
            if ((i2 & 64) != 0) {
                list2 = productListFlow.c;
            }
            List facetChips = list2;
            if ((i2 & 128) != 0) {
                zeroResultPageData = productListFlow.d;
            }
            ZeroResultPageData zeroResultPageData2 = zeroResultPageData;
            if ((i2 & 256) != 0) {
                productListZeroResults = productListFlow.e;
            }
            ProductListZeroResults productListZeroResults2 = productListZeroResults;
            if ((i2 & 512) != 0) {
                i = productListFlow.f;
            }
            int i3 = i;
            ProductListFilterState productListFilterState2 = (i2 & 1024) != 0 ? productListFlow.g : productListFilterState;
            ArrayList insetBanners = (i2 & 2048) != 0 ? productListFlow.h : arrayList;
            productListFlow.getClass();
            Intrinsics.h(chips, "chips");
            Intrinsics.h(facetChips, "facetChips");
            Intrinsics.h(insetBanners, "insetBanners");
            return new ProductListFlow(str2, chips, facetChips, zeroResultPageData2, productListZeroResults2, i3, productListFilterState2, insetBanners);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductListFlow)) {
                return false;
            }
            ProductListFlow productListFlow = (ProductListFlow) obj;
            return Intrinsics.c(this.f5248a, productListFlow.f5248a) && Intrinsics.c(this.b, productListFlow.b) && Intrinsics.c(this.c, productListFlow.c) && Intrinsics.c(this.d, productListFlow.d) && Intrinsics.c(this.e, productListFlow.e) && this.f == productListFlow.f && this.g.equals(productListFlow.g) && Intrinsics.c(this.h, productListFlow.h);
        }

        public final int hashCode() {
            String str = this.f5248a;
            int iD = androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d((str == null ? 0 : str.hashCode()) * 31, 28629151, this.b), 31, this.c);
            ZeroResultPageData zeroResultPageData = this.d;
            int iHashCode = (iD + (zeroResultPageData == null ? 0 : zeroResultPageData.hashCode())) * 31;
            ProductListZeroResults productListZeroResults = this.e;
            return this.h.hashCode() + ((this.g.hashCode() + androidx.camera.core.impl.b.a(this.f, (iHashCode + (productListZeroResults != null ? productListZeroResults.hashCode() : 0)) * 31, 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbS = au.com.woolworths.android.onesite.a.s("ProductListFlow(pageTitle=", this.f5248a, ", chips=", ", chipId=null, facetChipId=null, selectedChips=null, selectedFilters=null, facetChips=", this.b);
            sbS.append(this.c);
            sbS.append(", zeroResultContent=");
            sbS.append(this.d);
            sbS.append(", zeroResult=");
            sbS.append(this.e);
            sbS.append(", totalCount=");
            sbS.append(this.f);
            sbS.append(", filterState=");
            sbS.append(this.g);
            sbS.append(", insetBanners=");
            sbS.append(this.h);
            sbS.append(")");
            return sbS.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$ViewState;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public final Integer A;
        public final j B;

        /* renamed from: a, reason: collision with root package name */
        public final int f5249a;
        public final boolean b;
        public final ProductListErrorState c;
        public final int d;
        public final boolean e;
        public final List f;
        public final boolean g;
        public final FullScreenMessage h;
        public final BoostAllBannerState i;
        public final boolean j;
        public final Activities.ProductList.Extras k;
        public final CoachMark l;
        public final List m;
        public final List n;
        public final boolean o;
        public final String p;
        public final boolean q;
        public final List r;
        public final ZeroResultPageData s;
        public final ProductListZeroResults t;
        public final VideoAdPlayerState u;
        public final EdrOfferBoostState v;
        public final String w;
        public final String x;
        public final List y;
        public final Map z;

        public ViewState(int i, boolean z, ProductListErrorState productListErrorState, int i2, boolean z2, List list, boolean z3, FullScreenMessage fullScreenMessage, BoostAllBannerState boostAllBannerState, boolean z4, Activities.ProductList.Extras extras, CoachMark coachMark, List chips, List facetChips, boolean z5, String str, boolean z6, List watchlistedProductIds, ZeroResultPageData zeroResultPageData, ProductListZeroResults productListZeroResults, VideoAdPlayerState videoAdPlayerState, EdrOfferBoostState edrOfferBoostState, String str2, String str3, List list2, Map map, Integer num) {
            Intrinsics.h(boostAllBannerState, "boostAllBannerState");
            Intrinsics.h(chips, "chips");
            Intrinsics.h(facetChips, "facetChips");
            Intrinsics.h(watchlistedProductIds, "watchlistedProductIds");
            Intrinsics.h(videoAdPlayerState, "videoAdPlayerState");
            Intrinsics.h(edrOfferBoostState, "edrOfferBoostState");
            this.f5249a = i;
            this.b = z;
            this.c = productListErrorState;
            this.d = i2;
            this.e = z2;
            this.f = list;
            this.g = z3;
            this.h = fullScreenMessage;
            this.i = boostAllBannerState;
            this.j = z4;
            this.k = extras;
            this.l = coachMark;
            this.m = chips;
            this.n = facetChips;
            this.o = z5;
            this.p = str;
            this.q = z6;
            this.r = watchlistedProductIds;
            this.s = zeroResultPageData;
            this.t = productListZeroResults;
            this.u = videoAdPlayerState;
            this.v = edrOfferBoostState;
            this.w = str2;
            this.x = str3;
            this.y = list2;
            this.z = map;
            this.A = num;
            this.B = new j(this, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f5249a == viewState.f5249a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d && this.e == viewState.e && Intrinsics.c(this.f, viewState.f) && this.g == viewState.g && Intrinsics.c(this.h, viewState.h) && Intrinsics.c(this.i, viewState.i) && this.j == viewState.j && Intrinsics.c(this.k, viewState.k) && Intrinsics.c(this.l, viewState.l) && Intrinsics.c(this.m, viewState.m) && Intrinsics.c(this.n, viewState.n) && this.o == viewState.o && Intrinsics.c(this.p, viewState.p) && this.q == viewState.q && Intrinsics.c(this.r, viewState.r) && Intrinsics.c(this.s, viewState.s) && Intrinsics.c(this.t, viewState.t) && Intrinsics.c(this.u, viewState.u) && Intrinsics.c(this.v, viewState.v) && Intrinsics.c(this.w, viewState.w) && Intrinsics.c(this.x, viewState.x) && Intrinsics.c(this.y, viewState.y) && Intrinsics.c(this.z, viewState.z) && Intrinsics.c(this.A, viewState.A);
        }

        public final int hashCode() {
            int iE = androidx.camera.core.impl.b.e(Integer.hashCode(this.f5249a) * 31, 31, this.b);
            ProductListErrorState productListErrorState = this.c;
            int iE2 = androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.a(this.d, (iE + (productListErrorState == null ? 0 : productListErrorState.hashCode())) * 31, 31), 31, this.e), 31, this.f), 31, this.g);
            FullScreenMessage fullScreenMessage = this.h;
            int iHashCode = (this.k.hashCode() + androidx.camera.core.impl.b.e((this.i.hashCode() + ((iE2 + (fullScreenMessage == null ? 0 : fullScreenMessage.hashCode())) * 31)) * 31, 31, this.j)) * 31;
            CoachMark coachMark = this.l;
            int iE3 = androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d((iHashCode + (coachMark == null ? 0 : coachMark.hashCode())) * 31, 31, this.m), 31, this.n), 31, this.o);
            String str = this.p;
            int iD = androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.e((iE3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.q), 31, this.r);
            ZeroResultPageData zeroResultPageData = this.s;
            int iHashCode2 = (iD + (zeroResultPageData == null ? 0 : zeroResultPageData.hashCode())) * 31;
            ProductListZeroResults productListZeroResults = this.t;
            int iHashCode3 = (this.v.hashCode() + ((this.u.hashCode() + ((iHashCode2 + (productListZeroResults == null ? 0 : productListZeroResults.hashCode())) * 31)) * 31)) * 31;
            String str2 = this.w;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.x;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List list = this.y;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            Map map = this.z;
            int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
            Integer num = this.A;
            return iHashCode7 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(totalNumberOfProducts=");
            sb.append(this.f5249a);
            sb.append(", areFiltersEnabled=");
            sb.append(this.b);
            sb.append(", errorState=");
            sb.append(this.c);
            sb.append(", activeFilterCount=");
            sb.append(this.d);
            sb.append(", shouldShowDot=");
            sb.append(this.e);
            sb.append(", insetBanners=");
            sb.append(this.f);
            sb.append(", isGridListToggleSuppressed=");
            sb.append(this.g);
            sb.append(", fullScreenMessage=");
            sb.append(this.h);
            sb.append(", boostAllBannerState=");
            sb.append(this.i);
            sb.append(", shouldFilterChipShow=");
            sb.append(this.j);
            sb.append(", pageExtras=");
            sb.append(this.k);
            sb.append(", coachMark=");
            sb.append(this.l);
            sb.append(", chips=");
            au.com.woolworths.android.onesite.a.C(sb, this.m, ", facetChips=", this.n, ", isProductsListCountInvisible=");
            au.com.woolworths.android.onesite.a.y(", pageTitle=", this.p, ", isWatchlistEnabled=", sb, this.o);
            sb.append(this.q);
            sb.append(", watchlistedProductIds=");
            sb.append(this.r);
            sb.append(", zeroResultContent=");
            sb.append(this.s);
            sb.append(", zeroResult=");
            sb.append(this.t);
            sb.append(", videoAdPlayerState=");
            sb.append(this.u);
            sb.append(", edrOfferBoostState=");
            sb.append(this.v);
            sb.append(", chipId=");
            androidx.constraintlayout.core.state.a.B(sb, this.w, ", facetChipId=", this.x, ", selectedChips=");
            sb.append(this.y);
            sb.append(", selectedFilters=");
            sb.append(this.z);
            sb.append(", cartItemCount=");
            return au.com.woolworths.android.onesite.a.p(sb, this.A, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListContract$CoachMark;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final /* data */ class CoachMark {

        /* renamed from: a, reason: collision with root package name */
        public final String f5241a;
        public final ResText b;
        public final ResText c;
        public final Function0 d;
        public final Rect e;

        public CoachMark(String tag, ResText title, ResText message, Function0 seen, Rect spotLightRect) {
            Intrinsics.h(tag, "tag");
            Intrinsics.h(title, "title");
            Intrinsics.h(message, "message");
            Intrinsics.h(seen, "seen");
            Intrinsics.h(spotLightRect, "spotLightRect");
            this.f5241a = tag;
            this.b = title;
            this.c = message;
            this.d = seen;
            this.e = spotLightRect;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoachMark)) {
                return false;
            }
            CoachMark coachMark = (CoachMark) obj;
            return Intrinsics.c(this.f5241a, coachMark.f5241a) && Intrinsics.c(this.b, coachMark.b) && Intrinsics.c(this.c, coachMark.c) && Intrinsics.c(this.d, coachMark.d) && Intrinsics.c(this.e, coachMark.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f5241a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "CoachMark(tag=" + this.f5241a + ", title=" + this.b + ", message=" + this.c + ", seen=" + this.d + ", spotLightRect=" + this.e + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public CoachMark(String str, ResText resText, ResText resText2, Function0 function0) {
            float f = (int) 0;
            this(str, resText, resText2, function0, RectKt.a((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), IntSizeKt.d(0L)));
        }
    }
}

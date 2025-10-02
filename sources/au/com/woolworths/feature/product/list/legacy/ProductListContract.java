package au.com.woolworths.feature.product.list.legacy;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.unit.IntSizeKt;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.feature.product.list.legacy.analytics.ProductListScreens;
import au.com.woolworths.feature.product.list.legacy.data.FullScreenMessage;
import au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData;
import au.com.woolworths.feature.product.list.legacy.data.PopupMessage;
import au.com.woolworths.feature.product.list.legacy.data.ProductListZeroResults;
import au.com.woolworths.feature.product.list.legacy.data.ZeroResultPageData;
import au.com.woolworths.feature.product.list.legacy.errorstates.ProductListErrorState;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBoostState;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import au.com.woolworths.product.models.DietaryInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostAllBannerState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract;", "", "Actions", "ProductListActivityActions", "ViewState", "ProductListFilterState", "CoachMark", "ProductListFlow", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ProductListContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u0082\u0001\u001b\u001d\u001e\u001f !\"#$%&'()*+,-./01234567¨\u00068"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "", "ChangeDisplayMode", "ShowNoResultsMessage", "LaunchProductListProductGroup", "LaunchProductAddOrReplace", "LaunchProductSearch", "LaunchProductUpdate", "LaunchAddToList", "LaunchAvailabilityMessage", "DisplayRestrictedItemPrompt", "ShowTransientEdrOfferBoostError", "HandleBannerClick", "DisplayPopupMessage", "LaunchEducationBottomSheet", "LaunchProductVarieties", "LaunchProductsTab", "LaunchDeeplink", "NavigateToLink", "BoostAllSucceeded", "BoostAllFailed", "LaunchNutritionInfo", "LaunchVideoAdBottomSheet", "NavigateBack", "LaunchVoiceProductSearch", "DisplaySnackbarForWatchlist", "LaunchWatchlistGuestOnboardingScreen", "ShowMapFeatureHighlight", "OpenOliveChat", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$BoostAllFailed;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$BoostAllSucceeded;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$ChangeDisplayMode;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$DisplayPopupMessage;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$DisplayRestrictedItemPrompt;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$DisplaySnackbarForWatchlist;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$HandleBannerClick;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchAddToList;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchAvailabilityMessage;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchDeeplink;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchEducationBottomSheet;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchNutritionInfo;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchProductAddOrReplace;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchProductListProductGroup;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchProductSearch;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchProductUpdate;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchProductVarieties;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchProductsTab;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchVideoAdBottomSheet;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchVoiceProductSearch;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$NavigateBack;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$NavigateToLink;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$OpenOliveChat;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$ShowMapFeatureHighlight;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$ShowNoResultsMessage;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$ShowTransientEdrOfferBoostError;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$BoostAllFailed;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BoostAllFailed extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final TrackingMetadata f5288a;

            public BoostAllFailed(TrackingMetadata trackingMetadata) {
                this.f5288a = trackingMetadata;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BoostAllFailed) && Intrinsics.c(this.f5288a, ((BoostAllFailed) obj).f5288a);
            }

            public final int hashCode() {
                return this.f5288a.d.hashCode();
            }

            public final String toString() {
                return "BoostAllFailed(boostMetadata=" + this.f5288a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$BoostAllSucceeded;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BoostAllSucceeded extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final TrackingMetadata f5289a;

            public BoostAllSucceeded(TrackingMetadata trackingMetadata) {
                this.f5289a = trackingMetadata;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BoostAllSucceeded) && Intrinsics.c(this.f5289a, ((BoostAllSucceeded) obj).f5289a);
            }

            public final int hashCode() {
                return this.f5289a.d.hashCode();
            }

            public final String toString() {
                return "BoostAllSucceeded(boostMetadata=" + this.f5289a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$ChangeDisplayMode;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ChangeDisplayMode extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductsDisplayMode f5290a;

            public ChangeDisplayMode(ProductsDisplayMode productsDisplayMode) {
                Intrinsics.h(productsDisplayMode, "productsDisplayMode");
                this.f5290a = productsDisplayMode;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeDisplayMode) && this.f5290a == ((ChangeDisplayMode) obj).f5290a;
            }

            public final int hashCode() {
                return this.f5290a.hashCode();
            }

            public final String toString() {
                return "ChangeDisplayMode(productsDisplayMode=" + this.f5290a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$DisplayPopupMessage;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayPopupMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final PopupMessage f5291a;

            public DisplayPopupMessage(PopupMessage popupMessage) {
                Intrinsics.h(popupMessage, "popupMessage");
                this.f5291a = popupMessage;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayPopupMessage) && Intrinsics.c(this.f5291a, ((DisplayPopupMessage) obj).f5291a);
            }

            public final int hashCode() {
                return this.f5291a.hashCode();
            }

            public final String toString() {
                return "DisplayPopupMessage(popupMessage=" + this.f5291a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$DisplayRestrictedItemPrompt;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayRestrictedItemPrompt extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f5292a;
            public final boolean b;

            static {
                int i = ProductCard.$stable;
            }

            public DisplayRestrictedItemPrompt(ProductCard data, boolean z) {
                Intrinsics.h(data, "data");
                this.f5292a = data;
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
                return Intrinsics.c(this.f5292a, displayRestrictedItemPrompt.f5292a) && this.b == displayRestrictedItemPrompt.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.f5292a.hashCode() * 31);
            }

            public final String toString() {
                return "DisplayRestrictedItemPrompt(data=" + this.f5292a + ", isLoggedIn=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$DisplaySnackbarForWatchlist;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplaySnackbarForWatchlist extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5293a;
            public final ResText b;
            public final boolean c;
            public final ProductCard d;

            public DisplaySnackbarForWatchlist(String str, ResText resText, boolean z, ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f5293a = str;
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
                return this.f5293a.equals(displaySnackbarForWatchlist.f5293a) && this.b.equals(displaySnackbarForWatchlist.b) && this.c == displaySnackbarForWatchlist.c && Intrinsics.c(this.d, displaySnackbarForWatchlist.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + androidx.camera.core.impl.b.e((this.b.hashCode() + (this.f5293a.hashCode() * 31)) * 31, 31, this.c);
            }

            public final String toString() {
                return "DisplaySnackbarForWatchlist(watchlistId=" + this.f5293a + ", message=" + this.b + ", showViewListAction=" + this.c + ", productCard=" + this.d + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$HandleBannerClick;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class HandleBannerClick extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5294a;

            public HandleBannerClick(String link) {
                Intrinsics.h(link, "link");
                this.f5294a = link;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HandleBannerClick) && Intrinsics.c(this.f5294a, ((HandleBannerClick) obj).f5294a);
            }

            public final int hashCode() {
                return this.f5294a.hashCode();
            }

            public final String toString() {
                return YU.a.h("HandleBannerClick(link=", this.f5294a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchAddToList;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAddToList extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f5295a;
            public final ProductListScreens b;
            public final TrackingMetadata c;
            public final boolean d;
            public final String e;

            public LaunchAddToList(ProductCard data, ProductListScreens productListScreens, TrackingMetadata trackingMetadata, boolean z, String str) {
                Intrinsics.h(data, "data");
                this.f5295a = data;
                this.b = productListScreens;
                this.c = trackingMetadata;
                this.d = z;
                this.e = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchAddToList)) {
                    return false;
                }
                LaunchAddToList launchAddToList = (LaunchAddToList) obj;
                return Intrinsics.c(this.f5295a, launchAddToList.f5295a) && this.b.equals(launchAddToList.b) && Intrinsics.c(this.c, launchAddToList.c) && this.d == launchAddToList.d && Intrinsics.c(this.e, launchAddToList.e);
            }

            public final int hashCode() {
                int iHashCode = (this.b.hashCode() + (this.f5295a.hashCode() * 31)) * 31;
                TrackingMetadata trackingMetadata = this.c;
                int iE = androidx.camera.core.impl.b.e((iHashCode + (trackingMetadata == null ? 0 : trackingMetadata.d.hashCode())) * 31, 31, this.d);
                String str = this.e;
                return iE + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LaunchAddToList(data=");
                sb.append(this.f5295a);
                sb.append(", screen=");
                sb.append(this.b);
                sb.append(", trackingMetadata=");
                sb.append(this.c);
                sb.append(", hasVarieties=");
                sb.append(this.d);
                sb.append(", originatingListId=");
                return YU.a.o(sb, this.e, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchAvailabilityMessage;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAvailabilityMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f5296a;
            public final ProductListScreens b;
            public final TrackingMetadata c;

            public LaunchAvailabilityMessage(ProductCard data, ProductListScreens productListScreens, TrackingMetadata trackingMetadata) {
                Intrinsics.h(data, "data");
                this.f5296a = data;
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
                return Intrinsics.c(this.f5296a, launchAvailabilityMessage.f5296a) && this.b.equals(launchAvailabilityMessage.b) && Intrinsics.c(this.c, launchAvailabilityMessage.c);
            }

            public final int hashCode() {
                int iHashCode = (this.b.hashCode() + (this.f5296a.hashCode() * 31)) * 31;
                TrackingMetadata trackingMetadata = this.c;
                return iHashCode + (trackingMetadata == null ? 0 : trackingMetadata.d.hashCode());
            }

            public final String toString() {
                return "LaunchAvailabilityMessage(data=" + this.f5296a + ", screen=" + this.b + ", trackingMetadata=" + this.c + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchDeeplink;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeeplink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5297a;
            public final List b;

            public LaunchDeeplink(String deeplink, List list) {
                Intrinsics.h(deeplink, "deeplink");
                this.f5297a = deeplink;
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
                return Intrinsics.c(this.f5297a, launchDeeplink.f5297a) && Intrinsics.c(this.b, launchDeeplink.b);
            }

            public final int hashCode() {
                int iHashCode = this.f5297a.hashCode() * 31;
                List list = this.b;
                return iHashCode + (list == null ? 0 : list.hashCode());
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.i("LaunchDeeplink(deeplink=", this.f5297a, ", analyticsExtraContent=", ")", this.b);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchEducationBottomSheet;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchEducationBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final BottomSheetContent.Marketplace f5298a;
            public final InfoSection b;

            public LaunchEducationBottomSheet(BottomSheetContent.Marketplace bottomSheet, InfoSection infoSection) {
                Intrinsics.h(bottomSheet, "bottomSheet");
                Intrinsics.h(infoSection, "infoSection");
                this.f5298a = bottomSheet;
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
                return Intrinsics.c(this.f5298a, launchEducationBottomSheet.f5298a) && Intrinsics.c(this.b, launchEducationBottomSheet.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f5298a.hashCode() * 31);
            }

            public final String toString() {
                return "LaunchEducationBottomSheet(bottomSheet=" + this.f5298a + ", infoSection=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchNutritionInfo;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchNutritionInfo extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final DietaryInfo f5299a;

            static {
                int i = DietaryInfo.$stable;
            }

            public LaunchNutritionInfo(DietaryInfo dietaryInfo) {
                this.f5299a = dietaryInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchNutritionInfo) && Intrinsics.c(this.f5299a, ((LaunchNutritionInfo) obj).f5299a);
            }

            public final int hashCode() {
                return this.f5299a.hashCode();
            }

            public final String toString() {
                return "LaunchNutritionInfo(dietaryInfo=" + this.f5299a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchProductAddOrReplace;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductAddOrReplace extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f5300a;
            public final ProductListScreens b;
            public final TrackingMetadata c;
            public final ProductCard d;

            public LaunchProductAddOrReplace(ProductCard productToAdd, ProductListScreens productListScreens, TrackingMetadata trackingMetadata, ProductCard productCard) {
                Intrinsics.h(productToAdd, "productToAdd");
                this.f5300a = productToAdd;
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
                return Intrinsics.c(this.f5300a, launchProductAddOrReplace.f5300a) && this.b.equals(launchProductAddOrReplace.b) && Intrinsics.c(this.c, launchProductAddOrReplace.c) && Intrinsics.c(this.d, launchProductAddOrReplace.d);
            }

            public final int hashCode() {
                int iHashCode = (this.b.hashCode() + (this.f5300a.hashCode() * 31)) * 31;
                TrackingMetadata trackingMetadata = this.c;
                int iHashCode2 = (iHashCode + (trackingMetadata == null ? 0 : trackingMetadata.d.hashCode())) * 31;
                ProductCard productCard = this.d;
                return iHashCode2 + (productCard != null ? productCard.hashCode() : 0);
            }

            public final String toString() {
                return "LaunchProductAddOrReplace(productToAdd=" + this.f5300a + ", screen=" + this.b + ", trackingMetadata=" + this.c + ", productToRemove=" + this.d + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchProductListProductGroup;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductListProductGroup extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5301a;
            public final String b;
            public final String c;

            public LaunchProductListProductGroup(String str, String str2, String str3) {
                this.f5301a = str;
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
                return Intrinsics.c(this.f5301a, launchProductListProductGroup.f5301a) && Intrinsics.c(this.b, launchProductListProductGroup.b) && Intrinsics.c(this.c, launchProductListProductGroup.c);
            }

            public final int hashCode() {
                int iHashCode = this.f5301a.hashCode() * 31;
                String str = this.b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return YU.a.o(YU.a.v("LaunchProductListProductGroup(groupId=", this.f5301a, ", title=", this.b, ", type="), this.c, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchProductSearch;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductSearch extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5302a;
            public final ProductCard b;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductSearch(ProductCard productCard, String str) {
                this.f5302a = str;
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
                return Intrinsics.c(this.f5302a, launchProductSearch.f5302a) && Intrinsics.c(this.b, launchProductSearch.b);
            }

            public final int hashCode() {
                String str = this.f5302a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                ProductCard productCard = this.b;
                return iHashCode + (productCard != null ? productCard.hashCode() : 0);
            }

            public final String toString() {
                return "LaunchProductSearch(searchTerm=" + this.f5302a + ", productToReplace=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchProductUpdate;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductUpdate extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f5303a;
            public final ProductListScreens b;
            public final TrackingMetadata c;

            public LaunchProductUpdate(ProductCard data, ProductListScreens productListScreens, TrackingMetadata trackingMetadata) {
                Intrinsics.h(data, "data");
                this.f5303a = data;
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
                return Intrinsics.c(this.f5303a, launchProductUpdate.f5303a) && this.b.equals(launchProductUpdate.b) && Intrinsics.c(this.c, launchProductUpdate.c);
            }

            public final int hashCode() {
                int iHashCode = (this.b.hashCode() + (this.f5303a.hashCode() * 31)) * 31;
                TrackingMetadata trackingMetadata = this.c;
                return iHashCode + (trackingMetadata == null ? 0 : trackingMetadata.d.hashCode());
            }

            public final String toString() {
                return "LaunchProductUpdate(data=" + this.f5303a + ", screen=" + this.b + ", trackingMetadata=" + this.c + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchProductVarieties;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductVarieties extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5304a;

            public LaunchProductVarieties(String priceFamilyId) {
                Intrinsics.h(priceFamilyId, "priceFamilyId");
                this.f5304a = priceFamilyId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductVarieties) && Intrinsics.c(this.f5304a, ((LaunchProductVarieties) obj).f5304a);
            }

            public final int hashCode() {
                return this.f5304a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchProductVarieties(priceFamilyId=", this.f5304a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchProductsTab;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductsTab extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchProductsTab f5305a = new LaunchProductsTab();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchProductsTab);
            }

            public final int hashCode() {
                return 1479720741;
            }

            public final String toString() {
                return "LaunchProductsTab";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchVideoAdBottomSheet;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchVideoAdBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final VideoAdBottomSheet f5306a;

            public LaunchVideoAdBottomSheet(VideoAdBottomSheet videoAdBottomSheet) {
                Intrinsics.h(videoAdBottomSheet, "videoAdBottomSheet");
                this.f5306a = videoAdBottomSheet;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchVideoAdBottomSheet) && Intrinsics.c(this.f5306a, ((LaunchVideoAdBottomSheet) obj).f5306a);
            }

            public final int hashCode() {
                return this.f5306a.hashCode();
            }

            public final String toString() {
                return "LaunchVideoAdBottomSheet(videoAdBottomSheet=" + this.f5306a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchVoiceProductSearch;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchVoiceProductSearch extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchVoiceProductSearch f5307a = new LaunchVoiceProductSearch();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchVoiceProductSearch);
            }

            public final int hashCode() {
                return 246537553;
            }

            public final String toString() {
                return "LaunchVoiceProductSearch";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchWatchlistGuestOnboardingScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchWatchlistGuestOnboardingScreen f5308a = new LaunchWatchlistGuestOnboardingScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchWatchlistGuestOnboardingScreen);
            }

            public final int hashCode() {
                return 19775582;
            }

            public final String toString() {
                return "LaunchWatchlistGuestOnboardingScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$NavigateBack;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateBack extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateBack f5309a = new NavigateBack();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateBack);
            }

            public final int hashCode() {
                return 253837393;
            }

            public final String toString() {
                return "NavigateBack";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$NavigateToLink;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5310a;

            public NavigateToLink(String url) {
                Intrinsics.h(url, "url");
                this.f5310a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateToLink) && Intrinsics.c(this.f5310a, ((NavigateToLink) obj).f5310a);
            }

            public final int hashCode() {
                return this.f5310a.hashCode();
            }

            public final String toString() {
                return YU.a.h("NavigateToLink(url=", this.f5310a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$OpenOliveChat;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenOliveChat extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenOliveChat f5311a = new OpenOliveChat();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenOliveChat);
            }

            public final int hashCode() {
                return -2106467984;
            }

            public final String toString() {
                return "OpenOliveChat";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$ShowMapFeatureHighlight;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowMapFeatureHighlight extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowMapFeatureHighlight f5312a = new ShowMapFeatureHighlight();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowMapFeatureHighlight);
            }

            public final int hashCode() {
                return 566508964;
            }

            public final String toString() {
                return "ShowMapFeatureHighlight";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$ShowNoResultsMessage;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowNoResultsMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowNoResultsMessage f5313a = new ShowNoResultsMessage();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowNoResultsMessage);
            }

            public final int hashCode() {
                return -1541812792;
            }

            public final String toString() {
                return "ShowNoResultsMessage";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions$ShowTransientEdrOfferBoostError;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$Actions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowTransientEdrOfferBoostError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5314a;

            public ShowTransientEdrOfferBoostError(String str) {
                this.f5314a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowTransientEdrOfferBoostError) && Intrinsics.c(this.f5314a, ((ShowTransientEdrOfferBoostError) obj).f5314a);
            }

            public final int hashCode() {
                return this.f5314a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ShowTransientEdrOfferBoostError(errorMessage=", this.f5314a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions;", "", "LaunchProductListOptions", "LaunchAlternativeProducts", "LaunchProductDetails", "LaunchInstoreMap", "ShowFindInfoBottomSheet", "LaunchProductAvailability", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions$LaunchAlternativeProducts;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions$LaunchInstoreMap;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions$LaunchProductAvailability;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions$LaunchProductDetails;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions$LaunchProductListOptions;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions$ShowFindInfoBottomSheet;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ProductListActivityActions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions$LaunchAlternativeProducts;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAlternativeProducts extends ProductListActivityActions {

            /* renamed from: a, reason: collision with root package name */
            public final IngredientCardApiData f5316a;

            public LaunchAlternativeProducts(IngredientCardApiData ingredientCardApiData) {
                this.f5316a = ingredientCardApiData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchAlternativeProducts) && Intrinsics.c(this.f5316a, ((LaunchAlternativeProducts) obj).f5316a);
            }

            public final int hashCode() {
                return this.f5316a.hashCode();
            }

            public final String toString() {
                return "LaunchAlternativeProducts(ingredientCard=" + this.f5316a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions$LaunchInstoreMap;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchInstoreMap extends ProductListActivityActions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f5317a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchInstoreMap(ProductCard data) {
                Intrinsics.h(data, "data");
                this.f5317a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchInstoreMap) && Intrinsics.c(this.f5317a, ((LaunchInstoreMap) obj).f5317a);
            }

            public final int hashCode() {
                return this.f5317a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchInstoreMap(data=", this.f5317a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions$LaunchProductAvailability;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductAvailability extends ProductListActivityActions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f5318a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductAvailability(ProductCard data) {
                Intrinsics.h(data, "data");
                this.f5318a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductAvailability) && Intrinsics.c(this.f5318a, ((LaunchProductAvailability) obj).f5318a);
            }

            public final int hashCode() {
                return this.f5318a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchProductAvailability(data=", this.f5318a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions$LaunchProductDetails;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductDetails extends ProductListActivityActions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f5319a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductDetails(ProductCard data) {
                Intrinsics.h(data, "data");
                this.f5319a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductDetails) && Intrinsics.c(this.f5319a, ((LaunchProductDetails) obj).f5319a);
            }

            public final int hashCode() {
                return this.f5319a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchProductDetails(data=", this.f5319a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions$LaunchProductListOptions;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductListOptions extends ProductListActivityActions {

            /* renamed from: a, reason: collision with root package name */
            public final Activities.ProductList.Extras f5320a;

            public LaunchProductListOptions(Activities.ProductList.Extras extras) {
                this.f5320a = extras;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductListOptions) && Intrinsics.c(this.f5320a, ((LaunchProductListOptions) obj).f5320a);
            }

            public final int hashCode() {
                return this.f5320a.hashCode();
            }

            public final String toString() {
                return "LaunchProductListOptions(pageExtras=" + this.f5320a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions$ShowFindInfoBottomSheet;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListFilterState;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListFilterState {

        /* renamed from: a, reason: collision with root package name */
        public final int f5321a;
        public final boolean b;

        public ProductListFilterState(int i, boolean z) {
            this.f5321a = i;
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
            return this.f5321a == productListFilterState.f5321a && this.b == productListFilterState.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.f5321a) * 31);
        }

        public final String toString() {
            return "ProductListFilterState(activeFilterCount=" + this.f5321a + ", shouldShowDot=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListFlow;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListFlow {

        /* renamed from: a, reason: collision with root package name */
        public final String f5322a;
        public final List b;
        public final List c;
        public final ZeroResultPageData d;
        public final ProductListZeroResults e;
        public final ProductListFilterState f;
        public final List g;

        public ProductListFlow(String str, List chips, List facetChips, ZeroResultPageData zeroResultPageData, ProductListZeroResults productListZeroResults, ProductListFilterState productListFilterState, List insetBanners) {
            Intrinsics.h(chips, "chips");
            Intrinsics.h(facetChips, "facetChips");
            Intrinsics.h(insetBanners, "insetBanners");
            this.f5322a = str;
            this.b = chips;
            this.c = facetChips;
            this.d = zeroResultPageData;
            this.e = productListZeroResults;
            this.f = productListFilterState;
            this.g = insetBanners;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List] */
        public static ProductListFlow a(ProductListFlow productListFlow, String str, List list, List list2, ZeroResultPageData zeroResultPageData, ProductListZeroResults productListZeroResults, ProductListFilterState productListFilterState, ArrayList arrayList, int i) {
            if ((i & 1) != 0) {
                str = productListFlow.f5322a;
            }
            String str2 = str;
            if ((i & 2) != 0) {
                list = productListFlow.b;
            }
            List chips = list;
            if ((i & 4) != 0) {
                list2 = productListFlow.c;
            }
            List facetChips = list2;
            if ((i & 8) != 0) {
                zeroResultPageData = productListFlow.d;
            }
            ZeroResultPageData zeroResultPageData2 = zeroResultPageData;
            if ((i & 16) != 0) {
                productListZeroResults = productListFlow.e;
            }
            ProductListZeroResults productListZeroResults2 = productListZeroResults;
            if ((i & 32) != 0) {
                productListFilterState = productListFlow.f;
            }
            ProductListFilterState productListFilterState2 = productListFilterState;
            ArrayList arrayList2 = arrayList;
            if ((i & 64) != 0) {
                arrayList2 = productListFlow.g;
            }
            ArrayList insetBanners = arrayList2;
            productListFlow.getClass();
            Intrinsics.h(chips, "chips");
            Intrinsics.h(facetChips, "facetChips");
            Intrinsics.h(insetBanners, "insetBanners");
            return new ProductListFlow(str2, chips, facetChips, zeroResultPageData2, productListZeroResults2, productListFilterState2, insetBanners);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductListFlow)) {
                return false;
            }
            ProductListFlow productListFlow = (ProductListFlow) obj;
            return Intrinsics.c(this.f5322a, productListFlow.f5322a) && Intrinsics.c(this.b, productListFlow.b) && Intrinsics.c(this.c, productListFlow.c) && Intrinsics.c(this.d, productListFlow.d) && Intrinsics.c(this.e, productListFlow.e) && Intrinsics.c(this.f, productListFlow.f) && Intrinsics.c(this.g, productListFlow.g);
        }

        public final int hashCode() {
            String str = this.f5322a;
            int iD = androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
            ZeroResultPageData zeroResultPageData = this.d;
            int iHashCode = (iD + (zeroResultPageData == null ? 0 : zeroResultPageData.hashCode())) * 31;
            ProductListZeroResults productListZeroResults = this.e;
            return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (productListZeroResults != null ? productListZeroResults.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbS = au.com.woolworths.android.onesite.a.s("ProductListFlow(pageTitle=", this.f5322a, ", chips=", ", facetChips=", this.b);
            sbS.append(this.c);
            sbS.append(", zeroResultContent=");
            sbS.append(this.d);
            sbS.append(", zeroResult=");
            sbS.append(this.e);
            sbS.append(", filterState=");
            sbS.append(this.f);
            sbS.append(", insetBanners=");
            return android.support.v4.media.session.a.t(sbS, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ViewState;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final int f5323a;
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
        public final i w;

        public ViewState(int i, boolean z, ProductListErrorState productListErrorState, int i2, boolean z2, List list, boolean z3, FullScreenMessage fullScreenMessage, BoostAllBannerState boostAllBannerState, boolean z4, Activities.ProductList.Extras extras, CoachMark coachMark, List chips, List facetChips, boolean z5, String str, boolean z6, List watchlistedProductIds, ZeroResultPageData zeroResultPageData, ProductListZeroResults productListZeroResults, VideoAdPlayerState videoAdPlayerState, EdrOfferBoostState edrOfferBoostState) {
            Intrinsics.h(boostAllBannerState, "boostAllBannerState");
            Intrinsics.h(chips, "chips");
            Intrinsics.h(facetChips, "facetChips");
            Intrinsics.h(watchlistedProductIds, "watchlistedProductIds");
            Intrinsics.h(videoAdPlayerState, "videoAdPlayerState");
            Intrinsics.h(edrOfferBoostState, "edrOfferBoostState");
            this.f5323a = i;
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
            this.w = new i(this, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f5323a == viewState.f5323a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d && this.e == viewState.e && Intrinsics.c(this.f, viewState.f) && this.g == viewState.g && Intrinsics.c(this.h, viewState.h) && Intrinsics.c(this.i, viewState.i) && this.j == viewState.j && Intrinsics.c(this.k, viewState.k) && Intrinsics.c(this.l, viewState.l) && Intrinsics.c(this.m, viewState.m) && Intrinsics.c(this.n, viewState.n) && this.o == viewState.o && Intrinsics.c(this.p, viewState.p) && this.q == viewState.q && Intrinsics.c(this.r, viewState.r) && Intrinsics.c(this.s, viewState.s) && Intrinsics.c(this.t, viewState.t) && Intrinsics.c(this.u, viewState.u) && Intrinsics.c(this.v, viewState.v);
        }

        public final int hashCode() {
            int iE = androidx.camera.core.impl.b.e(Integer.hashCode(this.f5323a) * 31, 31, this.b);
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
            return this.v.hashCode() + ((this.u.hashCode() + ((iHashCode2 + (productListZeroResults != null ? productListZeroResults.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(totalNumberOfProducts=");
            sb.append(this.f5323a);
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
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListContract$CoachMark;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final /* data */ class CoachMark {

        /* renamed from: a, reason: collision with root package name */
        public final String f5315a;
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
            this.f5315a = tag;
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
            return Intrinsics.c(this.f5315a, coachMark.f5315a) && Intrinsics.c(this.b, coachMark.b) && Intrinsics.c(this.c, coachMark.c) && Intrinsics.c(this.d, coachMark.d) && Intrinsics.c(this.e, coachMark.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f5315a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "CoachMark(tag=" + this.f5315a + ", title=" + this.b + ", message=" + this.c + ", seen=" + this.d + ", spotLightRect=" + this.e + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public CoachMark(String str, ResText resText, ResText resText2, Function0 function0) {
            float f = (int) 0;
            this(str, resText, resText2, function0, RectKt.a((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), IntSizeKt.d(0L)));
        }
    }
}

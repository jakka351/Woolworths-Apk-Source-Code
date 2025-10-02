package au.com.woolworths.feature.shop.homepage.presentation;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.main.MainViewModel;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettings;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionState;
import au.com.woolworths.feature.shop.homepage.data.DeliveryNow;
import au.com.woolworths.feature.shop.homepage.data.DeliveryNowBottomBanner;
import au.com.woolworths.feature.shop.homepage.data.HomeListData;
import au.com.woolworths.feature.shop.homepage.data.OrderCardData;
import au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePrompt;
import au.com.woolworths.product.models.ProductCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract;", "", "Actions", "ViewState", "HeaderData", "ScreenLoadedStatus", "DeliveryNowData", "DeliveryNowViewState", "Snackbar", "MainAndHomeBridging", "CoachMarkAnchor", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface HomePageContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u0082\u0001\u001b\u001d\u001e\u001f !\"#$%&'()*+,-./01234567¨\u00068"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "", "LaunchCatalogue", "LaunchRewardsDetails", "LaunchAddRewards", "LaunchSignUp", "LaunchLogIn", "LaunchDisplayBarcode", "LaunchProductDetails", "LaunchProductAdd", "LaunchProductUpdate", "LaunchAddToList", "LaunchProductGroup", "LaunchOrder", "LaunchRecipeDetails", "LaunchMarketplace", "ShowCoachMarkContent", "LaunchDeepLink", "LaunchShoppingListDetails", "LaunchBuyAgain", "LaunchProductVarieties", "LaunchYourGroceries", "BoostAllSuccess", "BoostAllFail", "ShowInstorePrompt", "LaunchWebView", "ViewWatchlist", "LaunchWatchlistGuestOnboardingScreen", "OpenOliveChat", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$BoostAllFail;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$BoostAllSuccess;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchAddRewards;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchAddToList;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchBuyAgain;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchCatalogue;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchDisplayBarcode;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchLogIn;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchMarketplace;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchOrder;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchProductAdd;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchProductDetails;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchProductGroup;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchProductUpdate;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchProductVarieties;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchRecipeDetails;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchRewardsDetails;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchShoppingListDetails;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchSignUp;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchWebView;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchYourGroceries;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$OpenOliveChat;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$ShowCoachMarkContent;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$ShowInstorePrompt;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$ViewWatchlist;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$BoostAllFail;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BoostAllFail extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Integer f7210a;
            public final TrackingMetadata b;

            public BoostAllFail(Integer num, TrackingMetadata trackingMetadata) {
                this.f7210a = num;
                this.b = trackingMetadata;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BoostAllFail)) {
                    return false;
                }
                BoostAllFail boostAllFail = (BoostAllFail) obj;
                return Intrinsics.c(this.f7210a, boostAllFail.f7210a) && Intrinsics.c(this.b, boostAllFail.b);
            }

            public final int hashCode() {
                Integer num = this.f7210a;
                return this.b.d.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
            }

            public final String toString() {
                return "BoostAllFail(failureCount=" + this.f7210a + ", boostMetadata=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$BoostAllSuccess;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BoostAllSuccess extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final TrackingMetadata f7211a;

            public BoostAllSuccess(TrackingMetadata trackingMetadata) {
                this.f7211a = trackingMetadata;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BoostAllSuccess) && Intrinsics.c(this.f7211a, ((BoostAllSuccess) obj).f7211a);
            }

            public final int hashCode() {
                return this.f7211a.d.hashCode();
            }

            public final String toString() {
                return "BoostAllSuccess(boostMetadata=" + this.f7211a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchAddRewards;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchAddRewards extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchAddRewards f7212a = new LaunchAddRewards();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchAddToList;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAddToList extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f7213a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchAddToList(ProductCard data) {
                Intrinsics.h(data, "data");
                this.f7213a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchAddToList) && Intrinsics.c(this.f7213a, ((LaunchAddToList) obj).f7213a);
            }

            public final int hashCode() {
                return this.f7213a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchAddToList(data=", this.f7213a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchBuyAgain;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchBuyAgain extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchBuyAgain f7214a = new LaunchBuyAgain();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchCatalogue;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchCatalogue extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchCatalogue f7215a = new LaunchCatalogue();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeepLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7216a;

            public LaunchDeepLink(String deepLink) {
                Intrinsics.h(deepLink, "deepLink");
                this.f7216a = deepLink;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchDeepLink) && Intrinsics.c(this.f7216a, ((LaunchDeepLink) obj).f7216a);
            }

            public final int hashCode() {
                return this.f7216a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchDeepLink(deepLink=", this.f7216a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchDisplayBarcode;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchDisplayBarcode extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchDisplayBarcode f7217a = new LaunchDisplayBarcode();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchLogIn;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchLogIn extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchLogIn f7218a = new LaunchLogIn();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchMarketplace;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchMarketplace extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchMarketplace f7219a = new LaunchMarketplace();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchOrder;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchOrder extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final OrderCardData f7220a;

            public LaunchOrder(OrderCardData data) {
                Intrinsics.h(data, "data");
                this.f7220a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchOrder) && Intrinsics.c(this.f7220a, ((LaunchOrder) obj).f7220a);
            }

            public final int hashCode() {
                return this.f7220a.hashCode();
            }

            public final String toString() {
                return "LaunchOrder(data=" + this.f7220a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchProductAdd;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductAdd extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f7221a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductAdd(ProductCard data) {
                Intrinsics.h(data, "data");
                this.f7221a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductAdd) && Intrinsics.c(this.f7221a, ((LaunchProductAdd) obj).f7221a);
            }

            public final int hashCode() {
                return this.f7221a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchProductAdd(data=", this.f7221a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchProductDetails;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f7222a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductDetails(ProductCard data) {
                Intrinsics.h(data, "data");
                this.f7222a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductDetails) && Intrinsics.c(this.f7222a, ((LaunchProductDetails) obj).f7222a);
            }

            public final int hashCode() {
                return this.f7222a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchProductDetails(data=", this.f7222a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchProductGroup;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductGroup extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Activities.ProductList.Extras f7223a;

            public LaunchProductGroup(Activities.ProductList.Extras extras) {
                this.f7223a = extras;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductGroup) && Intrinsics.c(this.f7223a, ((LaunchProductGroup) obj).f7223a);
            }

            public final int hashCode() {
                return this.f7223a.hashCode();
            }

            public final String toString() {
                return "LaunchProductGroup(productListExtras=" + this.f7223a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchProductUpdate;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductUpdate extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f7224a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductUpdate(ProductCard data) {
                Intrinsics.h(data, "data");
                this.f7224a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductUpdate) && Intrinsics.c(this.f7224a, ((LaunchProductUpdate) obj).f7224a);
            }

            public final int hashCode() {
                return this.f7224a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchProductUpdate(data=", this.f7224a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchProductVarieties;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductVarieties extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7225a;

            public LaunchProductVarieties(String priceFamilyId) {
                Intrinsics.h(priceFamilyId, "priceFamilyId");
                this.f7225a = priceFamilyId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductVarieties) && Intrinsics.c(this.f7225a, ((LaunchProductVarieties) obj).f7225a);
            }

            public final int hashCode() {
                return this.f7225a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchProductVarieties(priceFamilyId=", this.f7225a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchRecipeDetails;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchRecipeDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7226a;

            public LaunchRecipeDetails(String recipeId) {
                Intrinsics.h(recipeId, "recipeId");
                this.f7226a = recipeId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchRecipeDetails) && Intrinsics.c(this.f7226a, ((LaunchRecipeDetails) obj).f7226a);
            }

            public final int hashCode() {
                return this.f7226a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchRecipeDetails(recipeId=", this.f7226a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchRewardsDetails;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchRewardsDetails extends Actions {
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchShoppingListDetails;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchShoppingListDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7227a;

            public LaunchShoppingListDetails(String shoppingListId) {
                Intrinsics.h(shoppingListId, "shoppingListId");
                this.f7227a = shoppingListId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchShoppingListDetails) && Intrinsics.c(this.f7227a, ((LaunchShoppingListDetails) obj).f7227a);
            }

            public final int hashCode() {
                return this.f7227a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchShoppingListDetails(shoppingListId=", this.f7227a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchSignUp;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchSignUp extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSignUp f7228a = new LaunchSignUp();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchWatchlistGuestOnboardingScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchWatchlistGuestOnboardingScreen f7229a = new LaunchWatchlistGuestOnboardingScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchWatchlistGuestOnboardingScreen);
            }

            public final int hashCode() {
                return -1257272643;
            }

            public final String toString() {
                return "LaunchWatchlistGuestOnboardingScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchWebView;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchWebView extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7230a;
            public final String b;

            public LaunchWebView(String str, String str2) {
                this.f7230a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchWebView)) {
                    return false;
                }
                LaunchWebView launchWebView = (LaunchWebView) obj;
                return Intrinsics.c(this.f7230a, launchWebView.f7230a) && Intrinsics.c(this.b, launchWebView.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f7230a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("LaunchWebView(title=", this.f7230a, ", url=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$LaunchYourGroceries;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchYourGroceries extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7231a;

            public LaunchYourGroceries(String orderId) {
                Intrinsics.h(orderId, "orderId");
                this.f7231a = orderId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchYourGroceries) && Intrinsics.c(this.f7231a, ((LaunchYourGroceries) obj).f7231a);
            }

            public final int hashCode() {
                return this.f7231a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchYourGroceries(orderId=", this.f7231a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$OpenOliveChat;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenOliveChat extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7232a;

            public OpenOliveChat(String str) {
                this.f7232a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenOliveChat) && Intrinsics.c(this.f7232a, ((OpenOliveChat) obj).f7232a);
            }

            public final int hashCode() {
                return this.f7232a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenOliveChat(oliveUrl=", this.f7232a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$ShowCoachMarkContent;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowCoachMarkContent extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final CoachMarkAnchor f7233a;
            public final SimpleCoachMarkSettings b;

            public ShowCoachMarkContent(CoachMarkAnchor coachMarkAnchor, SimpleCoachMarkSettings simpleCoachMarkSettings) {
                this.f7233a = coachMarkAnchor;
                this.b = simpleCoachMarkSettings;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowCoachMarkContent)) {
                    return false;
                }
                ShowCoachMarkContent showCoachMarkContent = (ShowCoachMarkContent) obj;
                return this.f7233a == showCoachMarkContent.f7233a && Intrinsics.c(this.b, showCoachMarkContent.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f7233a.hashCode() * 31);
            }

            public final String toString() {
                return "ShowCoachMarkContent(anchor=" + this.f7233a + ", data=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$ShowInstorePrompt;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowInstorePrompt extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final InstorePresencePrompt f7234a;

            public ShowInstorePrompt(InstorePresencePrompt instorePresencePrompt) {
                this.f7234a = instorePresencePrompt;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowInstorePrompt) && Intrinsics.c(this.f7234a, ((ShowInstorePrompt) obj).f7234a);
            }

            public final int hashCode() {
                return this.f7234a.hashCode();
            }

            public final String toString() {
                return "ShowInstorePrompt(inStorePrompt=" + this.f7234a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions$ViewWatchlist;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Actions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ViewWatchlist extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7235a;

            public ViewWatchlist(String str) {
                this.f7235a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ViewWatchlist) && Intrinsics.c(this.f7235a, ((ViewWatchlist) obj).f7235a);
            }

            public final int hashCode() {
                return this.f7235a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ViewWatchlist(watchlistId=", this.f7235a, ")");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$CoachMarkAnchor;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CoachMarkAnchor {
        public static final CoachMarkAnchor d;
        public static final CoachMarkAnchor e;
        public static final /* synthetic */ CoachMarkAnchor[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            CoachMarkAnchor coachMarkAnchor = new CoachMarkAnchor("CART_MENU_ITEM", 0);
            d = coachMarkAnchor;
            CoachMarkAnchor coachMarkAnchor2 = new CoachMarkAnchor("CHANGE_MY_ORDER_STOP_BUTTON", 1);
            e = coachMarkAnchor2;
            CoachMarkAnchor[] coachMarkAnchorArr = {coachMarkAnchor, coachMarkAnchor2};
            f = coachMarkAnchorArr;
            g = EnumEntriesKt.a(coachMarkAnchorArr);
        }

        public static CoachMarkAnchor valueOf(String str) {
            return (CoachMarkAnchor) Enum.valueOf(CoachMarkAnchor.class, str);
        }

        public static CoachMarkAnchor[] values() {
            return (CoachMarkAnchor[]) f.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$DeliveryNowData;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryNowData {

        /* renamed from: a, reason: collision with root package name */
        public final DeliveryNowViewState f7236a;
        public final DeliveryNowBottomBanner b;

        public DeliveryNowData(DeliveryNowViewState deliveryNowViewState, DeliveryNowBottomBanner deliveryNowBottomBanner) {
            this.f7236a = deliveryNowViewState;
            this.b = deliveryNowBottomBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryNowData)) {
                return false;
            }
            DeliveryNowData deliveryNowData = (DeliveryNowData) obj;
            return this.f7236a == deliveryNowData.f7236a && Intrinsics.c(this.b, deliveryNowData.b);
        }

        public final int hashCode() {
            DeliveryNowViewState deliveryNowViewState = this.f7236a;
            int iHashCode = (deliveryNowViewState == null ? 0 : deliveryNowViewState.hashCode()) * 31;
            DeliveryNowBottomBanner deliveryNowBottomBanner = this.b;
            return iHashCode + (deliveryNowBottomBanner != null ? deliveryNowBottomBanner.hashCode() : 0);
        }

        public final String toString() {
            return "DeliveryNowData(deliveryNowBannerState=" + this.f7236a + ", bottomBannerData=" + this.b + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$DeliveryNowViewState;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryNowViewState {
        public static final DeliveryNowViewState d;
        public static final DeliveryNowViewState e;
        public static final DeliveryNowViewState f;
        public static final /* synthetic */ DeliveryNowViewState[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            DeliveryNowViewState deliveryNowViewState = new DeliveryNowViewState("HIDDEN", 0);
            d = deliveryNowViewState;
            DeliveryNowViewState deliveryNowViewState2 = new DeliveryNowViewState("SHOW_CLASSIC", 1);
            e = deliveryNowViewState2;
            DeliveryNowViewState deliveryNowViewState3 = new DeliveryNowViewState("SHOW_BOTTOM", 2);
            f = deliveryNowViewState3;
            DeliveryNowViewState[] deliveryNowViewStateArr = {deliveryNowViewState, deliveryNowViewState2, deliveryNowViewState3};
            g = deliveryNowViewStateArr;
            h = EnumEntriesKt.a(deliveryNowViewStateArr);
        }

        public static DeliveryNowViewState valueOf(String str) {
            return (DeliveryNowViewState) Enum.valueOf(DeliveryNowViewState.class, str);
        }

        public static DeliveryNowViewState[] values() {
            return (DeliveryNowViewState[]) g.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$HeaderData;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeaderData {

        /* renamed from: a, reason: collision with root package name */
        public final List f7237a;
        public final DeliveryNowViewState b;
        public final DeliveryNow c;
        public final Integer d;

        public HeaderData(List list, DeliveryNowViewState deliveryNowViewState, DeliveryNow deliveryNow, Integer num) {
            this.f7237a = list;
            this.b = deliveryNowViewState;
            this.c = deliveryNow;
            this.d = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeaderData)) {
                return false;
            }
            HeaderData headerData = (HeaderData) obj;
            return Intrinsics.c(this.f7237a, headerData.f7237a) && this.b == headerData.b && Intrinsics.c(this.c, headerData.c) && Intrinsics.c(this.d, headerData.d);
        }

        public final int hashCode() {
            List list = this.f7237a;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            DeliveryNowViewState deliveryNowViewState = this.b;
            int iHashCode2 = (iHashCode + (deliveryNowViewState == null ? 0 : deliveryNowViewState.hashCode())) * 31;
            DeliveryNow deliveryNow = this.c;
            int iHashCode3 = (iHashCode2 + (deliveryNow == null ? 0 : deliveryNow.hashCode())) * 31;
            Integer num = this.d;
            return iHashCode3 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "HeaderData(items=" + this.f7237a + ", deliveryNowViewState=" + this.b + ", deliveryNow=" + this.c + ", unreadChatbotMessages=" + this.d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$MainAndHomeBridging;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface MainAndHomeBridging {
        MainViewModel o2();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$ScreenLoadedStatus;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScreenLoadedStatus {
        public static final ScreenLoadedStatus e;
        public static final ScreenLoadedStatus f;
        public static final /* synthetic */ ScreenLoadedStatus[] g;
        public static final /* synthetic */ EnumEntries h;
        public final String d;

        static {
            ScreenLoadedStatus screenLoadedStatus = new ScreenLoadedStatus("HOMEPAGE_LOAD_STATUS_SUCCESS", 0, "success");
            e = screenLoadedStatus;
            ScreenLoadedStatus screenLoadedStatus2 = new ScreenLoadedStatus("HOMEPAGE_LOAD_STATUS_FAIL", 1, "fail");
            f = screenLoadedStatus2;
            ScreenLoadedStatus[] screenLoadedStatusArr = {screenLoadedStatus, screenLoadedStatus2};
            g = screenLoadedStatusArr;
            h = EnumEntriesKt.a(screenLoadedStatusArr);
        }

        public ScreenLoadedStatus(String str, int i, String str2) {
            this.d = str2;
        }

        public static ScreenLoadedStatus valueOf(String str) {
            return (ScreenLoadedStatus) Enum.valueOf(ScreenLoadedStatus.class, str);
        }

        public static ScreenLoadedStatus[] values() {
            return (ScreenLoadedStatus[]) g.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$Snackbar;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Snackbar {

        /* renamed from: a, reason: collision with root package name */
        public final ResText f7238a;
        public final Text b;
        public final Function0 c;
        public final Function1 d;

        public Snackbar(ResText resText, ResText resText2, Function0 function0, Function1 function1) {
            this.f7238a = resText;
            this.b = resText2;
            this.c = function0;
            this.d = function1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Snackbar)) {
                return false;
            }
            Snackbar snackbar = (Snackbar) obj;
            return this.f7238a.equals(snackbar.f7238a) && Intrinsics.c(this.b, snackbar.b) && this.c.equals(snackbar.c) && this.d.equals(snackbar.d);
        }

        public final int hashCode() {
            int iHashCode = this.f7238a.hashCode() * 31;
            Text text = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (text == null ? 0 : text.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "Snackbar(message=" + this.f7238a + ", actionLabel=" + this.b + ", actionCallback=" + this.c + ", onImpression=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$ViewState;", "", "Companion", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState n = new ViewState(false, null, null, null, HorizontalListActionState.d, null, false, EmptyList.d, null);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7239a;
        public final HomeListData b;
        public final HomePageErrorState c;
        public final HomePageRefreshErrorState d;
        public final HorizontalListActionState e;
        public final DeliveryNowData f;
        public final boolean g;
        public final List h;
        public final Snackbar i;
        public final boolean j;
        public final boolean k;
        public final boolean l;
        public final boolean m;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$ViewState$Companion;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public ViewState(boolean z, HomeListData homeListData, HomePageErrorState homePageErrorState, HomePageRefreshErrorState homePageRefreshErrorState, HorizontalListActionState boosterCarouselActionState, DeliveryNowData deliveryNowData, boolean z2, List watchlistedProductIds, Snackbar snackbar) {
            Intrinsics.h(boosterCarouselActionState, "boosterCarouselActionState");
            Intrinsics.h(watchlistedProductIds, "watchlistedProductIds");
            this.f7239a = z;
            this.b = homeListData;
            this.c = homePageErrorState;
            this.d = homePageRefreshErrorState;
            this.e = boosterCarouselActionState;
            this.f = deliveryNowData;
            this.g = z2;
            this.h = watchlistedProductIds;
            this.i = snackbar;
            boolean z3 = false;
            boolean z4 = homeListData == null;
            this.j = z && z4;
            this.k = z && !z4;
            this.l = homePageErrorState != null && z4;
            if (!z && homePageErrorState == null && homePageRefreshErrorState == null) {
                z3 = true;
            }
            this.m = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f7239a == viewState.f7239a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d && this.e == viewState.e && Intrinsics.c(this.f, viewState.f) && this.g == viewState.g && Intrinsics.c(this.h, viewState.h) && Intrinsics.c(this.i, viewState.i);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f7239a) * 31;
            HomeListData homeListData = this.b;
            int iHashCode2 = (iHashCode + (homeListData == null ? 0 : homeListData.hashCode())) * 31;
            HomePageErrorState homePageErrorState = this.c;
            int iHashCode3 = (iHashCode2 + (homePageErrorState == null ? 0 : homePageErrorState.hashCode())) * 31;
            HomePageRefreshErrorState homePageRefreshErrorState = this.d;
            int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (homePageRefreshErrorState == null ? 0 : homePageRefreshErrorState.hashCode())) * 31)) * 31;
            DeliveryNowData deliveryNowData = this.f;
            int iD = androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.e((iHashCode4 + (deliveryNowData == null ? 0 : deliveryNowData.hashCode())) * 31, 31, this.g), 31, this.h);
            Snackbar snackbar = this.i;
            return iD + (snackbar != null ? snackbar.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f7239a + ", feedData=" + this.b + ", errorState=" + this.c + ", refreshErrorState=" + this.d + ", boosterCarouselActionState=" + this.e + ", deliveryNowData=" + this.f + ", isEnableContentPageFeed=" + this.g + ", watchlistedProductIds=" + this.h + ", snackbar=" + this.i + ")";
        }
    }
}

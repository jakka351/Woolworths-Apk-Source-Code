package au.com.woolworths.feature.shop.contentpage;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.feature.shop.contentpage.data.ContentPageData;
import au.com.woolworths.feature.shop.contentpage.data.SnackbarContent;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.PromotionCard;
import au.com.woolworths.shop.aem.components.model.CatalogueCard;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract;", "", "Actions", "ViewState", "CartData", "TopBarConfig", "Snackbar", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ContentPageContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "", "LaunchDeepLink", "LaunchProductListProductGroup", "LaunchRecipeDetails", "SharePage", "LaunchFullPageVideoPlayer", "LaunchWebView", "LaunchProductDetails", "LaunchListsBottomSheet", "LaunchAddToCartBottomSheet", "ViewShoppingList", "LaunchWatchlistGuestOnboardingScreen", "ViewWatchlist", "LaunchLogin", "OpenOliveChat", "LaunchCatalogueHome", "LaunchCatalogueDetails", "LaunchProductOnMap", "LaunchPromotionDetails", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchAddToCartBottomSheet;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchCatalogueDetails;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchCatalogueHome;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchFullPageVideoPlayer;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchListsBottomSheet;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchLogin;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchProductDetails;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchProductListProductGroup;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchProductOnMap;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchPromotionDetails;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchRecipeDetails;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchWebView;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$OpenOliveChat;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$SharePage;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$ViewShoppingList;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$ViewWatchlist;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchAddToCartBottomSheet;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAddToCartBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f6961a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchAddToCartBottomSheet(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f6961a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchAddToCartBottomSheet) && Intrinsics.c(this.f6961a, ((LaunchAddToCartBottomSheet) obj).f6961a);
            }

            public final int hashCode() {
                return this.f6961a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchAddToCartBottomSheet(productCard=", this.f6961a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchCatalogueDetails;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCatalogueDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final CatalogueCard f6962a;

            public LaunchCatalogueDetails(CatalogueCard catalogueCard) {
                Intrinsics.h(catalogueCard, "catalogueCard");
                this.f6962a = catalogueCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchCatalogueDetails) && Intrinsics.c(this.f6962a, ((LaunchCatalogueDetails) obj).f6962a);
            }

            public final int hashCode() {
                return this.f6962a.hashCode();
            }

            public final String toString() {
                return "LaunchCatalogueDetails(catalogueCard=" + this.f6962a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchCatalogueHome;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCatalogueHome extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchCatalogueHome f6963a = new LaunchCatalogueHome();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchCatalogueHome);
            }

            public final int hashCode() {
                return 1161977303;
            }

            public final String toString() {
                return "LaunchCatalogueHome";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeepLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6964a;

            public LaunchDeepLink(String deepLink) {
                Intrinsics.h(deepLink, "deepLink");
                this.f6964a = deepLink;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchDeepLink) && Intrinsics.c(this.f6964a, ((LaunchDeepLink) obj).f6964a);
            }

            public final int hashCode() {
                return this.f6964a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchDeepLink(deepLink=", this.f6964a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchFullPageVideoPlayer;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchFullPageVideoPlayer extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final VideoData f6965a;
            public final long b;

            public LaunchFullPageVideoPlayer(VideoData videoData, long j) {
                Intrinsics.h(videoData, "videoData");
                this.f6965a = videoData;
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchFullPageVideoPlayer)) {
                    return false;
                }
                LaunchFullPageVideoPlayer launchFullPageVideoPlayer = (LaunchFullPageVideoPlayer) obj;
                return Intrinsics.c(this.f6965a, launchFullPageVideoPlayer.f6965a) && this.b == launchFullPageVideoPlayer.b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b) + (this.f6965a.hashCode() * 31);
            }

            public final String toString() {
                return "LaunchFullPageVideoPlayer(videoData=" + this.f6965a + ", videoProgress=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchListsBottomSheet;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchListsBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f6966a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchListsBottomSheet(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f6966a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchListsBottomSheet) && Intrinsics.c(this.f6966a, ((LaunchListsBottomSheet) obj).f6966a);
            }

            public final int hashCode() {
                return this.f6966a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchListsBottomSheet(productCard=", this.f6966a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchLogin;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchLogin extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchLogin f6967a = new LaunchLogin();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchLogin);
            }

            public final int hashCode() {
                return 707515224;
            }

            public final String toString() {
                return "LaunchLogin";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchProductDetails;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f6968a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductDetails(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f6968a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductDetails) && Intrinsics.c(this.f6968a, ((LaunchProductDetails) obj).f6968a);
            }

            public final int hashCode() {
                return this.f6968a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchProductDetails(productCard=", this.f6968a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchProductListProductGroup;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductListProductGroup extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6969a;
            public final String b;
            public final String c;

            public LaunchProductListProductGroup(String str, String str2, String str3) {
                this.f6969a = str;
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
                return Intrinsics.c(this.f6969a, launchProductListProductGroup.f6969a) && Intrinsics.c(this.b, launchProductListProductGroup.b) && Intrinsics.c(this.c, launchProductListProductGroup.c);
            }

            public final int hashCode() {
                int iHashCode = this.f6969a.hashCode() * 31;
                String str = this.b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return YU.a.o(YU.a.v("LaunchProductListProductGroup(groupId=", this.f6969a, ", title=", this.b, ", type="), this.c, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchProductOnMap;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductOnMap extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f6970a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductOnMap(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f6970a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductOnMap) && Intrinsics.c(this.f6970a, ((LaunchProductOnMap) obj).f6970a);
            }

            public final int hashCode() {
                return this.f6970a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchProductOnMap(productCard=", this.f6970a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchPromotionDetails;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchPromotionDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final PromotionCard f6971a;
            public final String b;

            public LaunchPromotionDetails(PromotionCard promotionCard, String containerTitle) {
                Intrinsics.h(containerTitle, "containerTitle");
                this.f6971a = promotionCard;
                this.b = containerTitle;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchPromotionDetails)) {
                    return false;
                }
                LaunchPromotionDetails launchPromotionDetails = (LaunchPromotionDetails) obj;
                return Intrinsics.c(this.f6971a, launchPromotionDetails.f6971a) && Intrinsics.c(this.b, launchPromotionDetails.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f6971a.hashCode() * 31);
            }

            public final String toString() {
                return "LaunchPromotionDetails(promotionCard=" + this.f6971a + ", containerTitle=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchRecipeDetails;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchRecipeDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final RecipeCardSummaryData f6972a;

            public LaunchRecipeDetails(RecipeCardSummaryData data) {
                Intrinsics.h(data, "data");
                this.f6972a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchRecipeDetails) && Intrinsics.c(this.f6972a, ((LaunchRecipeDetails) obj).f6972a);
            }

            public final int hashCode() {
                return this.f6972a.hashCode();
            }

            public final String toString() {
                return "LaunchRecipeDetails(data=" + this.f6972a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchWatchlistGuestOnboardingScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchWatchlistGuestOnboardingScreen f6973a = new LaunchWatchlistGuestOnboardingScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchWatchlistGuestOnboardingScreen);
            }

            public final int hashCode() {
                return 1018313571;
            }

            public final String toString() {
                return "LaunchWatchlistGuestOnboardingScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$LaunchWebView;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchWebView extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6974a;
            public final String b;

            public LaunchWebView(String str, String str2) {
                this.f6974a = str;
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
                return Intrinsics.c(this.f6974a, launchWebView.f6974a) && Intrinsics.c(this.b, launchWebView.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f6974a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("LaunchWebView(title=", this.f6974a, ", url=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$OpenOliveChat;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenOliveChat extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6975a;

            public OpenOliveChat(String oliveUrl) {
                Intrinsics.h(oliveUrl, "oliveUrl");
                this.f6975a = oliveUrl;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenOliveChat) && Intrinsics.c(this.f6975a, ((OpenOliveChat) obj).f6975a);
            }

            public final int hashCode() {
                return this.f6975a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenOliveChat(oliveUrl=", this.f6975a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$SharePage;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SharePage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6976a;

            public SharePage(String url) {
                Intrinsics.h(url, "url");
                this.f6976a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SharePage) && Intrinsics.c(this.f6976a, ((SharePage) obj).f6976a);
            }

            public final int hashCode() {
                return this.f6976a.hashCode();
            }

            public final String toString() {
                return YU.a.h("SharePage(url=", this.f6976a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$ViewShoppingList;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ViewShoppingList extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6977a;

            public ViewShoppingList(String id) {
                Intrinsics.h(id, "id");
                this.f6977a = id;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ViewShoppingList) && Intrinsics.c(this.f6977a, ((ViewShoppingList) obj).f6977a);
            }

            public final int hashCode() {
                return this.f6977a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ViewShoppingList(id=", this.f6977a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions$ViewWatchlist;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ViewWatchlist extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6978a;

            public ViewWatchlist(String str) {
                this.f6978a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ViewWatchlist) && Intrinsics.c(this.f6978a, ((ViewWatchlist) obj).f6978a);
            }

            public final int hashCode() {
                return this.f6978a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ViewWatchlist(watchlistId=", this.f6978a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$CartData;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CartData {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6979a;
        public final Integer b;

        public CartData(boolean z, Integer num) {
            this.f6979a = z;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CartData)) {
                return false;
            }
            CartData cartData = (CartData) obj;
            return this.f6979a == cartData.f6979a && Intrinsics.c(this.b, cartData.b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f6979a) * 31;
            Integer num = this.b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "CartData(showCartIcon=" + this.f6979a + ", cartItemCount=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$TopBarConfig;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TopBarConfig {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6981a;
        public final CartData b;
        public final boolean c;

        public TopBarConfig(boolean z, CartData cartData, boolean z2) {
            Intrinsics.h(cartData, "cartData");
            this.f6981a = z;
            this.b = cartData;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TopBarConfig)) {
                return false;
            }
            TopBarConfig topBarConfig = (TopBarConfig) obj;
            return this.f6981a == topBarConfig.f6981a && Intrinsics.c(this.b, topBarConfig.b) && this.c == topBarConfig.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.f6981a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TopBarConfig(showSearchIcon=");
            sb.append(this.f6981a);
            sb.append(", cartData=");
            sb.append(this.b);
            sb.append(", hideElevation=");
            return YU.a.k(")", sb, this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$ViewState;", "", "Companion", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState p = new ViewState(null, null, new TopBarConfig(false, new CartData(false, null), false), false, null, true, new LinkedHashMap(), null, false, "Generic Content Page screen", VideoAdPlayerState.g, false, null, null, false);

        /* renamed from: a, reason: collision with root package name */
        public final ContentPageData f6982a;
        public final Screen b;
        public final TopBarConfig c;
        public final boolean d;
        public final ContentPageFullPageError e;
        public final boolean f;
        public final Map g;
        public final SnackbarContent h;
        public final boolean i;
        public final String j;
        public final VideoAdPlayerState k;
        public final boolean l;
        public final List m;
        public final Snackbar n;
        public final boolean o;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$ViewState$Companion;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public ViewState(ContentPageData contentPageData, Screen screen, TopBarConfig topBarConfig, boolean z, ContentPageFullPageError contentPageFullPageError, boolean z2, Map videoProgressMap, SnackbarContent snackbarContent, boolean z3, String str, VideoAdPlayerState videoAdPlayerState, boolean z4, List list, Snackbar snackbar, boolean z5) {
            Intrinsics.h(topBarConfig, "topBarConfig");
            Intrinsics.h(videoProgressMap, "videoProgressMap");
            Intrinsics.h(videoAdPlayerState, "videoAdPlayerState");
            this.f6982a = contentPageData;
            this.b = screen;
            this.c = topBarConfig;
            this.d = z;
            this.e = contentPageFullPageError;
            this.f = z2;
            this.g = videoProgressMap;
            this.h = snackbarContent;
            this.i = z3;
            this.j = str;
            this.k = videoAdPlayerState;
            this.l = z4;
            this.m = list;
            this.n = snackbar;
            this.o = z5;
        }

        public static ViewState a(ViewState viewState, TopBarConfig topBarConfig, VideoAdPlayerState videoAdPlayerState, boolean z, int i) {
            ContentPageData contentPageData = viewState.f6982a;
            Screen screen = viewState.b;
            TopBarConfig topBarConfig2 = (i & 4) != 0 ? viewState.c : topBarConfig;
            boolean z2 = viewState.d;
            ContentPageFullPageError contentPageFullPageError = viewState.e;
            boolean z3 = viewState.f;
            Map videoProgressMap = viewState.g;
            SnackbarContent snackbarContent = viewState.h;
            boolean z4 = viewState.i;
            String str = viewState.j;
            VideoAdPlayerState videoAdPlayerState2 = (i & 1024) != 0 ? viewState.k : videoAdPlayerState;
            boolean z5 = (i & 2048) != 0 ? viewState.l : z;
            List list = viewState.m;
            Snackbar snackbar = viewState.n;
            boolean z6 = viewState.o;
            viewState.getClass();
            Intrinsics.h(topBarConfig2, "topBarConfig");
            Intrinsics.h(videoProgressMap, "videoProgressMap");
            Intrinsics.h(videoAdPlayerState2, "videoAdPlayerState");
            return new ViewState(contentPageData, screen, topBarConfig2, z2, contentPageFullPageError, z3, videoProgressMap, snackbarContent, z4, str, videoAdPlayerState2, z5, list, snackbar, z6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f6982a, viewState.f6982a) && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d && Intrinsics.c(this.e, viewState.e) && this.f == viewState.f && Intrinsics.c(this.g, viewState.g) && Intrinsics.c(this.h, viewState.h) && this.i == viewState.i && Intrinsics.c(this.j, viewState.j) && Intrinsics.c(this.k, viewState.k) && this.l == viewState.l && Intrinsics.c(this.m, viewState.m) && Intrinsics.c(this.n, viewState.n) && this.o == viewState.o;
        }

        public final int hashCode() {
            ContentPageData contentPageData = this.f6982a;
            int iHashCode = (contentPageData == null ? 0 : contentPageData.hashCode()) * 31;
            Screen screen = this.b;
            int iE = androidx.camera.core.impl.b.e((this.c.hashCode() + ((iHashCode + (screen == null ? 0 : screen.hashCode())) * 31)) * 31, 31, this.d);
            ContentPageFullPageError contentPageFullPageError = this.e;
            int iD = au.com.woolworths.dynamic.page.ui.content.d.d(this.g, androidx.camera.core.impl.b.e((iE + (contentPageFullPageError == null ? 0 : contentPageFullPageError.hashCode())) * 31, 31, this.f), 31);
            SnackbarContent snackbarContent = this.h;
            int iE2 = androidx.camera.core.impl.b.e((this.k.hashCode() + androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.e((iD + (snackbarContent == null ? 0 : snackbarContent.hashCode())) * 31, 31, this.i), 31, this.j)) * 31, 31, this.l);
            List list = this.m;
            int iHashCode2 = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
            Snackbar snackbar = this.n;
            return Boolean.hashCode(this.o) + ((iHashCode2 + (snackbar != null ? snackbar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(page=");
            sb.append(this.f6982a);
            sb.append(", analyticsScreen=");
            sb.append(this.b);
            sb.append(", topBarConfig=");
            sb.append(this.c);
            sb.append(", isLoading=");
            sb.append(this.d);
            sb.append(", error=");
            sb.append(this.e);
            sb.append(", showShareButton=");
            sb.append(this.f);
            sb.append(", videoProgressMap=");
            sb.append(this.g);
            sb.append(", snackbarMessage=");
            sb.append(this.h);
            sb.append(", enablePullToRefresh=");
            au.com.woolworths.android.onesite.a.y(", pageName=", this.j, ", videoAdPlayerState=", sb, this.i);
            sb.append(this.k);
            sb.append(", isInStoreMode=");
            sb.append(this.l);
            sb.append(", watchlistedProductIds=");
            sb.append(this.m);
            sb.append(", snackbar=");
            sb.append(this.n);
            sb.append(", inMappedStore=");
            return YU.a.k(")", sb, this.o);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Snackbar;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Snackbar {

        /* renamed from: a, reason: collision with root package name */
        public final ResText f6980a;
        public final Text b;
        public final Function0 c;
        public final Function1 d;

        public Snackbar(ResText resText, ResText resText2, Function0 function0, Function1 function1) {
            this.f6980a = resText;
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
            return Intrinsics.c(this.f6980a, snackbar.f6980a) && Intrinsics.c(this.b, snackbar.b) && Intrinsics.c(this.c, snackbar.c) && Intrinsics.c(this.d, snackbar.d);
        }

        public final int hashCode() {
            int iHashCode = this.f6980a.hashCode() * 31;
            Text text = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (text == null ? 0 : text.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "Snackbar(message=" + this.f6980a + ", actionLabel=" + this.b + ", actionCallback=" + this.c + ", onImpression=" + this.d + ")";
        }

        public /* synthetic */ Snackbar(ResText resText, Function1 function1) {
            this(resText, null, new h(20), function1);
        }
    }
}

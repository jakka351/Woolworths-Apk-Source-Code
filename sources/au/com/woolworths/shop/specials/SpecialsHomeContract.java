package au.com.woolworths.shop.specials;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.PromotionCard;
import au.com.woolworths.shop.aem.components.model.CatalogueCard;
import au.com.woolworths.shop.specials.model.SpecialsHome;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeContract;", "", "ViewState", "Snackbar", "Action", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SpecialsHomeContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action;", "", "LaunchCatalogueHome", "LaunchDeepLink", "LaunchCatalogueDetails", "LaunchProductDetails", "LaunchCartBottomSheet", "LaunchAddToListBottomSheet", "LaunchViewList", "LaunchWatchlistGuestOnboardingScreen", "LaunchPromotionDetails", "OpenOliveChat", "LaunchProductOnMap", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchAddToListBottomSheet;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchCartBottomSheet;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchCatalogueDetails;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchCatalogueHome;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchDeepLink;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchProductDetails;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchProductOnMap;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchPromotionDetails;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchViewList;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$OpenOliveChat;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchAddToListBottomSheet;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAddToListBottomSheet extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f12925a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchAddToListBottomSheet(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f12925a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchAddToListBottomSheet) && Intrinsics.c(this.f12925a, ((LaunchAddToListBottomSheet) obj).f12925a);
            }

            public final int hashCode() {
                return this.f12925a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchAddToListBottomSheet(productCard=", this.f12925a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchCartBottomSheet;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCartBottomSheet extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f12926a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchCartBottomSheet(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f12926a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchCartBottomSheet) && Intrinsics.c(this.f12926a, ((LaunchCartBottomSheet) obj).f12926a);
            }

            public final int hashCode() {
                return this.f12926a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchCartBottomSheet(productCard=", this.f12926a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchCatalogueDetails;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCatalogueDetails extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final CatalogueCard f12927a;

            public LaunchCatalogueDetails(CatalogueCard data) {
                Intrinsics.h(data, "data");
                this.f12927a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchCatalogueDetails) && Intrinsics.c(this.f12927a, ((LaunchCatalogueDetails) obj).f12927a);
            }

            public final int hashCode() {
                return this.f12927a.hashCode();
            }

            public final String toString() {
                return "LaunchCatalogueDetails(data=" + this.f12927a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchCatalogueHome;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCatalogueHome extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchCatalogueHome f12928a = new LaunchCatalogueHome();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchCatalogueHome);
            }

            public final int hashCode() {
                return 573981879;
            }

            public final String toString() {
                return "LaunchCatalogueHome";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchDeepLink;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeepLink extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f12929a;

            public LaunchDeepLink(String deepLink) {
                Intrinsics.h(deepLink, "deepLink");
                this.f12929a = deepLink;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchDeepLink) && Intrinsics.c(this.f12929a, ((LaunchDeepLink) obj).f12929a);
            }

            public final int hashCode() {
                return this.f12929a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchDeepLink(deepLink=", this.f12929a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchProductDetails;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductDetails extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f12930a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductDetails(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f12930a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductDetails) && Intrinsics.c(this.f12930a, ((LaunchProductDetails) obj).f12930a);
            }

            public final int hashCode() {
                return this.f12930a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchProductDetails(productCard=", this.f12930a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchProductOnMap;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductOnMap extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f12931a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductOnMap(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f12931a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductOnMap) && Intrinsics.c(this.f12931a, ((LaunchProductOnMap) obj).f12931a);
            }

            public final int hashCode() {
                return this.f12931a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchProductOnMap(productCard=", this.f12931a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchPromotionDetails;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchPromotionDetails extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final PromotionCard f12932a;
            public final String b;

            public LaunchPromotionDetails(PromotionCard promotionCard, String containerTitle) {
                Intrinsics.h(containerTitle, "containerTitle");
                this.f12932a = promotionCard;
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
                return Intrinsics.c(this.f12932a, launchPromotionDetails.f12932a) && Intrinsics.c(this.b, launchPromotionDetails.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f12932a.hashCode() * 31);
            }

            public final String toString() {
                return "LaunchPromotionDetails(promotionCard=" + this.f12932a + ", containerTitle=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchViewList;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchViewList extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f12933a;

            public LaunchViewList(String str) {
                this.f12933a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchViewList) && this.f12933a.equals(((LaunchViewList) obj).f12933a);
            }

            public final int hashCode() {
                return Boolean.hashCode(true) + (this.f12933a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.h("LaunchViewList(listId=", this.f12933a, ", isWatchlist=true)");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchWatchlistGuestOnboardingScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchWatchlistGuestOnboardingScreen f12934a = new LaunchWatchlistGuestOnboardingScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchWatchlistGuestOnboardingScreen);
            }

            public final int hashCode() {
                return -1796411261;
            }

            public final String toString() {
                return "LaunchWatchlistGuestOnboardingScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action$OpenOliveChat;", "Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenOliveChat extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f12935a;

            public OpenOliveChat(String oliveUrl) {
                Intrinsics.h(oliveUrl, "oliveUrl");
                this.f12935a = oliveUrl;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenOliveChat) && Intrinsics.c(this.f12935a, ((OpenOliveChat) obj).f12935a);
            }

            public final int hashCode() {
                return this.f12935a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenOliveChat(title=null, oliveUrl=", this.f12935a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeContract$Snackbar;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Snackbar {

        /* renamed from: a, reason: collision with root package name */
        public final ResText f12936a;
        public final Text b;
        public final Function0 c;
        public final Function1 d;

        public Snackbar(ResText resText, Text text, Function0 function0, Function1 function1) {
            this.f12936a = resText;
            this.b = text;
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
            return this.f12936a.equals(snackbar.f12936a) && Intrinsics.c(this.b, snackbar.b) && this.c.equals(snackbar.c) && this.d.equals(snackbar.d);
        }

        public final int hashCode() {
            int iHashCode = this.f12936a.hashCode() * 31;
            Text text = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (text == null ? 0 : text.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "Snackbar(message=" + this.f12936a + ", actionLabel=" + this.b + ", actionCallback=" + this.c + ", onImpression=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeContract$ViewState;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12937a;
        public final SpecialsHome b;
        public final SpecialsHomePageErrorState c;
        public final List d;
        public final Snackbar e;
        public final boolean f;

        public ViewState(boolean z, SpecialsHome specialsHome, SpecialsHomePageErrorState specialsHomePageErrorState, List list, Snackbar snackbar, boolean z2) {
            this.f12937a = z;
            this.b = specialsHome;
            this.c = specialsHomePageErrorState;
            this.d = list;
            this.e = snackbar;
            this.f = z2;
        }

        public static ViewState a(ViewState viewState, boolean z, SpecialsHome specialsHome, SpecialsHomePageErrorState specialsHomePageErrorState, List list, Snackbar snackbar, boolean z2, int i) {
            if ((i & 1) != 0) {
                z = viewState.f12937a;
            }
            boolean z3 = z;
            if ((i & 2) != 0) {
                specialsHome = viewState.b;
            }
            SpecialsHome specialsHome2 = specialsHome;
            if ((i & 4) != 0) {
                specialsHomePageErrorState = viewState.c;
            }
            SpecialsHomePageErrorState specialsHomePageErrorState2 = specialsHomePageErrorState;
            if ((i & 8) != 0) {
                list = viewState.d;
            }
            List watchlistedProductIds = list;
            if ((i & 16) != 0) {
                snackbar = viewState.e;
            }
            Snackbar snackbar2 = snackbar;
            if ((i & 32) != 0) {
                z2 = viewState.f;
            }
            viewState.getClass();
            Intrinsics.h(watchlistedProductIds, "watchlistedProductIds");
            return new ViewState(z3, specialsHome2, specialsHomePageErrorState2, watchlistedProductIds, snackbar2, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f12937a == viewState.f12937a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && this.f == viewState.f;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f12937a) * 31;
            SpecialsHome specialsHome = this.b;
            int iHashCode2 = (iHashCode + (specialsHome == null ? 0 : specialsHome.f12942a.hashCode())) * 31;
            SpecialsHomePageErrorState specialsHomePageErrorState = this.c;
            int iD = androidx.camera.core.impl.b.d((iHashCode2 + (specialsHomePageErrorState == null ? 0 : specialsHomePageErrorState.hashCode())) * 31, 31, this.d);
            Snackbar snackbar = this.e;
            return Boolean.hashCode(this.f) + ((iD + (snackbar != null ? snackbar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f12937a + ", data=" + this.b + ", errorState=" + this.c + ", watchlistedProductIds=" + this.d + ", snackbar=" + this.e + ", inMappedStore=" + this.f + ")";
        }

        public /* synthetic */ ViewState(SpecialsHome specialsHome, int i) {
            this(false, (i & 2) != 0 ? null : specialsHome, null, EmptyList.d, null, false);
        }
    }
}

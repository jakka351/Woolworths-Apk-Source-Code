package au.com.woolworths.feature.shop.catalogue.listing.promotion.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.shop.catalogue.common.BottomSheetResult;
import au.com.woolworths.product.models.ProductCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract;", "", "Action", "Snackbar", "ViewState", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PromotionDetailsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Action;", "", "LaunchProductDetails", "LaunchProductBottomSheet", "LaunchListsBottomSheet", "LaunchViewShoppingList", "LaunchWatchlistGuestOnboardingScreen", "Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Action$LaunchListsBottomSheet;", "Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Action$LaunchProductBottomSheet;", "Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Action$LaunchProductDetails;", "Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Action$LaunchViewShoppingList;", "Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Action$LaunchWatchlistGuestOnboardingScreen;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Action$LaunchListsBottomSheet;", "Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchListsBottomSheet extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f6889a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchListsBottomSheet(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f6889a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchListsBottomSheet) && Intrinsics.c(this.f6889a, ((LaunchListsBottomSheet) obj).f6889a);
            }

            public final int hashCode() {
                return this.f6889a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchListsBottomSheet(productCard=", this.f6889a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Action$LaunchProductBottomSheet;", "Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductBottomSheet extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f6890a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductBottomSheet(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f6890a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductBottomSheet) && Intrinsics.c(this.f6890a, ((LaunchProductBottomSheet) obj).f6890a);
            }

            public final int hashCode() {
                return this.f6890a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchProductBottomSheet(productCard=", this.f6890a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Action$LaunchProductDetails;", "Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductDetails extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f6891a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductDetails(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f6891a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductDetails) && Intrinsics.c(this.f6891a, ((LaunchProductDetails) obj).f6891a);
            }

            public final int hashCode() {
                return this.f6891a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchProductDetails(productCard=", this.f6891a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Action$LaunchViewShoppingList;", "Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchViewShoppingList extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f6892a;
            public final boolean b;

            public LaunchViewShoppingList(String id, boolean z) {
                Intrinsics.h(id, "id");
                this.f6892a = id;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchViewShoppingList)) {
                    return false;
                }
                LaunchViewShoppingList launchViewShoppingList = (LaunchViewShoppingList) obj;
                return Intrinsics.c(this.f6892a, launchViewShoppingList.f6892a) && this.b == launchViewShoppingList.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.f6892a.hashCode() * 31);
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.j("LaunchViewShoppingList(id=", this.f6892a, ", isWatchlist=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Action$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchWatchlistGuestOnboardingScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchWatchlistGuestOnboardingScreen f6893a = new LaunchWatchlistGuestOnboardingScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchWatchlistGuestOnboardingScreen);
            }

            public final int hashCode() {
                return 1218405145;
            }

            public final String toString() {
                return "LaunchWatchlistGuestOnboardingScreen";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Snackbar;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Snackbar {

        /* renamed from: a, reason: collision with root package name */
        public final ResText f6894a;
        public final Text b;
        public final Function0 c;
        public final Function1 d;

        public Snackbar(ResText resText, Text text, Function0 function0, Function1 function1) {
            this.f6894a = resText;
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
            return this.f6894a.equals(snackbar.f6894a) && Intrinsics.c(this.b, snackbar.b) && this.c.equals(snackbar.c) && this.d.equals(snackbar.d);
        }

        public final int hashCode() {
            int iHashCode = this.f6894a.hashCode() * 31;
            Text text = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (text == null ? 0 : text.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "Snackbar(message=" + this.f6894a + ", actionLabel=" + this.b + ", actionCallback=" + this.c + ", onImpression=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$ViewState;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6895a;
        public final boolean b;
        public final Integer c;
        public final Flow d;
        public final BottomSheetResult e;
        public final List f;
        public final Snackbar g;

        public ViewState(boolean z, boolean z2, Integer num, Flow flow, BottomSheetResult bottomSheetResult, List watchlistedProductIds, Snackbar snackbar) {
            Intrinsics.h(watchlistedProductIds, "watchlistedProductIds");
            this.f6895a = z;
            this.b = z2;
            this.c = num;
            this.d = flow;
            this.e = bottomSheetResult;
            this.f = watchlistedProductIds;
            this.g = snackbar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v2, types: [au.com.woolworths.feature.shop.catalogue.common.BottomSheetResult] */
        public static ViewState a(ViewState viewState, Integer num, Flow flow, BottomSheetResult.AddToListSuccess addToListSuccess, List list, Snackbar snackbar, int i) {
            boolean z = viewState.f6895a;
            boolean z2 = viewState.b;
            if ((i & 4) != 0) {
                num = viewState.c;
            }
            Integer num2 = num;
            if ((i & 8) != 0) {
                flow = viewState.d;
            }
            Flow flow2 = flow;
            BottomSheetResult.AddToListSuccess addToListSuccess2 = addToListSuccess;
            if ((i & 16) != 0) {
                addToListSuccess2 = viewState.e;
            }
            BottomSheetResult.AddToListSuccess addToListSuccess3 = addToListSuccess2;
            if ((i & 32) != 0) {
                list = viewState.f;
            }
            List watchlistedProductIds = list;
            if ((i & 64) != 0) {
                snackbar = viewState.g;
            }
            viewState.getClass();
            Intrinsics.h(watchlistedProductIds, "watchlistedProductIds");
            return new ViewState(z, z2, num2, flow2, addToListSuccess3, watchlistedProductIds, snackbar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f6895a == viewState.f6895a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && Intrinsics.c(this.f, viewState.f) && Intrinsics.c(this.g, viewState.g);
        }

        public final int hashCode() {
            int iE = androidx.camera.core.impl.b.e(Boolean.hashCode(this.f6895a) * 31, 31, this.b);
            Integer num = this.c;
            int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
            Flow flow = this.d;
            int iHashCode2 = (iHashCode + (flow == null ? 0 : flow.hashCode())) * 31;
            BottomSheetResult bottomSheetResult = this.e;
            int iD = androidx.camera.core.impl.b.d((iHashCode2 + (bottomSheetResult == null ? 0 : bottomSheetResult.hashCode())) * 31, 31, this.f);
            Snackbar snackbar = this.g;
            return iD + (snackbar != null ? snackbar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = androidx.camera.core.impl.b.v("ViewState(inStore=", ", shouldShowCart=", ", cartItemCount=", this.f6895a, this.b);
            sbV.append(this.c);
            sbV.append(", items=");
            sbV.append(this.d);
            sbV.append(", bottomSheetResult=");
            sbV.append(this.e);
            sbV.append(", watchlistedProductIds=");
            sbV.append(this.f);
            sbV.append(", snackbar=");
            sbV.append(this.g);
            sbV.append(")");
            return sbV.toString();
        }
    }
}

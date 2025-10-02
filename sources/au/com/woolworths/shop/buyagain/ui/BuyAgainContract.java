package au.com.woolworths.shop.buyagain.ui;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.buyagain.domain.BuyAgainProductList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract;", "", "Actions", "FailureMessage", "ViewState", "Snackbar", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface BuyAgainContract {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions;", "", "GoToProducts", "OpenAddToList", "OpenLogin", "OpenAddToCart", "OpenSearch", "OpenCart", "ViewWatchlist", "OpenInStoreMap", "OpenProductDetails", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$GoToProducts;", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$OpenAddToCart;", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$OpenAddToList;", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$OpenCart;", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$OpenInStoreMap;", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$OpenLogin;", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$OpenProductDetails;", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$OpenSearch;", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$ViewWatchlist;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$GoToProducts;", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GoToProducts implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final GoToProducts f10261a = new GoToProducts();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof GoToProducts);
            }

            public final int hashCode() {
                return -248540951;
            }

            public final String toString() {
                return "GoToProducts";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$OpenAddToCart;", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenAddToCart implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f10262a;

            static {
                int i = ProductCard.$stable;
            }

            public OpenAddToCart(ProductCard product) {
                Intrinsics.h(product, "product");
                this.f10262a = product;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenAddToCart) && Intrinsics.c(this.f10262a, ((OpenAddToCart) obj).f10262a);
            }

            public final int hashCode() {
                return this.f10262a.hashCode();
            }

            public final String toString() {
                return d.n("OpenAddToCart(product=", this.f10262a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$OpenAddToList;", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenAddToList implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f10263a;

            static {
                int i = ProductCard.$stable;
            }

            public OpenAddToList(ProductCard product) {
                Intrinsics.h(product, "product");
                this.f10263a = product;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenAddToList) && Intrinsics.c(this.f10263a, ((OpenAddToList) obj).f10263a);
            }

            public final int hashCode() {
                return this.f10263a.hashCode();
            }

            public final String toString() {
                return d.n("OpenAddToList(product=", this.f10263a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$OpenCart;", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenCart implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenCart f10264a = new OpenCart();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenCart);
            }

            public final int hashCode() {
                return 1946464876;
            }

            public final String toString() {
                return "OpenCart";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$OpenInStoreMap;", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenInStoreMap implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f10265a;

            static {
                int i = ProductCard.$stable;
            }

            public OpenInStoreMap(ProductCard product) {
                Intrinsics.h(product, "product");
                this.f10265a = product;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenInStoreMap) && Intrinsics.c(this.f10265a, ((OpenInStoreMap) obj).f10265a);
            }

            public final int hashCode() {
                return this.f10265a.hashCode();
            }

            public final String toString() {
                return d.n("OpenInStoreMap(product=", this.f10265a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$OpenLogin;", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenLogin implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenLogin f10266a = new OpenLogin();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenLogin);
            }

            public final int hashCode() {
                return 219586973;
            }

            public final String toString() {
                return "OpenLogin";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$OpenProductDetails;", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenProductDetails implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f10267a;

            static {
                int i = ProductCard.$stable;
            }

            public OpenProductDetails(ProductCard product) {
                Intrinsics.h(product, "product");
                this.f10267a = product;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenProductDetails) && Intrinsics.c(this.f10267a, ((OpenProductDetails) obj).f10267a);
            }

            public final int hashCode() {
                return this.f10267a.hashCode();
            }

            public final String toString() {
                return d.n("OpenProductDetails(product=", this.f10267a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$OpenSearch;", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenSearch implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenSearch f10268a = new OpenSearch();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenSearch);
            }

            public final int hashCode() {
                return -1591739916;
            }

            public final String toString() {
                return "OpenSearch";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions$ViewWatchlist;", "Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ViewWatchlist implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10269a;

            public ViewWatchlist(String str) {
                this.f10269a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ViewWatchlist) && Intrinsics.c(this.f10269a, ((ViewWatchlist) obj).f10269a);
            }

            public final int hashCode() {
                return this.f10269a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ViewWatchlist(watchlistId=", this.f10269a, ")");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$FailureMessage;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FailureMessage {
        public static final /* synthetic */ FailureMessage[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            FailureMessage[] failureMessageArr = {new FailureMessage("NO_CONNECTIVITY", 0), new FailureMessage("ADD_PRODUCT_ERROR", 1)};
            d = failureMessageArr;
            e = EnumEntriesKt.a(failureMessageArr);
        }

        public static FailureMessage valueOf(String str) {
            return (FailureMessage) Enum.valueOf(FailureMessage.class, str);
        }

        public static FailureMessage[] values() {
            return (FailureMessage[]) d.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$ViewState;", "", "Companion", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState o = new ViewState(false, false, null, null, EmptyMap.d, EmptySet.d, true, null, false, EmptyList.d, null, false, true, false);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10271a;
        public final boolean b;
        public final Integer c;
        public final BuyAgainProductList d;
        public final Map e;
        public final Set f;
        public final boolean g;
        public final BuyAgainFullPageError h;
        public final boolean i;
        public final List j;
        public final Snackbar k;
        public final boolean l;
        public final boolean m;
        public final boolean n;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$ViewState$Companion;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public ViewState(boolean z, boolean z2, Integer num, BuyAgainProductList buyAgainProductList, Map map, Set set, boolean z3, BuyAgainFullPageError buyAgainFullPageError, boolean z4, List list, Snackbar snackbar, boolean z5, boolean z6, boolean z7) {
            this.f10271a = z;
            this.b = z2;
            this.c = num;
            this.d = buyAgainProductList;
            this.e = map;
            this.f = set;
            this.g = z3;
            this.h = buyAgainFullPageError;
            this.i = z4;
            this.j = list;
            this.k = snackbar;
            this.l = z5;
            this.m = z6;
            this.n = z7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f10271a == viewState.f10271a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && Intrinsics.c(this.f, viewState.f) && this.g == viewState.g && Intrinsics.c(this.h, viewState.h) && this.i == viewState.i && Intrinsics.c(this.j, viewState.j) && Intrinsics.c(this.k, viewState.k) && this.l == viewState.l && this.m == viewState.m && this.n == viewState.n;
        }

        public final int hashCode() {
            int iE = b.e(Boolean.hashCode(this.f10271a) * 31, 31, this.b);
            Integer num = this.c;
            int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
            BuyAgainProductList buyAgainProductList = this.d;
            int iE2 = b.e((this.f.hashCode() + d.d(this.e, (iHashCode + (buyAgainProductList == null ? 0 : buyAgainProductList.hashCode())) * 31, 31)) * 31, 31, this.g);
            BuyAgainFullPageError buyAgainFullPageError = this.h;
            int iD = b.d(b.e((iE2 + (buyAgainFullPageError == null ? 0 : buyAgainFullPageError.hashCode())) * 31, 31, this.i), 31, this.j);
            Snackbar snackbar = this.k;
            return Boolean.hashCode(this.n) + b.e(b.e((iD + (snackbar != null ? snackbar.hashCode() : 0)) * 31, 31, this.l), 31, this.m);
        }

        public final String toString() {
            StringBuilder sbV = b.v("ViewState(isRefreshing=", ", isApplyingChip=", ", cartItemCount=", this.f10271a, this.b);
            sbV.append(this.c);
            sbV.append(", buyAgainProductList=");
            sbV.append(this.d);
            sbV.append(", updateQuantityMap=");
            sbV.append(this.e);
            sbV.append(", boostedProducts=");
            sbV.append(this.f);
            sbV.append(", shouldShowCart=");
            sbV.append(this.g);
            sbV.append(", fullPageErrorState=");
            sbV.append(this.h);
            sbV.append(", isWatchlistEnabled=");
            sbV.append(this.i);
            sbV.append(", watchlistedProductIds=");
            sbV.append(this.j);
            sbV.append(", snackbar=");
            sbV.append(this.k);
            sbV.append(", inMappedStore=");
            sbV.append(this.l);
            sbV.append(", shouldFilterCoachMark=");
            return au.com.woolworths.android.onesite.a.q(sbV, this.m, ", isLowerPriceYellowEnabled=", this.n, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Snackbar;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Snackbar {

        /* renamed from: a, reason: collision with root package name */
        public final Text f10270a;
        public final Text b;
        public final Function0 c;
        public final TrackingMetadata d;

        public Snackbar(Text text, Text text2, Function0 actionCallback, TrackingMetadata trackingMetadata) {
            Intrinsics.h(actionCallback, "actionCallback");
            this.f10270a = text;
            this.b = text2;
            this.c = actionCallback;
            this.d = trackingMetadata;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Snackbar)) {
                return false;
            }
            Snackbar snackbar = (Snackbar) obj;
            return Intrinsics.c(this.f10270a, snackbar.f10270a) && Intrinsics.c(this.b, snackbar.b) && Intrinsics.c(this.c, snackbar.c) && Intrinsics.c(this.d, snackbar.d);
        }

        public final int hashCode() {
            int iHashCode = this.f10270a.hashCode() * 31;
            Text text = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (text == null ? 0 : text.hashCode())) * 31)) * 31;
            TrackingMetadata trackingMetadata = this.d;
            return iHashCode2 + (trackingMetadata != null ? trackingMetadata.d.hashCode() : 0);
        }

        public final String toString() {
            return "Snackbar(message=" + this.f10270a + ", actionLabel=" + this.b + ", actionCallback=" + this.c + ", trackingMetadata=" + this.d + ")";
        }

        public /* synthetic */ Snackbar(Text text) {
            this(text, null, new h(20), null);
        }
    }
}

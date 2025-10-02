package au.com.woolworths.shop.lists.ui.substitutions;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.lists.data.model.AlternativeProductCard;
import au.com.woolworths.shop.lists.data.model.AlternativeProducts;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsDisclaimer;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract;", "", "ViewState", "Action", "ResultStatus", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ViewSimilarProductsContract {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action;", "", "LaunchProductSearch", "DisplayAddToCartBottomSheet", "FinishWithNoResult", "FinishWithResult", "DisplayAddToListBottomSheet", "DisplaySeeInStoreBottomSheet", "LaunchProductDetailsScreen", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action$DisplayAddToCartBottomSheet;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action$DisplayAddToListBottomSheet;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action$DisplaySeeInStoreBottomSheet;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action$FinishWithNoResult;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action$FinishWithResult;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action$LaunchProductDetailsScreen;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action$LaunchProductSearch;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action$DisplayAddToCartBottomSheet;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayAddToCartBottomSheet implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f12473a;

            static {
                int i = ProductCard.$stable;
            }

            public DisplayAddToCartBottomSheet(ProductCard product) {
                Intrinsics.h(product, "product");
                this.f12473a = product;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayAddToCartBottomSheet) && Intrinsics.c(this.f12473a, ((DisplayAddToCartBottomSheet) obj).f12473a);
            }

            public final int hashCode() {
                return this.f12473a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("DisplayAddToCartBottomSheet(product=", this.f12473a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action$DisplayAddToListBottomSheet;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayAddToListBottomSheet implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f12474a;

            static {
                int i = ProductCard.$stable;
            }

            public DisplayAddToListBottomSheet(ProductCard product) {
                Intrinsics.h(product, "product");
                this.f12474a = product;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayAddToListBottomSheet) && Intrinsics.c(this.f12474a, ((DisplayAddToListBottomSheet) obj).f12474a);
            }

            public final int hashCode() {
                return this.f12474a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("DisplayAddToListBottomSheet(product=", this.f12474a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action$DisplaySeeInStoreBottomSheet;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplaySeeInStoreBottomSheet implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f12475a;

            static {
                int i = ProductCard.$stable;
            }

            public DisplaySeeInStoreBottomSheet(ProductCard product) {
                Intrinsics.h(product, "product");
                this.f12475a = product;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplaySeeInStoreBottomSheet) && Intrinsics.c(this.f12475a, ((DisplaySeeInStoreBottomSheet) obj).f12475a);
            }

            public final int hashCode() {
                return this.f12475a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("DisplaySeeInStoreBottomSheet(product=", this.f12475a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action$FinishWithNoResult;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class FinishWithNoResult implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final FinishWithNoResult f12476a = new FinishWithNoResult();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action$FinishWithResult;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FinishWithResult implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f12477a;

            public FinishWithResult(String str) {
                ResultStatus resultStatus = ResultStatus.d;
                this.f12477a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FinishWithResult)) {
                    return false;
                }
                ResultStatus resultStatus = ResultStatus.d;
                return this.f12477a.equals(((FinishWithResult) obj).f12477a);
            }

            public final int hashCode() {
                return this.f12477a.hashCode() + (ResultStatus.d.hashCode() * 31);
            }

            public final String toString() {
                return "FinishWithResult(status=" + ResultStatus.d + ", listName=" + this.f12477a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action$LaunchProductDetailsScreen;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductDetailsScreen implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f12478a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductDetailsScreen(ProductCard product) {
                Intrinsics.h(product, "product");
                this.f12478a = product;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductDetailsScreen) && Intrinsics.c(this.f12478a, ((LaunchProductDetailsScreen) obj).f12478a);
            }

            public final int hashCode() {
                return this.f12478a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchProductDetailsScreen(product=", this.f12478a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action$LaunchProductSearch;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$Action;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductSearch implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f12479a;

            public LaunchProductSearch(String str) {
                this.f12479a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductSearch) && Intrinsics.c(this.f12479a, ((LaunchProductSearch) obj).f12479a);
            }

            public final int hashCode() {
                return this.f12479a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchProductSearch(searchTerm=", this.f12479a, ")");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$ResultStatus;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ResultStatus {
        public static final ResultStatus d;
        public static final /* synthetic */ ResultStatus[] e;
        public static final /* synthetic */ EnumEntries f;

        static {
            ResultStatus resultStatus = new ResultStatus("SUBSTITUTE_SAVED_TO_LIST", 0);
            d = resultStatus;
            ResultStatus[] resultStatusArr = {resultStatus};
            e = resultStatusArr;
            f = EnumEntriesKt.a(resultStatusArr);
        }

        public static ResultStatus valueOf(String str) {
            return (ResultStatus) Enum.valueOf(ResultStatus.class, str);
        }

        public static ResultStatus[] values() {
            return (ResultStatus[]) e.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$ViewState;", "", "Loading", "Content", "Error", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$ViewState$Content;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$ViewState$Error;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$ViewState$Loading;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$ViewState$Error;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$ViewState;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final FullPageMessage.Error f12481a;

            public Error(FullPageMessage.Error error) {
                this.f12481a = error;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.c(this.f12481a, ((Error) obj).f12481a);
            }

            public final int hashCode() {
                return this.f12481a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.f12481a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$ViewState$Loading;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$ViewState;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f12482a = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -735303846;
            }

            public final String toString() {
                return "Loading";
            }
        }

        default boolean a() {
            return c() || b();
        }

        default boolean b() {
            return (this instanceof Content) && ((Content) this).c != null;
        }

        default boolean c() {
            return (this instanceof Content) && ((Content) this).b != null;
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$ViewState$Content;", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$ViewState;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Content implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final AlternativeProducts f12480a;
            public final AlternativeProductCard b;
            public final AlternativeProductsDisclaimer c;
            public final String d;
            public final boolean e;
            public final boolean f;

            public Content(AlternativeProducts alternativeProducts, AlternativeProductCard alternativeProductCard, AlternativeProductsDisclaimer alternativeProductsDisclaimer, String str, boolean z, boolean z2) {
                this.f12480a = alternativeProducts;
                this.b = alternativeProductCard;
                this.c = alternativeProductsDisclaimer;
                this.d = str;
                this.e = z;
                this.f = z2;
            }

            public static Content d(Content content, AlternativeProducts alternativeProducts, AlternativeProductCard alternativeProductCard, AlternativeProductsDisclaimer alternativeProductsDisclaimer, int i) {
                if ((i & 1) != 0) {
                    alternativeProducts = content.f12480a;
                }
                AlternativeProducts alternativeProducts2 = alternativeProducts;
                if ((i & 2) != 0) {
                    alternativeProductCard = content.b;
                }
                AlternativeProductCard alternativeProductCard2 = alternativeProductCard;
                if ((i & 4) != 0) {
                    alternativeProductsDisclaimer = content.c;
                }
                String str = content.d;
                boolean z = content.e;
                boolean z2 = content.f;
                Intrinsics.h(alternativeProducts2, "alternativeProducts");
                return new Content(alternativeProducts2, alternativeProductCard2, alternativeProductsDisclaimer, str, z, z2);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return Intrinsics.c(this.f12480a, content.f12480a) && Intrinsics.c(this.b, content.b) && Intrinsics.c(this.c, content.c) && Intrinsics.c(this.d, content.d) && this.e == content.e && this.f == content.f;
            }

            public final int hashCode() {
                int iHashCode = this.f12480a.hashCode() * 31;
                AlternativeProductCard alternativeProductCard = this.b;
                int iHashCode2 = (iHashCode + (alternativeProductCard == null ? 0 : alternativeProductCard.hashCode())) * 31;
                AlternativeProductsDisclaimer alternativeProductsDisclaimer = this.c;
                int iHashCode3 = (iHashCode2 + (alternativeProductsDisclaimer == null ? 0 : alternativeProductsDisclaimer.hashCode())) * 31;
                String str = this.d;
                return Boolean.hashCode(this.f) + androidx.camera.core.impl.b.e((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.e);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(alternativeProducts=");
                sb.append(this.f12480a);
                sb.append(", selectedProduct=");
                sb.append(this.b);
                sb.append(", disclaimer=");
                sb.append(this.c);
                sb.append(", titleContentDescription=");
                sb.append(this.d);
                sb.append(", disableTileCompression=");
                return au.com.woolworths.android.onesite.a.q(sb, this.e, ", useSharedProductCardButtons=", this.f, ")");
            }

            public /* synthetic */ Content(AlternativeProducts alternativeProducts, String str, boolean z, boolean z2, int i) {
                this(alternativeProducts, null, null, (i & 8) != 0 ? null : str, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
            }
        }
    }
}

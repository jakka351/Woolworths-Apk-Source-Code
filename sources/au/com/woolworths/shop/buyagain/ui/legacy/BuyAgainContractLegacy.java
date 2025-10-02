package au.com.woolworths.shop.buyagain.ui.legacy;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.PagedList;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.product.models.ProductCard;
import com.woolworths.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy;", "", "Actions", "FailureMessage", "ViewState", "FooterState", "HeaderState", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface BuyAgainContractLegacy {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions;", "", "GoToProducts", "OpenAddToList", "OpenLogin", "OpenQuantitySelector", "OpenSearch", "ShowAddToCartMessage", "ShowFailMessage", "LaunchInStoreMap", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions$GoToProducts;", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions$LaunchInStoreMap;", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions$OpenAddToList;", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions$OpenLogin;", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions$OpenQuantitySelector;", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions$OpenSearch;", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions$ShowAddToCartMessage;", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions$ShowFailMessage;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions$GoToProducts;", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class GoToProducts implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final GoToProducts f10281a = new GoToProducts();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions$LaunchInStoreMap;", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchInStoreMap implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f10282a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchInStoreMap(ProductCard product) {
                Intrinsics.h(product, "product");
                this.f10282a = product;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchInStoreMap) && Intrinsics.c(this.f10282a, ((LaunchInStoreMap) obj).f10282a);
            }

            public final int hashCode() {
                return this.f10282a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchInStoreMap(product=", this.f10282a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions$OpenAddToList;", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenAddToList implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Map f10283a;

            public OpenAddToList(Map map) {
                this.f10283a = map;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenAddToList) && Intrinsics.c(this.f10283a, ((OpenAddToList) obj).f10283a);
            }

            public final int hashCode() {
                return this.f10283a.hashCode();
            }

            public final String toString() {
                return "OpenAddToList(selectedProductQuantityMap=" + this.f10283a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions$OpenLogin;", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class OpenLogin implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenLogin f10284a = new OpenLogin();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions$OpenQuantitySelector;", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenQuantitySelector implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f10285a;
            public final float b;

            static {
                int i = ProductCard.$stable;
            }

            public OpenQuantitySelector(ProductCard product, float f) {
                Intrinsics.h(product, "product");
                this.f10285a = product;
                this.b = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenQuantitySelector)) {
                    return false;
                }
                OpenQuantitySelector openQuantitySelector = (OpenQuantitySelector) obj;
                return Intrinsics.c(this.f10285a, openQuantitySelector.f10285a) && Float.compare(this.b, openQuantitySelector.b) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.b) + (this.f10285a.hashCode() * 31);
            }

            public final String toString() {
                return "OpenQuantitySelector(product=" + this.f10285a + ", initialQuantity=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions$OpenSearch;", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class OpenSearch implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenSearch f10286a = new OpenSearch();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions$ShowAddToCartMessage;", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowAddToCartMessage implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final int f10287a;

            public ShowAddToCartMessage(int i) {
                this.f10287a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowAddToCartMessage) && this.f10287a == ((ShowAddToCartMessage) obj).f10287a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f10287a);
            }

            public final String toString() {
                return YU.a.e(this.f10287a, "ShowAddToCartMessage(productsSelectedCount=", ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions$ShowFailMessage;", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowFailMessage implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final FailureMessage f10288a;

            public ShowFailMessage(FailureMessage failureMessage) {
                this.f10288a = failureMessage;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowFailMessage) && this.f10288a == ((ShowFailMessage) obj).f10288a;
            }

            public final int hashCode() {
                return this.f10288a.hashCode();
            }

            public final String toString() {
                return "ShowFailMessage(message=" + this.f10288a + ")";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$FailureMessage;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FailureMessage {
        public static final FailureMessage e;
        public static final FailureMessage f;
        public static final /* synthetic */ FailureMessage[] g;
        public static final /* synthetic */ EnumEntries h;
        public final int d;

        static {
            FailureMessage failureMessage = new FailureMessage("NO_CONNECTIVITY", 0, R.string.error_no_network);
            e = failureMessage;
            FailureMessage failureMessage2 = new FailureMessage("ADD_PRODUCT_ERROR", 1, R.string.buy_again_snackbar_error_add_to_cart);
            f = failureMessage2;
            FailureMessage[] failureMessageArr = {failureMessage, failureMessage2};
            g = failureMessageArr;
            h = EnumEntriesKt.a(failureMessageArr);
        }

        public FailureMessage(String str, int i, int i2) {
            this.d = i2;
        }

        public static FailureMessage valueOf(String str) {
            return (FailureMessage) Enum.valueOf(FailureMessage.class, str);
        }

        public static FailureMessage[] values() {
            return (FailureMessage[]) g.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$FooterState;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FooterState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10289a;
        public final ButtonApiData b;
        public final ButtonApiData c;
        public final int d;

        public FooterState(boolean z, ButtonApiData buttonApiData, ButtonApiData buttonApiData2, int i) {
            this.f10289a = z;
            this.b = buttonApiData;
            this.c = buttonApiData2;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FooterState)) {
                return false;
            }
            FooterState footerState = (FooterState) obj;
            return this.f10289a == footerState.f10289a && Intrinsics.c(this.b, footerState.b) && Intrinsics.c(this.c, footerState.c) && this.d == footerState.d;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f10289a) * 31;
            ButtonApiData buttonApiData = this.b;
            int iHashCode2 = (iHashCode + (buttonApiData == null ? 0 : buttonApiData.hashCode())) * 31;
            ButtonApiData buttonApiData2 = this.c;
            return Integer.hashCode(this.d) + ((iHashCode2 + (buttonApiData2 != null ? buttonApiData2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "FooterState(showFooter=" + this.f10289a + ", addToCartButton=" + this.b + ", addToListButton=" + this.c + ", productsSelectedCount=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$HeaderState;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeaderState {

        /* renamed from: a, reason: collision with root package name */
        public final String f10290a;

        public HeaderState(String str) {
            this.f10290a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HeaderState) && Intrinsics.c(this.f10290a, ((HeaderState) obj).f10290a);
        }

        public final int hashCode() {
            String str = this.f10290a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return YU.a.h("HeaderState(totalProducts=", this.f10290a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$ViewState;", "", "Companion", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState h = new ViewState(true, null, new HeaderState(""), new FooterState(false, null, null, 0), EmptyMap.d, true, null);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10291a;
        public final PagedList b;
        public final HeaderState c;
        public final FooterState d;
        public final Map e;
        public final boolean f;
        public final FullPageErrorCause g;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$ViewState$Companion;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public ViewState(boolean z, PagedList pagedList, HeaderState headerState, FooterState footerState, Map map, boolean z2, FullPageErrorCause fullPageErrorCause) {
            this.f10291a = z;
            this.b = pagedList;
            this.c = headerState;
            this.d = footerState;
            this.e = map;
            this.f = z2;
            this.g = fullPageErrorCause;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f10291a == viewState.f10291a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && this.f == viewState.f && Intrinsics.c(this.g, viewState.g);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f10291a) * 31;
            PagedList pagedList = this.b;
            int iE = androidx.camera.core.impl.b.e(au.com.woolworths.dynamic.page.ui.content.d.d(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (pagedList == null ? 0 : pagedList.hashCode())) * 31)) * 31)) * 31, 31), 31, this.f);
            FullPageErrorCause fullPageErrorCause = this.g;
            return iE + (fullPageErrorCause != null ? fullPageErrorCause.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f10291a + ", pagedList=" + this.b + ", header=" + this.c + ", footer=" + this.d + ", selectedProductQuantityMap=" + this.e + ", shouldShowCart=" + this.f + ", fullPageErrorState=" + this.g + ")";
        }
    }
}

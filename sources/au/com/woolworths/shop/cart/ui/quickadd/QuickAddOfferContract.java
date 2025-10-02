package au.com.woolworths.shop.cart.ui.quickadd;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.cart.domain.model.OfferProductList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract;", "", "ViewState", "Content", "Action", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface QuickAddOfferContract {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$Action;", "", "NavigateAndRefreshCart", "ShowSnackBar", "Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$Action$NavigateAndRefreshCart;", "Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$Action$ShowSnackBar;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$Action$NavigateAndRefreshCart;", "Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$Action;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NavigateAndRefreshCart implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateAndRefreshCart f10529a = new NavigateAndRefreshCart();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$Action$ShowSnackBar;", "Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$Action;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackBar implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final int f10530a;

            public ShowSnackBar(int i) {
                this.f10530a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackBar) && this.f10530a == ((ShowSnackBar) obj).f10530a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f10530a);
            }

            public final String toString() {
                return YU.a.e(this.f10530a, "ShowSnackBar(messageResId=", ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$Content;", "", "Empty", "Success", "Error", "Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$Content$Empty;", "Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$Content$Error;", "Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$Content$Success;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Content {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$Content$Empty;", "Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$Content;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Empty implements Content {

            /* renamed from: a, reason: collision with root package name */
            public static final Empty f10531a = new Empty();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$Content$Error;", "Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$Content;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements Content {

            /* renamed from: a, reason: collision with root package name */
            public final int f10532a;
            public final int b;
            public final int c;

            public Error(int i, int i2, int i3) {
                this.f10532a = i;
                this.b = i2;
                this.c = i3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return this.f10532a == error.f10532a && this.b == error.b && this.c == error.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + androidx.camera.core.impl.b.a(this.b, Integer.hashCode(this.f10532a) * 31, 31);
            }

            public final String toString() {
                return YU.a.m(YU.a.q(this.f10532a, this.b, "Error(imageResId=", ", titleResId=", ", messageResId="), this.c, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$Content$Success;", "Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$Content;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success implements Content {

            /* renamed from: a, reason: collision with root package name */
            public final OfferProductList.Success f10533a;
            public final Map b;

            public Success(OfferProductList.Success offerProductList, Map map) {
                Intrinsics.h(offerProductList, "offerProductList");
                this.f10533a = offerProductList;
                this.b = map;
            }

            public static Success a(Success success, Map map) {
                OfferProductList.Success offerProductList = success.f10533a;
                success.getClass();
                Intrinsics.h(offerProductList, "offerProductList");
                return new Success(offerProductList, map);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.c(this.f10533a, success.f10533a) && Intrinsics.c(this.b, success.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f10533a.hashCode() * 31);
            }

            public final String toString() {
                return "Success(offerProductList=" + this.f10533a + ", pendingQuantities=" + this.b + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$ViewState;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10534a;
        public final Content b;

        public ViewState(boolean z, Content content) {
            Intrinsics.h(content, "content");
            this.f10534a = z;
            this.b = content;
        }

        public static ViewState a(boolean z, Content content) {
            Intrinsics.h(content, "content");
            return new ViewState(z, content);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2, types: [au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferContract$Content] */
        public static /* synthetic */ ViewState b(ViewState viewState, Content.Success success, int i) {
            boolean z = (i & 1) != 0 ? viewState.f10534a : true;
            Content.Success success2 = success;
            if ((i & 2) != 0) {
                success2 = viewState.b;
            }
            viewState.getClass();
            return a(z, success2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f10534a == viewState.f10534a && Intrinsics.c(this.b, viewState.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.f10534a) * 31);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f10534a + ", content=" + this.b + ")";
        }
    }
}

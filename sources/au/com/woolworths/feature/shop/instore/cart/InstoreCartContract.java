package au.com.woolworths.feature.shop.instore.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.instore.cart.data.InstoreCartData;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract;", "", "NavigationAction", "ViewState", "instore-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InstoreCartContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$NavigationAction;", "", "NavigateUp", "Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$NavigationAction$NavigateUp;", "instore-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class NavigationAction {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$NavigationAction$NavigateUp;", "Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$NavigationAction;", "instore-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NavigateUp extends NavigationAction {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateUp f7302a = new NavigateUp();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$ViewState;", "", "InstoreCartContent", "Empty", "Loading", "Error", "Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$ViewState$Empty;", "Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$ViewState$Error;", "Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$ViewState$InstoreCartContent;", "Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$ViewState$Loading;", "instore-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$ViewState$Empty;", "Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$ViewState;", "instore-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Empty implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Empty f7303a = new Empty();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Empty);
            }

            public final int hashCode() {
                return 1335216578;
            }

            public final String toString() {
                return "Empty";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$ViewState$Error;", "Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$ViewState;", "instore-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final FullPageMessage.Error f7304a;

            public Error(FullPageMessage.Error error) {
                this.f7304a = error;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.c(this.f7304a, ((Error) obj).f7304a);
            }

            public final int hashCode() {
                return this.f7304a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.f7304a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$ViewState$InstoreCartContent;", "Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$ViewState;", "instore-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class InstoreCartContent implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final InstoreCartData f7305a;
            public final boolean b;

            public InstoreCartContent(InstoreCartData instoreCartData, boolean z) {
                this.f7305a = instoreCartData;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InstoreCartContent)) {
                    return false;
                }
                InstoreCartContent instoreCartContent = (InstoreCartContent) obj;
                return Intrinsics.c(this.f7305a, instoreCartContent.f7305a) && this.b == instoreCartContent.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.f7305a.hashCode() * 31);
            }

            public final String toString() {
                return "InstoreCartContent(data=" + this.f7305a + ", isStoreMapped=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$ViewState$Loading;", "Lau/com/woolworths/feature/shop/instore/cart/InstoreCartContract$ViewState;", "instore-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f7306a = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 908385393;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }
}

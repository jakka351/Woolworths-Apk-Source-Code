package au.com.woolworths.shop.cart.ui.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/AutoNavigationState;", "", "None", "LoggedIn", "WindowSelected", "Lau/com/woolworths/shop/cart/ui/cart/AutoNavigationState$LoggedIn;", "Lau/com/woolworths/shop/cart/ui/cart/AutoNavigationState$None;", "Lau/com/woolworths/shop/cart/ui/cart/AutoNavigationState$WindowSelected;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class AutoNavigationState {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/AutoNavigationState$LoggedIn;", "Lau/com/woolworths/shop/cart/ui/cart/AutoNavigationState;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoggedIn extends AutoNavigationState {

        /* renamed from: a, reason: collision with root package name */
        public static final LoggedIn f10457a = new LoggedIn();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoggedIn);
        }

        public final int hashCode() {
            return -952946434;
        }

        public final String toString() {
            return "LoggedIn";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/AutoNavigationState$None;", "Lau/com/woolworths/shop/cart/ui/cart/AutoNavigationState;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class None extends AutoNavigationState {

        /* renamed from: a, reason: collision with root package name */
        public static final None f10458a = new None();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return 22949231;
        }

        public final String toString() {
            return "None";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/AutoNavigationState$WindowSelected;", "Lau/com/woolworths/shop/cart/ui/cart/AutoNavigationState;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WindowSelected extends AutoNavigationState {

        /* renamed from: a, reason: collision with root package name */
        public static final WindowSelected f10459a = new WindowSelected();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WindowSelected);
        }

        public final int hashCode() {
            return 231778338;
        }

        public final String toString() {
            return "WindowSelected";
        }
    }
}

package au.com.woolworths.shop.checkout.ui.bridge;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/bridge/CheckoutBridgeContract;", "", "Action", "ViewState", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CheckoutBridgeContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/bridge/CheckoutBridgeContract$Action;", "", "LaunchPaymentScreen", "LaunchZeroPayment", "Lau/com/woolworths/shop/checkout/ui/bridge/CheckoutBridgeContract$Action$LaunchPaymentScreen;", "Lau/com/woolworths/shop/checkout/ui/bridge/CheckoutBridgeContract$Action$LaunchZeroPayment;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/bridge/CheckoutBridgeContract$Action$LaunchPaymentScreen;", "Lau/com/woolworths/shop/checkout/ui/bridge/CheckoutBridgeContract$Action;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchPaymentScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f10674a;

            public LaunchPaymentScreen(boolean z) {
                this.f10674a = z;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/bridge/CheckoutBridgeContract$Action$LaunchZeroPayment;", "Lau/com/woolworths/shop/checkout/ui/bridge/CheckoutBridgeContract$Action;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchZeroPayment extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchZeroPayment f10675a = new LaunchZeroPayment();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/bridge/CheckoutBridgeContract$ViewState;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final List f10676a;

        public ViewState(List list) {
            this.f10676a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && Intrinsics.c(this.f10676a, ((ViewState) obj).f10676a);
        }

        public final int hashCode() {
            return this.f10676a.hashCode();
        }

        public final String toString() {
            return a.l("ViewState(steps=", ")", this.f10676a);
        }
    }
}

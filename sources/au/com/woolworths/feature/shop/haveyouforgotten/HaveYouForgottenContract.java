package au.com.woolworths.feature.shop.haveyouforgotten;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.cart.data.model.CartFooterData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/haveyouforgotten/HaveYouForgottenContract;", "", "Actions", "ViewState", "have-you-forgotten_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface HaveYouForgottenContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/haveyouforgotten/HaveYouForgottenContract$Actions;", "", "LaunchCheckout", "Lau/com/woolworths/feature/shop/haveyouforgotten/HaveYouForgottenContract$Actions$LaunchCheckout;", "have-you-forgotten_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/haveyouforgotten/HaveYouForgottenContract$Actions$LaunchCheckout;", "Lau/com/woolworths/feature/shop/haveyouforgotten/HaveYouForgottenContract$Actions;", "have-you-forgotten_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCheckout extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchCheckout f7149a = new LaunchCheckout();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchCheckout);
            }

            public final int hashCode() {
                return -1411826901;
            }

            public final String toString() {
                return "LaunchCheckout";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/haveyouforgotten/HaveYouForgottenContract$ViewState;", "", "have-you-forgotten_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final CartFooterData f7150a;

        public ViewState(CartFooterData cartFooterData) {
            this.f7150a = cartFooterData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && Intrinsics.c(this.f7150a, ((ViewState) obj).f7150a);
        }

        public final int hashCode() {
            CartFooterData cartFooterData = this.f7150a;
            if (cartFooterData == null) {
                return 0;
            }
            return cartFooterData.hashCode();
        }

        public final String toString() {
            return "ViewState(footer=" + this.f7150a + ")";
        }
    }
}

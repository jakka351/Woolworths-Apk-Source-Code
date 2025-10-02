package au.com.woolworths.product.cartpreauth;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/product/cartpreauth/CartPreAuthContract;", "", "Actions", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CartPreAuthContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/product/cartpreauth/CartPreAuthContract$Actions;", "", "LaunchLogInFlow", "LaunchSignUpFlow", "Lau/com/woolworths/product/cartpreauth/CartPreAuthContract$Actions$LaunchLogInFlow;", "Lau/com/woolworths/product/cartpreauth/CartPreAuthContract$Actions$LaunchSignUpFlow;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/cartpreauth/CartPreAuthContract$Actions$LaunchLogInFlow;", "Lau/com/woolworths/product/cartpreauth/CartPreAuthContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchLogInFlow extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchLogInFlow f9252a = new LaunchLogInFlow();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchLogInFlow);
            }

            public final int hashCode() {
                return 1400550899;
            }

            public final String toString() {
                return "LaunchLogInFlow";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/cartpreauth/CartPreAuthContract$Actions$LaunchSignUpFlow;", "Lau/com/woolworths/product/cartpreauth/CartPreAuthContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSignUpFlow extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSignUpFlow f9253a = new LaunchSignUpFlow();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchSignUpFlow);
            }

            public final int hashCode() {
                return -853575574;
            }

            public final String toString() {
                return "LaunchSignUpFlow";
            }
        }
    }
}

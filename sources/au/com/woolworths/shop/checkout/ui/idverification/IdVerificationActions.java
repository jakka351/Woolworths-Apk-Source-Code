package au.com.woolworths.shop.checkout.ui.idverification;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "ExitClick", "NetworkError", "ServerError", "NetworkErrorTryAgainClick", "ServerErrorTryAgainClick", "IdVerificationSuccessImpression", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions$ExitClick;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions$IdVerificationSuccessImpression;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions$NetworkError;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions$NetworkErrorTryAgainClick;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions$ServerError;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions$ServerErrorTryAgainClick;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class IdVerificationActions implements Action {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions$ExitClick;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExitClick extends IdVerificationActions {
        public static final ExitClick d = new ExitClick();
        public static final Category e = Category.m;
        public static final String f = "Exit";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions$IdVerificationSuccessImpression;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IdVerificationSuccessImpression extends IdVerificationActions {
        public static final IdVerificationSuccessImpression d = new IdVerificationSuccessImpression();
        public static final Category e = Category.g0;
        public static final String f = "Success! Your age has been verified";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions$NetworkError;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NetworkError extends IdVerificationActions {
        public static final NetworkError d = new NetworkError();
        public static final Category e = Category.v;
        public static final String f = "Network Error";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions$NetworkErrorTryAgainClick;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NetworkErrorTryAgainClick extends IdVerificationActions {
        public static final NetworkErrorTryAgainClick d = new NetworkErrorTryAgainClick();
        public static final Category e = Category.m;
        public static final String f = "Network Error - Try Again";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions$ServerError;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServerError extends IdVerificationActions {
        public static final ServerError d = new ServerError();
        public static final Category e = Category.v;
        public static final String f = "Server Error";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions$ServerErrorTryAgainClick;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServerErrorTryAgainClick extends IdVerificationActions {
        public static final ServerErrorTryAgainClick d = new ServerErrorTryAgainClick();
        public static final Category e = Category.m;
        public static final String f = "Server Error - Try Again";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return e;
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return IdVerificationScreens.d;
    }
}

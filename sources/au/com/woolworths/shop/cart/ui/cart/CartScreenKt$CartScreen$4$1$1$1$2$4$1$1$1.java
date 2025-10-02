package au.com.woolworths.shop.cart.ui.cart;

import au.com.woolworths.analytics.supers.couponbanner.EmCouponBannerAnalytics;
import au.com.woolworths.analytics.supers.couponbanner.EmCouponBannerAnalytics$Banner$Action$couponBannerTandcClick$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.cart.ui.cart.CartContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class CartScreenKt$CartScreen$4$1$1$1$2$4$1$1$1 extends FunctionReferenceImpl implements Function2<String, String, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String p0 = (String) obj;
        String p1 = (String) obj2;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        CartViewModel cartViewModel = (CartViewModel) this.receiver;
        cartViewModel.getClass();
        cartViewModel.l.k(new CartContract.Actions.OpenUrl(p0));
        AnalyticsManager analyticsManager = cartViewModel.g;
        EmCouponBannerAnalytics.Banner.Action action = CartViewModel.u.h;
        action.getClass();
        analyticsManager.g(new EmCouponBannerAnalytics$Banner$Action$couponBannerTandcClick$1(action, p1));
        return Unit.f24250a;
    }
}

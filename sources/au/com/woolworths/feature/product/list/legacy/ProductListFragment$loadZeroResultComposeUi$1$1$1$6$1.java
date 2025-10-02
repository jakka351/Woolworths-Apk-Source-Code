package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.analytics.supers.products.ZeroResultAnalytics;
import au.com.woolworths.analytics.supers.products.ZeroResultAnalytics$ZeroPageResult$Action$askOliveBannerClick$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListFragment$loadZeroResultComposeUi$1$1$1$6$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        productListViewModel.getClass();
        AnalyticsManager analyticsManager = productListViewModel.g;
        ZeroResultAnalytics.ZeroPageResult.Action action = productListViewModel.E6().f;
        action.getClass();
        analyticsManager.g(new ZeroResultAnalytics$ZeroPageResult$Action$askOliveBannerClick$1(action, p0));
        productListViewModel.v.f(ProductListContract.Actions.OpenOliveChat.f5311a);
        return Unit.f24250a;
    }
}

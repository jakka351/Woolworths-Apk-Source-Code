package au.com.woolworths.feature.product.list;

import au.com.woolworths.analytics.supers.products.ZeroResultAnalytics;
import au.com.woolworths.analytics.supers.products.ZeroResultAnalytics$ZeroPageResult$Action$askOliveBannerClick$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.product.list.ProductListContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListFragment$loadZeroResultComposeUi$1$1$1$5$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        productListViewModel.getClass();
        AnalyticsManager analyticsManager = productListViewModel.h;
        ZeroResultAnalytics.ZeroPageResult.Action action = productListViewModel.w6().f;
        action.getClass();
        analyticsManager.g(new ZeroResultAnalytics$ZeroPageResult$Action$askOliveBannerClick$1(action, p0));
        productListViewModel.y.f(ProductListContract.Actions.OpenOliveChat.f5237a);
        return Unit.f24250a;
    }
}

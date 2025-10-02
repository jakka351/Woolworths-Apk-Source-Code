package au.com.woolworths.shop.buyagain.ui.composable;

import au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics;
import au.com.woolworths.foundation.shop.instore.navigation.AnalyticsManagerExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.buyagain.ui.BuyAgainContract;
import au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class BuyAgainScreenKt$BuyAgainScreen$14$1 extends FunctionReferenceImpl implements Function1<ProductCard, Unit> {
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProductCard p0 = (ProductCard) obj;
        Intrinsics.h(p0, "p0");
        BuyAgainViewModel buyAgainViewModel = (BuyAgainViewModel) this.receiver;
        buyAgainViewModel.getClass();
        AnalyticsManagerExtKt.a(buyAgainViewModel.g, "Buy Again screen", null, (String) BuyAgainAnalytics.BuyAgain.d.get("app.Section"), p0);
        buyAgainViewModel.k.k(new BuyAgainContract.Actions.OpenInStoreMap(p0));
        return Unit.f24250a;
    }
}

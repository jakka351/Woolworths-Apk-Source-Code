package au.com.woolworths.shop.buyagain.ui.composable;

import au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.buyagain.ui.BuyAgainContract;
import au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel;
import au.com.woolworths.shop.lists.data.WatchlistInteractor;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class BuyAgainScreenKt$BuyAgainScreen$13$1 extends FunctionReferenceImpl implements Function1<ProductCard, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProductCard p0 = (ProductCard) obj;
        Intrinsics.h(p0, "p0");
        BuyAgainViewModel buyAgainViewModel = (BuyAgainViewModel) this.receiver;
        AnalyticsManager analyticsManager = buyAgainViewModel.g;
        WatchlistInteractor watchlistInteractor = buyAgainViewModel.j;
        String strB = watchlistInteractor.b();
        if (strB != null) {
            if (ProductCardExtKt.t(p0, ((BuyAgainContract.ViewState) buyAgainViewModel.n.getValue()).j)) {
                analyticsManager.i(BuyAgainAnalytics.BuyAgain.Action.w, ProductAnalyticsExtKt.h(p0, null, null, 7));
                watchlistInteractor.d(p0);
                BuyAgainViewModel.w6(buyAgainViewModel, new ResText(R.string.watchlist_product_removed_snackbar_message), null, null, ProductAnalyticsExtKt.h(p0, null, null, 7), 6);
            } else {
                analyticsManager.i(BuyAgainAnalytics.BuyAgain.Action.v, ProductAnalyticsExtKt.h(p0, null, null, 7));
                watchlistInteractor.a(p0);
                buyAgainViewModel.v6(new ResText(R.string.watchlist_product_added_snackbar_message), new ResText(R.string.view_list), new androidx.work.impl.utils.c(19, buyAgainViewModel, p0, strB), ProductAnalyticsExtKt.h(p0, null, null, 7));
            }
        }
        return Unit.f24250a;
    }
}

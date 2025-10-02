package au.com.woolworths.feature.product.list;

import android.content.Context;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.feature.product.list.analytics.ProductListActions;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductListFragment e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u(ProductListFragment productListFragment, Object obj, int i) {
        this.d = i;
        this.e = productListFragment;
        this.f = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.f;
        ProductListFragment productListFragment = this.e;
        switch (i) {
            case 0:
                float f = ProductListFragment.u;
                AnalyticsManager analyticsManagerX2 = productListFragment.X2();
                ProductListContract.Actions.DisplaySnackbarForWatchlist displaySnackbarForWatchlist = (ProductListContract.Actions.DisplaySnackbarForWatchlist) ((ProductListContract.Actions) obj);
                ResText resText = displaySnackbarForWatchlist.b;
                Context contextRequireContext = productListFragment.requireContext();
                Intrinsics.g(contextRequireContext, "requireContext(...)");
                analyticsManagerX2.j(new ProductListActions.SaveToWatchlistSnackbarImpression(resText.getText(contextRequireContext).toString()), productListFragment.m3().E6(displaySnackbarForWatchlist.d));
                break;
            default:
                float f2 = ProductListFragment.u;
                productListFragment.m3().B6((String) obj);
                break;
        }
        return unit;
    }
}

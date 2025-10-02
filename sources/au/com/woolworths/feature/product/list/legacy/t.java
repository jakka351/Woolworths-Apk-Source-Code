package au.com.woolworths.feature.product.list.legacy;

import android.content.Context;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.feature.product.list.legacy.analytics.ProductListActions;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductListFragment e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t(ProductListFragment productListFragment, Object obj, int i) {
        this.d = i;
        this.e = productListFragment;
        this.f = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.h2().I6((ProductListContract.CoachMark) this.f);
                break;
            case 1:
                this.e.h2().I6((ProductListContract.CoachMark) this.f);
                break;
            default:
                ProductListContract.Actions actions = (ProductListContract.Actions) this.f;
                ProductListFragment productListFragment = this.e;
                AnalyticsManager analyticsManagerQ1 = productListFragment.Q1();
                ProductListContract.Actions.DisplaySnackbarForWatchlist displaySnackbarForWatchlist = (ProductListContract.Actions.DisplaySnackbarForWatchlist) actions;
                ResText resText = displaySnackbarForWatchlist.b;
                Context contextRequireContext = productListFragment.requireContext();
                Intrinsics.g(contextRequireContext, "requireContext(...)");
                analyticsManagerQ1.j(new ProductListActions.SaveToWatchlistSnackbarImpression(resText.getText(contextRequireContext).toString()), productListFragment.h2().O6(displaySnackbarForWatchlist.d));
                break;
        }
        return Unit.f24250a;
    }
}

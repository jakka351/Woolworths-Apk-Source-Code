package com.woolworths.scanlibrary.ui.weighted;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.WeightRequiredProductSelectionScreenTracking;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.weighted.WeightedListContract;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/ui/weighted/WeightedListPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/weighted/WeightedListContract$View;", "Lcom/woolworths/scanlibrary/ui/weighted/WeightedListContract$Presenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WeightedListPresenter extends BasePresenter<WeightedListContract.View> implements WeightedListContract.Presenter {
    public final Cart c;
    public final AnalyticsProvider d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeightedListPresenter(WeightedListContract.View view, Cart shoppingCart, AnalyticsProvider analyticsAggregator) {
        super(view);
        Intrinsics.h(shoppingCart, "shoppingCart");
        Intrinsics.h(analyticsAggregator, "analyticsAggregator");
        this.c = shoppingCart;
        this.d = analyticsAggregator;
        view.k1(this);
        analyticsAggregator.a(new WeightRequiredProductSelectionScreenTracking("Weight Required Product Selection Screen"));
    }

    @Override // com.woolworths.scanlibrary.base.BasePresenter, com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public final void M0() {
        Cart cart = this.c;
        int size = cart.c().size();
        MvpView mvpView = this.f21139a;
        if (size == 1) {
            ((WeightedListContract.View) mvpView).m((Item) cart.c().get(0));
            return;
        }
        WeightedListContract.View view = (WeightedListContract.View) mvpView;
        if (view.t0() != null) {
            String strT0 = view.t0();
            Iterator it = cart.c().iterator();
            while (it.hasNext()) {
                Item item = (Item) it.next();
                if (Intrinsics.c(item.getEannumber(), strT0)) {
                    view.m(item);
                    return;
                }
            }
        }
    }

    @Override // com.woolworths.scanlibrary.ui.weighted.WeightedListContract.Presenter
    public final float X(String str) {
        try {
            return Integer.parseInt(StringsKt.Q(str, "026000000000", "", false)) / 1000;
        } catch (NumberFormatException unused) {
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    @Override // com.woolworths.scanlibrary.ui.weighted.WeightedListContract.Presenter
    public final List j() {
        return this.c.c();
    }
}

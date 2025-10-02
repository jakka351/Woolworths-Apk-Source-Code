package com.woolworths.scanlibrary.ui.home.itemview.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.databinding.PostScanViewWeightRequiredItemBinding;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.home.itemview.ItemContract;
import com.woolworths.scanlibrary.util.extensions.BigDecimalExtKt;
import com.woolworths.scanlibrary.util.extensions.ItemExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/views/WeightRequiredPSView;", "Lcom/woolworths/scanlibrary/ui/home/itemview/views/ItemView;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WeightRequiredPSView implements ItemView {

    /* renamed from: a, reason: collision with root package name */
    public final Item f21273a;
    public final List b;
    public PostScanViewWeightRequiredItemBinding c;
    public View d;
    public ItemContract.Presenter e;
    public Context f;
    public AnalyticsProvider g;

    public WeightRequiredPSView(Item item, List list) {
        this.f21273a = item;
        this.b = list;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final boolean a() {
        return true;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        PostScanViewWeightRequiredItemBinding postScanViewWeightRequiredItemBinding = (PostScanViewWeightRequiredItemBinding) DataBindingUtil.c(layoutInflater, R.layout.post_scan_view_weight_required_item, viewGroup, false, null);
        this.c = postScanViewWeightRequiredItemBinding;
        if (postScanViewWeightRequiredItemBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        View view = postScanViewWeightRequiredItemBinding.h;
        this.d = view;
        if (view == null) {
            Intrinsics.p("rootView");
            throw null;
        }
        this.f = view.getContext();
        PostScanViewWeightRequiredItemBinding postScanViewWeightRequiredItemBinding2 = this.c;
        if (postScanViewWeightRequiredItemBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        Item item = this.f21273a;
        postScanViewWeightRequiredItemBinding2.L(item);
        PostScanViewWeightRequiredItemBinding postScanViewWeightRequiredItemBinding3 = this.c;
        if (postScanViewWeightRequiredItemBinding3 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        postScanViewWeightRequiredItemBinding3.B.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 26));
        PostScanViewWeightRequiredItemBinding postScanViewWeightRequiredItemBinding4 = this.c;
        if (postScanViewWeightRequiredItemBinding4 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        postScanViewWeightRequiredItemBinding4.C.setVisibility(ItemExtKt.b(item) ? 0 : 8);
        if (item.getItemIs().getLinkedpromo()) {
            PostScanViewWeightRequiredItemBinding postScanViewWeightRequiredItemBinding5 = this.c;
            if (postScanViewWeightRequiredItemBinding5 == null) {
                Intrinsics.p("binding");
                throw null;
            }
            TextView textView = postScanViewWeightRequiredItemBinding5.C;
            Context context = this.f;
            if (context == null) {
                Intrinsics.p("context");
                throw null;
            }
            textView.setText(context.getString(R.string.sng_label_savings_applied));
        } else if (item.getItemIs().getPromotionalitem()) {
            PostScanViewWeightRequiredItemBinding postScanViewWeightRequiredItemBinding6 = this.c;
            if (postScanViewWeightRequiredItemBinding6 == null) {
                Intrinsics.p("binding");
                throw null;
            }
            TextView textView2 = postScanViewWeightRequiredItemBinding6.C;
            Context context2 = this.f;
            if (context2 == null) {
                Intrinsics.p("context");
                throw null;
            }
            String string = context2.getString(R.string.sng_label_save);
            Intrinsics.g(string, "getString(...)");
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.B(new Object[]{BigDecimalExtKt.a(item.getDiscountamount())}, 1, string, textView2);
        }
        View view2 = this.d;
        if (view2 != null) {
            return view2;
        }
        Intrinsics.p("rootView");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final ItemContract.Presenter d() {
        ItemContract.Presenter presenter = this.e;
        if (presenter != null) {
            return presenter;
        }
        Intrinsics.p("presenter");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final void e(AnalyticsProvider analyticsProvider) {
        this.g = analyticsProvider;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final void g(ItemContract.Presenter presenter) {
        this.e = presenter;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final Context getContext() {
        Context context = this.f;
        if (context != null) {
            return context;
        }
        Intrinsics.p("context");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final void h(boolean z) {
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final void i() {
        PostScanViewWeightRequiredItemBinding postScanViewWeightRequiredItemBinding = this.c;
        if (postScanViewWeightRequiredItemBinding != null) {
            postScanViewWeightRequiredItemBinding.B.setVisibility(8);
        } else {
            Intrinsics.p("binding");
            throw null;
        }
    }
}

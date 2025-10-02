package com.woolworths.scanlibrary.ui.home.itemview.views;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.databinding.PostScanViewWeightedItemBinding;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.home.itemview.ItemContract;
import com.woolworths.scanlibrary.util.extensions.BigDecimalExtKt;
import com.woolworths.scanlibrary.util.extensions.ItemExtKt;
import com.woolworths.scanlibrary.util.extensions.ViewExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/views/WeightedItemPSView;", "Lcom/woolworths/scanlibrary/ui/home/itemview/views/ItemView;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WeightedItemPSView implements ItemView {

    /* renamed from: a, reason: collision with root package name */
    public final Item f21274a;
    public final List b;
    public final boolean c;
    public PostScanViewWeightedItemBinding d;
    public View e;
    public ItemContract.Presenter f;
    public Context g;
    public AnalyticsProvider h;

    public WeightedItemPSView(Item item, List list, boolean z) {
        this.f21274a = item;
        this.b = list;
        this.c = z;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final boolean a() {
        return true;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        PostScanViewWeightedItemBinding postScanViewWeightedItemBinding = (PostScanViewWeightedItemBinding) DataBindingUtil.c(layoutInflater, R.layout.post_scan_view_weighted_item, viewGroup, false, null);
        this.d = postScanViewWeightedItemBinding;
        if (postScanViewWeightedItemBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        View view = postScanViewWeightedItemBinding.h;
        this.e = view;
        if (view == null) {
            Intrinsics.p("rootView");
            throw null;
        }
        this.g = view.getContext();
        PostScanViewWeightedItemBinding postScanViewWeightedItemBinding2 = this.d;
        if (postScanViewWeightedItemBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        Item item = this.f21274a;
        postScanViewWeightedItemBinding2.M(item);
        PostScanViewWeightedItemBinding postScanViewWeightedItemBinding3 = this.d;
        if (postScanViewWeightedItemBinding3 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        postScanViewWeightedItemBinding3.D.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 27));
        PostScanViewWeightedItemBinding postScanViewWeightedItemBinding4 = this.d;
        if (postScanViewWeightedItemBinding4 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        postScanViewWeightedItemBinding4.L(Boolean.valueOf(this.c));
        PostScanViewWeightedItemBinding postScanViewWeightedItemBinding5 = this.d;
        if (postScanViewWeightedItemBinding5 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        postScanViewWeightedItemBinding5.E.setVisibility(ItemExtKt.b(item) ? 0 : 8);
        if (item.getItemIs().getLinkedpromo()) {
            PostScanViewWeightedItemBinding postScanViewWeightedItemBinding6 = this.d;
            if (postScanViewWeightedItemBinding6 == null) {
                Intrinsics.p("binding");
                throw null;
            }
            TextView textView = postScanViewWeightedItemBinding6.E;
            Context context = this.g;
            if (context == null) {
                Intrinsics.p("context");
                throw null;
            }
            textView.setText(context.getString(R.string.sng_label_savings_applied));
        } else if (item.getItemIs().getPromotionalitem()) {
            PostScanViewWeightedItemBinding postScanViewWeightedItemBinding7 = this.d;
            if (postScanViewWeightedItemBinding7 == null) {
                Intrinsics.p("binding");
                throw null;
            }
            TextView textView2 = postScanViewWeightedItemBinding7.E;
            Context context2 = this.g;
            if (context2 == null) {
                Intrinsics.p("context");
                throw null;
            }
            String string = context2.getString(R.string.sng_label_save);
            Intrinsics.g(string, "getString(...)");
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.B(new Object[]{BigDecimalExtKt.a(item.getDiscountamount())}, 1, string, textView2);
        }
        View view2 = this.e;
        if (view2 != null) {
            return view2;
        }
        Intrinsics.p("rootView");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final ItemContract.Presenter d() {
        ItemContract.Presenter presenter = this.f;
        if (presenter != null) {
            return presenter;
        }
        Intrinsics.p("presenter");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final void e(AnalyticsProvider analyticsProvider) {
        this.h = analyticsProvider;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final void g(ItemContract.Presenter presenter) {
        this.f = presenter;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final Context getContext() {
        Context context = this.g;
        if (context != null) {
            return context;
        }
        Intrinsics.p("context");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final void h(boolean z) {
        if (z) {
            Context context = this.g;
            if (context == null) {
                Intrinsics.p("context");
                throw null;
            }
            View rootView = ((Activity) context).getWindow().getDecorView().getRootView();
            Intrinsics.g(rootView, "getRootView(...)");
            ViewExtKt.a(rootView);
        }
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final void i() {
        PostScanViewWeightedItemBinding postScanViewWeightedItemBinding = this.d;
        if (postScanViewWeightedItemBinding != null) {
            postScanViewWeightedItemBinding.D.setVisibility(8);
        } else {
            Intrinsics.p("binding");
            throw null;
        }
    }
}

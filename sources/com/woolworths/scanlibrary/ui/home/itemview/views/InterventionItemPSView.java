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
import com.woolworths.scanlibrary.databinding.PostScanViewInterventionItemBinding;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.home.itemview.ItemContract;
import com.woolworths.scanlibrary.util.extensions.BigDecimalExtKt;
import com.woolworths.scanlibrary.util.extensions.ItemExtKt;
import com.woolworths.scanlibrary.util.extensions.ViewExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/views/InterventionItemPSView;", "Lcom/woolworths/scanlibrary/ui/home/itemview/views/ItemView;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class InterventionItemPSView implements ItemView {

    /* renamed from: a, reason: collision with root package name */
    public final Item f21271a;
    public final List b;
    public View c;
    public Context d;
    public PostScanViewInterventionItemBinding e;
    public ItemContract.Presenter f;
    public AnalyticsProvider g;

    public InterventionItemPSView(Item item, List list) {
        this.f21271a = item;
        this.b = list;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final boolean a() {
        return false;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        PostScanViewInterventionItemBinding postScanViewInterventionItemBinding = (PostScanViewInterventionItemBinding) DataBindingUtil.c(layoutInflater, R.layout.post_scan_view_intervention_item, viewGroup, false, null);
        this.e = postScanViewInterventionItemBinding;
        if (postScanViewInterventionItemBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        View view = postScanViewInterventionItemBinding.h;
        Intrinsics.h(view, "<set-?>");
        this.c = view;
        Context context = j().getContext();
        Intrinsics.h(context, "<set-?>");
        this.d = context;
        PostScanViewInterventionItemBinding postScanViewInterventionItemBinding2 = this.e;
        if (postScanViewInterventionItemBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        Item item = this.f21271a;
        postScanViewInterventionItemBinding2.M(item);
        PostScanViewInterventionItemBinding postScanViewInterventionItemBinding3 = this.e;
        if (postScanViewInterventionItemBinding3 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        postScanViewInterventionItemBinding3.L(Boolean.valueOf(Intrinsics.c(item.getItemIs().getQuantityUpdateAllowed(), Boolean.TRUE)));
        PostScanViewInterventionItemBinding postScanViewInterventionItemBinding4 = this.e;
        if (postScanViewInterventionItemBinding4 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        postScanViewInterventionItemBinding4.E.setVisibility(ItemExtKt.b(item) ? 0 : 8);
        if (item.getItemIs().getLinkedpromo()) {
            PostScanViewInterventionItemBinding postScanViewInterventionItemBinding5 = this.e;
            if (postScanViewInterventionItemBinding5 == null) {
                Intrinsics.p("binding");
                throw null;
            }
            TextView textView = postScanViewInterventionItemBinding5.E;
            Context context2 = this.d;
            if (context2 == null) {
                Intrinsics.p("mContext");
                throw null;
            }
            textView.setText(context2.getString(R.string.sng_label_savings_applied));
        } else if (item.getItemIs().getPromotionalitem()) {
            PostScanViewInterventionItemBinding postScanViewInterventionItemBinding6 = this.e;
            if (postScanViewInterventionItemBinding6 == null) {
                Intrinsics.p("binding");
                throw null;
            }
            TextView textView2 = postScanViewInterventionItemBinding6.E;
            Context context3 = this.d;
            if (context3 == null) {
                Intrinsics.p("mContext");
                throw null;
            }
            String string = context3.getString(R.string.sng_label_save);
            Intrinsics.g(string, "getString(...)");
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.B(new Object[]{BigDecimalExtKt.a(item.getDiscountamount())}, 1, string, textView2);
        }
        PostScanViewInterventionItemBinding postScanViewInterventionItemBinding7 = this.e;
        if (postScanViewInterventionItemBinding7 != null) {
            postScanViewInterventionItemBinding7.D.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 22));
            return j();
        }
        Intrinsics.p("binding");
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
        this.g = analyticsProvider;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final void g(ItemContract.Presenter presenter) {
        this.f = presenter;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final Context getContext() {
        Context context = this.d;
        if (context != null) {
            return context;
        }
        Intrinsics.p("mContext");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public void h(boolean z) {
        if (z) {
            ViewExtKt.b(R.string.sng_post_scan_intervention_item_added_to_cart, j());
        }
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final void i() {
        PostScanViewInterventionItemBinding postScanViewInterventionItemBinding = this.e;
        if (postScanViewInterventionItemBinding != null) {
            postScanViewInterventionItemBinding.D.setVisibility(8);
        } else {
            Intrinsics.p("binding");
            throw null;
        }
    }

    public final View j() {
        View view = this.c;
        if (view != null) {
            return view;
        }
        Intrinsics.p("rootView");
        throw null;
    }
}

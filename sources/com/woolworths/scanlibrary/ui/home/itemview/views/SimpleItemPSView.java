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
import com.woolworths.scanlibrary.databinding.PostScanViewSimpleItemBinding;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.home.itemview.ItemContract;
import com.woolworths.scanlibrary.util.extensions.BigDecimalExtKt;
import com.woolworths.scanlibrary.util.extensions.ItemExtKt;
import com.woolworths.scanlibrary.util.extensions.ViewExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/views/SimpleItemPSView;", "Lcom/woolworths/scanlibrary/ui/home/itemview/views/ItemView;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class SimpleItemPSView implements ItemView {

    /* renamed from: a, reason: collision with root package name */
    public final Item f21272a;
    public final List b;
    public final boolean c;
    public PostScanViewSimpleItemBinding d;
    public View e;
    public ItemContract.Presenter f;
    public Context g;
    public AnalyticsProvider h;

    public SimpleItemPSView(Item item, List list, boolean z) {
        this.f21272a = item;
        this.b = list;
        this.c = z;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public boolean a() {
        return !(this instanceof AssistanceRequiredPSView);
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        PostScanViewSimpleItemBinding postScanViewSimpleItemBinding = (PostScanViewSimpleItemBinding) DataBindingUtil.c(layoutInflater, R.layout.post_scan_view_simple_item, viewGroup, false, null);
        this.d = postScanViewSimpleItemBinding;
        if (postScanViewSimpleItemBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        View view = postScanViewSimpleItemBinding.h;
        this.e = view;
        if (view == null) {
            Intrinsics.p("rootView");
            throw null;
        }
        this.g = view.getContext();
        PostScanViewSimpleItemBinding postScanViewSimpleItemBinding2 = this.d;
        if (postScanViewSimpleItemBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        Item item = this.f21272a;
        postScanViewSimpleItemBinding2.N(item);
        PostScanViewSimpleItemBinding postScanViewSimpleItemBinding3 = this.d;
        if (postScanViewSimpleItemBinding3 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        postScanViewSimpleItemBinding3.L(Boolean.valueOf(j()));
        PostScanViewSimpleItemBinding postScanViewSimpleItemBinding4 = this.d;
        if (postScanViewSimpleItemBinding4 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        postScanViewSimpleItemBinding4.E.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 24));
        PostScanViewSimpleItemBinding postScanViewSimpleItemBinding5 = this.d;
        if (postScanViewSimpleItemBinding5 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        postScanViewSimpleItemBinding5.M(Boolean.valueOf(this.c));
        PostScanViewSimpleItemBinding postScanViewSimpleItemBinding6 = this.d;
        if (postScanViewSimpleItemBinding6 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        postScanViewSimpleItemBinding6.F.setVisibility(ItemExtKt.b(item) ? 0 : 8);
        if (item.getItemIs().getLinkedpromo()) {
            PostScanViewSimpleItemBinding postScanViewSimpleItemBinding7 = this.d;
            if (postScanViewSimpleItemBinding7 == null) {
                Intrinsics.p("binding");
                throw null;
            }
            TextView textView = postScanViewSimpleItemBinding7.F;
            Context context = this.g;
            if (context == null) {
                Intrinsics.p("mContext");
                throw null;
            }
            textView.setText(context.getString(R.string.sng_label_savings_applied));
        } else if (item.getItemIs().getPromotionalitem()) {
            PostScanViewSimpleItemBinding postScanViewSimpleItemBinding8 = this.d;
            if (postScanViewSimpleItemBinding8 == null) {
                Intrinsics.p("binding");
                throw null;
            }
            TextView textView2 = postScanViewSimpleItemBinding8.F;
            Context context2 = this.g;
            if (context2 == null) {
                Intrinsics.p("mContext");
                throw null;
            }
            String string = context2.getString(R.string.sng_label_save);
            Intrinsics.g(string, "getString(...)");
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.B(new Object[]{BigDecimalExtKt.a(item.getDiscountamount())}, 1, string, textView2);
        }
        if (item.getItemIs().getReducedtoclear()) {
            PostScanViewSimpleItemBinding postScanViewSimpleItemBinding9 = this.d;
            if (postScanViewSimpleItemBinding9 == null) {
                Intrinsics.p("binding");
                throw null;
            }
            postScanViewSimpleItemBinding9.F.setVisibility(8);
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
        Intrinsics.p("mContext");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public void h(boolean z) {
        if (z) {
            Context context = this.g;
            if (context == null) {
                Intrinsics.p("mContext");
                throw null;
            }
            View rootView = ((Activity) context).getWindow().getDecorView().getRootView();
            Intrinsics.g(rootView, "getRootView(...)");
            ViewExtKt.a(rootView);
        }
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final void i() {
        PostScanViewSimpleItemBinding postScanViewSimpleItemBinding = this.d;
        if (postScanViewSimpleItemBinding != null) {
            postScanViewSimpleItemBinding.E.setVisibility(8);
        } else {
            Intrinsics.p("binding");
            throw null;
        }
    }

    public final boolean j() {
        return Intrinsics.c(this.f21272a.getItemIs().getQuantityUpdateAllowed(), Boolean.TRUE);
    }

    public final TextView k() {
        PostScanViewSimpleItemBinding postScanViewSimpleItemBinding = this.d;
        if (postScanViewSimpleItemBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        TextView itemQuantity = postScanViewSimpleItemBinding.C;
        Intrinsics.g(itemQuantity, "itemQuantity");
        return itemQuantity;
    }
}

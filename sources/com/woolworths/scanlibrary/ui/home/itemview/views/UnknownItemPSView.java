package com.woolworths.scanlibrary.ui.home.itemview.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.PostScanViewUnknownItemBinding;
import com.woolworths.scanlibrary.util.extensions.ViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/views/UnknownItemPSView;", "Lcom/woolworths/scanlibrary/ui/home/itemview/views/InterventionItemPSView;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UnknownItemPSView extends InterventionItemPSView {
    public PostScanViewUnknownItemBinding h;

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.InterventionItemPSView, com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        PostScanViewUnknownItemBinding postScanViewUnknownItemBinding = (PostScanViewUnknownItemBinding) DataBindingUtil.c(layoutInflater, R.layout.post_scan_view_unknown_item, viewGroup, false, null);
        this.h = postScanViewUnknownItemBinding;
        if (postScanViewUnknownItemBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        View view = postScanViewUnknownItemBinding.h;
        Intrinsics.h(view, "<set-?>");
        this.c = view;
        Context context = j().getContext();
        Intrinsics.h(context, "<set-?>");
        this.d = context;
        PostScanViewUnknownItemBinding postScanViewUnknownItemBinding2 = this.h;
        if (postScanViewUnknownItemBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        postScanViewUnknownItemBinding2.L(this.f21271a);
        PostScanViewUnknownItemBinding postScanViewUnknownItemBinding3 = this.h;
        if (postScanViewUnknownItemBinding3 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        View view2 = postScanViewUnknownItemBinding3.h;
        Intrinsics.h(view2, "<set-?>");
        this.c = view2;
        PostScanViewUnknownItemBinding postScanViewUnknownItemBinding4 = this.h;
        if (postScanViewUnknownItemBinding4 != null) {
            postScanViewUnknownItemBinding4.y.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 25));
            return j();
        }
        Intrinsics.p("binding");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.InterventionItemPSView, com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final void h(boolean z) {
        if (z) {
            ViewExtKt.b(R.string.sng_post_scan_unknown_item_added_to_cart, j());
        }
    }
}

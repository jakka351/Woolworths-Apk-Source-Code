package com.woolworths.scanlibrary.ui.home.itemview.views;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.PostScanViewSimpleItemBinding;
import com.woolworths.scanlibrary.util.extensions.ViewExtKt;
import com.woolworths.scanlibrary.util.widget.PriceView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/views/AssistanceRequiredPSView;", "Lcom/woolworths/scanlibrary/ui/home/itemview/views/SimpleItemPSView;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AssistanceRequiredPSView extends SimpleItemPSView {
    public View i;

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.SimpleItemPSView, com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.i = super.b(layoutInflater, viewGroup);
        k().setEnabled(j());
        k().setAlpha(0.5f);
        PostScanViewSimpleItemBinding postScanViewSimpleItemBinding = this.d;
        if (postScanViewSimpleItemBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        PriceView itemPrice = postScanViewSimpleItemBinding.B;
        Intrinsics.g(itemPrice, "itemPrice");
        itemPrice.setVisibility(8);
        PostScanViewSimpleItemBinding postScanViewSimpleItemBinding2 = this.d;
        if (postScanViewSimpleItemBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        TextView labelRemoveItem = postScanViewSimpleItemBinding2.E;
        Intrinsics.g(labelRemoveItem, "labelRemoveItem");
        labelRemoveItem.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 21));
        if (this.f21272a.getItemIs().getWeightrequired()) {
            if (this.i == null) {
                Intrinsics.p("rootView");
                throw null;
            }
            k().setVisibility(8);
        }
        View view = this.i;
        if (view != null) {
            return view;
        }
        Intrinsics.p("rootView");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.SimpleItemPSView, com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final void h(boolean z) {
        if (z) {
            View view = this.i;
            if (view != null) {
                ViewExtKt.b(R.string.sng_post_scan_intervention_item_added_to_cart, view);
            } else {
                Intrinsics.p("rootView");
                throw null;
            }
        }
    }
}

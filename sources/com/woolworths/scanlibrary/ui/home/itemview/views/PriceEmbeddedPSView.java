package com.woolworths.scanlibrary.ui.home.itemview.views;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/views/PriceEmbeddedPSView;", "Lcom/woolworths/scanlibrary/ui/home/itemview/views/SimpleItemPSView;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PriceEmbeddedPSView extends SimpleItemPSView {
    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.SimpleItemPSView, com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final boolean a() {
        return true;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.SimpleItemPSView, com.woolworths.scanlibrary.ui.home.itemview.views.ItemView
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewB = super.b(layoutInflater, viewGroup);
        k().setEnabled(j());
        k().setAlpha(0.5f);
        return viewB;
    }
}

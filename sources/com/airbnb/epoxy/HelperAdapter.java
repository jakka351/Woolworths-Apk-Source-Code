package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/airbnb/epoxy/HelperAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/airbnb/epoxy/EpoxyViewHolder;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HelperAdapter extends RecyclerView.Adapter<EpoxyViewHolder> {
    public EpoxyModel g;
    public ViewParent h;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void v(RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        ViewParent viewParent = this.h;
        EpoxyModel epoxyModel = this.g;
        Intrinsics.e(epoxyModel);
        View viewJ = epoxyModel.j(viewGroup);
        EpoxyModel epoxyModel2 = this.g;
        Intrinsics.e(epoxyModel2);
        return new EpoxyViewHolder(viewParent, viewJ, epoxyModel2.y());
    }
}

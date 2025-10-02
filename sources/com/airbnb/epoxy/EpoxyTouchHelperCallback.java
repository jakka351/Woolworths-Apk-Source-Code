package com.airbnb.epoxy;

import android.graphics.Canvas;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/epoxy/EpoxyTouchHelperCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class EpoxyTouchHelperCallback extends ItemTouchHelper.Callback {
    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final RecyclerView.ViewHolder b(RecyclerView.ViewHolder selected, List dropTargets, int i, int i2) {
        Intrinsics.h(selected, "selected");
        Intrinsics.h(dropTargets, "dropTargets");
        RecyclerView.ViewHolder viewHolderB = super.b((EpoxyViewHolder) selected, dropTargets, i, i2);
        if (viewHolderB instanceof EpoxyViewHolder) {
            return (EpoxyViewHolder) viewHolderB;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void c(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.h(recyclerView, "recyclerView");
        Intrinsics.h(viewHolder, "viewHolder");
        j(recyclerView, (EpoxyViewHolder) viewHolder);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void h(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        Intrinsics.h(c, "c");
        Intrinsics.h(viewHolder, "viewHolder");
        n(c, recyclerView, (EpoxyViewHolder) viewHolder, f, f2, i, z);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void i(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
        Intrinsics.h(recyclerView, "recyclerView");
        Intrinsics.h(viewHolder, "viewHolder");
        super.i(recyclerView, (EpoxyViewHolder) viewHolder, i, (EpoxyViewHolder) viewHolder2, i2, i3, i4);
    }

    public void j(RecyclerView recyclerView, EpoxyViewHolder viewHolder) {
        Intrinsics.h(recyclerView, "recyclerView");
        Intrinsics.h(viewHolder, "viewHolder");
        super.c(recyclerView, viewHolder);
    }

    public final int k(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.h(recyclerView, "recyclerView");
        Intrinsics.h(viewHolder, "viewHolder");
        return l(recyclerView, (EpoxyViewHolder) viewHolder);
    }

    public abstract int l(RecyclerView recyclerView, EpoxyViewHolder epoxyViewHolder);

    public final void m(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.h(viewHolder, "viewHolder");
    }

    public void n(Canvas c, RecyclerView recyclerView, EpoxyViewHolder viewHolder, float f, float f2, int i, boolean z) {
        Intrinsics.h(c, "c");
        Intrinsics.h(viewHolder, "viewHolder");
        super.h(c, recyclerView, viewHolder, f, f2, i, z);
    }

    public final void o(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.h(c, "c");
        Intrinsics.h(viewHolder, "viewHolder");
        Intrinsics.f(viewHolder instanceof EpoxyViewHolder ? (EpoxyViewHolder) viewHolder : null, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.ViewHolder");
    }
}

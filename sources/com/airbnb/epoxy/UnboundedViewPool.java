package com.airbnb.epoxy;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/epoxy/UnboundedViewPool;", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UnboundedViewPool extends RecyclerView.RecycledViewPool {
    public final SparseArray d = new SparseArray();

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final void a() {
        this.d.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final RecyclerView.ViewHolder b(int i) {
        Queue queue = (Queue) this.d.get(i);
        if (queue != null) {
            return (RecyclerView.ViewHolder) queue.poll();
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final void d(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.h(viewHolder, "viewHolder");
        int itemViewType = viewHolder.getItemViewType();
        SparseArray sparseArray = this.d;
        Queue linkedList = (Queue) sparseArray.get(itemViewType);
        if (linkedList == null) {
            linkedList = new LinkedList();
            sparseArray.put(itemViewType, linkedList);
        }
        linkedList.add(viewHolder);
    }
}

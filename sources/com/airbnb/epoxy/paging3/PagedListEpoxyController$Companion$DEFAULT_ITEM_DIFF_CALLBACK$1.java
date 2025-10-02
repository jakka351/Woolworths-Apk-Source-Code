package com.airbnb.epoxy.paging3;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/airbnb/epoxy/paging3/PagedListEpoxyController$Companion$DEFAULT_ITEM_DIFF_CALLBACK$1", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "epoxy-paging3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PagedListEpoxyController$Companion$DEFAULT_ITEM_DIFF_CALLBACK$1 extends DiffUtil.ItemCallback<Object> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean a(Object oldItem, Object newItem) {
        Intrinsics.h(oldItem, "oldItem");
        Intrinsics.h(newItem, "newItem");
        return oldItem.equals(newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean b(Object oldItem, Object newItem) {
        Intrinsics.h(oldItem, "oldItem");
        Intrinsics.h(newItem, "newItem");
        return oldItem.equals(newItem);
    }
}

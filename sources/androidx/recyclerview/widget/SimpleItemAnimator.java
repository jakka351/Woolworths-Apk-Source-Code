package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class SimpleItemAnimator extends RecyclerView.ItemAnimator {
    public boolean g;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i;
        int i2;
        if (itemHolderInfo != null && ((i = itemHolderInfo.f3686a) != (i2 = itemHolderInfo2.f3686a) || itemHolderInfo.b != itemHolderInfo2.b)) {
            return o(viewHolder, i, itemHolderInfo.b, i2, itemHolderInfo2.b);
        }
        m(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean b(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i;
        int i2;
        int i3 = itemHolderInfo.f3686a;
        int i4 = itemHolderInfo.b;
        if (viewHolder2.shouldIgnore()) {
            int i5 = itemHolderInfo.f3686a;
            i2 = itemHolderInfo.b;
            i = i5;
        } else {
            i = itemHolderInfo2.f3686a;
            i2 = itemHolderInfo2.b;
        }
        return n(viewHolder, viewHolder2, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean c(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i = itemHolderInfo.f3686a;
        int i2 = itemHolderInfo.b;
        View view = viewHolder.itemView;
        int left = itemHolderInfo2 == null ? view.getLeft() : itemHolderInfo2.f3686a;
        int top = itemHolderInfo2 == null ? view.getTop() : itemHolderInfo2.b;
        if (viewHolder.isRemoved() || (i == left && i2 == top)) {
            p(viewHolder);
            return true;
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return o(viewHolder, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean d(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i = itemHolderInfo.f3686a;
        int i2 = itemHolderInfo2.f3686a;
        if (i != i2 || itemHolderInfo.b != itemHolderInfo2.b) {
            return o(viewHolder, i, itemHolderInfo.b, i2, itemHolderInfo2.b);
        }
        h(viewHolder);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean f(RecyclerView.ViewHolder viewHolder) {
        return !this.g || viewHolder.isInvalid();
    }

    public abstract void m(RecyclerView.ViewHolder viewHolder);

    public abstract boolean n(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4);

    public abstract boolean o(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4);

    public abstract void p(RecyclerView.ViewHolder viewHolder);

    public void q(RecyclerView.ViewHolder viewHolder) {
    }

    public void r(RecyclerView.ViewHolder viewHolder) {
    }
}

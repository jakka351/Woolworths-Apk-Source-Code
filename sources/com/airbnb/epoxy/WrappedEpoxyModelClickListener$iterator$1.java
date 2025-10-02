package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/airbnb/epoxy/WrappedEpoxyModelClickListener$iterator$1", "", "Landroid/view/View;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WrappedEpoxyModelClickListener$iterator$1 implements Iterator<View>, KMutableIterator {
    public int d;
    public final /* synthetic */ ViewGroup e;

    public WrappedEpoxyModelClickListener$iterator$1(ViewGroup viewGroup) {
        this.e = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.e.getChildCount();
    }

    @Override // java.util.Iterator
    public final View next() {
        int i = this.d;
        this.d = i + 1;
        View childAt = this.e.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.d - 1;
        this.d = i;
        this.e.removeViewAt(i);
    }
}

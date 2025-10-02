package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class AdapterListUpdateCallback implements ListUpdateCallback {
    public final RecyclerView.Adapter d;

    public AdapterListUpdateCallback(RecyclerView.Adapter adapter) {
        this.d = adapter;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void a(int i, int i2, Object obj) {
        this.d.q(i, i2, obj);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void b(int i, int i2) {
        this.d.s(i, i2);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void c(int i, int i2) {
        this.d.p(i, i2);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void d(int i, int i2) {
        this.d.r(i, i2);
    }
}

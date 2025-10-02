package com.airbnb.epoxy;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
class NotifyBlocker extends RecyclerView.AdapterDataObserver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13324a;

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void a() {
        if (!this.f13324a) {
            throw new IllegalStateException("You cannot notify item changes directly. Call `requestModelBuild` instead.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void b(int i, int i2) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void c(int i, int i2, Object obj) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void d(int i, int i2) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void e(int i, int i2) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void f(int i, int i2) {
        a();
    }
}

package com.airbnb.epoxy;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class EpoxyDiffLogger extends RecyclerView.AdapterDataObserver {

    /* renamed from: a, reason: collision with root package name */
    public final String f13314a;

    public EpoxyDiffLogger(String str) {
        this.f13314a = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void b(int i, int i2) {
        Log.d(this.f13314a, "Item range changed. Start: " + i + " Count: " + i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void c(int i, int i2, Object obj) {
        if (obj == null) {
            b(i, i2);
            return;
        }
        Log.d(this.f13314a, "Item range changed with payloads. Start: " + i + " Count: " + i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void d(int i, int i2) {
        Log.d(this.f13314a, "Item range inserted. Start: " + i + " Count: " + i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void e(int i, int i2) {
        Log.d(this.f13314a, "Item moved. From: " + i + " To: " + i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void f(int i, int i2) {
        Log.d(this.f13314a, "Item range removed. Start: " + i + " Count: " + i2);
    }
}

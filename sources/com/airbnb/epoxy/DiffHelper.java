package com.airbnb.epoxy;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
class DiffHelper {

    /* renamed from: com.airbnb.epoxy.DiffHelper$1, reason: invalid class name */
    public class AnonymousClass1 extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void a() {
            throw new UnsupportedOperationException("Diffing is enabled. You should use notifyModelsChanged instead of notifyDataSetChanged");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void b(int i, int i2) {
            if (i < i2 + i) {
                throw null;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void d(int i, int i2) {
            if (i2 == 0) {
                return;
            }
            if (i2 == 1 && i >= i2 + i) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void e(int i, int i2) {
            if (i != i2) {
                throw null;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void f(int i, int i2) {
            if (i2 != 0) {
                throw null;
            }
        }
    }
}

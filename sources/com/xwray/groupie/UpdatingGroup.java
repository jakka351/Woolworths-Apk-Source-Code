package com.xwray.groupie;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;

@Deprecated
/* loaded from: classes7.dex */
public class UpdatingGroup extends NestedGroup {

    /* renamed from: com.xwray.groupie.UpdatingGroup$1, reason: invalid class name */
    public class AnonymousClass1 implements ListUpdateCallback {
        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public final void a(int i, int i2, Object obj) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public final void b(int i, int i2) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public final void c(int i, int i2) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public final void d(int i, int i2) {
            throw null;
        }
    }

    public class UpdatingCallback extends DiffUtil.Callback {
        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final boolean a(int i, int i2) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final boolean b(int i, int i2) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final int d() {
            throw null;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final int e() {
            throw null;
        }
    }

    @Override // com.xwray.groupie.NestedGroup
    public final Group h(int i) {
        throw null;
    }

    @Override // com.xwray.groupie.NestedGroup
    public final int i() {
        throw null;
    }

    @Override // com.xwray.groupie.NestedGroup
    public final int k(Group group) {
        if (group instanceof Item) {
            throw null;
        }
        return -1;
    }
}

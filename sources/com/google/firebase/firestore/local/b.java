package com.google.firebase.firestore.local;

import com.google.common.base.Supplier;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements Supplier {
    public final /* synthetic */ int d;
    public final /* synthetic */ LocalStore e;

    public /* synthetic */ b(LocalStore localStore, int i) {
        this.d = i;
        this.e = localStore;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.d) {
            case 0:
                return this.e.g;
            default:
                return this.e.c;
        }
    }
}

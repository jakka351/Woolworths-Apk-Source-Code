package com.google.firebase.firestore.local;

import android.util.SparseArray;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Assert;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ LocalStore d;
    public final /* synthetic */ int e;

    public /* synthetic */ g(LocalStore localStore, int i) {
        this.d = localStore;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LocalStore localStore = this.d;
        Persistence persistence = localStore.f15487a;
        SparseArray sparseArray = localStore.l;
        int i = this.e;
        TargetData targetData = (TargetData) sparseArray.get(i);
        Assert.b(targetData != null, "Tried to release nonexistent target: %s", Integer.valueOf(i));
        Iterator it = localStore.i.e(i).iterator();
        while (it.hasNext()) {
            persistence.g().o((DocumentKey) it.next());
        }
        persistence.g().k(targetData);
        sparseArray.remove(i);
        localStore.m.remove(targetData.f15522a);
    }
}

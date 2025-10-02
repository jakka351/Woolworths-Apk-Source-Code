package com.google.firebase.firestore.local;

import android.util.SparseArray;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ LocalStore e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(LocalStore localStore, Object obj, int i) {
        this.d = i;
        this.e = localStore;
        this.f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.e.d.h((ByteString) this.f);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f;
                LocalStore localStore = this.e;
                SparseArray sparseArray = localStore.l;
                ReferenceSet referenceSet = localStore.i;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LocalViewChanges localViewChanges = (LocalViewChanges) it.next();
                    int i = localViewChanges.f15489a;
                    ImmutableSortedSet immutableSortedSet = localViewChanges.c;
                    referenceSet.getClass();
                    Iterator it2 = immutableSortedSet.iterator();
                    while (it2.hasNext()) {
                        referenceSet.a((DocumentKey) it2.next(), i);
                    }
                    ImmutableSortedSet immutableSortedSet2 = localViewChanges.d;
                    Iterator it3 = immutableSortedSet2.iterator();
                    while (it3.hasNext()) {
                        localStore.f15487a.g().o((DocumentKey) it3.next());
                    }
                    Iterator it4 = immutableSortedSet2.iterator();
                    while (it4.hasNext()) {
                        referenceSet.d((DocumentKey) it4.next(), i);
                    }
                    if (!localViewChanges.b) {
                        TargetData targetData = (TargetData) sparseArray.get(i);
                        Assert.b(targetData != null, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(i));
                        SnapshotVersion snapshotVersion = targetData.e;
                        TargetData targetData2 = new TargetData(targetData.f15522a, targetData.b, targetData.c, targetData.d, snapshotVersion, snapshotVersion, targetData.g, targetData.h);
                        sparseArray.put(i, targetData2);
                        if (LocalStore.h(targetData, targetData2, null)) {
                            localStore.j.e(targetData2);
                        }
                    }
                }
                break;
        }
    }
}

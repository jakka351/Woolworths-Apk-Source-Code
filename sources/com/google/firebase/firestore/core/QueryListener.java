package com.google.firebase.firestore.core;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.ListenSource;
import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.core.EventManager;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentSet;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class QueryListener {

    /* renamed from: a, reason: collision with root package name */
    public final Query f15459a;
    public final EventManager.ListenOptions b;
    public final AsyncEventListener c;
    public boolean d = false;
    public OnlineState e = OnlineState.d;
    public ViewSnapshot f;

    public QueryListener(Query query, EventManager.ListenOptions listenOptions, AsyncEventListener asyncEventListener) {
        this.f15459a = query;
        this.c = asyncEventListener;
        this.b = listenOptions;
    }

    public final boolean a() {
        return !ListenSource.d.equals(ListenSource.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(com.google.firebase.firestore.core.ViewSnapshot r15) {
        /*
            r14 = this;
            java.util.ArrayList r0 = r15.d
            boolean r0 = r0.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L11
            boolean r0 = r15.g
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            java.lang.String r3 = "We got a new snapshot with no changes?"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.google.firebase.firestore.util.Assert.b(r0, r3, r4)
            com.google.firebase.firestore.core.EventManager$ListenOptions r0 = r14.b
            boolean r3 = r0.f15449a
            if (r3 != 0) goto L55
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r3 = r15.d
            java.util.Iterator r3 = r3.iterator()
        L2a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L40
            java.lang.Object r4 = r3.next()
            com.google.firebase.firestore.core.DocumentViewChange r4 = (com.google.firebase.firestore.core.DocumentViewChange) r4
            com.google.firebase.firestore.core.DocumentViewChange$Type r5 = r4.f15445a
            com.google.firebase.firestore.core.DocumentViewChange$Type r6 = com.google.firebase.firestore.core.DocumentViewChange.Type.g
            if (r5 == r6) goto L2a
            r8.add(r4)
            goto L2a
        L40:
            com.google.firebase.firestore.core.ViewSnapshot r4 = new com.google.firebase.firestore.core.ViewSnapshot
            com.google.firebase.firestore.core.Query r5 = r15.f15473a
            com.google.firebase.firestore.model.DocumentSet r6 = r15.b
            com.google.firebase.firestore.model.DocumentSet r7 = r15.c
            boolean r9 = r15.e
            com.google.firebase.database.collection.ImmutableSortedSet r10 = r15.f
            boolean r11 = r15.g
            r12 = 1
            boolean r13 = r15.i
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15 = r4
        L55:
            boolean r3 = r14.d
            if (r3 != 0) goto L65
            com.google.firebase.firestore.core.OnlineState r0 = r14.e
            boolean r0 = r14.d(r15, r0)
            if (r0 == 0) goto L9e
            r14.c(r15)
            goto L9f
        L65:
            java.util.ArrayList r3 = r15.d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L6f
            r0 = r1
            goto L95
        L6f:
            com.google.firebase.firestore.core.ViewSnapshot r3 = r14.f
            if (r3 == 0) goto L89
            com.google.firebase.database.collection.ImmutableSortedSet r3 = r3.f
            com.google.firebase.database.collection.ImmutableSortedMap r3 = r3.d
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r1
            com.google.firebase.database.collection.ImmutableSortedSet r4 = r15.f
            com.google.firebase.database.collection.ImmutableSortedMap r4 = r4.d
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r1
            if (r3 == r4) goto L89
            r3 = r1
            goto L8a
        L89:
            r3 = r2
        L8a:
            boolean r4 = r15.g
            if (r4 != 0) goto L93
            if (r3 == 0) goto L91
            goto L93
        L91:
            r0 = r2
            goto L95
        L93:
            boolean r0 = r0.b
        L95:
            if (r0 == 0) goto L9e
            com.google.firebase.firestore.core.AsyncEventListener r0 = r14.c
            r2 = 0
            r0.a(r15, r2)
            goto L9f
        L9e:
            r1 = r2
        L9f:
            r14.f = r15
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.QueryListener.b(com.google.firebase.firestore.core.ViewSnapshot):boolean");
    }

    public final void c(ViewSnapshot viewSnapshot) {
        Assert.b(!this.d, "Trying to raise initial event for second time", new Object[0]);
        Query query = viewSnapshot.f15473a;
        DocumentSet documentSet = viewSnapshot.b;
        ImmutableSortedSet immutableSortedSet = viewSnapshot.f;
        boolean z = viewSnapshot.e;
        boolean z2 = viewSnapshot.h;
        boolean z3 = viewSnapshot.i;
        ArrayList arrayList = new ArrayList();
        Iterator it = documentSet.e.iterator();
        while (it.hasNext()) {
            arrayList.add(new DocumentViewChange(DocumentViewChange.Type.e, (Document) it.next()));
        }
        ViewSnapshot viewSnapshot2 = new ViewSnapshot(query, documentSet, new DocumentSet(DocumentCollections.f15533a, new ImmutableSortedSet(Collections.EMPTY_LIST, new androidx.camera.core.internal.compat.workaround.a(query.a(), 1))), arrayList, z, immutableSortedSet, true, z2, z3);
        this.d = true;
        this.c.a(viewSnapshot2, null);
    }

    public final boolean d(ViewSnapshot viewSnapshot, OnlineState onlineState) {
        Assert.b(!this.d, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (viewSnapshot.e && a()) {
            OnlineState onlineState2 = OnlineState.f;
            onlineState.equals(onlineState2);
            if (viewSnapshot.b.d.isEmpty() && !viewSnapshot.i && !onlineState.equals(onlineState2)) {
                return false;
            }
        }
        return true;
    }
}

package com.scandit.datacapture.core;

import java.util.AbstractSet;
import java.util.ArrayList;

/* renamed from: com.scandit.datacapture.core.a4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC0958a4 extends AbstractSet {
    private AbstractC0958a4() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Q3 q3 = ConcurrentMapC1165x4.j;
        ArrayList arrayList = new ArrayList(size());
        AbstractC1173y3.a(arrayList, iterator());
        return arrayList.toArray();
    }

    public /* synthetic */ AbstractC0958a4(int i) {
        this();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Q3 q3 = ConcurrentMapC1165x4.j;
        ArrayList arrayList = new ArrayList(size());
        AbstractC1173y3.a(arrayList, iterator());
        return arrayList.toArray(objArr);
    }
}

package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;

/* loaded from: classes5.dex */
abstract class zzglx extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return zzglz.zzf(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}

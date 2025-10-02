package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
    public static final RegularImmutableBiMap l = new RegularImmutableBiMap();
    public final transient Object g;
    public final transient Object[] h;
    public final transient int i;
    public final transient int j;
    public final transient RegularImmutableBiMap k;

    public RegularImmutableBiMap() {
        this.g = null;
        this.h = new Object[0];
        this.i = 0;
        this.j = 0;
        this.k = this;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.BiMap
    public final BiMap T0() {
        return this.k;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet d() {
        return new RegularImmutableMap.EntrySet(this, this.h, this.i, this.j);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet e() {
        return new RegularImmutableMap.KeySet(this, new RegularImmutableMap.KeysOrValuesAsList(this.h, this.i, this.j));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Object get(Object obj) {
        Object objS = RegularImmutableMap.s(this.g, this.h, this.j, this.i, obj);
        if (objS == null) {
            return null;
        }
        return objS;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean i() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableBiMap
    /* renamed from: q */
    public final ImmutableBiMap T0() {
        return this.k;
    }

    @Override // java.util.Map
    public final int size() {
        return this.j;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.ImmutableMap
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }

    public RegularImmutableBiMap(Object obj, Object[] objArr, int i, RegularImmutableBiMap regularImmutableBiMap) {
        this.g = obj;
        this.h = objArr;
        this.i = 1;
        this.j = i;
        this.k = regularImmutableBiMap;
    }

    public RegularImmutableBiMap(Object[] objArr, int i) {
        this.h = objArr;
        this.j = i;
        this.i = 0;
        int iN = i >= 2 ? ImmutableSet.n(i) : 0;
        Object objR = RegularImmutableMap.r(objArr, i, iN, 0);
        if (!(objR instanceof Object[])) {
            this.g = objR;
            Object objR2 = RegularImmutableMap.r(objArr, i, iN, 1);
            if (!(objR2 instanceof Object[])) {
                this.k = new RegularImmutableBiMap(objR2, objArr, i, this);
                return;
            }
            throw ((ImmutableMap.Builder.DuplicateKey) ((Object[]) objR2)[2]).a();
        }
        throw ((ImmutableMap.Builder.DuplicateKey) ((Object[]) objR)[2]).a();
    }
}

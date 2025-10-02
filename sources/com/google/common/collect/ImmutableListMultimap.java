package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Serialization;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements ListMultimap<K, V> {

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
    }

    public static ImmutableListMultimap o() {
        return EmptyImmutableListMultimap.k;
    }

    public static ImmutableListMultimap p(String str) {
        Builder builder = new Builder();
        CollectPreconditions.a("charset", str);
        Map mapE = builder.f14886a;
        if (mapE == null) {
            mapE = CompactHashMap.e();
            builder.f14886a = mapE;
        }
        ImmutableCollection.Builder builderN = (ImmutableCollection.Builder) mapE.get("charset");
        if (builderN == null) {
            builderN = ImmutableList.n(4);
            Map mapE2 = builder.f14886a;
            if (mapE2 == null) {
                mapE2 = CompactHashMap.e();
                builder.f14886a = mapE2;
            }
            mapE2.put("charset", builderN);
        }
        builderN.a(str);
        Map map = builder.f14886a;
        if (map == null) {
            return EmptyImmutableListMultimap.k;
        }
        Collection collectionEntrySet = ((CompactHashMap) map).entrySet();
        if (((AbstractCollection) collectionEntrySet).isEmpty()) {
            return EmptyImmutableListMultimap.k;
        }
        CompactHashMap.EntrySetView entrySetView = (CompactHashMap.EntrySetView) collectionEntrySet;
        ImmutableMap.Builder builder2 = new ImmutableMap.Builder(CompactHashMap.this.size());
        Iterator it = entrySetView.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ImmutableList immutableListJ = ((ImmutableList.Builder) entry.getValue()).j();
            builder2.c(key, immutableListJ);
            i += ((RegularImmutableList) immutableListJ).g;
        }
        return new ImmutableListMultimap(builder2.a(true), i);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(YU.a.d(i, "Invalid key count "));
        }
        ImmutableMap.Builder builderA = ImmutableMap.a();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(YU.a.d(i4, "Invalid value count "));
            }
            ImmutableList.Builder builderM = ImmutableList.m();
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                builderM.h(object2);
            }
            builderA.c(object, builderM.j());
            i2 += i4;
        }
        try {
            ImmutableMultimap.FieldSettersHolder.f14887a.a(this, builderA.a(true));
            Serialization.FieldSetter fieldSetter = ImmutableMultimap.FieldSettersHolder.b;
            fieldSetter.getClass();
            try {
                fieldSetter.f14904a.set(this, Integer.valueOf(i2));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        } catch (IllegalArgumentException e2) {
            throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.f(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection get(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.i.get(obj);
        if (immutableList != null) {
            return immutableList;
        }
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.e;
        return RegularImmutableList.h;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* renamed from: k */
    public final ImmutableCollection get(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.i.get(obj);
        if (immutableList != null) {
            return immutableList;
        }
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.e;
        return RegularImmutableList.h;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public final ImmutableCollection n() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final List b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final List get(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.i.get(obj);
        if (immutableList != null) {
            return immutableList;
        }
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.e;
        return RegularImmutableList.h;
    }
}

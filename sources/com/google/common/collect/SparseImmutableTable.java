package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.Immutable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@Immutable
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class SparseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    public static final ImmutableTable j;
    public final ImmutableMap f;
    public final ImmutableMap g;
    public final int[] h;
    public final int[] i;

    static {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.e;
        ImmutableList immutableList = RegularImmutableList.h;
        int i = ImmutableSet.f;
        RegularImmutableSet regularImmutableSet = RegularImmutableSet.m;
        j = new SparseImmutableTable(immutableList, regularImmutableSet, regularImmutableSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SparseImmutableTable(ImmutableList immutableList, ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        ImmutableMap immutableMapF = Maps.f(immutableSet);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UnmodifiableIterator it = immutableSet.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        UnmodifiableIterator it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            linkedHashMap2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        int i = 0;
        while (true) {
            if (i >= immutableList.size()) {
                this.h = iArr;
                this.i = iArr2;
                ImmutableMap.Builder builder = new ImmutableMap.Builder(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    builder.c(entry.getKey(), ImmutableMap.c((Map) entry.getValue()));
                }
                this.f = builder.a(true);
                ImmutableMap.Builder builder2 = new ImmutableMap.Builder(linkedHashMap2.size());
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    builder2.c(entry2.getKey(), ImmutableMap.c((Map) entry2.getValue()));
                }
                this.g = builder2.a(true);
                return;
            }
            Table.Cell cell = (Table.Cell) immutableList.get(i);
            Object objB = cell.b();
            Object objA = cell.a();
            Object value = cell.getValue();
            Integer num = (Integer) ((RegularImmutableMap) immutableMapF).get(objB);
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            Map map = (Map) linkedHashMap.get(objB);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i] = map2.size();
            Object objPut = map2.put(objA, value);
            if (!(objPut == null)) {
                throw new IllegalArgumentException(Strings.b("Duplicate key: (row=%s, column=%s), values: [%s, %s].", objB, objA, value, objPut));
            }
            Map map3 = (Map) linkedHashMap2.get(objA);
            Objects.requireNonNull(map3);
            map3.put(objB, value);
            i++;
        }
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final Map d() {
        return ImmutableMap.c(this.f);
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap k() {
        return ImmutableMap.c(this.g);
    }

    @Override // com.google.common.collect.ImmutableTable
    /* renamed from: o */
    public final ImmutableMap d() {
        return ImmutableMap.c(this.f);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public final Table.Cell q(int i) {
        Map.Entry entry = (Map.Entry) this.f.entrySet().b().get(this.h[i]);
        ImmutableMap immutableMap = (ImmutableMap) entry.getValue();
        Map.Entry entry2 = (Map.Entry) immutableMap.entrySet().b().get(this.i[i]);
        return ImmutableTable.i(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.RegularImmutableTable
    public final Object r(int i) {
        ImmutableMap immutableMap = (ImmutableMap) this.f.values().b().get(this.h[i]);
        return immutableMap.values().b().get(this.i[i]);
    }

    @Override // com.google.common.collect.Table
    public final int size() {
        return this.h.length;
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        ImmutableMap immutableMapF = Maps.f(k().keySet());
        int[] iArr = new int[j().size()];
        UnmodifiableIterator it = j().iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer num = (Integer) ((RegularImmutableMap) immutableMapF).get(((Table.Cell) it.next()).a());
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            i++;
        }
        return ImmutableTable.SerializedForm.a(this, this.h, iArr);
    }
}

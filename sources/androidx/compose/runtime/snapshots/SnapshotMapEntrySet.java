package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapEntrySet;", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SnapshotMapEntrySet<K, V> extends SnapshotMapSet<K, V, Map.Entry<K, V>> {
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!TypeIntrinsics.f(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Intrinsics.c(this.d.get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        SnapshotStateMap snapshotStateMap = this.d;
        return new StateMapMutableEntriesIterator(snapshotStateMap, ((ImmutableSet) snapshotStateMap.c().c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return TypeIntrinsics.f(obj) && this.d.remove(((Map.Entry) obj).getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (this.d.remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        PersistentMap persistentMap;
        int i;
        Snapshot snapshotK;
        boolean zA;
        Collection<Map.Entry> collection2 = collection;
        int iH = MapsKt.h(CollectionsKt.s(collection2, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (Map.Entry entry : collection2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        SnapshotStateMap snapshotStateMap = this.d;
        boolean z = false;
        do {
            synchronized (SnapshotStateMapKt.f1709a) {
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord = snapshotStateMap.d;
                Intrinsics.f(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.i(stateMapStateRecord);
                persistentMap = stateMapStateRecord2.c;
                i = stateMapStateRecord2.d;
            }
            Intrinsics.e(persistentMap);
            PersistentMap.Builder builder = persistentMap.builder();
            Object it = ((SnapshotMapEntrySet) snapshotStateMap.e).iterator();
            while (((StateMapMutableIterator) it).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((StateMapMutableEntriesIterator) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !Intrinsics.c(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    builder.remove(entry2.getKey());
                    z = true;
                }
            }
            PersistentMap persistentMapE = builder.e();
            if (Intrinsics.c(persistentMapE, persistentMap)) {
                break;
            }
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = snapshotStateMap.d;
            Intrinsics.f(stateMapStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zA = SnapshotStateMap.a(snapshotStateMap, (SnapshotStateMap.StateMapStateRecord) SnapshotKt.w(stateMapStateRecord3, snapshotStateMap, snapshotK), i, persistentMapE);
            }
            SnapshotKt.n(snapshotK, snapshotStateMap);
        } while (!zA);
        return z;
    }
}

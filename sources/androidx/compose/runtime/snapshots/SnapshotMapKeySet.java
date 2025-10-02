package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapKeySet;", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SnapshotMapKeySet<K, V> extends SnapshotMapSet<K, V, K> {
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
        return this.d.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.d.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        SnapshotStateMap snapshotStateMap = this.d;
        return new StateMapMutableKeysIterator(snapshotStateMap, ((ImmutableSet) snapshotStateMap.c().c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.d.remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (this.d.remove(it.next()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        PersistentMap persistentMap;
        int i;
        Snapshot snapshotK;
        boolean zA;
        Set setL0 = CollectionsKt.L0(collection);
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
                Map.Entry entry = (Map.Entry) ((StateMapMutableEntriesIterator) it).next();
                if (!setL0.contains(entry.getKey())) {
                    builder.remove(entry.getKey());
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

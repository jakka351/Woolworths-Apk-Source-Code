package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "K", "V", "Landroidx/compose/runtime/snapshots/StateObject;", "", "StateMapStateRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SnapshotStateMap<K, V> implements StateObject, Map<K, V>, KMutableMap {
    public StateMapStateRecord d;
    public final Set e;
    public final Set f;
    public final Collection g;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "K", "V", "Landroidx/compose/runtime/snapshots/StateRecord;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class StateMapStateRecord<K, V> extends StateRecord {
        public PersistentMap c;
        public int d;

        public StateMapStateRecord(long j, PersistentMap persistentMap) {
            super(j);
            this.c = persistentMap;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            Intrinsics.f(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) stateRecord;
            synchronized (SnapshotStateMapKt.f1709a) {
                this.c = stateMapStateRecord.c;
                this.d = stateMapStateRecord.d;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return new StateMapStateRecord(SnapshotKt.k().getB(), this.c);
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord c(long j) {
            return new StateMapStateRecord(j, this.c);
        }
    }

    public SnapshotStateMap() {
        PersistentHashMap persistentHashMap = PersistentHashMap.h;
        Snapshot snapshotK = SnapshotKt.k();
        StateMapStateRecord stateMapStateRecord = new StateMapStateRecord(snapshotK.getB(), persistentHashMap);
        if (!(snapshotK instanceof GlobalSnapshot)) {
            stateMapStateRecord.b = new StateMapStateRecord(1, persistentHashMap);
        }
        this.d = stateMapStateRecord;
        this.e = new SnapshotMapEntrySet(this);
        this.f = new SnapshotMapKeySet(this);
        this.g = new SnapshotMapValueSet(this);
    }

    public static final boolean a(SnapshotStateMap snapshotStateMap, StateMapStateRecord stateMapStateRecord, int i, PersistentMap persistentMap) {
        boolean z;
        synchronized (SnapshotStateMapKt.f1709a) {
            int i2 = stateMapStateRecord.d;
            if (i2 == i) {
                stateMapStateRecord.c = persistentMap;
                z = true;
                stateMapStateRecord.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void b(StateRecord stateRecord) {
        Intrinsics.f(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.d = (StateMapStateRecord) stateRecord;
    }

    public final StateMapStateRecord c() {
        StateMapStateRecord stateMapStateRecord = this.d;
        Intrinsics.f(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (StateMapStateRecord) SnapshotKt.t(stateMapStateRecord, this);
    }

    @Override // java.util.Map
    public final void clear() {
        Snapshot snapshotK;
        StateMapStateRecord stateMapStateRecord = this.d;
        Intrinsics.f(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.i(stateMapStateRecord);
        PersistentHashMap persistentHashMap = PersistentHashMap.h;
        if (persistentHashMap != stateMapStateRecord2.c) {
            StateMapStateRecord stateMapStateRecord3 = this.d;
            Intrinsics.f(stateMapStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.w(stateMapStateRecord3, this, snapshotK);
                synchronized (SnapshotStateMapKt.f1709a) {
                    stateMapStateRecord4.c = persistentHashMap;
                    stateMapStateRecord4.d++;
                }
            }
            SnapshotKt.n(snapshotK, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return c().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c().c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.e;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return c().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return c().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        PersistentMap persistentMap;
        int i;
        V vPut;
        Snapshot snapshotK;
        boolean zA;
        do {
            synchronized (SnapshotStateMapKt.f1709a) {
                StateMapStateRecord stateMapStateRecord = this.d;
                Intrinsics.f(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.i(stateMapStateRecord);
                persistentMap = stateMapStateRecord2.c;
                i = stateMapStateRecord2.d;
            }
            Intrinsics.e(persistentMap);
            PersistentMap.Builder builder = persistentMap.builder();
            vPut = builder.put(obj, obj2);
            PersistentMap persistentMapBuild = builder.e();
            if (Intrinsics.c(persistentMapBuild, persistentMap)) {
                break;
            }
            StateMapStateRecord stateMapStateRecord3 = this.d;
            Intrinsics.f(stateMapStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zA = a(this, (StateMapStateRecord) SnapshotKt.w(stateMapStateRecord3, this, snapshotK), i, persistentMapBuild);
            }
            SnapshotKt.n(snapshotK, this);
        } while (!zA);
        return vPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        PersistentMap persistentMap;
        int i;
        Snapshot snapshotK;
        boolean zA;
        do {
            synchronized (SnapshotStateMapKt.f1709a) {
                StateMapStateRecord stateMapStateRecord = this.d;
                Intrinsics.f(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.i(stateMapStateRecord);
                persistentMap = stateMapStateRecord2.c;
                i = stateMapStateRecord2.d;
            }
            Intrinsics.e(persistentMap);
            PersistentMap.Builder builder = persistentMap.builder();
            builder.putAll(map);
            PersistentMap persistentMapBuild = builder.e();
            if (Intrinsics.c(persistentMapBuild, persistentMap)) {
                return;
            }
            StateMapStateRecord stateMapStateRecord3 = this.d;
            Intrinsics.f(stateMapStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zA = a(this, (StateMapStateRecord) SnapshotKt.w(stateMapStateRecord3, this, snapshotK), i, persistentMapBuild);
            }
            SnapshotKt.n(snapshotK, this);
        } while (!zA);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        PersistentMap persistentMap;
        int i;
        V vRemove;
        Snapshot snapshotK;
        boolean zA;
        do {
            synchronized (SnapshotStateMapKt.f1709a) {
                StateMapStateRecord stateMapStateRecord = this.d;
                Intrinsics.f(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.i(stateMapStateRecord);
                persistentMap = stateMapStateRecord2.c;
                i = stateMapStateRecord2.d;
            }
            Intrinsics.e(persistentMap);
            PersistentMap.Builder builder = persistentMap.builder();
            vRemove = builder.remove(obj);
            PersistentMap persistentMapBuild = builder.e();
            if (Intrinsics.c(persistentMapBuild, persistentMap)) {
                break;
            }
            StateMapStateRecord stateMapStateRecord3 = this.d;
            Intrinsics.f(stateMapStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zA = a(this, (StateMapStateRecord) SnapshotKt.w(stateMapStateRecord3, this, snapshotK), i, persistentMapBuild);
            }
            SnapshotKt.n(snapshotK, this);
        } while (!zA);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return c().c.size();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord t() {
        return this.d;
    }

    public final String toString() {
        StateMapStateRecord stateMapStateRecord = this.d;
        Intrinsics.f(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((StateMapStateRecord) SnapshotKt.i(stateMapStateRecord)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.g;
    }
}

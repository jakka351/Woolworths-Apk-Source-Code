package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator;", "K", "V", "Landroidx/compose/runtime/snapshots/StateMapMutableIterator;", "", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class StateMapMutableEntriesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010'\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.runtime.snapshots.StateMapMutableEntriesIterator$next$1, reason: invalid class name */
    public final class AnonymousClass1 implements Map.Entry<Object, Object>, KMutableMap.Entry {
        public final Object d;
        public Object e;

        public AnonymousClass1() {
            Map.Entry entry = StateMapMutableEntriesIterator.this.g;
            Intrinsics.e(entry);
            this.d = entry.getKey();
            Map.Entry entry2 = StateMapMutableEntriesIterator.this.g;
            Intrinsics.e(entry2);
            this.e = entry2.getValue();
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.d;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            StateMapMutableEntriesIterator stateMapMutableEntriesIterator = StateMapMutableEntriesIterator.this;
            if (stateMapMutableEntriesIterator.d.c().d != stateMapMutableEntriesIterator.f) {
                throw new ConcurrentModificationException();
            }
            Object obj2 = this.e;
            stateMapMutableEntriesIterator.d.put(this.d, obj);
            this.e = obj;
            return obj2;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        if (this.g != null) {
            return new AnonymousClass1();
        }
        throw new IllegalStateException();
    }
}

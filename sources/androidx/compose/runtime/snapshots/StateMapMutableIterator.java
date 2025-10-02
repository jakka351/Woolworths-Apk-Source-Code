package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableIterator;", "K", "V", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
abstract class StateMapMutableIterator<K, V> {
    public final SnapshotStateMap d;
    public final Iterator e;
    public int f;
    public Map.Entry g;
    public Map.Entry h;

    public StateMapMutableIterator(SnapshotStateMap snapshotStateMap, Iterator it) {
        this.d = snapshotStateMap;
        this.e = it;
        this.f = snapshotStateMap.c().d;
        a();
    }

    public final void a() {
        this.g = this.h;
        Iterator it = this.e;
        this.h = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    public final boolean hasNext() {
        return this.h != null;
    }

    public final void remove() {
        SnapshotStateMap snapshotStateMap = this.d;
        if (snapshotStateMap.c().d != this.f) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.g;
        if (entry == null) {
            throw new IllegalStateException();
        }
        snapshotStateMap.remove(entry.getKey());
        this.g = null;
        this.f = snapshotStateMap.c().d;
    }
}

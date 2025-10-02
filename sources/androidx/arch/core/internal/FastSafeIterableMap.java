package androidx.arch.core.internal;

import androidx.annotation.RestrictTo;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LifecycleObserver;
import java.util.HashMap;
import java.util.Map;

@RestrictTo
/* loaded from: classes.dex */
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {
    public final HashMap h = new HashMap();

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final SafeIterableMap.Entry b(Object obj) {
        return (SafeIterableMap.Entry) this.h.get(obj);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final Object d(Object obj, Object obj2) {
        SafeIterableMap.Entry entryB = b(obj);
        if (entryB != null) {
            return entryB.e;
        }
        SafeIterableMap.Entry entry = new SafeIterableMap.Entry(obj, obj2);
        this.g++;
        SafeIterableMap.Entry entry2 = this.e;
        if (entry2 == null) {
            this.d = entry;
            this.e = entry;
        } else {
            entry2.f = entry;
            entry.g = entry2;
            this.e = entry;
        }
        this.h.put(obj, entry);
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final Object g(Object obj) {
        Object objG = super.g(obj);
        this.h.remove(obj);
        return objG;
    }

    public final Map.Entry h(LifecycleObserver lifecycleObserver) {
        HashMap map = this.h;
        if (map.containsKey(lifecycleObserver)) {
            return ((SafeIterableMap.Entry) map.get(lifecycleObserver)).g;
        }
        return null;
    }
}

package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, d2 = {"androidx/collection/LruCacheKt$lruCache$4", "Landroidx/collection/LruCache;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes2.dex */
public final class LruCacheKt$lruCache$4 extends LruCache<Object, Object> {
    @Override // androidx.collection.LruCache
    public final Object create(Object key) {
        Intrinsics.h(key, "key");
        throw null;
    }

    @Override // androidx.collection.LruCache
    public final void entryRemoved(boolean z, Object key, Object oldValue, Object obj) {
        Intrinsics.h(key, "key");
        Intrinsics.h(oldValue, "oldValue");
        throw null;
    }

    @Override // androidx.collection.LruCache
    public final int sizeOf(Object key, Object value) {
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        throw null;
    }
}

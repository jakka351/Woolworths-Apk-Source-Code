package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ1\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00012\b\u0010\u0014\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\u000bJ\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001dJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001dJ\r\u0010!\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u001dJ\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001dJ\u0019\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010)R \u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010)R\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010)R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010)R\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010)R\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010)¨\u00060"}, d2 = {"Landroidx/collection/LruCache;", "", "K", "V", "", "maxSize", "", "resize", "(I)V", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "trimToSize", "remove", "", "evicted", "oldValue", "newValue", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "create", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "evictAll", "()V", "size", "()I", "hitCount", "missCount", "createCount", "putCount", "evictionCount", "", "snapshot", "()Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", "I", "Landroidx/collection/internal/LruHashMap;", "map", "Landroidx/collection/internal/LruHashMap;", "Landroidx/collection/internal/Lock;", "lock", "Landroidx/collection/internal/Lock;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;

    @NotNull
    private final Lock lock;

    @NotNull
    private final LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i) {
        this.maxSize = i;
        if (i <= 0) {
            RuntimeHelpersKt.a("maxSize <= 0");
            throw null;
        }
        this.map = new LruHashMap<>();
        this.lock = new Lock();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        RuntimeHelpersKt.b("Negative size: " + obj + '=' + obj2);
        throw null;
    }

    @Nullable
    public V create(@NotNull K key) {
        Intrinsics.h(key, "key");
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    public void entryRemoved(boolean evicted, @NotNull K key, @NotNull V oldValue, @Nullable V newValue) {
        Intrinsics.h(key, "key");
        Intrinsics.h(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    @Nullable
    public final V get(@NotNull K key) {
        V v;
        Intrinsics.h(key, "key");
        synchronized (this.lock) {
            LruHashMap<K, V> lruHashMap = this.map;
            lruHashMap.getClass();
            V v2 = (V) lruHashMap.f706a.get(key);
            if (v2 != null) {
                this.hitCount++;
                return v2;
            }
            this.missCount++;
            V vCreate = create(key);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v = (V) this.map.f706a.put(key, vCreate);
                    if (v != null) {
                        this.map.f706a.put(key, v);
                    } else {
                        this.size += a(key, vCreate);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v != null) {
                entryRemoved(false, key, vCreate, v);
                return v;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    @Nullable
    public final V put(@NotNull K key, @NotNull V value) {
        V v;
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += a(key, value);
            v = (V) this.map.f706a.put(key, value);
            if (v != null) {
                this.size -= a(key, v);
            }
        }
        if (v != null) {
            entryRemoved(false, key, v, value);
        }
        trimToSize(this.maxSize);
        return v;
    }

    public final int putCount() {
        int i;
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    @Nullable
    public final V remove(@NotNull K key) {
        V v;
        Intrinsics.h(key, "key");
        synchronized (this.lock) {
            LruHashMap<K, V> lruHashMap = this.map;
            lruHashMap.getClass();
            v = (V) lruHashMap.f706a.remove(key);
            if (v != null) {
                this.size -= a(key, v);
            }
        }
        if (v != null) {
            entryRemoved(false, key, v, null);
        }
        return v;
    }

    public void resize(@IntRange int maxSize) {
        if (!(maxSize > 0)) {
            RuntimeHelpersKt.a("maxSize <= 0");
            throw null;
        }
        synchronized (this.lock) {
            this.maxSize = maxSize;
        }
        trimToSize(maxSize);
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    public int sizeOf(@NotNull K key, @NotNull V value) {
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            Set<Map.Entry<K, V>> setEntrySet = this.map.f706a.entrySet();
            Intrinsics.g(setEntrySet, "<get-entries>(...)");
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry<K, V>> setEntrySet2 = this.map.f706a.entrySet();
            Intrinsics.g(setEntrySet2, "<get-entries>(...)");
            Iterator<T> it = setEntrySet2.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i = this.hitCount;
                int i2 = this.missCount + i;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        androidx.collection.internal.RuntimeHelpersKt.b("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L0:
            androidx.collection.internal.Lock r0 = r6.lock
            monitor-enter(r0)
            int r1 = r6.size     // Catch: java.lang.Throwable -> L17
            r2 = 0
            if (r1 < 0) goto L6e
            androidx.collection.internal.LruHashMap<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r1 = r1.f706a     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            int r1 = r6.size     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L6e
            goto L19
        L17:
            r7 = move-exception
            goto L74
        L19:
            int r1 = r6.size     // Catch: java.lang.Throwable -> L17
            if (r1 <= r7) goto L6c
            androidx.collection.internal.LruHashMap<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r1 = r1.f706a     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L28
            goto L6c
        L28:
            androidx.collection.internal.LruHashMap<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r1 = r1.f706a     // Catch: java.lang.Throwable -> L17
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = "<get-entries>(...)"
            kotlin.jvm.internal.Intrinsics.g(r1, r3)     // Catch: java.lang.Throwable -> L17
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = kotlin.collections.CollectionsKt.E(r1)     // Catch: java.lang.Throwable -> L17
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L41
            monitor-exit(r0)
            return
        L41:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L17
            androidx.collection.internal.LruHashMap<K, V> r4 = r6.map     // Catch: java.lang.Throwable -> L17
            r4.getClass()     // Catch: java.lang.Throwable -> L17
            java.lang.String r5 = "key"
            kotlin.jvm.internal.Intrinsics.h(r3, r5)     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r4 = r4.f706a     // Catch: java.lang.Throwable -> L17
            r4.remove(r3)     // Catch: java.lang.Throwable -> L17
            int r4 = r6.size     // Catch: java.lang.Throwable -> L17
            int r5 = r6.a(r3, r1)     // Catch: java.lang.Throwable -> L17
            int r4 = r4 - r5
            r6.size = r4     // Catch: java.lang.Throwable -> L17
            int r4 = r6.evictionCount     // Catch: java.lang.Throwable -> L17
            r5 = 1
            int r4 = r4 + r5
            r6.evictionCount = r4     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            r6.entryRemoved(r5, r3, r1, r2)
            goto L0
        L6c:
            monitor-exit(r0)
            return
        L6e:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            androidx.collection.internal.RuntimeHelpersKt.b(r7)     // Catch: java.lang.Throwable -> L17
            throw r2     // Catch: java.lang.Throwable -> L17
        L74:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.trimToSize(int):void");
    }
}

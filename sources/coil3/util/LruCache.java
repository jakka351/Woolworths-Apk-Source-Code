package coil3.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Lcoil3/util/LruCache;", "", "K", "V", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class LruCache<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final long f13153a;
    public final LinkedHashMap b = new LinkedHashMap(0, 0.75f, true);
    public long c;

    public LruCache(long j) {
        this.f13153a = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    public void a(Object obj, Object obj2, Object obj3) {
    }

    public final long b() {
        if (this.c == -1) {
            Iterator<T> it = this.b.entrySet().iterator();
            long jC = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                jC += c(entry.getKey(), entry.getValue());
            }
            this.c = jC;
        }
        return this.c;
    }

    public final long c(Object obj, Object obj2) throws Exception {
        try {
            long jD = d(obj, obj2);
            if (jD >= 0) {
                return jD;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + jD).toString());
        } catch (Exception e) {
            this.c = -1L;
            throw e;
        }
    }

    public long d(Object obj, Object obj2) {
        return 1L;
    }

    public final void e(long j) {
        while (b() > j) {
            LinkedHashMap linkedHashMap = this.b;
            if (linkedHashMap.isEmpty()) {
                if (b() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) kotlin.collections.CollectionsKt.C(linkedHashMap.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            linkedHashMap.remove(key);
            this.c = b() - c(key, value);
            a(key, value, null);
        }
    }
}

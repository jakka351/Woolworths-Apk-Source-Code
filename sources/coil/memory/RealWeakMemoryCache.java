package coil.memory;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import coil.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcoil/memory/RealWeakMemoryCache;", "Lcoil/memory/WeakMemoryCache;", "Companion", "InternalValue", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RealWeakMemoryCache implements WeakMemoryCache {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f13007a = new LinkedHashMap();
    public int b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/memory/RealWeakMemoryCache$Companion;", "", "", "CLEAN_UP_INTERVAL", "I", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/RealWeakMemoryCache$InternalValue;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @VisibleForTesting
    public static final class InternalValue {

        /* renamed from: a, reason: collision with root package name */
        public final int f13008a;
        public final WeakReference b;
        public final Map c;
        public final int d;

        public InternalValue(int i, WeakReference weakReference, Map map, int i2) {
            this.f13008a = i;
            this.b = weakReference;
            this.c = map;
            this.d = i2;
        }
    }

    @Override // coil.memory.WeakMemoryCache
    public final synchronized void a(int i) {
        if (i >= 10 && i != 20) {
            d();
        }
    }

    @Override // coil.memory.WeakMemoryCache
    public final synchronized MemoryCache.Value b(MemoryCache.Key key) {
        try {
            ArrayList arrayList = (ArrayList) this.f13007a.get(key);
            MemoryCache.Value value = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                InternalValue internalValue = (InternalValue) arrayList.get(i);
                Bitmap bitmap = (Bitmap) internalValue.b.get();
                MemoryCache.Value value2 = bitmap != null ? new MemoryCache.Value(bitmap, internalValue.c) : null;
                if (value2 != null) {
                    value = value2;
                    break;
                }
                i++;
            }
            int i2 = this.b;
            this.b = i2 + 1;
            if (i2 >= 10) {
                d();
            }
            return value;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // coil.memory.WeakMemoryCache
    public final synchronized void c(MemoryCache.Key key, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = this.f13007a;
            Object arrayList = linkedHashMap.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(key, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            InternalValue internalValue = new InternalValue(iIdentityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    arrayList2.add(internalValue);
                    break;
                }
                InternalValue internalValue2 = (InternalValue) arrayList2.get(i2);
                if (i < internalValue2.d) {
                    i2++;
                } else if (internalValue2.f13008a == iIdentityHashCode && internalValue2.b.get() == bitmap) {
                    arrayList2.set(i2, internalValue);
                } else {
                    arrayList2.add(i2, internalValue);
                }
            }
            int i3 = this.b;
            this.b = i3 + 1;
            if (i3 >= 10) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        WeakReference weakReference;
        this.b = 0;
        Iterator it = this.f13007a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                InternalValue internalValue = (InternalValue) CollectionsKt.F(arrayList);
                if (((internalValue == null || (weakReference = internalValue.b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((InternalValue) arrayList.get(i3)).b.get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}

package coil3.memory;

import coil3.Image;
import coil3.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/memory/RealWeakMemoryCache;", "Lcoil3/memory/WeakMemoryCache;", "InternalValue", "Companion", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RealWeakMemoryCache implements WeakMemoryCache {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f13119a = new LinkedHashMap();
    public int b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/memory/RealWeakMemoryCache$Companion;", "", "", "CLEAN_UP_INTERVAL", "I", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/memory/RealWeakMemoryCache$InternalValue;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InternalValue {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f13120a;
        public final Map b;
        public final long c;

        public InternalValue(WeakReference weakReference, Map map, long j) {
            this.f13120a = weakReference;
            this.b = map;
            this.c = j;
        }
    }

    public final void a() {
        WeakReference weakReference;
        int i = this.b;
        this.b = i + 1;
        if (i >= 10) {
            this.b = 0;
            Iterator it = this.f13119a.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    InternalValue internalValue = (InternalValue) CollectionsKt.F(arrayList);
                    if (((internalValue == null || (weakReference = internalValue.f13120a) == null) ? null : (Image) weakReference.get()) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((InternalValue) arrayList.get(i4)).f13120a.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void b(MemoryCache.Key key, Image image, Map map, long j) {
        LinkedHashMap linkedHashMap = this.f13119a;
        Object arrayList = linkedHashMap.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(key, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        InternalValue internalValue = new InternalValue(new WeakReference(image), map, j);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                InternalValue internalValue2 = (InternalValue) arrayList2.get(i);
                if (j < internalValue2.c) {
                    i++;
                } else if (internalValue2.f13120a.get() == image) {
                    arrayList2.set(i, internalValue);
                } else {
                    arrayList2.add(i, internalValue);
                }
            }
        } else {
            arrayList2.add(internalValue);
        }
        a();
    }
}

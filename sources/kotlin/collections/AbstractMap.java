package kotlin.collections;

import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/AbstractMap;", "K", "V", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class AbstractMap<K, V> implements Map<K, V>, KMappedMarker {
    public volatile AbstractMap$keys$1 d;
    public volatile AnonymousClass1 e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/collections/AbstractMap$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    public abstract Set b();

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.collections.AbstractMap$keys$1] */
    public Set c() {
        if (this.d == null) {
            this.d = new AbstractSet<Object>() { // from class: kotlin.collections.AbstractMap$keys$1
                @Override // kotlin.collections.AbstractCollection
                /* renamed from: b */
                public final int getF() {
                    return this.d.getG();
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public final boolean contains(Object obj) {
                    return this.d.containsKey(obj);
                }

                @Override // kotlin.collections.AbstractSet, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    return new AbstractMap$keys$1$iterator$1(this.d.b().iterator());
                }
            };
        }
        AbstractMap$keys$1 abstractMap$keys$1 = this.d;
        Intrinsics.e(abstractMap$keys$1);
        return abstractMap$keys$1;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return f(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setB = b();
        if (setB.isEmpty()) {
            return false;
        }
        Iterator it = setB.iterator();
        while (it.hasNext()) {
            if (Intrinsics.c(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public int getG() {
        return b().size();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.collections.AbstractMap$values$1] */
    public Collection e() {
        if (this.e == null) {
            this.e = new AbstractCollection<Object>() { // from class: kotlin.collections.AbstractMap.values.1
                @Override // kotlin.collections.AbstractCollection
                /* renamed from: b */
                public final int getF() {
                    return AbstractMap.this.getG();
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public final boolean contains(Object obj) {
                    return AbstractMap.this.containsValue(obj);
                }

                @Override // java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
                    return new AbstractMap$values$1$iterator$1(AbstractMap.this.b().iterator());
                }
            };
        }
        AnonymousClass1 anonymousClass1 = this.e;
        Intrinsics.e(anonymousClass1);
        return anonymousClass1;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return b();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (getG() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                V v = get(key);
                if (Intrinsics.c(value, v) && (v != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    public final Map.Entry f(Object obj) {
        Object next;
        Iterator it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((Map.Entry) next).getKey(), obj)) {
                break;
            }
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Map.Entry entryF = f(obj);
        if (entryF != null) {
            return entryF.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return b().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return getG() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return c();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getG();
    }

    public final String toString() {
        return CollectionsKt.M(b(), ", ", "{", "}", new i(this, 25), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return e();
    }
}

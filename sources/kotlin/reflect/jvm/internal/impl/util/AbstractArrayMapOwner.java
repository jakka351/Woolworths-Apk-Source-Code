package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;

/* loaded from: classes.dex */
public abstract class AbstractArrayMapOwner<K, V> implements Iterable<V>, KMappedMarker {

    /* loaded from: classes7.dex */
    public static abstract class AbstractArrayMapAccessor<K, V, T extends V> {

        /* renamed from: a, reason: collision with root package name */
        public final int f24638a;

        public AbstractArrayMapAccessor(int i) {
            this.f24638a = i;
        }
    }

    public abstract ArrayMap b();

    public abstract TypeAttributes.Companion d();

    public final boolean isEmpty() {
        return ((AttributeArrayOwner) this).d.b() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return b().iterator();
    }
}

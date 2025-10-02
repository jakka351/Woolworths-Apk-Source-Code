package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public abstract class ArrayMap<T> implements Iterable<T>, KMappedMarker {
    public abstract int b();

    public abstract void d(int i, Object obj);

    public abstract Object get(int i);

    @Override // java.lang.Iterable
    public Iterator iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

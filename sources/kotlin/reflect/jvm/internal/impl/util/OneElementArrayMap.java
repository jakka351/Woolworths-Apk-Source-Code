package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.types.TypeAttribute;

/* loaded from: classes7.dex */
public final class OneElementArrayMap<T> extends ArrayMap<T> {
    public final TypeAttribute d;
    public final int e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        public boolean d = true;

        public AnonymousClass1() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.d) {
                throw new NoSuchElementException();
            }
            this.d = false;
            return OneElementArrayMap.this.d;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public OneElementArrayMap(TypeAttribute typeAttribute, int i) {
        this.d = typeAttribute;
        this.e = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final int b() {
        return 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final void d(int i, Object obj) {
        throw new IllegalStateException();
    }

    public final int g() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final Object get(int i) {
        if (i == this.e) {
            return this.d;
        }
        return null;
    }

    public final Object h() {
        return this.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public final Iterator iterator() {
        return new AnonymousClass1();
    }
}

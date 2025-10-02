package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class LazyField extends LazyFieldLite {

    /* loaded from: classes7.dex */
    public static class LazyEntry<K> implements Map.Entry<K, Object> {
        public Map.Entry d;

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.d.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            LazyField lazyField = (LazyField) this.d.getValue();
            if (lazyField == null) {
                return null;
            }
            return lazyField.a();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof MessageLite)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            LazyField lazyField = (LazyField) this.d.getValue();
            MessageLite messageLite = lazyField.f24515a;
            lazyField.f24515a = (MessageLite) obj;
            return messageLite;
        }
    }

    /* loaded from: classes7.dex */
    public static class LazyIterator<K> implements Iterator<Map.Entry<K, Object>> {
        public Iterator d;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry entry = (Map.Entry) this.d.next();
            if (!(entry.getValue() instanceof LazyField)) {
                return entry;
            }
            LazyEntry lazyEntry = new LazyEntry();
            lazyEntry.d = entry;
            return lazyEntry;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.d.remove();
        }
    }

    public final MessageLite a() {
        if (this.f24515a == null) {
            synchronized (this) {
                if (this.f24515a == null) {
                    try {
                        this.f24515a = null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return this.f24515a;
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}

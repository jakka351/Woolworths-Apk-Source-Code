package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public class LazyField extends LazyFieldLite {

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
            return lazyField.b(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof MessageLite)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            LazyField lazyField = (LazyField) this.d.getValue();
            MessageLite messageLite = lazyField.f15104a;
            lazyField.b = null;
            lazyField.f15104a = (MessageLite) obj;
            return messageLite;
        }
    }

    public static class LazyIterator<K> implements Iterator<Map.Entry<K, Object>> {
        public final Iterator d;

        public LazyIterator(Iterator it) {
            this.d = it;
        }

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

    @Override // com.google.crypto.tink.shaded.protobuf.LazyFieldLite
    public final boolean equals(Object obj) {
        return b(null).equals(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyFieldLite
    public final int hashCode() {
        return b(null).hashCode();
    }

    public final String toString() {
        return b(null).toString();
    }
}

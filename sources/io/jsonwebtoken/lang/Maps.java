package io.jsonwebtoken.lang;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class Maps {

    public static class HashMapBuilder<K, V> implements MapBuilder<K, V> {
        private final Map<K, V> data;

        private HashMapBuilder() {
            this.data = new HashMap();
        }

        @Override // io.jsonwebtoken.lang.Maps.MapBuilder
        public MapBuilder<K, V> and(K k, V v) {
            this.data.put(k, v);
            return this;
        }

        @Override // io.jsonwebtoken.lang.Maps.MapBuilder
        public Map<K, V> build() {
            return java.util.Collections.unmodifiableMap(this.data);
        }
    }

    public interface MapBuilder<K, V> {
        MapBuilder<K, V> and(K k, V v);

        Map<K, V> build();
    }

    private Maps() {
    }

    public static <K, V> MapBuilder<K, V> of(K k, V v) {
        return new HashMapBuilder().and(k, v);
    }
}

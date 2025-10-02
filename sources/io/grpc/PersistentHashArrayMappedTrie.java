package io.grpc;

/* loaded from: classes7.dex */
final class PersistentHashArrayMappedTrie {

    public static final class CollisionLeaf<K, V> implements Node<K, V> {
        public final String toString() {
            throw null;
        }
    }

    public static final class CompressedIndex<K, V> implements Node<K, V> {
        public final String toString() {
            new StringBuilder("CompressedIndex(").append("bitmap=" + Integer.toBinaryString(0) + " ");
            throw null;
        }
    }

    public static final class Leaf<K, V> implements Node<K, V> {
        public final String toString() {
            throw null;
        }
    }

    public interface Node<K, V> {
    }
}

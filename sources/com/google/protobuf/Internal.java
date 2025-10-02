package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import org.bouncycastle.i18n.LocalizedMessage;

/* loaded from: classes.dex */
public final class Internal {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f16059a;
    public static final byte[] b;
    public static final ByteBuffer c;

    /* loaded from: classes6.dex */
    public interface BooleanList extends ProtobufList<Boolean> {
        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        BooleanList a(int i);
    }

    /* loaded from: classes6.dex */
    public interface DoubleList extends ProtobufList<Double> {
        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        DoubleList a(int i);
    }

    public interface EnumLite {
        int g();
    }

    public interface EnumLiteMap<T extends EnumLite> {
        EnumLite a(int i);
    }

    public interface EnumVerifier {
        boolean a(int i);
    }

    /* loaded from: classes6.dex */
    public interface FloatList extends ProtobufList<Float> {
        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        FloatList a(int i);
    }

    public interface IntList extends ProtobufList<Integer> {
        void W1(int i);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        IntList a(int i);

        int getInt(int i);
    }

    /* loaded from: classes6.dex */
    public static class ListAdapter<F, T> extends AbstractList<T> {

        /* loaded from: classes.dex */
        public interface Converter<F, T> {
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* loaded from: classes6.dex */
    public interface LongList extends ProtobufList<Long> {
        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        LongList a(int i);
    }

    /* loaded from: classes6.dex */
    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {

        /* renamed from: com.google.protobuf.Internal$MapAdapter$1, reason: invalid class name */
        class AnonymousClass1 implements Converter<Integer, EnumLite> {
        }

        public interface Converter<A, B> {
        }

        public class EntryAdapter implements Map.Entry<K, V> {
            @Override // java.util.Map.Entry
            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Map.Entry) {
                    throw null;
                }
                return false;
            }

            @Override // java.util.Map.Entry
            public final Object getKey() {
                throw null;
            }

            @Override // java.util.Map.Entry
            public final Object getValue() {
                throw null;
            }

            @Override // java.util.Map.Entry
            public final int hashCode() {
                throw null;
            }

            @Override // java.util.Map.Entry
            public final Object setValue(Object obj) {
                throw null;
            }
        }

        public class IteratorAdapter implements Iterator<Map.Entry<K, V>> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                throw null;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw null;
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw null;
            }
        }

        public class SetAdapter extends AbstractSet<Map.Entry<K, V>> {
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                throw null;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set entrySet() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            throw null;
        }
    }

    public interface ProtobufList<E> extends List<E>, RandomAccess {
        ProtobufList a(int i);

        void p();

        boolean r();
    }

    static {
        Charset.forName("US-ASCII");
        f16059a = Charset.forName("UTF-8");
        Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        byte[] bArr = new byte[0];
        b = bArr;
        c = ByteBuffer.wrap(bArr);
        CodedInputStream.g(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}

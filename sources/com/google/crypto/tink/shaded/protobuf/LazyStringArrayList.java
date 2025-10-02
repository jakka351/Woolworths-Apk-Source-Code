package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Internal;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {
    public static final /* synthetic */ int f = 0;
    public final ArrayList e;

    public static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, Object obj) {
            int i2 = LazyStringArrayList.f;
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            int i2 = LazyStringArrayList.f;
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    public static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, Object obj) {
            int i2 = LazyStringArrayList.f;
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            int i2 = LazyStringArrayList.f;
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    static {
        new LazyStringArrayList(10).d = false;
    }

    public LazyStringArrayList(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public final void P0(ByteString byteString) {
        b();
        this.e.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public final Internal.ProtobufList a(int i) {
        ArrayList arrayList = this.e;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new LazyStringArrayList(arrayList2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        b();
        this.e.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.e.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.e.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public final List e() {
        return Collections.unmodifiableList(this.e);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public final LazyStringList f() {
        return this.d ? new UnmodifiableLazyStringList(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.e;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String strY = byteString.y();
            if (byteString.n()) {
                arrayList.set(i, strY);
            }
            return strY;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, Internal.f15103a);
        if (Utf8.f15122a.e(0, bArr.length, bArr)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public final Object getRaw(int i) {
        return this.e.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
    public final boolean r() {
        return this.d;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = this.e.remove(i);
        ((AbstractList) this).modCount++;
        return objRemove instanceof String ? (String) objRemove : objRemove instanceof ByteString ? ((ByteString) objRemove).y() : new String((byte[]) objRemove, Internal.f15103a);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        Object obj2 = this.e.set(i, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof ByteString ? ((ByteString) obj2).y() : new String((byte[]) obj2, Internal.f15103a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e.size();
    }

    public LazyStringArrayList(ArrayList arrayList) {
        this.e = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).e();
        }
        boolean zAddAll = this.e.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}

package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {
    public static final /* synthetic */ int f = 0;
    public final List e;

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
        new LazyStringArrayList();
    }

    public LazyStringArrayList(ArrayList arrayList) {
        super(true);
        this.e = arrayList;
    }

    @Override // com.google.protobuf.LazyStringList
    public final void R(ByteString byteString) {
        b();
        this.e.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public final Internal.ProtobufList a(int i) {
        List list = this.e;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new LazyStringArrayList(arrayList);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        b();
        this.e.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.e.size(), collection);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.e.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.LazyStringList
    public final List e() {
        return Collections.unmodifiableList(this.e);
    }

    @Override // com.google.protobuf.LazyStringList
    public final LazyStringList f() {
        return this.d ? new UnmodifiableLazyStringList(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.e;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String strZ = byteString.size() == 0 ? "" : byteString.z(Internal.f16059a);
            if (byteString.q()) {
                list.set(i, strZ);
            }
            return strZ;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, Internal.f16059a);
        if (Utf8.f16094a.e(0, bArr.length, bArr)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // com.google.protobuf.LazyStringList
    public final Object getRaw(int i) {
        return this.e.get(i);
    }

    @Override // com.google.protobuf.AbstractProtobufList, com.google.protobuf.Internal.ProtobufList
    public final boolean r() {
        return this.d;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = this.e.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof ByteString)) {
            return new String((byte[]) objRemove, Internal.f16059a);
        }
        ByteString byteString = (ByteString) objRemove;
        return byteString.size() == 0 ? "" : byteString.z(Internal.f16059a);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        Object obj2 = this.e.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof ByteString)) {
            return new String((byte[]) obj2, Internal.f16059a);
        }
        ByteString byteString = (ByteString) obj2;
        return byteString.size() == 0 ? "" : byteString.z(Internal.f16059a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e.size();
    }

    public LazyStringArrayList() {
        super(false);
        this.e = Collections.EMPTY_LIST;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).e();
        }
        boolean zAddAll = this.e.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public LazyStringArrayList(int i) {
        this(new ArrayList(i));
    }
}

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes7.dex */
public class LazyStringArrayList extends AbstractList<String> implements RandomAccess, LazyStringList {
    public static final UnmodifiableLazyStringList e = new UnmodifiableLazyStringList(new LazyStringArrayList());
    public final ArrayList d;

    public LazyStringArrayList() {
        this.d = new ArrayList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final ByteString C1(int i) {
        ByteString literalByteString;
        ArrayList arrayList = this.d;
        Object obj = arrayList.get(i);
        if (obj instanceof ByteString) {
            literalByteString = (ByteString) obj;
        } else if (obj instanceof String) {
            literalByteString = ByteString.g((String) obj);
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            literalByteString = new LiteralByteString(bArr2);
        }
        if (literalByteString != obj) {
            arrayList.set(i, literalByteString);
        }
        return literalByteString;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final void J1(ByteString byteString) {
        this.d.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.d.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.d.size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.d.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final List e() {
        return Collections.unmodifiableList(this.d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final UnmodifiableLazyStringList f() {
        return new UnmodifiableLazyStringList(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.d;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String strU = byteString.u();
            if (byteString.l()) {
                arrayList.set(i, strU);
            }
            return strU;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = Internal.f24514a;
        try {
            String str = new String(bArr, "UTF-8");
            if (Utf8.c(0, bArr.length, bArr)) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.d.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof ByteString) {
            return ((ByteString) objRemove).u();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = Internal.f24514a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.d.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof ByteString) {
            return ((ByteString) obj2).u();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = Internal.f24514a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d.size();
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.d = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).e();
        }
        boolean zAddAll = this.d.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}

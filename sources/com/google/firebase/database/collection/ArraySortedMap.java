package com.google.firebase.database.collection;

import androidx.browser.trusted.a;
import com.google.firebase.database.collection.RBTreeSortedMap;
import com.google.firebase.firestore.model.DocumentKey;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public class ArraySortedMap<K, V> extends ImmutableSortedMap<K, V> {
    public final Object[] d;
    public final Object[] e;
    public final Comparator f;

    /* renamed from: com.google.firebase.database.collection.ArraySortedMap$1, reason: invalid class name */
    class AnonymousClass1 implements Iterator<Map.Entry<Object, Object>> {
        public int d;

        public AnonymousClass1(int i) {
            this.d = i;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d < ArraySortedMap.this.d.length;
        }

        @Override // java.util.Iterator
        public final Map.Entry<Object, Object> next() {
            ArraySortedMap arraySortedMap = ArraySortedMap.this;
            Object[] objArr = arraySortedMap.d;
            int i = this.d;
            Object obj = objArr[i];
            Object obj2 = arraySortedMap.e[i];
            this.d = i + 1;
            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }
    }

    public ArraySortedMap() {
        a aVar = DocumentKey.e;
        this.d = new Object[0];
        this.e = new Object[0];
        this.f = aVar;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final boolean b(Object obj) {
        return m(obj) != -1;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Object d(DocumentKey documentKey) {
        int iM = m(documentKey);
        if (iM != -1) {
            return this.e[iM];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Comparator g() {
        return this.f;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Object h() {
        Object[] objArr = this.d;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Object i() {
        Object[] objArr = this.d;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final boolean isEmpty() {
        return this.d.length == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new AnonymousClass1(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final ImmutableSortedMap j(Object obj, Object obj2) {
        int iM = m(obj);
        Comparator comparator = this.f;
        Object[] objArr = this.e;
        Object[] objArr2 = this.d;
        if (iM != -1) {
            if (objArr2[iM] == obj && objArr[iM] == obj2) {
                return this;
            }
            int length = objArr2.length;
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr3[iM] = obj;
            int length2 = objArr.length;
            Object[] objArr4 = new Object[length2];
            System.arraycopy(objArr, 0, objArr4, 0, length2);
            objArr4[iM] = obj2;
            return new ArraySortedMap(comparator, objArr3, objArr4);
        }
        if (objArr2.length > 25) {
            HashMap map = new HashMap(objArr2.length + 1);
            for (int i = 0; i < objArr2.length; i++) {
                map.put(objArr2[i], objArr[i]);
            }
            map.put(obj, obj2);
            return RBTreeSortedMap.Builder.b(new ArrayList(map.keySet()), map, comparator);
        }
        int i2 = 0;
        while (i2 < objArr2.length && comparator.compare(objArr2[i2], obj) < 0) {
            i2++;
        }
        Object[] objArr5 = new Object[objArr2.length + 1];
        System.arraycopy(objArr2, 0, objArr5, 0, i2);
        objArr5[i2] = obj;
        int i3 = i2 + 1;
        System.arraycopy(objArr2, i2, objArr5, i3, (r1 - i2) - 1);
        Object[] objArr6 = new Object[objArr.length + 1];
        System.arraycopy(objArr, 0, objArr6, 0, i2);
        objArr6[i2] = obj2;
        System.arraycopy(objArr, i2, objArr6, i3, (r1 - i2) - 1);
        return new ArraySortedMap(comparator, objArr5, objArr6);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Iterator k(Object obj) {
        int i = 0;
        while (true) {
            Object[] objArr = this.d;
            if (i >= objArr.length || this.f.compare(objArr[i], obj) >= 0) {
                break;
            }
            i++;
        }
        return new AnonymousClass1(i);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final ImmutableSortedMap l(Object obj) {
        int iM = m(obj);
        if (iM == -1) {
            return this;
        }
        Object[] objArr = this.d;
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, iM);
        int i = iM + 1;
        System.arraycopy(objArr, i, objArr2, iM, length - iM);
        Object[] objArr3 = this.e;
        int length2 = objArr3.length - 1;
        Object[] objArr4 = new Object[length2];
        System.arraycopy(objArr3, 0, objArr4, 0, iM);
        System.arraycopy(objArr3, i, objArr4, iM, length2 - iM);
        return new ArraySortedMap(this.f, objArr2, objArr4);
    }

    public final int m(Object obj) {
        int i = 0;
        for (Object obj2 : this.d) {
            if (this.f.compare(obj, obj2) == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final int size() {
        return this.d.length;
    }

    public ArraySortedMap(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = objArr2;
        this.f = comparator;
    }
}

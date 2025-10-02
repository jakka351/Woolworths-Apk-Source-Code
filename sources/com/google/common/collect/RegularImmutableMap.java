package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.crypto.hpke.HPKE;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes.dex */
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    public static final ImmutableMap j = new RegularImmutableMap(null, new Object[0], 0);
    public final transient Object g;
    public final transient Object[] h;
    public final transient int i;

    /* loaded from: classes6.dex */
    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        public final transient ImmutableMap g;
        public final transient Object[] h;
        public final transient int i;
        public final transient int j;

        public EntrySet(ImmutableMap immutableMap, Object[] objArr, int i, int i2) {
            this.g = immutableMap;
            this.h = objArr;
            this.i = i;
            this.j = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.g.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int d(int i, Object[] objArr) {
            return b().d(i, objArr);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* renamed from: k */
        public final UnmodifiableIterator iterator() {
            return b().listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.j;
        }

        @Override // com.google.common.collect.ImmutableSet
        public final ImmutableList t() {
            return new ImmutableList<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // java.util.List
                public final Object get(int i) {
                    EntrySet entrySet = EntrySet.this;
                    Preconditions.i(i, entrySet.j);
                    Object[] objArr = entrySet.h;
                    int i2 = i * 2;
                    int i3 = entrySet.i;
                    Object obj = objArr[i2 + i3];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArr[i2 + (i3 ^ 1)];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // com.google.common.collect.ImmutableCollection
                public final boolean j() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return EntrySet.this.j;
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                @J2ktIncompatible
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class KeySet<K> extends ImmutableSet<K> {
        public final transient ImmutableMap g;
        public final transient ImmutableList h;

        public KeySet(ImmutableMap immutableMap, ImmutableList immutableList) {
            this.g = immutableMap;
            this.h = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public final ImmutableList b() {
            return this.h;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.g.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int d(int i, Object[] objArr) {
            return this.h.d(i, objArr);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* renamed from: k */
        public final UnmodifiableIterator iterator() {
            return this.h.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.g.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class KeysOrValuesAsList extends ImmutableList<Object> {
        public final transient Object[] f;
        public final transient int g;
        public final transient int h;

        public KeysOrValuesAsList(Object[] objArr, int i, int i2) {
            this.f = objArr;
            this.g = i;
            this.h = i2;
        }

        @Override // java.util.List
        public final Object get(int i) {
            Preconditions.i(i, this.h);
            Object obj = this.f[(i * 2) + this.g];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.h;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public RegularImmutableMap(Object obj, Object[] objArr, int i) {
        this.g = obj;
        this.h = objArr;
        this.i = i;
    }

    public static RegularImmutableMap q(int i, Object[] objArr, ImmutableMap.Builder builder) {
        if (i == 0) {
            return (RegularImmutableMap) j;
        }
        if (i == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new RegularImmutableMap(null, objArr, 1);
        }
        Preconditions.l(i, objArr.length >> 1);
        Object objR = r(objArr, i, ImmutableSet.n(i), 0);
        if (objR instanceof Object[]) {
            Object[] objArr2 = (Object[]) objR;
            ImmutableMap.Builder.DuplicateKey duplicateKey = (ImmutableMap.Builder.DuplicateKey) objArr2[2];
            if (builder == null) {
                throw duplicateKey.a();
            }
            builder.c = duplicateKey;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objR = obj;
            i = iIntValue;
        }
        return new RegularImmutableMap(objR, objArr, i);
    }

    public static Object r(Object[] objArr, int i, int i2, int i3) {
        ImmutableMap.Builder.DuplicateKey duplicateKey = null;
        if (i == 1) {
            Objects.requireNonNull(objArr[i3]);
            Objects.requireNonNull(objArr[i3 ^ 1]);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = 0;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            while (i5 < i) {
                int i7 = (i5 * 2) + i3;
                int i8 = (i6 * 2) + i3;
                Object obj = objArr[i7];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i7 ^ 1];
                Objects.requireNonNull(obj2);
                int iB = Hashing.b(obj.hashCode());
                while (true) {
                    int i9 = iB & i4;
                    int i10 = bArr[i9] & 255;
                    if (i10 == 255) {
                        bArr[i9] = (byte) i8;
                        if (i6 < i5) {
                            objArr[i8] = obj;
                            objArr[i8 ^ 1] = obj2;
                        }
                        i6++;
                    } else {
                        if (obj.equals(objArr[i10])) {
                            int i11 = i10 ^ 1;
                            Object obj3 = objArr[i11];
                            Objects.requireNonNull(obj3);
                            duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj, obj2, obj3);
                            objArr[i11] = obj2;
                            break;
                        }
                        iB = i9 + 1;
                    }
                }
                i5++;
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), duplicateKey};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i12 = 0;
            while (i5 < i) {
                int i13 = (i5 * 2) + i3;
                int i14 = (i12 * 2) + i3;
                Object obj4 = objArr[i13];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i13 ^ 1];
                Objects.requireNonNull(obj5);
                int iB2 = Hashing.b(obj4.hashCode());
                while (true) {
                    int i15 = iB2 & i4;
                    int i16 = sArr[i15] & HPKE.aead_EXPORT_ONLY;
                    if (i16 == 65535) {
                        sArr[i15] = (short) i14;
                        if (i12 < i5) {
                            objArr[i14] = obj4;
                            objArr[i14 ^ 1] = obj5;
                        }
                        i12++;
                    } else {
                        if (obj4.equals(objArr[i16])) {
                            int i17 = i16 ^ 1;
                            Object obj6 = objArr[i17];
                            Objects.requireNonNull(obj6);
                            duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj4, obj5, obj6);
                            objArr[i17] = obj5;
                            break;
                        }
                        iB2 = i15 + 1;
                    }
                }
                i5++;
            }
            return i12 == i ? sArr : new Object[]{sArr, Integer.valueOf(i12), duplicateKey};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i18 = 0;
        while (i5 < i) {
            int i19 = (i5 * 2) + i3;
            int i20 = (i18 * 2) + i3;
            Object obj7 = objArr[i19];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i19 ^ 1];
            Objects.requireNonNull(obj8);
            int iB3 = Hashing.b(obj7.hashCode());
            while (true) {
                int i21 = iB3 & i4;
                int i22 = iArr[i21];
                if (i22 == -1) {
                    iArr[i21] = i20;
                    if (i18 < i5) {
                        objArr[i20] = obj7;
                        objArr[i20 ^ 1] = obj8;
                    }
                    i18++;
                } else {
                    if (obj7.equals(objArr[i22])) {
                        int i23 = i22 ^ 1;
                        Object obj9 = objArr[i23];
                        Objects.requireNonNull(obj9);
                        duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj7, obj8, obj9);
                        objArr[i23] = obj8;
                        break;
                    }
                    iB3 = i21 + 1;
                }
            }
            i5++;
        }
        return i18 == i ? iArr : new Object[]{iArr, Integer.valueOf(i18), duplicateKey};
    }

    public static Object s(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = Hashing.b(obj2.hashCode());
            while (true) {
                int i3 = iB & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iB = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = Hashing.b(obj2.hashCode());
            while (true) {
                int i5 = iB2 & length2;
                int i6 = sArr[i5] & HPKE.aead_EXPORT_ONLY;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iB2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = Hashing.b(obj2.hashCode());
            while (true) {
                int i7 = iB3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iB3 = i7 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet d() {
        return new EntrySet(this, this.h, 0, this.i);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet e() {
        return new KeySet(this, new KeysOrValuesAsList(this.h, 0, this.i));
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection f() {
        return new KeysOrValuesAsList(this.h, 1, this.i);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Object get(Object obj) {
        Object objS = s(this.g, this.h, this.i, 0, obj);
        if (objS == null) {
            return null;
        }
        return objS;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean i() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    @Override // com.google.common.collect.ImmutableMap
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }
}

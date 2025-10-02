package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0001H\u0001¢\u0006\u0004\b\u000f\u0010\rJ!\u0010\u0012\u001a\u00028\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u0013J'\u0010\u001f\u001a\u00020\u00042\u0016\u0010\u001e\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b!\u0010\u0013J\u001f\u0010\"\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u0016J!\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010\u0013J'\u0010%\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010&\u001a\u00028\u00012\u0006\u0010'\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0007H\u0016¢\u0006\u0004\b.\u0010*J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010)\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00108¨\u00069"}, d2 = {"Landroidx/collection/SimpleArrayMap;", "K", "V", "", "", "clear", "()V", "", "minimumCapacity", "ensureCapacity", "(I)V", "key", "indexOfKey", "(Ljava/lang/Object;)I", "value", "__restricted$indexOfValue", "indexOfValue", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "index", "keyAt", "(I)Ljava/lang/Object;", "valueAt", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "isEmpty", "()Z", "put", "map", "putAll", "(Landroidx/collection/SimpleArrayMap;)V", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "size", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "", "hashes", "[I", "", "array", "[Ljava/lang/Object;", "I", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class SimpleArrayMap<K, V> {

    @NotNull
    private Object[] array;

    @NotNull
    private int[] hashes;
    private int size;

    public SimpleArrayMap(int i) {
        this.hashes = i == 0 ? ContainerHelpersKt.f705a : new int[i];
        this.array = i == 0 ? ContainerHelpersKt.c : new Object[i << 1];
    }

    @JvmName
    public final int __restricted$indexOfValue(V value) {
        int i = this.size * 2;
        Object[] objArr = this.array;
        if (value == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (value.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int a(int i, Object obj) {
        int i2 = this.size;
        if (i2 == 0) {
            return -1;
        }
        int iA = ContainerHelpersKt.a(i2, i, this.hashes);
        if (iA < 0 || obj.equals(this.array[iA << 1])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.hashes[i3] == i) {
            if (obj.equals(this.array[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.hashes[i4] == i; i4--) {
            if (obj.equals(this.array[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int b() {
        int i = this.size;
        if (i == 0) {
            return -1;
        }
        int iA = ContainerHelpersKt.a(i, 0, this.hashes);
        if (iA < 0 || this.array[iA << 1] == null) {
            return iA;
        }
        int i2 = iA + 1;
        while (i2 < i && this.hashes[i2] == 0) {
            if (this.array[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iA - 1; i3 >= 0 && this.hashes[i3] == 0; i3--) {
            if (this.array[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = ContainerHelpersKt.f705a;
            this.array = ContainerHelpersKt.c;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsKey(Object obj) {
        return indexOfKey(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsValue(Object obj) {
        return __restricted$indexOfValue(obj) >= 0;
    }

    public void ensureCapacity(int minimumCapacity) {
        int i = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < minimumCapacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, minimumCapacity);
            Intrinsics.g(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, minimumCapacity * 2);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
        }
        if (this.size != i) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof SimpleArrayMap) {
                if (getSize() != ((SimpleArrayMap) other).getSize()) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) other;
                int i = this.size;
                for (int i2 = 0; i2 < i; i2++) {
                    K kKeyAt = keyAt(i2);
                    V vValueAt = valueAt(i2);
                    Object obj = simpleArrayMap.get(kKeyAt);
                    if (vValueAt == null) {
                        if (obj != null || !simpleArrayMap.containsKey(kKeyAt)) {
                            return false;
                        }
                    } else if (!vValueAt.equals(obj)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || getSize() != ((Map) other).size()) {
                return false;
            }
            int i3 = this.size;
            for (int i4 = 0; i4 < i3; i4++) {
                K kKeyAt2 = keyAt(i4);
                V vValueAt2 = valueAt(i4);
                Object obj2 = ((Map) other).get(kKeyAt2);
                if (vValueAt2 == null) {
                    if (obj2 != null || !((Map) other).containsKey(kKeyAt2)) {
                        return false;
                    }
                } else if (!vValueAt2.equals(obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object get(Object obj) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey >= 0) {
            return this.array[(iIndexOfKey << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(@Nullable Object key, V defaultValue) {
        int iIndexOfKey = indexOfKey(key);
        return iIndexOfKey >= 0 ? (V) this.array[(iIndexOfKey << 1) + 1] : defaultValue;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i = this.size;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public int indexOfKey(K key) {
        return key == null ? b() : a(key.hashCode(), key);
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public K keyAt(int index) {
        boolean z = false;
        if (index >= 0 && index < this.size) {
            z = true;
        }
        if (z) {
            return (K) this.array[index << 1];
        }
        RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + index);
        throw null;
    }

    @Nullable
    public V put(K key, V value) {
        int i = this.size;
        int iHashCode = key != null ? key.hashCode() : 0;
        int iA = key != null ? a(iHashCode, key) : b();
        if (iA >= 0) {
            int i2 = (iA << 1) + 1;
            Object[] objArr = this.array;
            V v = (V) objArr[i2];
            objArr[i2] = value;
            return v;
        }
        int i3 = ~iA;
        int[] iArr = this.hashes;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            Intrinsics.g(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i4 << 1);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
            if (i != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.hashes;
            int i5 = i3 + 1;
            ArraysKt.q(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.array;
            ArraysKt.t(objArr2, i5 << 1, objArr2, i3 << 1, this.size << 1);
        }
        int i6 = this.size;
        if (i == i6) {
            int[] iArr3 = this.hashes;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.array;
                int i7 = i3 << 1;
                objArr3[i7] = key;
                objArr3[i7 + 1] = value;
                this.size = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(@NotNull SimpleArrayMap<? extends K, ? extends V> map) {
        Intrinsics.h(map, "map");
        int i = map.size;
        ensureCapacity(this.size + i);
        if (this.size != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(map.keyAt(i2), map.valueAt(i2));
            }
        } else if (i > 0) {
            ArraysKt.q(0, 0, i, map.hashes, this.hashes);
            ArraysKt.t(map.array, 0, this.array, 0, i << 1);
            this.size = i;
        }
    }

    @Nullable
    public V putIfAbsent(K key, V value) {
        V v = (V) get(key);
        return v == null ? put(key, value) : v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object remove(Object obj) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public V removeAt(int index) {
        int i;
        if (index < 0 || index >= (i = this.size)) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + index);
            throw null;
        }
        Object[] objArr = this.array;
        int i2 = index << 1;
        V v = (V) objArr[i2 + 1];
        if (i <= 1) {
            clear();
            return v;
        }
        int i3 = i - 1;
        int[] iArr = this.hashes;
        if (iArr.length <= 8 || i >= iArr.length / 3) {
            if (index < i3) {
                int i4 = index + 1;
                ArraysKt.q(index, i4, i, iArr, iArr);
                Object[] objArr2 = this.array;
                ArraysKt.t(objArr2, i2, objArr2, i4 << 1, i << 1);
            }
            Object[] objArr3 = this.array;
            int i5 = i3 << 1;
            objArr3[i5] = null;
            objArr3[i5 + 1] = null;
        } else {
            int i6 = i > 8 ? i + (i >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i6);
            Intrinsics.g(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i6 << 1);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
            if (i != this.size) {
                throw new ConcurrentModificationException();
            }
            if (index > 0) {
                ArraysKt.q(0, 0, index, iArr, this.hashes);
                ArraysKt.t(objArr, 0, this.array, 0, i2);
            }
            if (index < i3) {
                int i7 = index + 1;
                ArraysKt.q(index, i7, i, iArr, this.hashes);
                ArraysKt.t(objArr, i2, this.array, i7 << 1, i << 1);
            }
        }
        if (i != this.size) {
            throw new ConcurrentModificationException();
        }
        this.size = i3;
        return v;
    }

    @Nullable
    public V replace(K key, V value) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, value);
        }
        return null;
    }

    public V setValueAt(int index, V value) {
        boolean z = false;
        if (index >= 0 && index < this.size) {
            z = true;
        }
        if (!z) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + index);
            throw null;
        }
        int i = (index << 1) + 1;
        Object[] objArr = this.array;
        V v = (V) objArr[i];
        objArr[i] = value;
        return v;
    }

    /* renamed from: size, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @NotNull
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kKeyAt = keyAt(i2);
            if (kKeyAt != sb) {
                sb.append(kKeyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vValueAt = valueAt(i2);
            if (vValueAt != sb) {
                sb.append(vValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    public V valueAt(int index) {
        boolean z = false;
        if (index >= 0 && index < this.size) {
            z = true;
        }
        if (z) {
            return (V) this.array[(index << 1) + 1];
        }
        RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + index);
        throw null;
    }

    public boolean remove(K key, V value) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey < 0 || !Intrinsics.c(value, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public boolean replace(K key, V oldValue, V newValue) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey < 0 || !Intrinsics.c(oldValue, valueAt(iIndexOfKey))) {
            return false;
        }
        setValueAt(iIndexOfKey, newValue);
        return true;
    }

    public SimpleArrayMap(SimpleArrayMap simpleArrayMap) {
        this(0);
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }
}

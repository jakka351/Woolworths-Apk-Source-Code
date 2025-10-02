package kotlin.collections;

import YU.a;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/RingBuffer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {
    public final Object[] d;
    public final int e;
    public int f;
    public int g;

    public RingBuffer(Object[] objArr, int i) {
        this.d = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(a.d(i, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i <= objArr.length) {
            this.e = objArr.length;
            this.g = i;
        } else {
            StringBuilder sbR = a.r(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbR.append(objArr.length);
            throw new IllegalArgumentException(sbR.toString().toString());
        }
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b, reason: from getter */
    public final int getG() {
        return this.g;
    }

    public final void d(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.d(i, "n shouldn't be negative but it is ").toString());
        }
        if (i > this.g) {
            StringBuilder sbR = a.r(i, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbR.append(this.g);
            throw new IllegalArgumentException(sbR.toString().toString());
        }
        if (i > 0) {
            int i2 = this.f;
            int i3 = this.e;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.d;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.f = i4;
            this.g -= i;
        }
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        AbstractList.Companion.b(i, this.g);
        return this.d[(this.f + i) % this.e];
    }

    @Override // kotlin.collections.AbstractList, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new AbstractIterator<Object>() { // from class: kotlin.collections.RingBuffer.iterator.1
            public int f;
            public int g;

            {
                this.f = RingBuffer.this.g;
                this.g = RingBuffer.this.f;
            }

            @Override // kotlin.collections.AbstractIterator
            public final void a() {
                int i = this.f;
                if (i == 0) {
                    this.d = 2;
                    return;
                }
                RingBuffer ringBuffer = RingBuffer.this;
                Object[] objArr = ringBuffer.d;
                int i2 = this.g;
                this.e = objArr[i2];
                this.d = 1;
                this.g = (i2 + 1) % ringBuffer.e;
                this.f = i - 1;
            }
        };
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[getG()]);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        Intrinsics.h(array, "array");
        int length = array.length;
        int i = this.g;
        if (length < i) {
            array = Arrays.copyOf(array, i);
            Intrinsics.g(array, "copyOf(...)");
        }
        int i2 = this.g;
        int i3 = this.f;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr = this.d;
            if (i5 >= i2 || i3 >= this.e) {
                break;
            }
            array[i5] = objArr[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            array[i5] = objArr[i4];
            i5++;
            i4++;
        }
        if (i2 < array.length) {
            array[i2] = null;
        }
        return array;
    }
}

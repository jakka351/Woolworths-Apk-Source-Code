package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ArrayMapImpl<T> extends ArrayMap<T> {
    public Object[] d = new Object[20];
    public int e = 0;

    public static final class Companion {
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final int b() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final void d(int i, Object value) {
        Intrinsics.h(value, "value");
        Object[] objArr = this.d;
        if (objArr.length <= i) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i);
            Object[] objArrCopyOf = Arrays.copyOf(this.d, length);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            this.d = objArrCopyOf;
        }
        Object[] objArr2 = this.d;
        if (objArr2[i] == null) {
            this.e++;
        }
        objArr2[i] = value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final Object get(int i) {
        return ArraysKt.M(i, this.d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public final Iterator iterator() {
        return new AbstractIterator<Object>() { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl.iterator.1
            public int f = -1;

            @Override // kotlin.collections.AbstractIterator
            public final void a() {
                int i;
                Object[] objArr;
                do {
                    i = this.f + 1;
                    this.f = i;
                    objArr = ArrayMapImpl.this.d;
                    if (i >= objArr.length) {
                        break;
                    }
                } while (objArr[i] == null);
                if (i >= objArr.length) {
                    this.d = 2;
                    return;
                }
                Object obj = objArr[i];
                Intrinsics.f(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
                this.e = obj;
                this.d = 1;
            }
        };
    }
}

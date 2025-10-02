package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes.dex */
public final class ObjectArrays {
    public static void a(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(YU.a.d(i2, "at index "));
            }
        }
    }

    public static void b(Collection collection, Object[] objArr) {
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public static Object[] c(Collection collection, Object[] objArr) {
        int size = collection.size();
        if (objArr.length < size) {
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        }
        b(collection, objArr);
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }
}

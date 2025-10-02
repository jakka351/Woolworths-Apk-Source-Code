package androidx.collection;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
class ArraySetJvmUtil {
    public static Object[] a(int i, Object[] objArr) {
        if (objArr.length < i) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}

package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ArraySetKt {
    public static final int a(ArraySet arraySet, Object obj, int i) {
        int i2 = arraySet.f;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iA = ContainerHelpersKt.a(i2, i, arraySet.d);
            if (iA < 0 || Intrinsics.c(obj, arraySet.e[iA])) {
                return iA;
            }
            int i3 = iA + 1;
            while (i3 < i2 && arraySet.d[i3] == i) {
                if (Intrinsics.c(obj, arraySet.e[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iA - 1; i4 >= 0 && arraySet.d[i4] == i; i4--) {
                if (Intrinsics.c(obj, arraySet.e[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}

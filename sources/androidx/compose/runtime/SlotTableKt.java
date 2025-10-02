package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "g", "()V", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SlotTableKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f1666a = new long[0];

    public static final int a(int i, int[] iArr) {
        return iArr[(i * 5) + 3];
    }

    public static final int b(int i, int i2, ArrayList arrayList) {
        int iF = f(i, i2, arrayList);
        return iF >= 0 ? iF : -(iF + 1);
    }

    public static final int c(int i, int[] iArr) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 30) + iArr[i2 + 4];
    }

    public static final int d(int i, int[] iArr) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void e(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final int f(int i, int i2, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((Anchor) arrayList.get(i4)).f1619a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iJ = Intrinsics.j(i5, i);
            if (iJ < 0) {
                i3 = i4 + 1;
            } else {
                if (iJ <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void g() {
        throw new ConcurrentModificationException();
    }
}

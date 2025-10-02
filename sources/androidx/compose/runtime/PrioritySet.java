package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "list", "Landroidx/collection/MutableIntList;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PrioritySet {
    public static final void a(MutableIntList mutableIntList, int i) {
        if (mutableIntList.b == 0 || !(mutableIntList.a(0) == i || mutableIntList.a(mutableIntList.b - 1) == i)) {
            int i2 = mutableIntList.b;
            mutableIntList.c(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iA = mutableIntList.a(i3);
                if (i <= iA) {
                    break;
                }
                mutableIntList.f(i2, iA);
                i2 = i3;
            }
            mutableIntList.f(i2, i);
        }
    }

    public static final int b(MutableIntList mutableIntList) {
        int iA;
        int i = mutableIntList.b;
        int iA2 = mutableIntList.a(0);
        while (mutableIntList.b != 0 && mutableIntList.a(0) == iA2) {
            mutableIntList.f(0, mutableIntList.b());
            mutableIntList.e(mutableIntList.b - 1);
            int i2 = mutableIntList.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iA3 = mutableIntList.a(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iA4 = mutableIntList.a(i6);
                if (i5 >= i2 || (iA = mutableIntList.a(i5)) <= iA4) {
                    if (iA4 > iA3) {
                        mutableIntList.f(i4, iA4);
                        mutableIntList.f(i6, iA3);
                        i4 = i6;
                    }
                } else if (iA > iA3) {
                    mutableIntList.f(i4, iA);
                    mutableIntList.f(i5, iA3);
                    i4 = i5;
                }
            }
        }
        return iA2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof PrioritySet) && Intrinsics.c(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "PrioritySet(list=null)";
    }
}
